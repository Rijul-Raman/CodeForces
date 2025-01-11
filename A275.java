import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A275 {
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
        boolean[][] lights = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = sc.nextInt();
                for (int k = 0; k < n; k++) {
                    lights[i][j] = !lights[i][j];
                    if (i+1 < 3) lights[i+1][j] = !lights[i+1][j];
                    if (i-1 >= 0) lights[i-1][j] = !lights[i-1][j];
                    if (j+1 < 3) lights[i][j+1] = !lights[i][j+1];
                    if (j-1 >= 0) lights[i][j-1] = !lights[i][j-1];
                }

            }
        }

        for (boolean[] x : lights) {
            for (boolean a : x) {
                System.out.print(a ? "1" : "0");
            }
            System.out.println();
        }
    }
}