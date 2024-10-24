import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C1883 {
    static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
        
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
        
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
        
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
        
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i < n;i++) {
                arr[i] = sc.nextInt();
            }
            int ans;
            if (k == 4) {
                ans = k;
                for(int i = 0;i < n;i++) {
                    if (arr[i] % k == 0) {
                        ans = 0;
                        break;
                    }
                    else {
                        ans = Math.min(ans, (k - (arr[i] % k)));
                    }
                }
                int even = 0;
                for(int i = 0;i < n;i++) {
                    if (arr[i] % 2 == 0) {
                        even++;
                    }
                }
                ans = Math.min(ans, Math.max(0, 2 - even));
            }
            else {
                ans = k;
                for(int i = 0;i < n;i++) {
                    if (arr[i] % k == 0) {
                        ans = 0;
                        break;
                    }
                    else {
                        ans = Math.min(ans, (k - (arr[i] % k)));
                    }
                }
            }
            System.out.println(ans);
        }
    }
}