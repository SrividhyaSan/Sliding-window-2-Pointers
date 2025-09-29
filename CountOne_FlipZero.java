Given a binary array nums and an integer k, flip at most k 0's.

Return the maximum number of consecutive 1's after performing the flipping operation.


Examples:
Input : nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0] , k = 3

Output : 10

Explanation : The maximum number of consecutive 1's are obtained only if we flip the 0's present at position 3, 4, 5 (0 base indexing).

The array after flipping becomes [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0].

The number of consecutive 1's is 10.

Input : nums = [0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1] , k = 3

Output : 9

Explanation : The underlines 1's are obtained by flipping 0's in the new array.

[1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1].

The number of consecutive 1's is 9.

Input : nums = [1, 1, 0, 0, 1] , k = 3
package StudyOpedia;
// IN SLIDING WINDOW AND 2 POINTERS ,WHEN CONDTN FAILS INCREMENT i VALUE AND SATISFY THE CONTN (BY REDUCING THE K)
public class CountOne_FlipZero {
    public static void main(String[] args){
        int a[]={0,0,1,1,1,0,0,1,0,0,1,0,1};
        int i=0,j=0,k=3,zeros=0,maxlen=0;
        // move i when flip>k and j+1 !=1
        while(j<a.length){
           if(a[j]==0) zeros++;
           while(zeros>k){ // if(zeros>k){}  SO TIME COMPLEXITY O(N) BUT FOR while(zeros>k){} O(N+N)
               if(a[i]==0) zeros--;
               i++;
           }
           if(zeros<=k){
               maxlen=Math.max(maxlen,j-i+1);
           }
            j++;
        }
        System.out.println("maxlen "+maxlen);
    }
}

