class Solution {
    public int reverse(int x) {
        int revNo=0;
        while(x != 0){
            int num =x % 10;

               if (revNo > Integer.MAX_VALUE / 10 ||
                revNo < Integer.MIN_VALUE / 10) {
                return 0;
            }

            revNo = (revNo * 10) + num;

            x = x / 10;
        }
        return revNo;
    }
}