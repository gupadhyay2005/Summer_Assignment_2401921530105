class Solution {
    public boolean isPalindrome(String s) {
        String g = "";
        for( int i = 0 ; i<s.length() ; i++){
             char ch = s.charAt(i);

if (!(ch >= 'a' && ch <= 'z') &&
    !(ch >= 'A' && ch <= 'Z') &&
    !(ch >= '0' && ch <= '9')) {
    continue;
}

g += ch;
g =g.toLowerCase();
        }
        int i = 0;
        int j = g.length() - 1;
        while(i<j){
            if(g.charAt(i)!= g.charAt(j)){
                return false;
                
            }
            i++;
                j--;
        }
        return true;
        
    }
}
