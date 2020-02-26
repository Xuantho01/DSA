public class MyList<E> {
   private int size = 0;
   static final int DEFAULT_CAPACITY = 10;
   private Object elements[];

   public MyList(){
      elements = new Object[DEFAULT_CAPACITY];
   }
}
