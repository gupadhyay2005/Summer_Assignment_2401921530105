class Solution {
    public int maxArea(int[] height) {
  int maxwater =0;
  int n =height.length;
  int rpp =  n-1;
  int lpp =0;
  while(lpp<rpp){
    int w = rpp -lpp;
     int minh =Math.min(height[rpp], height[lpp]);
     int currwater =w*minh;
     maxwater = Math.max(currwater , maxwater);
     if(height[lpp] <height[rpp]){
        lpp++;
     }
     else{
        rpp--;
     }

  }
  return maxwater;
    }
}
