package StudyOpedia;

public class MaxLenKsum {
    public static void main(String[] args) {
        int a[] = {2,5,1,7,10}; // Longest subarray when sum<=k
        int k = 14, sum = 0,maxsum=0, maxlen = 0, i = 0, j = 0, n = a.length,index1=0,index2=0;
        while (j < n) {
            sum += a[j];
            while (sum > k) {
                sum -= a[i];
                i++;
            }
            if (sum <= k) {
                if((sum > maxsum && maxlen == j - i + 1)){
                index1 = i;
                index2 = j;
                }
                maxlen = Math.max(maxlen, j - i + 1);
                maxsum = Math.max(maxsum, sum);
            }
            j++;

            System.out.println("maxlen=" + maxlen + " index1=" + index1 + " index2=" + index2 + " maxsum=" + maxsum);
        } }
}