public class ArrayList<E> {
  // instance variables
  private E[] data;                        // generic array used for storage

  /** Current number of elements in the list. */
  private int size = 0;                    // current number of elements
  

  public ArrayList(int capacity) {         // constructs list with given capacity
    data = (E[]) new Object[capacity];     
  }
   
  /**
   * Inserts the given element at the end of the list
   * @param  e   the new element to be stored
   *
   * Candidate implementation A for the add method
   */
  public void addA(E e) {
    if (size == data.length) {              // not enough capacity
      resize(1 + data.length);             // so add 1 to current capacity
    }

    data[size] = e;                           // place the new element
    size++;
  }
  
  /**
   * Inserts the given element at the end of the list
   * @param  e   the new element to be stored
   *
   * Candidate implementation B for the add method
   */
  public void addB(E e) {
    if (size == data.length) {              // not enough capacity
      resize(2 * data.length);             // so double the current capacity
    }

    data[size] = e;                           // place the new element
    size++;
  }

  /** Resizes internal array to have given capacity >= size. */
  private void resize(int newCapacity) {
    //System.out.println("resizing from " + data.length + " to " + newCapacity);
    E[] temp = (E[]) new Object[newCapacity];   
    for (int k=0; k < size; k++) {
      temp[k] = data[k];
    }
    data = temp;                               // use the new array
  }
}
