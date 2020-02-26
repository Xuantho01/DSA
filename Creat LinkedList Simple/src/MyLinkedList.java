public class MyLinkedList {
    private Node head;
    private  Node tail;
    private int numNodes;

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public void add(int index, Object data){
        addElement(index, data);
    }

    private void addElement(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    int count = 0;
    public void lengthOfLinkedList(){
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
    }
    public void addLast(Object data){
        addElement(count, data);
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
