// import java.util.function.Consumer;

// class ListOriginal<T> {
//   class Node {
//     public Node(T value, Node prev, Node next) {
//       this.value = value;
//       this.prev = prev;
//       this.next = next;
//     }
  
//     public Node(T value) {
//       this.value = value;
//       this.prev = null;
//       this.next = null;
//     }
  
//     public T value;
//     public Node prev;
//     public Node next;
//   }
  
//   private Node head;
//   private Node last;

//   public List() {
//     this.head = null;
//     this.last = null;
//   }

//   public boolean add(T element) {
//     if(this.head == null) {
//       this.head = new Node(element);
//       this.last = this.head;
//     } else {
//       // TODO: test for previous link
//       Node tmp = new Node(element, this.last, null);
//       this.last.next = tmp;
//       this.last = tmp;
//     }

//     return true;
//   }

//   public String toString() {
//     return listToString(this.head, "[");
//   }

//   private String listToString(Node node, String output) {
//     if(node == null) {
//       return "[]";
//     }

//     if(node.next != null) {
//       return listToString(node.next, output + node.value + " -> ");
//     }

//     return output + node.value + "]";
//   }
// }