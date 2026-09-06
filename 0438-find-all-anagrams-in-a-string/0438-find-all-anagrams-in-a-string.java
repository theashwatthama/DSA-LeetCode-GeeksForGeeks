class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list =new ArrayList<>();
        int n=s.length();

        int[] freq=new int[26];
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            freq[ch - 'a']++;
        }

        int i=0;
        int j=p.length()-1;

        while(j<n){
            int[] window=new int[26];
            for(int e=i;e<=j;e++){
            char ch=s.charAt(e);
            window[ch - 'a']++;
            }

            if(Arrays.equals(freq,window)){
                list.add(i);
            }

            i++;
            j++;
        }
        return list;
    }
    
}