import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1303 {
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
        while(t-->0) {
            String s = sc.nextLine();
            int first = s.length();
            for(int i = 0;i<s.length();i++) {
                if(s.charAt(i)=='1') {
                    first = i;
                    break;
                }
            }
            int last = 0;
            for(int i = s.length()-1;i>=0;i--) {
                if(s.charAt(i)=='1') {
                    last = i;
                    break;
                }
            }
            int ans = 0;
            for(int i = first;i<last;i++) {
                if(s.charAt(i)=='0') {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
