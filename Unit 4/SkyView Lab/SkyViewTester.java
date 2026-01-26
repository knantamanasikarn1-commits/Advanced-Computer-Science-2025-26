public class SkyViewTester {
    public static void main(String[] args) {
        double[] testView = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};
        SkyView testSkyView = new SkyView(3, 2, testView);
        System.out.println(testSkyView);
        double[] testView2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
        SkyView testSkyView2 = new SkyView(4, 3, testView2);
        System.out.println(testSkyView2);
        System.out.println(testSkyView2.getAverage(1, 2, 0, 1));
    }
}
