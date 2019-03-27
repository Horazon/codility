package pl.horazon.codility.lessons.lesson003;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJumpTest {

    @Test
    void solution() {
        Assertions.assertThat(FrogJump.solution(10,85,30)).isEqualTo(3);
        Assertions.assertThat(FrogJump.solution(0,999999996,2)).isEqualTo(499999998);

    }
}