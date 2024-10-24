import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class A1876 {
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
            int p = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            PriorityQueue<Element> pq = new PriorityQueue<>(Comparator.comparing(Element::cost));
            pq.offer(new Element(p, n));
            long result = 0;
            int[] sortedIndices =
                IntStream.range(0, a.length)
                    .boxed()
                    .sorted(Comparator.comparing(i -> b[i]))
                    .mapToInt(Integer::intValue)
                    .toArray();
            for (int index : sortedIndices) {
                Element head = pq.poll();
                result += head.cost();
                if (head.count() != 1) {
                    pq.offer(new Element(head.cost(), head.count() - 1));
                }

                pq.offer(new Element(b[index], a[index]));
            }
            System.out.println(result);
        }
    }
}

record Element(int cost, int count) {}