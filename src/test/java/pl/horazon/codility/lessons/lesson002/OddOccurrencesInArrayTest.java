package pl.horazon.codility.lessons.lesson002;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {
    @Test
    void solution() {
        Assertions.assertThat(OddOccurrencesInArray.solutionA(new int[]{9, 3, 9, 3, 9, 7, 9})).isEqualTo(7);
        Assertions.assertThat(OddOccurrencesInArray.solutionB(new int[]{9, 3, 9, 3, 9, 7, 9})).isEqualTo(7);
    }
}