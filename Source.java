class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> boolean linkedListFind(Node<T> head, T target) {
        // iterate through each node of the list
        while(head != null) {
            // use .equals() -- compatible with any object T
            // "==" would be comparing references -- we want to compare values
            if(head.val.equals(target)) {
                return true;
            }
            // if condition isn't true (node not found), move to next node
            head = head.next;
        }

        // iterated through the whole list -- target not found
        return false;
    }
    
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
        // a -> b -> c -> d
        System.out.println(Source.linkedListFind(a, "c"));

        Node<Integer> node1 = new Node<>(42);
        System.out.println(Source.linkedListFind(node1, 100));
        
    }

  }