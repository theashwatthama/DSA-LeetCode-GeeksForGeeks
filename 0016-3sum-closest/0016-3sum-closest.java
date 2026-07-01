class Solution {
    public int threeSumClosest(int[] arr, int target) {

        Arrays.sort(arr);
        int n = arr.length;
        int closest = arr[0]+arr[1]+arr[2];

        for(int i =0;i<n-2;i++) {

            int left=i+1;
            int right=n-1;

            while(left < right){

                int total = arr[i]+arr[left]+arr[right];

                if(Math.abs(total- target)<Math.abs(closest-target) ){
                    closest = total;
                }

                if(total < target){
                    left++;
                }
                else if(total > target){
                    right--;
                }
                else{
                    return target;
                }
            }
        }

        return closest;
    }
}