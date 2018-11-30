/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  BinaryTreeNodeApp.java
 * Purpose    :  Tests BinaryTreeNode.java
 * @author    :  Ale Vasquez
 * @author    :  Bob (R. Ventura)
 * Date       :  2018-11-21
 * Description:  Tests BinaryTreeNode.java
 * Notes      :  None
 * Warnings   :  None
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

 public class BinaryTreeNodeApp {
  public static void main( String[] args ) {
    BinaryTreeNode root = new BinaryTreeNode( 0 );
    System.out.println("\nStarting BinaryTreeNodeApp with 0 as root...");
    root.add( 1, "L" );
    root.add( 2, "R" );
    System.out.println("\nGetting data for current tree:  \n" + root.toString() );
    System.out.println("\nIn order traversal of tree in progress... ");
    root.inOrderPrinter(root);
    System.out.println("\n");
    BinaryTreeNode one = root.getChild( "L" );
    BinaryTreeNode two = root.getChild( "R" );
    one.add( 3, "L" );
    one.add( 4, "R" );
    two.add( 5, "L" );
    two.add( 6, "R" );
    System.out.println("\nGetting data for current tree:  \n" + one.toString() );
    System.out.println("\nIn order traversal of node one of tree in progress... ");
    root.inOrderPrinter(one);
    System.out.println("\n");
    System.out.println("\nGetting data for current tree:  \n" + two.toString() );
    System.out.println("\nIn order traversal of node two of tree in progress... ");
    root.inOrderPrinter(two);
    System.out.println("\n");
    BinaryTreeNode six = two.getChild( "R" );
    six.add( 7, "L" );
    six.add( 8, "R" );
    System.out.println("\nGetting data for current tree:  \n" + six.toString() );
    System.out.println("\nIn order traversal of entire tree: ");
    System.out.println("\nExpecting [3][1][4][0][5][2][7][6][8]");
    root.inOrderPrinter(root);
    System.out.println("\n");

    System.out.println("Building new tree...");
    BinaryTreeNode root2 = new BinaryTreeNode( 11 );
    System.out.println("\nStarting BinaryTreeNodeApp with 11 as root...");
    root2.add( 5, "L" );
    root2.add( 25, "R" );
    System.out.println("\nGetting data for current tree:  \n" + root2.toString() );
    System.out.println("\nIn order traversal of tree in progress... ");
    root2.inOrderPrinter(root2);
    System.out.println("\n");
    BinaryTreeNode five = root2.getChild( "L" );
    BinaryTreeNode two5 = root2.getChild( "R" );
    five.add( 2, "L" );
    five.add( 3, "R" );
    two5.add( 12, "L" );
    two5.add( 37, "R" );
    System.out.println("\nGetting data for current tree:  \n" + five.toString() );
    System.out.println("\nIn order traversal of node one of tree in progress... ");
    root2.inOrderPrinter(five);
    System.out.println("\n");
    BinaryTreeNode three = five.getChild( "R" );
    three.add( 1, "L" );
    three.add( 0, "R" );
    System.out.println("\nGetting data for current tree:  \n" + three.toString() );
    System.out.println("\nIn order traversal of node three of tree in progress... ");
    root2.inOrderPrinter(three);
    System.out.println("\n");
    System.out.println("\nGetting data for current tree:  \n" + two5.toString() );
    System.out.println("\nIn order traversal of node two5 of tree in progress... ");
    root2.inOrderPrinter(two5);
    System.out.println("\n");
    BinaryTreeNode three7 = two5.getChild( "R" );
    three7.add( 42, "L" );
    three7.add( 56, "R" );
    System.out.println("\nGetting data for current tree:  \n" + three7.toString() );
    System.out.println("\nIn order traversal of entire tree: ");
    System.out.println("\nExpecting [2][5][1][3][0][11][12][25][42][37][56]");
    root2.inOrderPrinter(root2);
    System.out.println("\n");
    }
  }
