class Solution {
    public int maxProduct(int n) {
        char[] ch=String.valueOf(n).toCharArray();
        int[] arr=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            arr[i]=ch[i]-'0';
        }
        Arrays.sort(arr);
        int l=arr.length;
        int a=arr[l-1];
        int b=arr[l-2];
        int product=a*b;
        return product;
    }
}