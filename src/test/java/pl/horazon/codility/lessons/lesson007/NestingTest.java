package pl.horazon.codility.lessons.lesson007;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NestingTest {

    @Test
    void solution() {
        Assertions.assertThat(Nesting.solution("(()(())())")).isEqualTo(1);
        Assertions.assertThat(Nesting.solution("())")).isEqualTo(0);
        Assertions.assertThat(Nesting.solution(")()")).isEqualTo(0);
        Assertions.assertThat(Nesting.solution(")()(")).isEqualTo(0);
        Assertions.assertThat(Nesting.solution("((())")).isEqualTo(0);
    }
}