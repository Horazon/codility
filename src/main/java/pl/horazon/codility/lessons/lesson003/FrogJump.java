package pl.horazon.codility.lessons.lesson003;

public class FrogJump {
    public static int solution(int X, int Y, int D) {
        if ((Y - X) % D == 0) {
            return (Y - X) / D;
        }
        return (Y - X) / D + 1;
    }
}
