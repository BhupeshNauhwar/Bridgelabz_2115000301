import java.util.*;

class ZeroSumSubarrays {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;
        sumMap.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, -1, 0, 4};
        List<int[]> subarrays = findZeroSumSubarrays(arr);

        for (int[] subarray : subarrays) {
            System.out.println("Subarray: [" + subarray[0] + ", " + subarray[1] + "]");
        }
    }
}
