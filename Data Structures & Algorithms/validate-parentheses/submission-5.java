class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        if(charArray.length % 2 != 0) { return false; }
        for(int i=0;i<charArray.length;i++) {
            if(charArray[i] == ')') {
                if(stack.isEmpty()) return false;
                char lastPop = stack.pop();
                if(lastPop != '(') {
                    return false;
                }
            }
            else if(charArray[i] == '}') {
                if(stack.isEmpty()) return false;
                char lastPop = stack.pop();
                if(lastPop != '{') {
                    return false;
                }
            }
            else if(charArray[i] == ']') {
                if(stack.isEmpty()) return false;
                char lastPop = stack.pop();
                if(lastPop != '[') {
                    return false;
                }
            } else {
                stack.push(charArray[i]);
            }
        }
        return stack.isEmpty();
    }
}
