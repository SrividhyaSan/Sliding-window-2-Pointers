1.Given a binary array nums and an integer goal. Return the number of non-empty subarrays with a sum goal.
A subarray is a continuous part of the array.
Examples:
Input : nums = [1, 1, 0, 1, 0, 0, 1] , goal = 3

Output : 4

Explanation : The subarray with sum 3 are

[1, 1, 0, 1]

[1, 1, 0, 1, 0]

[1, 1, 0, 1, 0, 0]

[1, 0, 1, 0, 0, 1].

Input : nums = [0, 0, 0, 0, 1] , goal = 0

Output : 10

Explanation : Some of the subarray with sum 0 are

[0]

[0, 0]

[0, 0, 0]

[0, 0, 0, 0]

2. Given an array nums and an integer k. An array is called nice if and only if it contains k odd numbers. Find the number of nice subarrays in the given array nums.
A subarray is continuous part of the array.
Examples:
Input : nums = [1, 1, 2, 1, 1] , k = 3
Output : 2
Explanation : The subarrays with three odd numbers are

[1, 1, 2, 1]

[1, 2, 1, 1]

Input : nums = [4, 8, 2] , k = 1

Output : 0

Explanation : The array does not contain any odd number.
 For this change odd num to 1 and even num to 0
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

