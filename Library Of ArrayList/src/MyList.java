public class MyList<E>{
   private int size = 0;
   static final int DEFAULT_CAPACITY = 4;
   private Object[] elements;

   public MyList() {
      elements = new Object[DEFAULT_CAPACITY];
   }
   private void ensureCapa(){
      if (size >= elements.length){
          Object[] newElements = new Object[size*2 +1];
          System.arraycopy(elements,0,newElements,0,size);
          elements = newElements;
      }
   }

   public void add(int index,E data){
      ensureCapa();
      for (int i = size - 1; i >= index; i--) {
         elements[i + 1] = elements[i];
      }
      elements[index] = data;
      size++;
   }
   public void checkIndex(int index){
      if(index < 0 || index >= size)
         throw new IndexOutOfBoundsException("index " +index+" out of bounds");
   }
   public void remove(int index){
      checkIndex(index);
       // Object listAfterRemove = elements[index];
      for (int i = index; i < size - 1; i++){
         elements[i] = elements[i+1];
      }
      elements[size - 1] = null;
      size--;
   }
   public void trimToSize() {

      if (size != elements.length) {
         Object[] newData = new Object[size];
         System.arraycopy(elements, 0, newData, 0, size);
         elements = newData;
      } // If size == capacity, no need to trim
   }
//   public Arrays ketQua(){
//      return elements
//   }
   public void printList() {
     for (int i = 0; i < elements.length; i++){
        System.out.print(elements[i] + "  ");
     }
   }
}
