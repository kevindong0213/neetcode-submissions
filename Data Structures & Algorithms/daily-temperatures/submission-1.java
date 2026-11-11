class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = temperatures.length;
        int[] result = new int[n];
        for (int i = 0;i < n;i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int waitingDay = stack.pop();
                result[waitingDay] = i - waitingDay;
            }
            stack.push(i);
        }
        return result;
    }
}
