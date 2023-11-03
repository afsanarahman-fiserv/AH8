class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    // iterate through the list to get to the index
    for (int i = 0; i < index; i++) {
      // if we reach end of list before reaching index, return null
      if(head == null) {
        return null;
      }
      // otherwise, list is not empty -- move to next node
      head = head.next;
    }

    // loop iterated in entirety -- index has been reached
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