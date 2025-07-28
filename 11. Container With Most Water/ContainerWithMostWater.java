class Solution {
    public int maxArea(int[] height) {
        int first=0, last=height.length-1;
        int maxArea=0;
        while(first<last){
            int currentHeight=Math.min(height[first],height[last]);
            int currentWidth=last-first;
            int area=currentHeight*currentWidth;
            maxArea=Math.max(maxArea,area);
        
        if(height[first]<height[last]){
            first++;
        }
        else{
            last--;
        }}
        return maxArea;
        
    }
}

// time comp-O(n)
// space comp - O(1)
