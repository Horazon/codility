package pl.horazon.codility.lessons.lessons009;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSliceSumTest {

    @Test
    void solution() {
        Assertions.assertThat( new MaxSliceSum().solution(new int[]{3, 2, -6, 4, 0})).isEqualTo(5);
        Assertions.assertThat( new MaxSliceSum().solution(new int[]{5, -7, 3, 5, -2, 4, -1})).isEqualTo(10);
        Assertions.assertThat( new MaxSliceSum().solution(new int[]{-2, -3, 4, -1, -2, 1, 5, -3})).isEqualTo(7);
        Assertions.assertThat( new MaxSliceSum().solution(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})).isEqualTo(6);
    }
}