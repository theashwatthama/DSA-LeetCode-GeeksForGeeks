class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
          LinkedHashSet<Integer> set= new LinkedHashSet<>();
        for(int arrs:arr){
            set.add(arrs);
        }
        return new ArrayList<>(set);
    }
}