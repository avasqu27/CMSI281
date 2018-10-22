/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  CircularStack.java
 * Purpose    :  Gain practice with packages
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-10-22
 * Description:  Creates a circular stack with push, peek, and pop characteristics 
 *                 
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

 public class CircularStack extends CircularList {

   private CircularList stack;

   public CircularStack() {
     stack = new CircularList();    //create instance of CircularList
   }

   /*
     @return int; gets size of stack
   */
   public int getSize() {
     return stack.getSize();       // return size
   }

  /*
    @param index value to be inserted
    @return void; inserts value onto stack
  */
   public void push(int value) {
     stack.insertion(value);      //push onto stack (LIFO)
   }

  /*
    @return int; looks at top of stack
  */
   public int peek() {
     return stack.getCurrent();      //look at current node
   }

  /*
    @return boolean; deletes value at top of stack and returns if value is present
  */
   public int pop() {
     return stack.deletion(peek());    //delete current node
   }

   public String toString() {
     return stack.toString();           // use previous method toString
   }
   public static void main(String[] args) {
     CircularStack cs = new CircularStack();
     System.out.println("Pushing 50: ");
     cs.push(50);
     System.out.println("current is: " + "" + cs.peek());
     System.out.println("Pushing 76: ");
     cs.push(76);
     System.out.println("current is: " + "" + cs.peek());
     System.out.println("Pushing 28: ");
     cs.push(28);
     System.out.println("current is: " + "" + cs.peek());
     System.out.println("Pushing 20: ");
     cs.push(20);
     System.out.println("current is: " + "" + cs.peek());
     System.out.println("\nCurrent stack is: " + cs.toString());
     System.out.println("size is: " + "" + cs.getSize());
     System.out.println("current is: " + "" + cs.peek());
     System.out.println("Poppin' 28: ");
     cs.pop();
     System.out.println("\nCurrent stack is: " + cs.toString());
     System.out.println("current is: " + "" + cs.peek());
     System.out.println("Poppin' 76: ");
     cs.pop();
     System.out.println("current is: " + "" + cs.peek());
     System.out.println("\nCurrent stack is: " + cs.toString());
     System.out.println("size is: " + "" + cs.getSize());

   }
 }
