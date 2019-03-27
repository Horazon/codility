package pl.horazon.codility.lessons.lesson003;

public class TapeEquilibrium {

    public static int solution(int[] A){

        int len = A.length;
        int lastIdx = A.length-1;

        int[] sums = new int[len];

        sums[0]=A[0];

        for(int i=1; i<len; i++)
        {
            sums[i]=sums[i-1]+A[i];
        }

        if(len==2){
            return sums[1];
        }

        int min = Math.abs(2*sums[0]-sums[lastIdx]);

        for(int i=1; i<len; i++){
            int cmin = Math.abs(2*sums[i-1]-sums[lastIdx]);
            min = cmin > min ? min : cmin;
        }

        return min;
    }
}
