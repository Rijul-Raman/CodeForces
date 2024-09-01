import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class B950 {
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
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();
            Integer[] arr = new Integer[n];
            for(int i = 0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            if(k==n) {
                System.out.println("YES");
                continue;
            }
            int fav = arr[f-1];
            Arrays.sort(arr, Collections.reverseOrder());
            if(arr[k-1]>fav) {
                System.out.println("NO");
            }
            else if(arr[k-1]<fav) {
                System.out.println("YES");
            }
            else {
                if(arr[k]==fav) {
                    System.out.println("MAYBE");
                }
                else {
                    System.out.println("YES");
                }
            }
        }
    }
}
