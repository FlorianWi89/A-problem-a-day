import java.util.Stack;

public class Temperatures {
    // Given an array of integers temperatures represents the daily temperatures,
    // return an array answer such that answer[i] is the number of days you have to
    // wait after the ith day to get a warmer temperature.
    // If there is no future day for which this is possible, keep answer[i] == 0
    // instead.

    // O(n) because every index will only pushed once onto the stack
    public int[] dailyTemps(int[] temps) {
        int n = temps.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            while (!stack.empty() && temps[stack.peek()] < temps[i]) {
                result[i] = i - stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
