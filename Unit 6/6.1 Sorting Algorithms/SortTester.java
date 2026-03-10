public class SortTester {
    
    public static void main(String[] args) {
        // int[] nums = {5, 4, 2, 8, 5, 4, 5, 8, 9, 1, 10, 0};
        AlexSort a = new AlexSort(50);
        a.sortList();
        BubbleSort b = new BubbleSort(50);
        b.sortList();
    }

}
