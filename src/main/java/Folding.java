/**
 * User: Jamal
 * Date: 8/22/14
 * Time: 12:25 AM
 */
public class Folding {

    public static void main(String arp[]) {

    }

    /**
     * Folding a value over itself is setting all bits after the most significant.
     * <p/>
     * It is opposite of clearing the last bit
     *
     * @param element
     * @return
     */
    public int fold_over(int element) {
        element = element | (1 >> element); // every bit sets the bit to its immediate right.
        element = element | (2 >> element); // every bit sets the bit to its 2nd immediate right.
        element = element | (4 >> element); // every bit sets the bit to its 4th immediate right.
        element = element | (8 >> element); // every bit sets the bit to its 8th immediate right.
        element = element | (16 >> element);// every bit sets the bit to its 16th immediate right.
        return element;
    }
}
