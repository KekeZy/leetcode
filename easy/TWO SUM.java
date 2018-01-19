问题描述：
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

显然暴力搜索两层循环可以解决，下面是使用哈希表对算法进行优化，时间复杂度O(n). (没有考虑数据异常的情况，比如nums=null)

 class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
              if(map.containsKey(target-nums[i])){
                  res[0]=map.get(target-nums[i]);
                  res[1]=i;
                  return res;
              }
              map.put(nums[i],i);
        }
        return null;
    }
}

