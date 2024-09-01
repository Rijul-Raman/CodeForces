import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A263 {
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
        int[][] matrix = new int[5][5];
        int i1 = 0, j1 = 0;
        for(int i = 0;i<5;i++) {
            for(int j = 0;j<5;j++) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j]==1) {
                    i1 = i;
                    j1 = j;
                }
            }
        }
        int ans = Math.abs(i1-2) + Math.abs(j1-2);
        System.out.println(ans);
    }
}
