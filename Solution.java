import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {

    /**
     * Given a positive N, create a N-sized array
     * of unique integers that sum up to zero.
     */
    public int[] solution(final int N) {
        final int[] sumUpToZero = new int[N];
        for (int i = 1; i < N; i += 2) {
            sumUpToZero[i - 1] = i;
            sumUpToZero[i] = -i;
        }
        if (N % 2 == 1) {
            sumUpToZero[N - 1] = 0;
        }
        return sumUpToZero;
    }
}