class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r=ransomNote.length();
        int m=magazine.length();
        HashMap<Character,Integer>need=new HashMap<>();
        HashMap<Character,Integer>have=new HashMap<>();
        for(int i=0;i<r;i++){
            need.put(ransomNote.charAt(i),need.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<m;i++){
            have.put(magazine.charAt(i),have.getOrDefault(magazine.charAt(i),0)+1);
        }
        return fun(need,have);
    }
   public boolean fun(HashMap<Character, Integer> need,
                   HashMap<Character, Integer> have) {

    for (char ch : need.keySet()) {

        if (have.getOrDefault(ch, 0) < need.get(ch)) {
            return false;
        }
    }

    return true;
}
}