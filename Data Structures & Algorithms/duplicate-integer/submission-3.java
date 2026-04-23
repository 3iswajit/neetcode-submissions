class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int num : nums){
            if(!s.contains(num)){
                s.add(num);
            }
            else{
                return true;
            }
        }
        return false;
    }
}