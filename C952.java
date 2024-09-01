import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C952 {
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
            int[] a = new int[n];
            for(int i = 0;i<n;i++) {
                a[i] = sc.nextInt();
            }

            int sum = 0, max = 0;
            int ans = 0;
            for(int i = 0;i<n;i++) {
                if(a[i]<max) {
                    sum+=a[i];
                    if(sum==max) {
                        ans++;
                    }
                }
                else if(a[i]==max) {
                    if((sum+max)==a[i]) { 
                        ans++;
                        sum+=max;
                    }
                }
                else {
                    sum+=max;
                    if(sum==a[i]) {
                        ans++;
                    }
                    max = a[i];
                }
            }

            System.out.println(ans);
        }
    }
}
