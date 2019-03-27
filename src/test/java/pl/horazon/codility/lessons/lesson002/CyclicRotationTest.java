package pl.horazon.codility.lessons.lesson002;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    @Test
    void solution() {
        Assertions.assertThat(CyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3)).isEqualTo(new int[]{9, 7, 6, 3, 8});
        Assertions.assertThat(CyclicRotation.solution(new int[]{1, 2, 3, 4}, 4)).isEqualTo(new int[]{1, 2, 3, 4});
        Assertions.assertThat(CyclicRotation.solution(new int[]{}, 4)).isEqualTo(new int[]{});
    }
}