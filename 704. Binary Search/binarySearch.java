class Solution {
    public int search(int[] nums, int target) {
        int low = 0 , high = nums.length-1;
        while(low<=high){
            int mid= low +(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]> target){
                high=mid-1;
            }

            else{
                low= mid+1;
            }
        }
        return -1;
        
    }
}

// i1 --> low = 0 , high = 5 , mid = 0+(5-0)/2; mid= 2 ; 3<9
// i2 --> low= 3 , high = 5 , mid= 3+(5-2)/2; mid = 3 ; 5 < 9
// i3 --> low 4 , high =5 , mid = 4+(5-4)/2; mid = 4 ;9 ==9 
