
/** LC 7 – Reverse Integer
 */
public class Lc7 {

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            // Check for overflow before updating result
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;
    }
}
