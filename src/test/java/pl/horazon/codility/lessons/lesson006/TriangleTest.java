package pl.horazon.codility.lessons.lesson006;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void solution() {
        Assertions.assertThat(Triangle.solution(new int[]{10, 2, 5, 1, 8, 20})).isEqualTo(1);
        Assertions.assertThat(Triangle.solution(new int[]{10, 50, 5, 1})).isEqualTo(0);
    }
}