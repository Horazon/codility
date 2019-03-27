package pl.horazon.codility.lessons.lesson002;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public static int solutionA(int[] A) {
        Set<Integer> set = new HashSet<>();

        for(int a : A){
            if(set.contains(a)){
                set.remove(a);
            } else {
                set.add(a);
            }
        }

        return set.iterator().next();
    }

    public static int solutionB(int[] A) {
        BitSet set = new BitSet(1000000000);

        for(int a : A){
            set.flip(a);
        }

        return set.nextSetBit(0);
    }
}
