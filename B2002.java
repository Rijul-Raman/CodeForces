import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class B2002 {
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
            int n = sc.nextInt();;
            int[] p = new int[n];
            int[] q = new int[n];
            for(int i = 0;i<n;i++) {
                p[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++) {
                q[i] = sc.nextInt();
            }

            String winner = "Alice";

            int[] qn = new int[n];
            for(int i = 0;i<n;i++) {
                qn[i] = q[n-i-1];
            }

            boolean flag = true;
            for(int i = 0;i<n;i++) {
                if(p[i]!=q[i]) {
                    flag = false;
                    break;
                }
            }

            if(flag==false) {
                flag = true;
                for(int i = 0;i<n;i++) {
                    if(p[i]!=qn[i]) {
                        flag = false;
                        break;
                    }
                }
            }

            if(flag==true) {
                winner = "Bob";
            }
            
            System.out.println(winner);
        }
    }
}
