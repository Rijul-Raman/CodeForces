import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1913 {
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
            String s = sc.nextLine();
            int c0 = 0, c1 = 0;
            for (int i = 0;i < s.length();i++) {
                if (s.charAt(i) == '0') {
                    c0++;
                }
                else {
                    c1++;
                }
            }
            String t1 = "";
            int i = 0;
            while (i < s.length()) {
                if (s.charAt(i) == '0') {
                    if (c1 != 0) {
                        t1+="1";
                        c1--;
                    }
                    else {
                        break;
                    }
                }
                else {
                    if (c0 != 0) {
                        t1+="0";
                        c0--;
                    }
                    else {
                        break;
                    }
                }
                i++;
            }
            System.out.println(s.length() - t1.length());
        }
    }
}