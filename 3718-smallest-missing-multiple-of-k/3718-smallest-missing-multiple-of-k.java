class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int [] arr=new int[n];
        int a=0;
        for(int i=0;i<n;i++){
            if(nums[i]%k==0){
                arr[a]=nums[i];
                a++;
            }
        }
            if(a==0){
            return k;
            }
            if(arr[0]!=k){
                return k;
            } 
            for(int j=1;j<a;j++){    
                 if(arr[j] == arr[j-1]){
        continue;
    }
            if(arr[j]-arr[j-1]==k){
                continue;
            } else {
               return arr[j-1]+k;
            }
        } 
        return arr[a-1]+k;
    }
}