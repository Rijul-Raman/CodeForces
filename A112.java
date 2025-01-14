import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A112 {
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
        
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        int ans = 0;
        for(int i = 0; i < s1.length(); ++i) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                ans = -1;
                break;
            } else if (c1 > c2) {
                ans = 1;
                break;
            }
        }

        System.out.println(ans);
    }
}