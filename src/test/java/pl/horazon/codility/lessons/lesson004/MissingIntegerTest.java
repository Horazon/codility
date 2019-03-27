package pl.horazon.codility.lessons.lesson004;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    void solutionA() {
        Assertions
                .assertThat(MissingInteger.solutionA(new int[]{1, 3, 6, 4, 1, 2}))
                .isEqualTo(5);
    }

    @Test
    void solutionB() {
        Assertions
                .assertThat(MissingInteger.solutionB(new int[]{1, 3, 6, 4, 1, 2}))
                .isEqualTo(5);
    }
}