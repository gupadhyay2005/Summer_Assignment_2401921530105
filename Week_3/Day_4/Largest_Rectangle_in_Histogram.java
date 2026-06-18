class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int left[] = new int[n];
        int right[] = new int[n];
        int k = 0;

        for(int  i = 0; i< n ; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                left[k++] =-1;
            }else{
                left[k++] =s.peek();
            }
            s.push(i);


        }
        k=n-1;
        s.clear();
        for(int  i = n-1; i  >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                right[k--] =n;
            }else{
                right[k--] =s.peek();
            }
            s.push(i);


        }
        int maxarea  = 0;
        int area  = 0;
        int width ;
        for( int i = 0 ; i< n ; i++){
           width = right[i] - left[i] -1;
           area = heights[i]*width;
            maxarea = Math.max(area , maxarea);
            

        }
        return maxarea ;
   

        
        
        
    }
}
