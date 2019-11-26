package pl.horazon.codility.lessons.lessons009;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    @Test
    void solution() {
        Assertions.assertThat(MaxProfit.solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367})).isEqualTo(356);
    }
}