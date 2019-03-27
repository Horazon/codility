package pl.horazon.codility.lessons.lesson002;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {

        int len = A.length;

        if(len != 0) {
            for (int i = 0; i < K; i++) {
                int last = A[len - 1];
                System.arraycopy(A, 0, A, 1, len - 1);
                A[0] = last;
            }
        }

        return A;
    }
}
