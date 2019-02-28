import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class solution2 {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long,Long> h=new HashMap<>();
        long c=0;
        for(Long e:arr)
        {
            if(h.containsKey(e))
            {
                h.put(e, h.get(e)+1L);
            }
            else
            {
                h.put(e,1L);
            }
        }
        Set<Long> map=h.keySet();
        for(Long element:map)
        {
            if(h.containsKey(element*r)&&h.containsKey(element*r*r))
            {
                c=c+h.get(element*r)*h.get(element*r*r)*h.get(element);
            }
        }
        return c;

    }

    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner abc=new Scanner(System.in);
        //String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = abc.nextInt();

        long r = abc.nextInt();

       // String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long arrItem = abc.nextLong();
            arr.add(arrItem);
        }

        long ans = countTriplets(arr, r);
        System.out.println(ans);
        //bufferedWriter.write(String.valueOf(ans));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}
