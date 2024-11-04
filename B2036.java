import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2036 {
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
            int k = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < k; i++) {
                int b = sc.nextInt();
                int c = sc.nextInt();
                if (map.containsKey(b)) {
                    map.put(b, map.get(b) + c);
                }
                else {
                    map.put(b, c);
                }
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                pq.offer(e.getValue());
            }
            int ans = 0;
            while ((n-- > 0) && (pq.size() != 0)) {
                ans += pq.poll();
            }
            System.out.println(ans);
        }
    }
}