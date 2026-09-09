class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int pre[] = new int[n];
        int suff[] = new int[n];
        int res[] = new int[n];
        
        pre[0] = 1;
        suff[n - 1] = 1;

        for(int i = 1;i < n;i++) pre[i] = nums[i - 1] * pre[i - 1];

        for(int j = n - 2;j >= 0;j--) suff[j] = nums[j + 1] * suff[j + 1];

        for(int i = 0;i < n;i++) res[i] = pre[i] * suff[i];

        return res;
        
    }
}  
