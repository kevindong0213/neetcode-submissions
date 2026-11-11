class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> nums = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.equals("+") || 
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")) {
                int right = nums.pop();
                int left = nums.pop();
                int result = 0;
                switch(token) {
                    case "+": result =left+right;break;
                    case "-": result =left-right;break;
                    case "*": result =left*right;break;
                    case "/": result =left/right;break;
                }
                nums.push(result);
            } else {
                nums.push(Integer.parseInt(token));
            }

        }
        return nums.pop();
    }
}
