import java.util.*;

public class B1993 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];

        int oddCount = 0;
        int evenCount = 0;
        long largestOdd = -1;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] % 2 == 1) {
                oddCount++;
                largestOdd = Math.max(largestOdd, a[i]);
            } else {
                evenCount++;
            }
        }

        long largestOddCopy = largestOdd;

        if (oddCount == 0 || evenCount == 0) {
            System.out.println(0);
        } else {
            Arrays.sort(a);
            long count1 = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 1) {
                    continue;
                } else {
                    if (a[i] > largestOdd) {
                        count1 += 2;
                        largestOdd += 2 * a[i];
                    } else {
                        count1++;
                        largestOdd += a[i];
                    }
                }
            }

            long count2 = 0;
            Arrays.sort(a);
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] % 2 == 1) {
                    continue;
                } else {
                    if (a[i] > largestOddCopy) {
                        count2 += 2;
                        largestOddCopy += 2 * a[i];
                    } else {
                        count2++;
                        largestOddCopy += a[i];
                    }
                }
            }

            System.out.println(Math.min(count1, count2));
        }
    }
}
