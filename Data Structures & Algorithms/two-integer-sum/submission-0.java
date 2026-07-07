class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();

        int i = 0;
        for (int n: nums){

            int need = target - n;
            
            if (intMap.containsKey(need)){
                int[] indexList = {intMap.get(need), i};
                return indexList;
            } else {
                intMap.put(n, i);
            }

            i++;
        }
        return null;
    }
}
