import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A260 {
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
        long a = sc.nextLong();
        int b = sc.nextInt();
        int n = sc.nextInt();
        boolean flag = false;
        int d = -1;
        for (int i = 0; i < 10; ++i) {
            if ((a*10 + i) % b == 0) {
                flag = true;
                d = i;
                break;
            }
        }
        String ans = "";
        if (!flag) {
            ans = "-1";
        }
        else {
            ans = String.valueOf((a*10 + d));
            for (int i = 0; i < n-1; ++i) {
                ans += "0";
            }
        }
        System.out.println(ans);
    }
}