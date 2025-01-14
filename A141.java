import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A141 {
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
        String a = sc.nextLine();
        String b= sc.nextLine();
        String c = sc.nextLine();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i < a.length(); ++i) {
            map1.put(a.charAt(i), map1.getOrDefault(a.charAt(i), 0) + 1);
        }
        for(int i = 0; i < b.length(); ++i) {
            map1.put(b.charAt(i), map1.getOrDefault(b.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < c.length(); ++i) {
            map2.put(c.charAt(i), map2.getOrDefault(c.charAt(i), 0) + 1);
        }
        if (map1.equals(map2)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}