package pl.horazon.codility.lessons.lesson001;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryGapTest {
    @Test
    void count() {
        //org.assertj.core.api.Assertions.assertThat(BinaryGap.count(3)).isEqualTo(0);
        //assertThat(BinaryGap.count(529 )).isEqualTo(4);
        assertThat(BinaryGap.count(1610612737 )).isEqualTo(28);
    }
}