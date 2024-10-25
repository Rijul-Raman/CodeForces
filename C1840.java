import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C1840 {
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
            long k = sc.nextLong();
            long q = sc.nextLong();
            long[] temperatures = new long[n];
            for (int i = 0; i < n; i++) {
                temperatures[i] = sc.nextLong();
            }
            long len = 0;
            long ans = 0L;
            for (int i = 0; i < n; i++) {
                if (temperatures[i] <= q) {
                    len++;
                }
                else {
                    if (len >= k) {
                        ans += (((len - k + 1) * (len - k + 2))/2);
                    }
                    len = 0;
                }
            }
            if (len >= k) {
                ans += (((len - k + 1) * (len - k + 2))/2);
            }
            System.out.println(ans);
        }
    }
}