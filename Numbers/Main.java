// Write a Java program to find and print the first 10 happy numbers.

// Happy number: Starting with any positive integer, replace the number by the
// sum of the squares of its digits, and repeat the process until the number
// equals 1, or it loops endlessly in a cycle which does not include 1.
package Numbers;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("First 10 Happy numbers:");
        for (long num = 1, count = 0; count < 8; num++) {
            if (happy_num(num)) {
                System.out.println(num);
                count++;
            }
        }
    }

    public static boolean happy_num(long num) {
        long m = 0;
        int digit = 0;
        HashSet<Long> cycle = new HashSet<Long>();
        while (num != 1 && cycle.add(num)) {
            m = 0;
            while (num > 0) {
                digit = (int) (num % 10);
                m += digit * digit;
                num /= 10;
            }
            num = m;
        }
        return num == 1;
    }
}
