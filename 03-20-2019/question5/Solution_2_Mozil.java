class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums == null || nums.length == 0 ) return new int[]{-1, -1};
        
        int[] result = new int[2];
        
        result[0] = firstEqualorGreater(nums,target);
        
        if(nums[result[0]] != target) {
            return new int[]{-1, -1};
        }
        
        result[1] = firstEqualorGreater(nums,target + 1) - 1;
        
        return result;
    }
    
    private int firstEqualorGreater(int[] nums, int target){
        
        int start = 0;
        int end = nums.length;
        
        while(start < end) {
            
            int mid = start + (end - start) / 2;
            
            if(nums[mid] >= target) {
                
                end = mid;
                
            } else{
                
                start = mid + 1;
                
            }         
        }
        
        return start;
    }                
}