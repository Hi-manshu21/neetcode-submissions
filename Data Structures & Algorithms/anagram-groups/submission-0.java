class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0){
            return  new ArrayList<>();
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            
            String freqString = frequencyOfString(s);

            if(map.containsKey(freqString)){
                map.get(freqString).add(s);
            }
            else{
                List<String> strlist = new ArrayList<>();
                strlist.add(s);
                map.put(freqString,strlist);
            }
        }

        return new ArrayList<>(map.values());
    }

    private String frequencyOfString(String s){
        int [] freq = new int [26];

        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder("");
        char c = 'a';
        for(int i=0;i<26;i++){
            sb.append(c);
            sb.append(freq[i]);
            c++;
        }

        return sb.toString();
    }
}
