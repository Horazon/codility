package pl.horazon.codility.lessons.lesson001;

public class BinaryGap {

    public static int count(int number){

        char[] chars = Integer.toBinaryString(number).toCharArray();

        boolean isStarted = false;
        int len = 0;
        int max = 0;

        for(char c : chars){

            if(isStarted){
                if(c == '0'){
                    len++;
                } else {
                    max = len > max ? len : max;
                    len = 0;
                    isStarted = true;
                }

            } else if (c == '1'){
                isStarted = true;
            }
        }

        return max;
    }
}
