class Solution {
    public int compress(char[] chars) {
        
        int j =0;
        int k =0;
        int n =chars.length;
        int length =0;
        for( int i = 0; i<n ; i++ ){
            char s = chars[i];
            int count =1;
           
                while( i+1< chars.length &&chars[i] ==(chars[i+1])){
                    count++;
                    i++;
                
                }
        
                chars[k++]=s;
                length++;
                if(count>1){
                    String num ="" + count;
                    for( char c : num.toCharArray()){
                        chars[k++] =c;
                    
                
                length++;
            }
        }
        }
        return length;
        
    }
}
