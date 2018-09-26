/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntLinkedList.java
 * Purpose    :  Gain practice with lists and index locations
 * @author    :  BJ Johnson
 * @author    :
 * Date       :  2018-09-26
 * Description:  Constructs lists
 *                 Creates an insertAt() method to take index location and insert a node
                   Creates removeAt() method to take integer location only, removing node at index
                   Creates a returnSize() method that returns the size of the LinkedList 
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntLinkedList {

  private Node head;
  private int  size;

  // the constructor
  IntLinkedList() {
    head = null;
    size = 0;
  }

  public int getSize() {
    return size;
  }

  public void prepend( int dataToAdd ) {        // prepends value
    Node currentHead = head;
    head = new Node( dataToAdd );
    head.next = currentHead;
    size++;
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
      currentNode = head;
    }

    public void next() {
      if( currentNode == null ) {
        return;
      } else {
        currentNode = currentNode.next;
      }
    }

    public boolean hasNext() {
      return ((currentNode != null) && (currentNode.next != null));
    }

    public int getCurrentInt() {
      return currentNode.data;
    }
  }

// * __________________________________________________________________________________

  public void insertAt(int index, int value) {
    if (index == 0){
      prepend(value);
    }
    Iterator m = getIteratorAt(index-1);
    Node n = new Node(value);
    // holds our new node
    n.next = m.currentNode.next;
    // holds the node currently at the index; no pointing yet!
    m.currentNode.next = n;
    // now currentNode points to the n value
    size++;
      //  break;
  }

  public int removeAt(int index) {
    Iterator m = getIteratorAt(index-1);
    Iterator n = getIteratorAt(index);
    int valueRemoved = n.currentNode.data;
    //Node n = new Node(value);
    // holds our new node
    m.currentNode.next = m.currentNode.next.next;
    // holds the node currently at the index; no pointing yet!
    //m.currentNode.next = n;
    // now currentNode points to the n value
    size--;
    return valueRemoved;
  }

  public int returnSize(){
    return this.size;
  }
}
