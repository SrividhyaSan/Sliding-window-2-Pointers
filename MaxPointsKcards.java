package StudyOpedia;

public class MaxPointsKcards {
    // Maximum points with k cards by taking elements from front or
    // back or front & back but not from middle in array
    public static void main(String[] args) {
      int a[]={5,4,1,1,3,2};
      int k=3,sum=0,maxsum=0,index1=0,index2=0,p=a.length;
      for(int i=0;i<k;i++){
          sum+=a[i];

      }
        maxsum=Math.max(maxsum,sum);
        index1=0;index2=2;
        for(int i=0;i<k;i++){
            sum-=a[k-i-1];
            sum+=a[p-1-i];
            if(sum>maxsum){
                maxsum=sum;
                index1=k-i-2; index2=p-2-i;
            }

        }

      System.out.println(" maxsum "+maxsum+" index1 "+index1+" index2 "+index2);
    }
}
