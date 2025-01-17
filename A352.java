import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A352 {
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
        int n = sc.nextInt();
        int n5 = 0, n0 = 0;
        for(int i = 0; i < n; ++i) {
            int a = sc.nextInt();
            if (a == 5) {
                n5++;
            }
            else {
                n0++;
            }
        }
        String ans = "";
        if (n0 == 0) {
            ans = "-1";
        }
        else if (n5 < 9 && n0 != 0) {
            ans = "0";
        }
        else {
            int r = 9*(n5/9);
            for (int i = 0; i < r; ++i) {
                ans += "5";
            }
            for (int i = 0; i < n0; ++i) {
                ans += "0";
            }
        }
        System.out.println(ans);
    }
}