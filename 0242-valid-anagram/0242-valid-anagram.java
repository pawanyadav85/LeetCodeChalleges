class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char ele : s.toCharArray()){
            map1.put(ele,map1.getOrDefault(ele,0) + 1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ele : t.toCharArray()){
        map2.put(ele,map2.getOrDefault(ele,0) + 1);
        }
        for(char ele : map1.keySet()){
            if(!map2.containsKey(ele)){
                return false;
            }
            if(!map1.get(ele).equals(map2.get(ele))){
                return false;
            }
        }
        return true;
    }
}