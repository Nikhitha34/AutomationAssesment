package Assesment;

public class RepeatElement {
    void printRepeating(String[] arr1,String[] arr2,int length1, int length2)
    {
        String[] finalArr=new String[length1+length2];
        int i;
        int j;
        int total= length1+length2;
        int[] freq =new int[total];
        System.out.println("Output :");
        for (i = 0; i < total; i++) {
            freq[i] = -1;
        }
        System.arraycopy(arr1, 0, finalArr, 0, length1);
        System.arraycopy(arr2, 0, finalArr, length1, length2);
            for (i=0;i<total;i++)
            {
                int count=1;
                for(j=i+1;j<total;j++) {
                    if (finalArr[i].equals(finalArr[j])) {
                        count++;
                        freq[j] = 0;
                    }
                }
                if(freq[i]!=0) {
                    freq[i] = count;
                }
            }
            for(i=0;i<total;i++){
                if(freq[i]!=0)
                    System.out.println("No of duplicates found for"+finalArr[i]+"="+freq[i]);

        }
    }
}
