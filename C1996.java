import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C1996 {
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
        while(t-->0) {
            @SuppressWarnings("unused")
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int[] ans = new int[q];
            for(int i = 0;i<q;i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int[] c1 = new int[26];
                int[] c2 = new int[26];
                for(int j = l-1;j<r;j++) {
                    c1[s1.charAt(j)-'a']+=1;
                    c2[s2.charAt(j)-'a']+=1;
                }
                int a = 0;
                for(int j = 0;j<26;j++) {
                    a = a+(Math.abs(c1[j]-c2[j]));
                }
                a = a/2;
                ans[i] = a;
            }
            for(int i = 0;i<q;i++) {
                System.out.println(ans[i]);
            }
        }
    }
}
