package pl.horazon.codility.lessons.lesson004;

import java.util.BitSet;
import java.util.HashSet;

/**
  This is a demo task.

  Write a function:

    class Solution { public int solution(int[] A); }

  that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

  For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

  Given A = [1, 2, 3], the function should return 4.
  Given A = [−1, −3], the function should return 1.

  Write an efficient algorithm for the following assumptions:

    - N is an integer within the range [1..100,000];
    - each element of array A is an integer within the range [−1,000,000..1,000,000].
  */
public class MissingInteger {

    // fails with java.lang.OutOfMemoryError
    public static int solutionA(int[] A) {

        BitSet set = new BitSet(1000000000);

        for(int a : A){
            if(a>0)
            set.flip(a);
        }

        return set.nextSetBit(0);
    }

    // 100/100
    public static int solutionB(int[] A) {

        boolean[] seen = new boolean[1000001];

        for (int i : A) {
            if (i > 0)
                seen[i] = true;
        }

        int min=1;
        while(seen[min])
            min++;

        return min;
    }
}
