class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> h = new Hashtable<>();
        for(int i = 0;i < nums.length;i++){
            if(h.containsKey(nums[i])) return true;
            else h.put(nums[i],i+1);
        }
        return false;
    }
}