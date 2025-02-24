import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B227 {
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
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; ++i) {
            map.put(sc.nextInt(), i);
        }
        int m = sc.nextInt();
        long vasya = 0, petya = 0;
        for(int i = 0; i < m; ++i) {
            int b = map.get(sc.nextInt());
            vasya += (b + 1);
            petya += (n - b);
        }
        System.out.println(vasya + " " + petya);
    }
}