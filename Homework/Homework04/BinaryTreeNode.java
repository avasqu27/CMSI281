/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  BinaryTreeNode.java
 * Purpose    :  Creates L & R binary tree nodes
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-11-21
 * Description:  Creates binary tree using L & R binary tree nodes
 * Notes      :  None
 * Warnings   :  None
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class BinaryTreeNode {

  private int data;
  private BinaryTreeNode left;
  private BinaryTreeNode right;

  BinaryTreeNode( int d ) {
    data = d;
    left = null;
    right = null;
  }

  public void add( int s, String child ) {
    child = child.toUpperCase();
    if( child.equals( "L" ) ) {
      left = new BinaryTreeNode( s );
    } else if( child.equals( "R" ) ) {
        right = new BinaryTreeNode( s );
    } else {
        throw new IllegalArgumentException();
    }
  }

  public BinaryTreeNode getChild( String child ) {
    child = child.toUpperCase();
    if( child.equals("L") || child.equals("R") ) {
      return (child.equals("L") ? left : right);
    } else {
        throw new IllegalArgumentException();
    }
  }

  public int getString() {
    return data;
  }

  public String toString() {
    String n = "Current Node: " + "" + getString();       // displays value of node
    n = n + "\n" + "Left child: " + "" + left.data;   // displays value of node's left child
    n = n + "\n" + "Right child: " + "" + right.data;  // displays value of node's right child
    return n;
  }

  public static void inOrderPrinter( BinaryTreeNode node ) {
    if( node == null ) {
      return;
    }
    inOrderPrinter( node.getChild( "L" ) );
    System.out.print( "[" + node.data + "]" );
    inOrderPrinter( node.getChild( "R" ) );
  }

}
