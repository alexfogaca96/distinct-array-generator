import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {

    /**
     * Given a positive N, create a N-sized array
     * of unique integers that sum up to zero.
     */
    public int[] solution(final int N) {
        final int[] sumUpToZero = new int[N];
        for (int i = 1, j = i - 2; i <= N / 2; i++) {
            sumUpToZero[++j] =  i;
            sumUpToZero[++j] = -i;
        }
        if (N % 2 == 1) {
            sumUpToZero[N - 1] = 0;
        }
        return sumUpToZero;
    }
}