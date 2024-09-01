import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2007 {
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
            int m = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0;i<n;i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            while(m-->0) {
                char c = sc.next().charAt(0);
                long l = sc.nextLong();
                long r = sc.nextInt();
                if(n>1) {                    
                    if (arr[arr.length-1]<=r && arr[arr.length-1]>=l) {
                        if(c=='+') {
                            arr[arr.length-1]+=1;
                        }
                        else {
                            arr[arr.length-1]-=1;
                        }
                    }
                    if (arr[arr.length-2]<=r && arr[arr.length-2]>=l) {
                        if(c=='+') {
                            arr[arr.length-2]+=1;
                        }
                        else {
                            arr[arr.length-2]-=1;
                        }
                    }
                    if (arr[arr.length-2] > arr[arr.length-1]) {
                        long temp = arr[arr.length-2];
                        arr[arr.length-2] = arr[arr.length-1];
                        arr[arr.length-1] = temp;
                    }
                    System.out.print(arr[arr.length-1]+" ");
                }
                if (n==1) {
                    if (arr[arr.length-1]<=r && arr[arr.length-1]>=l) {
                        if(c=='+') {                            
                            arr[arr.length-1]+=1;
                        }
                        else {
                            arr[arr.length-1]-=1;
                        }
                    }
                    System.out.print(arr[arr.length-1] +" ");
                }
            }
            System.out.println();
        }
    }
}
