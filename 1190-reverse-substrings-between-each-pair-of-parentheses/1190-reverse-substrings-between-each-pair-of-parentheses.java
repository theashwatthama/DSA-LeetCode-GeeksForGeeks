class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!=')'){
                stack.push(ch);
            } else {
                StringBuilder st=new StringBuilder();
                while(stack.peek()!='('){
                    st.append(stack.pop());
                }
                stack.pop();

                for(char c: st.toString().toCharArray()){
                    stack.push(c);
                }
            }
        }

        StringBuilder ans =new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}