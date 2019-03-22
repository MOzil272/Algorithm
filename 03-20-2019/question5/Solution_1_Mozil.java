class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums == null || nums.length == 0 ) return new int[]{-1, -1};
        
        int[] result = new int[2];
        
        int start = 0;
        
        int end = nums.length - 1;
        
        while(start < end) {
            
            int mid = start + (end - start) / 2;
            
            if(nums[mid] >= target) {
                
                end = mid;
                
            } else{
                
                start = mid + 1;
                
            }
            
        
        }
                
        if(nums[start] != target) {
            
            return new int[]{-1, -1};
        }
        
        
       result[0] = start; 
       
                
       end = nums.length - 1;
        
       while(start < end) {
            
           int mid = start + (end - start + 1) / 2;
            
           if(nums[mid] > target) {
               
               end = mid - 1;
               
           }else {
               
              start = mid ;    
           }
        
        }
        
        result[1] =  start ;
        
        return result;
    }
}