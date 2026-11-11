class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> nums = new ArrayDeque<>();
        int ans = 0;
        for (String token : tokens) {
            if (token.equals("+") || 
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")) {
                int f = nums.pop();
                int s = nums.pop();
                int result = 0;
                switch(token) {
                    case "+": result+=f+s;break;
                    case "-": result+=s-f;break;
                    case "*": result+=f*s;break;
                    case "/": result+=s/f;break;
                }
                nums.push(result);
            } else {
                nums.push(Integer.parseInt(token));
            }

        }
        return nums.pop();
    }
}
