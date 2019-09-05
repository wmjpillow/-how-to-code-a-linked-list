// Backtracking
// https://www.cnblogs.com/Xieyang-blog/p/9078268.html
//https://leetcode.com/problems/combination-sum/discuss/16502/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)
//Subsets && Permutations && Combination Sum && Palindrome Partitioning 



private void backtrack(List<List<Integer>>list, List<Integer> templist, int[] nums, int start){
    list.add(new ArrayList<>(templist));
    for(int i=start; i<nums.length; i++){
        tempList.add(nums[i]);
        backtrack(list, templist, nums, i+1);
        tempList.remove(tempList.size()-1);
    }
}

public List<List<Integer>> subsets(int[] nums){
    List<List<Integer>> list= new ArrayList<>();
    Arrays.sort(nums);
    bakctrack(list, new ArrayList<>(), nums, 0);
    return list;
}

