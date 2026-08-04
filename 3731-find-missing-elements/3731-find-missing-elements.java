class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List <Integer> list =new ArrayList<>();
        int expected=nums[0];
        int i=0;
        while(expected<=nums[n-1]){
            if(expected==nums[i]){
                i++;
            } else {
                list.add(expected);
            }
             expected++;
        }
        return list;
    }
}