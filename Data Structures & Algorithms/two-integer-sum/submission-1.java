class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> solution = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int numberToFind = target - nums[i];
            if(solution.containsKey(numberToFind)) {
                result[0] = solution.get(numberToFind);;
                result[1] = i;
            }
            solution.put(nums[i], i);
        }
        return result;
    }
}
