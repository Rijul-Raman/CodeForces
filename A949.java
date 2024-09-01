import java.util.*;

public class A949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            @SuppressWarnings("unused")
            long l = sc.nextLong();
            long r = sc.nextLong();
            long ans = (long) (Math.log(r) / Math.log(2));
            System.out.println(ans);
        }
        sc.close();
    }
}