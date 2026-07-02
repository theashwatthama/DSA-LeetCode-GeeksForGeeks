class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
         Arrays.sort(arr);
        int counter=0;
        int n= arr.length;
        for (int i = 0; i <n-2 ; i++) {
            int left= i+1;
            int right=n-1;

            while (left<right){
                int s = arr[i]+arr[left]+arr[right];
                if(s>=sum){
                   right--;
                 } else if (s<sum) {
                    counter+=(right-left);
                    left++;
                }
            }
        } return counter;
    }
}