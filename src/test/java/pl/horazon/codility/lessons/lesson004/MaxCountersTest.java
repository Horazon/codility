package pl.horazon.codility.lessons.lesson004;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {

    @Test
    void solution() {
        Assertions
                .assertThat(MaxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}))
                .isEqualTo(new int[]{3, 2, 2, 4, 2});
    }
}