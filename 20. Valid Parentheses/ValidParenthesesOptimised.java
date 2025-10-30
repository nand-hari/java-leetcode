class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int top= -1;

        for(char c : chars){
            if(c=='(' || c=='{' || c=='['){
                chars[++top]=c;
            }
            else{
                if(top<0) return false;
                char open=chars[top--];
                if(!matcher(open,c)) return false;
            }
        }

       return  top == -1;
    }

    public boolean matcher(char open, char close){
        return (open == '{' && close == '}') ||
        (open == '[' && close == ']') ||
        (open == '(' && close == ')');
    }
}

//chars[]='(','[',']',')';
