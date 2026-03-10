abstract class Sort {

    protected int[] nums;
    protected int[] originalNums;
    protected int numSwaps = 0;
    protected int numComparisons = 0;

    public Sort(int length) {
        this.nums = new int[length];
        for (int i = 0; i < length; i++) {
            this.nums[i] = (int) (Math.random() * 20);
        }
        this.originalNums = this.nums.clone();
    }

    public Sort(int[] nums) {
        this.nums = nums.clone();
        this.originalNums = nums.clone();
    }

    public void swap(int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
        numSwaps++;
    }

    public static void printList(int[] nums) {
        String str = "[";
        for (int i = 0; i < nums.length; i++) {
            str += Integer.toString(nums[i]);
            str += (i == nums.length - 1) ? "]" : ",";
        }
        System.out.println(str);
    }

    public void displaySortingInfo() {
        System.out.print("Unsorted: ");
        printList(originalNums);
        System.out.print("Sorted: ");
        printList(nums);
        System.out.println("Number of Swaps: " + numSwaps);
        System.out.println("Number of Comparisons: " + numComparisons);
        System.out.println();
    }

    abstract void sortList();

}
