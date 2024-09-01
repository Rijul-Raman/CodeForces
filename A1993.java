import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A1993 {
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
            int n = sc.nextInt();
            String s = sc.nextLine();
            int a = 0, b = 0, c = 0, d = 0;
            for(int i = 0;i<(4*n);i++) {
                char ch = s.charAt(i);
                if(ch=='A') {
                    a++;
                }
                else if(ch=='B') {
                    b++;
                }
                else if(ch=='C') {
                    c++;
                }
                else if(ch=='D') {
                    d++;
                }
                else {
                    continue;
                }
            }
            int ans = Math.min(a, n) + Math.min(b, n) + Math.min(c, n) + Math.min(d, n);
            System.out.println(ans);
        }
    }
}
