import java.util.HashMap;
import java.util.Map;

public class CountBinarySubaryKSum {
   public static void main(String [] args)  {
       int a[] = {1, 0, 0,1, 1, 0};
       int i = 0, j = 0, count = 0,n= a.length, sum = 0, k = 2;
        Map<Integer,Integer> SumCount = new HashMap<>();
        SumCount.put(0, 1);
        for(int num:a){
            sum+=num;
            count+=SumCount.getOrDefault(sum-k,0);
            SumCount.put(sum,SumCount.getOrDefault(sum,0)+1);
        }
        System.out.println("count "+count);
    }
}
// while (j <n ||(j==n-1 && n-i+1>=k)) {
//            sum += a[j];
//            while (sum>k){
//                sum-=a[i];
//                i++;
//            }
//            if(sum==k) {
//                int p=i,value=0;
//                while (sum == k && j>=i) {
//                    count++;
//                    value+=a[i];
//                    sum-=a[i];
//                   i++;
//                }
//                if(j<n-1) {
//                    i = p;
//                    sum+=value;
//                }
//            }
//           System.out.println(count+" j"+j + " sum "+sum);
//            j++;
//        }