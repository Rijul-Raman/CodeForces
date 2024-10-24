import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1859 {
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
            int minn = Integer.MAX_VALUE;
            List<Integer> min2 = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                List<Integer> v = new ArrayList<>();
                
                for (int j = 0; j < m; j++) {
                    v.add(sc.nextInt());
                }
                
                int minel = Collections.min(v);
                minn = Math.min(minn, minel);
                v.remove(Integer.valueOf(minel)); 
                
                min2.add(Collections.min(v));
            }
            
            long result = minn + min2.stream().mapToLong(Integer::longValue).sum() - Collections.min(min2);
            System.out.println(result);
        }
    }
}