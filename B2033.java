import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2033 {
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
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            

            ArrayList<Integer> minValues = new ArrayList<>();

            for (int col = 0; col < n; col++) {
                int minValue = matrix[0][col];
                for (int i = 0, j = col; i < n && j < n; i++, j++) {
                    minValue = Math.min(minValue, matrix[i][j]);
                }
                minValues.add(minValue);
            }

            for (int row = 1; row < n; row++) {
                int minValue = matrix[row][0];
                for (int i = row, j = 0; i < n && j < n; i++, j++) {
                    minValue = Math.min(minValue, matrix[i][j]);
                }
                minValues.add(minValue);
            }

            int ans = 0;
            for (int i = 0;i < minValues.size(); i++) {
                if (minValues.get(i) < 0) {
                    ans += minValues.get(i);
                }
            }

            ans *= -1;
            System.out.println(ans);
        }
    }
}