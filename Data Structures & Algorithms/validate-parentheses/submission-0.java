class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (!isPair(open, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isPair(char open, char close) {
        return (open == '(' && close == ')')
        || (open == '{' && close == '}')
        || (open == '[' && close == ']');
    }
}
