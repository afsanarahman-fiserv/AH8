class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    for (int i = 0; i < index; i++) {
      if(head == null) {
        return null;
      }
      head = head.next;
    }
    return head.val;
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");
    node1.next = node2;
    node2.next = node3;
    // banana -> mango -> kiwi
    System.out.println(ECSource.getNodeValue(node1, 1));
  }
}