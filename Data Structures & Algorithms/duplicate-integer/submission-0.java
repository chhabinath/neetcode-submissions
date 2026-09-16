
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> a = new HashSet<Integer>();
        for(int i: nums){
            a.add(i);
        }
        return a.size() != nums.length;
    }
}