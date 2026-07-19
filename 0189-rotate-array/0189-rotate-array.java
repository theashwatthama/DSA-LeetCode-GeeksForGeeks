class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
        k=k%n;
        List<Integer> list= new ArrayList<>();
        for (int i = n-k; i<n ; i++) {
            list.add(nums[i]);

        }
        for (int j = 0; j <n-k ; j++) {
            list.add(nums[j]);
        }
        for (int l = 0; l <n ; l++) {
            nums[l]=list.get(l);
        }
    }
}