package pl.horazon.codility.lessons.lesson006;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductOfThreeTest {

    @Test
    void solution() {
        Assertions.assertThat(MaxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6})).isEqualTo(60);
    }

}