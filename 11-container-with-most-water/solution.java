// 5 ms | 77.4 MB
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxWater=0;

        while(left<right){
            int width=right-left;
            int h=Math.min(height[right],height[left]);
            int currWater=width*h;
            maxWater=Math.max(maxWater,currWater);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}