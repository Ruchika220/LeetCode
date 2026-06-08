class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer str = new StringBuffer();
        int n = s.length();
        int count = 0;
        for(int i = 0; i<n; i++)
        {
            char ch = s.charAt(i);
            if(ch == '('){
            count++;
            if(count >1){
                str.append(ch);
            } 
        }
        else{
            count --;
            if(count >= 1){
                str.append(ch);
            }
        }
        }
        return str.toString();
    }
}