package pl.horazon.codility.lessons.lesson003;

public class PermMissingElem {

    public static int solutionA(int[] A) {

        int MAX = 100002;

        byte[] occurences = new byte[MAX];

        for(int c : A){
            occurences[c] = 1;
        }

        for(int i=1; i<MAX; i++){
            if(occurences[i]==0){
                return i;
            }
        }

        return 0;
    }

    public static int solutionB(int[] A) {
        long N = A.length + 1;
        long total = (N * (N + 1)) / 2;

        long sum = 0L;

        for (int i : A) {

            sum += i;
        }

        return (int)(total - sum);
    }
}
