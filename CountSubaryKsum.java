TO FIND LONGEST OR COUNT SUBARRAY = K SUM THAT CONTAINS ONLY +VE AND 0 , USE SLIDING WINDOW
TO FIND LONGEST OR COUNT SUBARRAY = K SUM THAT CONTAINS -VE, +VE AND 0 , USE PREFIXSUM MAP
    
package StudyOpedia;

public class CountSubaryKsum {
    public static void main(String[] args) {
        int a[]={5,4,1,1,3,2};
        int k=5,sum=0,maxsum=0,i=0,j=0,n=a.length,cnt=0;
        while(j<n){
            if(sum<=k){
                sum+=a[j];
            }
            while(sum>k){
                sum-=a[i];
                i++;
            }
            if(sum==k){
                cnt++;
            }
            j++;
        }
        System.out.println(cnt);
    }
}

