import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A977 {
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
        long n = sc.nextLong();
        int k = sc.nextInt();
        while(k-->0) {
            if(n%10==0) {
                n/=10;
            }
            else {
                n-=1;
            }
        }
        System.out.println(n);
    }
}
