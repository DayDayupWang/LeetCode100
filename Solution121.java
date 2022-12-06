
// import java.util.TreeSet;

public class Solution121 {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 4, 6 };
        // int[] arr = { 7, 6, 4, 3, 1 };
        int MAx = maxProfit(arr);
        System.out.println(MAx);
    }

    public static int maxProfit(int[] prices) {
        if (prices == null) {
            return 0;
        }
        int max = prices[0];
        int min = prices[0];
        int maxIndex = 0;
        int minIndex = 0;
        int Index = 0;
        int len = prices.length;
        if (prices[Index] >= min ) {
            
        }

        while (Index < len) {
            if (prices[Index] >= min && minIndex <= Index) {
                max = prices[Index];

            } else if (prices[Index] < min && minIndex <=maxIndex) {
                min = prices[Index];
                minIndex = Index;
            }

            Index++;

        }

        return max - min;

    }
}

// public static int maxProfit(int[] prices) {
// int max = 0;
// for (int i = 0; i < prices.length; i++) {
// for (int j = i + 1; j < prices.length; j++) {
// while (prices[i] < prices[j] && prices[j] - prices[i] > max) {
// max = prices[j] - prices[i];
// }
// }
// }
// return max;
// }