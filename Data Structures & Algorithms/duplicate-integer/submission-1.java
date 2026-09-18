class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> exists = new HashSet<>();

        for (int a : nums){
            if (exists.contains(a)){
                return true;
            }
            exists.add(a);
        }

        return false;
    }
}