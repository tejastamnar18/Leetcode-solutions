class Solution {
    public int fib(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        return fibDB(arr,n);
    }

    public int fibDB(int[] arr,int n){
        if(n<=1){
            return n;
        }
        if(arr[n] != -1){
            return arr[n];
        }
        return arr[n] = fibDB(arr,n-1)+fibDB(arr,n-2);
    }
}