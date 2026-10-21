class Solution {
    public int minOperations(String s) {
        int n=s.length();
        if(n==1){
            return 0;
        }
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if(s.charAt(i-1)>s.charAt(i)){
                sorted=false;
                break;
            }
        }

        if(sorted){
            return 0;
        }

        if(n==2){
            return -1;
        }

        char min='z';
        char max='a';

        for (int i = 0; i < n; i++) {
            char ch=s.charAt(i);
            if(ch>max){
                max=ch;
            }
            if(ch<min){
                min=ch;
            }
        }

        char first=s.charAt(0);
        char last=s.charAt(n-1);

        if (first == min || last == max) return 1;

        if (first == max && last == min) {
            // max kahin aur hai (index 1..n-1) ya min kahin aur hai (index 0..n-2)?
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == max) return 2;
            }
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == min) return 2;
            }
            return 3;
        }

        return 2;

    }
}