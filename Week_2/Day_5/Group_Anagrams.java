class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       HashMap<String , List<String>> map = new HashMap<>();
        for( int i = 0 ; i< strs.length ; i++){
            String s = strs[i];

            char[] arr =s.toCharArray();
            Arrays.sort(arr);
  String x = new String(arr);

            if(!map.containsKey(x)){
                map.put(x , new ArrayList<>());

            }
            map.get(x).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
