class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complemnt = target - nums[i];

            if(map.containsKey(complemnt)){
                return new int[]{map.get(complemnt),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
