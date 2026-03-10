public class AlexSort extends Sort {

    public AlexSort(int length) {
        super(length);
    }

    public AlexSort(int[] nums) {
        super(nums);
    }

    public void sortList() {
        int first = 0;
        int second = 1;
        while (!(first == nums.length - 1)) {
            numComparisons++;
            if (nums[second] < nums[first]) {
                swap(first, second);
            }
            second++;
            if (second == nums.length) {
                first++;
                second = first;
            }
        }
        displaySortingInfo();
    }

}
