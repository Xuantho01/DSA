import java.util.ArrayList;
public class testMyarrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);
        myList.add(3,4);

        myList.remove(2);
        myList.trimToSize();

        myList.add(1212);
        System.out.println(myList.get(0));
//        System.out.println("\nSize of array: "+myList.getSize());;
//    }
    }
}
