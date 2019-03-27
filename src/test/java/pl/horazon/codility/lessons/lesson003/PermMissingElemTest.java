package pl.horazon.codility.lessons.lesson003;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {

    @Test
    void solution() {
        Assertions.assertThat(PermMissingElem.solutionA(new int[]{2,3,1,5})).isEqualTo(4);
        Assertions.assertThat(PermMissingElem.solutionA(new int[]{2,3,1,100000})).isEqualTo(4);
    }
}