class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String item: strs) {
            char[] chars = item.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars); 

            if (map.containsKey(sortedStr)){
                ArrayList<String> anagrams = map.get(sortedStr);
                anagrams.add(item); 
            } else {
                map.putIfAbsent(sortedStr, new ArrayList<>());
                map.get(sortedStr).add(item);
            }
        }

        return new ArrayList<>(map.values());
        
    }
}
