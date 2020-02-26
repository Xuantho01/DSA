public class testMyarrayList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);
        myList.add(3,4);

        myList.remove(2);
        myList.trimToSize();
        myList.printList();
    }
}
