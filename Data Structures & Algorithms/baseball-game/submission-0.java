class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int right;
        int left;
        for (String op : operations) {
                if (op.equals("+") || op.equals("C") || op.equals("D")) {
                    switch (op) {
                        case "+" :
                        right = stack.pop();
                        left = stack.pop();
                        stack.push(left);
                        stack.push(right);
                        stack.push(right + left);
                        break;
                        case "C" :
                        stack.pop();
                        break;
                        case "D" :
                        right = stack.peek();
                        stack.push(right * 2);
                        break;
                    }
                } else {
                    stack.push(Integer.parseInt(op));
                }

        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        
        return result;
    }
}