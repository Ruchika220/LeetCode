class Solution {
    public boolean rotateString(String s, String goal) {
       String ch = s + s;
       if(s.length() != goal.length()){
        return false;
       }
       return ch.contains(goal);
    }
}