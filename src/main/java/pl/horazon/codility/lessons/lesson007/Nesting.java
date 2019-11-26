package pl.horazon.codility.lessons.lesson007;

import java.util.Stack;

@SuppressWarnings("WeakerAccess")
public class Nesting {

    private static final Character OPEN = '(';
    private static final Character CLOSE = ')';

    public static int solution(String input) {
        Stack<Character> st = new Stack<>();

        boolean valid = true;

        if (input.startsWith(CLOSE.toString())) {
            valid = false;
        } else {

            for (char c : input.toCharArray()) {

                if (c == OPEN) {
                    st.push(c);
                } else if (!st.empty() && st.peek().equals('(')) {
                    st.pop();
                } else {
                    valid = false;
                }
            }

            valid &= st.size() == 0;
        }

        return valid ? 1 : 0;
    }
}