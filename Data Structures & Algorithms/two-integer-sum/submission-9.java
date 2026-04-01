class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(!mp.containsKey(diff)){
                mp.put(nums[i],i);
            }
            else{
                return new int[]{mp.get(diff),i};
            }
        }
        return new int[0];
    }
}
