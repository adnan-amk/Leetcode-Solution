class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack=new Stack<>();
        if(str.length()%2!=0)
            return false;
        for(Character ch:str.toCharArray()){
            // Push all opening brackets to the stack
            if(ch=='(' || ch=='{' || ch=='[')
                stack.push(ch);
            // For closing brackets, check if stack is empty and match it with the top of the stack
            else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty())
                    return false;
                char top=stack.peek();

                 // Check if the top of the stack is a matching opening bracket
                if( ch==')' && top=='(' || ch=='}' && top=='{' || ch==']' && top=='[')
                    stack.pop();  
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}