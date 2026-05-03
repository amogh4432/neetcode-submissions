class Solution {
    public String sorted(String s) {
    int[] freq = new int[26];
    for (char c : s.toCharArray()) {
        freq[c - 'a']++;
    }
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 26; i++) {
        while (freq[i] > 0) {
            sb.append((char) (i + 'a'));
            freq[i]--;
        }
    }
    return sb.toString();
} 
    public List<List<String>> groupAnagrams(String[] strs) {

    HashMap<String , List<String>> map= new HashMap<>();

    for(String str:strs){
        if(!map.containsKey(sorted(str))){
            map.put(sorted(str), new ArrayList<>());
        }

        map.get(sorted(str)).add(str);
    }

    System.out.println(map);

    return new ArrayList<>(map.values());

        
    }
}
