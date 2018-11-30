/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HashProbe.java
 *  Purpose       :  Creates Hash table with linear probing
 *  @author       :  Ale, Bob
 *  Date written  :  2018-11-27
 *  Notes         :  None right now.  We'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
public class HashProbe {
    private String[] hashTable;
    private static int maxSize;
    public HashProbe(int i) {
        maxSize = i;
        hashTable = new String[maxSize];
        int counter = 0;
        while (counter < maxSize) {
            hashTable[counter] = "-1";
            counter++;
        }
    }
    /*
    @param key; element to be hashed
    @return int ; returns index value
    */
    public static int hashMeOutside(String key) {
        int hashVal = 0;
        for(int j=0; j<key.length(); j++) {
            int letter = key.charAt(j) - 96;
            hashVal = (hashVal * 27 + letter)%maxSize;
        }
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
        boolean checker = hashTable[index].equals("-1");
        while (checker == false) {
            index = index + 1;  // linear probing
            checker = hashTable[index].equals("-1");
        }
        hashTable[index] = ins;  // place string in empty place
    }
    /*
    @param ins; element to remove
    @return void ; adds to String[]
    */
    public String remove(String ins) {
        String removed = hashTable[find(ins)];
        hashTable[find(ins)] = "-1"; // set to empty string to remove
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
        HashProbe hashBrowns = new HashProbe(10);
        System.out.println("\nNow inserting the words 'd's', 'knife', 'umbrella', 'taco', 'squirrel', 'cow', 'o', and 'buche': ");
        hashBrowns.insert("d's");
        hashBrowns.insert("knife");
        hashBrowns.insert("umbrella");
        hashBrowns.insert("taco");
        hashBrowns.insert("squirrel");
        hashBrowns.insert("cow");
        hashBrowns.insert("buche");
        hashBrowns.insert("o");
        System.out.println(hashBrowns.toString());
        System.out.println("\nNow deleting the word 'squirrel': ");
        hashBrowns.remove("squirrel");
        System.out.println(hashBrowns.toString());
    }
}
