class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        
        // code here
       ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            int target=-arr[i];
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            while(left<right){
                int s =  arr[left]+arr[right];
              if(s==target){
                  ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[left]);
                    temp.add(arr[right]);
                    result.add(temp);
                  left++;
                  right--;
               while(left<right&&arr[left]==arr[left-1]){
                  left++;
              }
              while(left<right&&arr[right]==arr[right+1]){
                  right--;
              }
                 }
              else if(s<target){
                  left++;
              }else right--;
            }
        }  return result;
    }
}