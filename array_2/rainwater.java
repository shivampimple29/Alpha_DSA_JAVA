package array_2;

public class rainwater {
    public static void main(String args[]) {
        int left = 0;
        int right = 0;
        int total_area=0;
        int width = 1;
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        for (int i = 0; i < height.length; i++) {
            int max_left = Integer.MIN_VALUE;
            int max_right = Integer.MIN_VALUE;
            for (int j = i; j >= 0; j--) {
                left = height[j];
                max_left = Math.max(max_left, left);
            }

            for (int k = i; k <height.length; k++) {
                right = height[k];
                max_right = Math.max(max_right, right);
            }

            total_area += ((Math.min(max_left, max_right)) - height[i]) * width;
        }
        System.out.println("Area trapped by the water is "+total_area+" units.");

    }
}
