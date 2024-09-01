import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A510 {
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
        int m = sc.nextInt();
        char[][] ans = new char[n][m];
        for(int i = 0;i<n;i+=2) {
            for(int j = 0;j<m;j++) {
                ans[i][j] = '#';
            }
        }
        int k = 1;
        for(int i = 1;i<n;i+=2) {
            if(k==0) {
                ans[i][0] = '#';
                for(int j = 1;j<m;j++) {
                    ans[i][j] = '.';
                }
                k = 1;
            }
            else {
                ans[i][m-1] = '#';
                for(int j = 0;j<m-1;j++) {
                    ans[i][j] = '.';
                }
                k = 0;
            }
        }
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
