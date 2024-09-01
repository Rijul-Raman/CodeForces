import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1996 {
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
            int k = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0;i<n;i++) {
                String s = sc.nextLine();
                for(int j = 0;j<n;j++) {
                    arr[i][j] = (int)(s.charAt(j)-'0');
                }
            }
            int[][] ans = new int[n/k][n/k];
            for(int i = 0,i1=0;i<n;i+=k,i1++) {
                for(int j = 0,j1=0;j<n;j+=k,j1++) {
                    ans[i1][j1] = arr[i][j];
                }
            }
            for(int i = 0;i<(n/k);i++) {
                for(int j = 0;j<(n/k);j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
        }
        
    }
}
