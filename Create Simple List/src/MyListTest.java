public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(1);
        System.out.println(listInteger.get(3));
    }
}
