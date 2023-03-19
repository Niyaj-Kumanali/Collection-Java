package Collection;

import LeetCode.Node;

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

    public void insertUsingRecursion(int  val, int index, Node node) {
        if (index == 1){
            Node tmp = new Node(val);
            tmp.next = node.next;
            node.next = tmp;
            size++;
            return;
        }
        insertUsingRecursion(val, index-1, node.next);
    }
    private Node insertRec (int val, int index, Node node){
        if (index == 0){
            Node tmp = new Node(val, node);
            size++;
            return tmp;
        }
        node.next = insertRec(val, --index, node.next);
        return node;
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

    public Node deleteDuplicates(Node head) {
        if (head == null)
            return head;
        Node node = head;
        while (node.next != null){
            if (node.val == node.next.val){
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
        return node;
    }

    public static MyLinkedList merge(MyLinkedList list1, MyLinkedList list2){
        Node f = list1.head;
        Node s = list2.head;

        MyLinkedList ans = new MyLinkedList();
        while (f != null && s != null){
            if (f.val < s.val){
                ans.insertAtLast(f.val);
                f = f.next;
            } else {
                ans.insertAtLast(s.val);
                s = s.next;
            }
        }

        while (f != null){
            ans.insertAtLast(f.val);
            f = f.next;
        }

        while (s != null){
            ans.insertAtLast(s.val);
            s = s.next;
        }

        return ans;
    }

    public void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverseInplace(){
        if (size < 2)
            return;
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null)
                next = next.next;
        }
        head = prev;
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
//        list.insertAtFirst(1);
//        System.out.println(list.size);
//        list.insertAtFirst(2);
//        System.out.println(list.size);
//        list.insertAtFirst(3);
//        System.out.println(list.size);
//        list.insertAtFirst(4);
//        System.out.println(list.size);
//        list.insertAtLast(5);
//        System.out.println(list.size);
//        list.insertAtLast(6);
//        System.out.println(list.size);
//        list.insertAtLast(7);
//        System.out.println(list.size);
//        list.display();
//        System.out.println();
//        list.insertAt(9,1);
//        list.display();
//        System.out.println(list.size);
//
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.size);
//
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.size);
//
//        System.out.println(list.delete(1));
//        list.display();
//        System.out.println(list.size);
//
//        System.out.println(list.findValue(2));
//        System.out.println();
//        System.out.println(list.valueAt(3));
//
//        list.replace(3,0);
//        list.display();
//        list.insertUsingRecursion(7, 1, list.head);
//        list.insertRec(8, 2, list.head);
////        list.clear();
//        list.display();

        list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(4);
        list.insertAtLast(4);
//        list.display();
//        list.deleteDuplicates(list.head);
//        list.display();

        MyLinkedList list2 = new MyLinkedList();
        list2.insertAtLast(1);
        list2.insertAtLast(1);
        list2.insertAtLast(1);
        list2.insertAtLast(2);
        list2.insertAtLast(4);
        list2.insertAtLast(4);
        list2.insertAtLast(5);
        list2.insertAtLast(6);

//        MyLinkedList ans = MyLinkedList.merge(list, list2);
//        ans.display();
        list.display();
        list.reverse(list.head);
        list.display();

    }
}
