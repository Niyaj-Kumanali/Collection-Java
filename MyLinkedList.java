package Collection;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(){}
        public Node(int val)
        {
            this.val = val;
        }

        public Node(int val, Node next)
        {
            this.val = val;
            this.next = next;
        }

    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null)
            tail = head;
        size++;
    }

    public void insertAtLast(int val){
        Node node = new Node(val);
        if (tail == null){
            insertAtFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int val, int index) throws Exception {
        if (index == 0){
            insertAtFirst(val);
            return;
        }
        if (index == size){
            insertAtLast(val);
            return;
        }

        if (index > size) {
            throw new Exception("Index is out Linked List");
        }

        Node tmp = getLast(index);
        Node node = new Node(val, tmp.next);
        tmp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast(){
        int val = tail.val;
        tail = getLast(size-1);
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) throws Exception {
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        if (index >= size) {
            throw new Exception("Index is out Linked List");
        }
        Node tmp = getLast(index);
        int val = tmp.next.val;
        tmp.next = tmp.next.next;
        size--;
        return val;
    }

    public int findValue(int val){
        if (head.val == val)
            return 0;
        if (tail.val == val)
            return size-1;
        Node tmp = head.next;
        for (int i = 1; i < size-1; i++) {
            if (tmp.val == val)
                return i;
            tmp = tmp.next;
        }
        return -1;
    }

    public int valueAt(int index) throws Exception {
        if (index == 0)
            return head.val;
        if (index == size - 1)
            return tail.val;
        if (index >= size)
            throw new Exception("Index is out of LinkedList");
        return getLast(index).next.val;
    }

    public void replace(int val, int index) throws Exception {
        if (index == 0) {
            head.val = val;
            return;
        }
        if (index == size - 1) {
            tail.val = val;
            return;
        }
        if (index >= size)
            throw new Exception("Index is out of LinkedList");
        Node tmp = getLast(index);
        tmp.next.val = val;
    }

    public void clear(){
        Node node = new Node();
        head = node;
        tail = node;
    }

    private Node getLast(int index){
        Node tmp = head;
        for(int i = 1; i < index; i++){
            tmp = tmp.next;
        }
        return tmp;
    }

    public void display(){
        Node tmp = head;
        System.out.print("Head --> ");
        while (tmp != null){
            System.out.print(tmp.val+ "--> ");
            tmp = tmp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        MyLinkedList list = new MyLinkedList();
        list.insertAtFirst(1);
        System.out.println(list.size);
        list.insertAtFirst(2);
        System.out.println(list.size);
        list.insertAtFirst(3);
        System.out.println(list.size);
        list.insertAtFirst(4);
        System.out.println(list.size);
        list.insertAtLast(5);
        System.out.println(list.size);
        list.insertAtLast(6);
        System.out.println(list.size);
        list.insertAtLast(7);
        System.out.println(list.size);
        list.display();
        System.out.println();
        list.insertAt(9,1);
        list.display();
        System.out.println(list.size);

        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.size);

        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.size);

        System.out.println(list.delete(1));
        list.display();
        System.out.println(list.size);

        System.out.println(list.findValue(2));
        System.out.println();
        System.out.println(list.valueAt(3));

        list.replace(3,0);

        list.clear();
        list.display();
    }
}
