import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A144 {
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
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int mini = 0;
        for(int i = 0;i<n;i++) {
            if(arr[i]<=min) {
                min = arr[i];
                mini = i;
            }
        }
        int ans = 0;
        for(int i = mini;i<n-1;i++) {
            swap(arr, i, i+1);
            ans++;
        }
        int max = Integer.MIN_VALUE;
        int maxi = 0;
        for(int i = 0;i<n;i++) {
            if(arr[i]>max) {
                max = arr[i];
                maxi = i;
            }
        }
        for(int i = maxi;i>0;i--) {
            swap(arr, i, i-1);
            ans++;
        }
        System.out.println(ans);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
