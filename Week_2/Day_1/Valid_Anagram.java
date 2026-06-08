class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
                int n = s.length();
                for(int i = 0; i<n ; i++){
                    char c = s.charAt(i);
                    if(map.containsKey(c)){
                        map.put(c, map.get(c)+1);
                    }else{
                        map.put(c, 1);
                    }
                }
                for( int i = 0 ; i< t.length() ; i++){
                  char c = t.charAt(i);
                  if(!map.containsKey(c)){
                    return false;
                  }else if(map.get(c) == 1){
                    map.remove(c);
                  }else{
                    map.put(c , map.get(c)-1);
                  }
                }
                return map.isEmpty();
        
    }
}
