class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                nums.add(nums.pop()+nums.pop());
            }
            else if(s.equals("-")){
               int a= nums.pop();
               int b = nums.pop();
               nums.add(b-a);
            }
            else if(s.equals("*")){
                nums.add(nums.pop()* nums.pop());
            }
            else if(s.equals("/")){
                int a = nums.pop();
                int b = nums.pop();
                nums.add(b/a);
            }
            else {
                nums.add(Integer.parseInt(s));
            }
        }
        return nums.pop();
        
    }
}


// stack<Integer> - 4 , 13 , 5
// 13/5 + 4

// stack<Integer> - 

// (1+2)*3
