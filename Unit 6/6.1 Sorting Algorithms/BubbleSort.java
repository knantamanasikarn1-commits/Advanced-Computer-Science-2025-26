public class BubbleSort extends Sort {
    
    public BubbleSort(int length) {
        super(length);
    }

    public BubbleSort(int[] nums) {
        super(nums);
    }

    public void sortList() {
        boolean didSwapInPass = true;
        while (didSwapInPass) {
            didSwapInPass = false;
            for (int first = 0; first < nums.length - 1; first++) {
                numComparisons++;
                if (nums[first] > nums[first + 1]) {
                    swap(first, first + 1);
                    didSwapInPass = true;
                }
            }
        }
        displaySortingInfo();
    }

}
