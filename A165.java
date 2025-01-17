import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A165 {
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
        int[][] points = new int[n][2];
        for(int i = 0; i < n; ++i) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < n; ++i) {
            boolean right = false, left = false, upper = false, lower = false;
            int x = points[i][0];
            int y = points[i][1];
            for(int j = 0; j < n; ++j) {
                if(points[j][0] > x && points[j][1] == y) {
                    right = true;
                    break;
                }
            }
            for(int j = 0; j < n; ++j) {
                if(points[j][0] < x && points[j][1] == y) {
                    left = true;
                    break;
                }
            }
            for(int j = 0; j < n; ++j) {
                if(points[j][0] == x && points[j][1] > y) {
                    upper = true;
                    break;
                }
            }
            for(int j = 0; j < n; ++j) {
                if(points[j][0] == x && points[j][1] < y) {
                    lower = true;
                    break;
                }
            }
            if (right && left && upper && lower) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}