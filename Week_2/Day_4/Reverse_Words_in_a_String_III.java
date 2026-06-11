class Solution {
    public String reverseWords(String s) {
    
    int n = s.length();
    String x ="" ;
    String y ="";
        for( int i = 0 ; i<n ; i++){
            char c = s.charAt(i);
            if(c ==' '){
                int a= y.length() -1;
                 
                while(a>=0){
                   x+=y.charAt(a);
                   a--;
                   
                }
                x+=' ';
                y="";
            }else{
            y+=c;
            }
      
        
    }
       
      int   a =y.length() -1;
                while(a>=0){
                   x+=y.charAt(a);
                   a--;
                   
                }
    return x;
        
    }
}
