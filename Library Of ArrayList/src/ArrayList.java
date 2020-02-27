
//import java.util.ArrayList;

public class ArrayList<E> {
   private int Size = 0;
   static final int DEFAULT_CAPACITY = 4;
   private Object[] elements;

   public ArrayList() {
      elements = new Object[DEFAULT_CAPACITY];
   }

   private void ensureCapa(){
      if (Size >= elements.length){
          Object[] newElements = new Object[Size *2 +1];
          System.arraycopy(elements,0,newElements,0, Size);
          elements = newElements;
      }
   }
   public int getSize(){
     return elements.length;
   }
   public void add(int index,E data){
      ensureCapa();
      for (int i = Size - 1; i >= index; i--) {
         elements[i + 1] = elements[i];
      }
      elements[index] = data;
      Size++;
   }
   public void checkIndex(int index){
      if(index < 0 || index >= Size)
         throw new IndexOutOfBoundsException("index " +index+" out of bounds");
   }
   public void remove(int index){
      checkIndex(index);
       // Object listAfterRemove = elements[index];
      for (int i = index; i < Size - 1; i++){
         elements[i] = elements[i+1];
      }
      elements[Size - 1] = null;
      Size--;
   }
   public void trimToSize() {

      if (Size != elements.length) {
         Object[] newData = new Object[Size];
         System.arraycopy(elements, 0, newData, 0, Size);
         elements = newData;
      } // If size == capacity, no need to trim
   }
   public void printList() {
     for (int i = 0; i < elements.length; i++){
        System.out.print(elements[i] + "  ");
     }
   }

}
