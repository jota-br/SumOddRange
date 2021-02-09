public class SumOddRange {

    public static boolean isOdd(int number) {
        if(number < 1) {
            return false;
        }
        if(number % 2 != 0) {
            return true;
        }

        return false;
    }

    public static int sumOdd(int start, int end) {
        if((start > end) || (start <= 0) || (end <= 0)) {
            return -1;
        }
        int k = 0;
        for(int i = start; i <= end; i++) {
            if(isOdd(i)) {
                k += i;
            }
        }
        return k;
    }
}
