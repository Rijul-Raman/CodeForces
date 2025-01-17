import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A205 {
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
        long[] arr = new long[n];
        long min = Long.MAX_VALUE;
        int idx = -1;
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextLong();
            if (arr[i] <= min) {
                min = arr[i];
                idx = i;
            }
        }
        boolean flag = true;
        for(int i = 0; i < n; ++i) {
            if (arr[i] == min && i != idx) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(idx + 1);
        }
        else {
            System.out.println("Still Rozdil");
        }
    }
}