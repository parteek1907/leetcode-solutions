class Solution {
    public List<Integer> sequentialDigits(int low, int high) 
    {
        int nums[]={1,2,3,4,5,6,7,8,9};

        List<Integer> list= new ArrayList<>();

        for (int i = 0; i < 9; i++) {

        int num = 0;

        for (int j = i; j < 9; j++) {

            num = num * 10 + nums[j];

            if (num >= low && num <= high)
                list.add(num);

            if (num > high)
                break;
        }
    }

    Collections.sort(list);
    return list;    
    }
}