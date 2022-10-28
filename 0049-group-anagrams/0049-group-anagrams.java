class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list = new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();
        
        for(String current : strs){
            char[] chars = current.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            if(!map.containsKey(sorted)){
                map.put(sorted , new ArrayList<>());
            }
            map.get(sorted).add(current);
        
        }
        list.addAll(map.values());
        return list;
        
    }
}