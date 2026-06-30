#include <stdio.h>

int alternatingSum(int* nums, int numsSize) {
    int count = 0;
    for (int i = 0; i < numsSize; i++) {
        if (i % 2 == 0)
            count += nums[i];
        else
            count -= nums[i];
    }
    return count;
}