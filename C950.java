import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C950 {
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
            int[] b = new int[n];
            for(int i = 0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++) {
                b[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] d = new int[m];
            for(int i = 0;i<m;i++) {
                d[i] = sc.nextInt();
            }

            for(int i = 0;i<m;i++) {
                boolean isf = false;
                for(int j = 0;j<n;j++) {
                    if(b[j]==d[i] && a[j]!=d[i]) {
                        isf = true;
                        a[j] = d[i];
                        break;
                    }
                    else if(b[j]==d[i] && a[j]==d[i]) {
                        isf = true;
                        continue;
                    }
                }
                if(isf==false) {
                    for(int k = 0;k<n;k++) {
                        if(a[k]!=b[k]) {
                            a[k] = d[i];
                            break;
                        }
                    }
                }
            }
            boolean flag = true;
            for(int i = 0;i<n;i++) {
                if(a[i]!=b[i]) {
                    flag = false;
                    break;
                }
            }
            String ans = flag?"YES":"NO";
            System.out.println(ans);
        }
    }
}
