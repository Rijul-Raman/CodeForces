import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A110 {
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
        int c = 0;
        for(int i = 0;i<s.length();i++) {
            char d = s.charAt(i);
            if(d=='4' || d=='7') {
                c++;
            }
        }
        String s1 = String.valueOf(c);
        boolean ans = true;
        for(int i = 0;i<s1.length();i++) {
            char d = s1.charAt(i);
            if(!(d=='4'||d=='7')) {
                ans = false;
                break;
            }
        }
        String res = ans==true?"YES":"NO";
        System.out.println(res);
    }
}
