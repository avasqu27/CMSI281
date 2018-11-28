/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Folded.java
 *  Purpose       :  Creates Hash table with linear probing
 *  @author       :  Ale, Bob
 *  Date written  :  2018-11-27
 *  Notes         :  None right now.  We'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
public class Folded {
    private String[] hashTable;
    private static int maxSize;
    private int digToFold;
    public Folded(int size, int length) {
        maxSize = size;
        digToFold = length;
        hashTable = new String[maxSize];
        int counter = 0;
        while (counter < maxSize) {
            hashTable[counter] = "a";
            counter++;
        }
    }
    /*
    @param key; element to be hashed
    @return int ; returns index value
    */
    public static int hashMeOutside(String key) {
        int hashVal = 0;
        int k = 2;
        for(int j=0; j<key.length(); j=j+2) {
            if (k >= key.length()) {
                k = key.length();
            }
            hashVal = hashVal + Integer.valueOf(key.substring(j,k));
            k = k+2;
        }
        hashVal = hashVal%maxSize;
        return hashVal;
    }
    /*
    @param ins; element to use hash function on
    @return int ; returns index value
    */
    public int find(String ins) {
        return hashMeOutside(ins);
    }
    /*
    @param ins; element to insert
    @return void ; adds to String[]
    */
    public void insert(String ins) {
        int index = find(ins);
        System.out.println ("Index calculated is: " + "" +index + " and String is: " + ins);
        boolean checker = hashTable[index].equals("a");
        while (checker == false) {
            index = index + 1;  // linear probing
            checker = hashTable[index].equals("a");
        }
        hashTable[index] = ins;  // place string in empty place
    }
    /*
    @param ins; element to remove
    @return void ; adds to String[]
    */
    public String remove(String ins) {
        String removed = hashTable[find(ins)];
        hashTable[find(ins)] = "a"; // set to empty string to remove
        return removed;
    }
    public String toString() {
        String s = "";
        s = hashTable[0];
        for (int i = 1; i < maxSize; i++) {
            s = s + ", " + hashTable[i];
        }
        return s;
    }
    public static void main(String[] args) {
        Folded hashBrowns = new Folded(100,2);
        System.out.println("\nNow inserting the numbers '55451', '9532', '56', '666', '87', '1', '40', and '20': ");
        hashBrowns.insert("55451");
        hashBrowns.insert("9532");
        hashBrowns.insert("56");
        hashBrowns.insert("666");
        hashBrowns.insert("87");
        hashBrowns.insert("1");
        hashBrowns.insert("40");
        hashBrowns.insert("20");
        System.out.println(hashBrowns.toString());
        System.out.println("\nNow deleting the number '20': ");
        hashBrowns.remove("20");
        System.out.println(hashBrowns.toString());
    }
}
