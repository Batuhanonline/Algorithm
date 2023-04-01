class Solution {
    public int search(int[] nums, int target) {


        int maxIndex = nums.length - 1, minIndex = 0;
        int i = maxIndex / 2;

        if (maxIndex != 0) {
            while (true) {
                if (nums[i] == target) {
                    return i;
                }
                if (maxIndex - minIndex == 1) {
                    return -1;
                }
                if (nums[i] < target) {
                    minIndex = i;
                    i = ((maxIndex - minIndex) / 2) + minIndex;
                    continue;
                }
                if (nums[i] > target) {
                    maxIndex = i;
                    i = ((maxIndex - minIndex) / 2);
                    continue;
                }
            }
        } else {
            if (nums[0] == target) return 0;
            return -1;
        }

    }
}