class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> nonDups = new HashSet<Integer>();

        for (int i: nums){
            if(!nonDups.contains(i)){
                nonDups.add(i);
            } else {
                return true;
            }
        }

        return false;
    }
}