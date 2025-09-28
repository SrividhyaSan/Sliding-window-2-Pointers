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
