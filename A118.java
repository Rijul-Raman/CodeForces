import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class A118 {
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
        String s = sc.nextLine();
        s = s.toLowerCase();
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','y'));
        String cons = "";
        for(int i = 0;i<s.length();i++) {
            if(!(vowels.contains(s.charAt(i)))) {
                cons+=s.charAt(i);
            }
        }
        String ans = "";
        for(int i = 0;i<cons.length();i++) {
            ans = ans + '.' + cons.charAt(i);
        }
        System.out.println(ans);
    }
}
