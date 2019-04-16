package pl.horazon.codility.lessons.lesson006;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DistinctTest {

    @Test
    void solution() {
        Assertions.assertThat(Distinct.solution(new int[]{2, 1, 1, 2, 3, 1})).isEqualTo(3);
    }
}