class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(num>0){
        int digit = num%10;
        sum=sum+digit;
        num=num/10; 
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0 ; i<nums.length;i++){
            arr[i]=addDigits(nums[i]);
        }
        int min =arr[0];
        for(int i=0;i<nums.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
     return min;   
    }
}