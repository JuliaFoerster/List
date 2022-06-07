import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
  public static void main() {
    Result result = JUnitCore.runClasses(
      ListTest.class
    );

    System.out.println("Run " + result.getRunCount() + " tests in " + ((double)result.getRunTime() / 1000) + "s.");
    System.out.println("Passed: " + (result.getRunCount() - result.getFailureCount()));
    System.out.println("Failed: " + result.getFailureCount() + "\n");
      
    if(result.getFailureCount() > 0) {
      System.out.println("Failed tests:");
      for (Failure failure : result.getFailures()) {
        System.out.println(failure.toString());
      }
    }
  }
}