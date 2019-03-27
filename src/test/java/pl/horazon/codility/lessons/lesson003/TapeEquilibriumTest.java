package pl.horazon.codility.lessons.lesson003;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.horazon.codility.lessons.lesson002.CyclicRotation;

class TapeEquilibriumTest {

    @Test
    void solution() {
        Assertions.assertThat(TapeEquilibrium.solution(new int[]{3,1,2,4,3})).isEqualTo(1);
        Assertions.assertThat(TapeEquilibrium.solution(new int[]{1000,1000})).isEqualTo(2000);
        Assertions.assertThat(TapeEquilibrium.solution(new int[]{1,2})).isEqualTo(2);

    }
}