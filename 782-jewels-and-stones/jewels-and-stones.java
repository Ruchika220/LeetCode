class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> str = new HashSet<>();
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            str.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (str.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}