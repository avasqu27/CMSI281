/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  CircularList.java
 * Purpose    :  Gain practice with packages
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-10-22
 * Description:  Creates a circular list with deletion, insertion, and searching methods 
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class CircularList {

  private Node head;
  private Node last;
  public Node current;
  private int  size;

  // the constructor
  CircularList() {
    head = null;
    current = head;
    size = 0;
  }

  /*
    @return int type
  */
  public int getSize() {
    return size;
  }

  private class Node {
    int data;            // remember this is an IntLinkedList
    Node next;           // here's the self-referential part

   // constructor
    Node( int d ) {
      data = d;
      next = null;
    }
  }

  /*
    @return int; handles wraparound to make circular; otherwise, gets value
  */
  public int getNext() {
    Iterator i = new Iterator();
    if(i.hasNext() == false) {
      current.next = head;
      return current.next.data;
    }
    else {
      return current.next.data;
    }
  }

  /*
    @param index value to be found
    @return it; location of iterator
  */
  public Iterator getIteratorAt( int index ) {
    if( (index > size) || (index < 0) ) {
      throw new IllegalArgumentException();
    }
    Iterator it = new Iterator();
    while( index > 0 ) {
      it.next();
      index--;
    }
    return it;
  }

  public class Iterator {
    private Node currentNode;

    Iterator() {
      currentNode = current;
    }

   /*
    @return void; checks if next exists; otherwise, sets next to head
   */
    public void next() {
      if( currentNode.next == null ) {
        currentNode = head;
      } else {
        currentNode = currentNode.next;
      }
    }

    /*
      @return void; checks if next exists
    */
    public boolean hasNext() {
      return ((currentNode != null) && (currentNode.next != null));
    }

    /*
     @return int, finds currentNode's data
    */
    public int getCurrentInt() {
      return currentNode.data;
    }
  }

// * __________________________________________________________________________________
   /*
     @param value ,value to be inserted
     @return void, inserts value from right
  */
  public void insertion(int value) {
    if (current == null) {     // only used when initialized
      head = new Node(value);
      current = head;
    }
    Node n = new Node(value);
    // holds our new node
    current.next = n;
    // holds the node currently at the index; no pointing yet!
    current = current.next;
    // now currentNode points to the n value
    //move currentNode to value just added
    size++;

      //  break;
  }

  /*
     @param value ,value to be deleted
     @return int, deletes value by searching for it in the list
  */
  public int deletion(int value) {
    int nextCheck = current.next.data;  // get next from current Node
    while (nextCheck != value) {       // stop when reach value wanted to be removed
      step();                          // go to next value
      nextCheck = current.next.data;   // go to next value
    }
    int valueRemoved = nextCheck;
    // holds our new node
    current.next = current.next.next;
    // holds the node currently at the index; no pointing yet!
    // now currentNode points to the n value
    size--;
    return valueRemoved;
  }

  /*
     @return void, sets current node to next value
  */
  public void step() {
    current = current.next;
  }

  /*
     @param value ,value to be found
     @return boolean, logic verifies whether value is found in list
    */
  public boolean searching(int value){
    int check = current.data;
    if (check == value) {
      return true;
    }
    int nextCheck = getNext();
    while (check != nextCheck) {   //assuming no repeating values in list
      if(nextCheck == value) {
        return true;
      }
      step();
      nextCheck = current.data;
    }
    return false;
  }

  /*
     @return String, lists as a String
    */
  public String toString() {
    String s = "";
    int check = current.data;
    s = s + check + " ";
    int nextCheck = getNext();
    step();
    while (check != nextCheck) {
      s = s + nextCheck + " ";
      step();
      nextCheck = getNext();
    }
    return s;
  }

  /*
     @return int, returns size of the list
  */
  public int returnSize() {
    return this.size;
  }
  
  /*
     @return int, returns current node looked at
  */
  public int getCurrent() {
    return current.data;
  }

// --------------------------------------------------------------------------------------
  public static void main(String[] args) {
    CircularList cl = new CircularList(); //make new CircularList
    System.out.println("Inserting 1: " );
    cl.insertion(1);
    System.out.println("current is: " + "" +cl.current.data);
    System.out.println("Inserting 2: " );
    cl.insertion(2);
    System.out.println("current is: " + "" +cl.current.data);
    System.out.println("Inserting 4: " );
    cl.insertion(4);
    System.out.println("current is: " + "" +cl.current.data);
    System.out.println("Inserting 5: " );
    cl.insertion(5);
    System.out.println("current is: " + "" +cl.current.data);
    System.out.println("Inserting 10: " );
    cl.insertion(10);
    System.out.println("current is: " + "" +cl.current.data);
    System.out.println("\nCurrent list is: " + cl.toString());
    System.out.println("check if 5 is in list: " + "" + cl.searching(5));
    System.out.println("check if 8 is in list: " + "" + cl.searching(8));
    System.out.println("check if 2 is in list: " + "" + cl.searching(2));
    System.out.println("check if 10 is in list: " + "" + cl.searching(10));
    System.out.println("Deleting 5: " );
    cl.deletion(5);
    System.out.println("\nCurrent list is: " + cl.toString());
    System.out.println("Deleting 2: " );
    cl.deletion(2);
    System.out.println("\nCurrent list is: " + cl.toString());
    System.out.println("Deleting 4: " );
    cl.deletion(4);
    System.out.println("\nCurrent list is: " + cl.toString());
    System.out.println("Deleting 10: " );
    cl.deletion(10);
    System.out.println("\nCurrent list is: " + cl.toString());
    System.out.println("Inserting 11: " );
    cl.insertion(11);
    System.out.println("current is: " + "" +cl.current.data);
    System.out.println("Inserting 12: " );
    cl.insertion(12);
    System.out.println("current is: " + "" +cl.current.data);
    System.out.println("Inserting 13: " );
    cl.insertion(13);
    System.out.println("current is: " + "" +cl.current.data);
    System.out.println("Inserting 14: " );
    cl.insertion(14);
    System.out.println("current is: " + "" +cl.current.data);
    System.out.println("Inserting 15: " );
    cl.insertion(15);
    System.out.println("\nCurrent list is: " + cl.toString());
    System.out.println("check if 15 is in list: " + "" + cl.searching(15));
    System.out.println("check if 100 is in list; expecting false: " + "" + cl.searching(100));
    System.out.println("check if 14 is in list: " + "" + cl.searching(14));
  }
}
