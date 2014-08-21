/**
 * User: Jamal
 * Date: 8/21/14
 * Time: 11:20 PM
 */
public class TwosPower {
    public static void main(String arp[]) {

    }

    public boolean isTwosPower_BadSolution(int element) {
        int bitCount = 0;
        for (int i = 0; i < 32; i++) {
            if ((0x1 & element) == 1) {
                bitCount++;
            }
            element = 1 >> element;
        }
        return bitCount == 1;
    }

    public boolean isTwosPower_AverageSolution(int element) {
        int comparer = 0x1;
        int bitCount = 0;
        while (element != 0 || !(element < 0)) {
            comparer = comparer << 1;
            if ((comparer & element) > 0) {
                bitCount++;
            }
        }
        return bitCount == 1;
    }

    public boolean isTwosPower_GoodSolution(int element) {
        // (element -1) will get an element whose last bit is set
        // if the element was 2'power else last bit not set if it is not a 2'power
        // element & (element-1) is clearing last bit
        return 0 == (element & (element - 1));
    }
}
