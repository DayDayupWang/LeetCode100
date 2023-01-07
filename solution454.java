import java.util.HashMap;
import java.util.HashSet;

public class solution454 {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2 };
        int[] nums2 = new int[] { -2, -1 };
        int[] nums3 = new int[] { -1, 2 };
        int[] nums4 = new int[] { 0, 2 };
        int count = fourSumCount(nums1, nums2, nums3, nums4);
        System.out.println(count);
        // int[] nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2];
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        HashSet<Integer> resultmap = new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                for (int k = 0; k < nums3.length; k++) {
                    resultmap.add(nums1[i] + nums2[j] + nums3[k]);

                }
            }
        }
        for (int q = 0; q < nums4.length; q++) {

          if (resultmap.contains(-nums4[q])) {
            count++;
          }
            // if (resultmap.contains(-nums4[q])) {
            // System.out.print(nums1[i]);
            // System.out.print(nums2[j]);
            // System.out.print(nums3[k]);
            // System.out.print(nums4[q]);
            // System.out.println("----------");
            // count++;
            // }
        }

        return count;
    }

}
