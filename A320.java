import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A320 {
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

    public static boolean helper(String s) {
        if (s.charAt(0) != '1') {
            return false;
        }
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '1' && s.charAt(i) != '4') {
                return false;
            }
        }
        if (s.indexOf("444") != -1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String s = sc.nextLine();
        if (helper(s)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}