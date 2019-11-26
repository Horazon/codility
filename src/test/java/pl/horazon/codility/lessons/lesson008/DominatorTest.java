package pl.horazon.codility.lessons.lesson008;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DominatorTest {

    @Test
    void solution() {
        Assertions.assertThat(Dominator.solution(new int[]{1, 1, 0, 0, 1})).isEqualTo(4);
        Assertions.assertThat(Dominator.solution(new int[]{1, 1, 0, 0})).isEqualTo(-1);
        Assertions.assertThat(Dominator.solution(new int[]{1, 2, 3})).isEqualTo(-1);
    }
}