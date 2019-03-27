package pl.horazon.codility.lessons.lesson004;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PermCheckTest {

    @Test
    void solution() {
        Assertions.assertThat(PermCheck.solution(new int[]{4, 1, 3, 2})).isEqualTo(1);
        Assertions.assertThat(PermCheck.solution(new int[]{4, 1, 3})).isEqualTo(0);
    }
}