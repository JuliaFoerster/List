class List<T>{
  private Node first;
  private Node last;
  
  public List(){
    this.first = null;
    this.last = null;
  }

  public List add(T item){
    if (first == null){
      this.first = new Node(item);
      this.last = this.first;
    }
    else{
      this.last.next = new Node(item);
      this.last = this.last.next;
    }
    return this;
  }
  
  public String toString(){
    String result = "";
    Node current = this.first;
    while(current!=null){
      result += current.data + "->";
      current = current.next;
    }

    return result;
  }
  
  class Node{
    private Node next;
    private Node prev;
    private T data;
    
    public Node(T data){
      this.next = null;
      this.prev = null;
      this.data = data;
    }
    
  }
}