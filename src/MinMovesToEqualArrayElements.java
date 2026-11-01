//Nov1
public class MinMovesToEqualArrayElements {
    //Approach-I(Brute force , getting TLE)
//    public int minMoves(int[] nums) {
//        int n = nums.length;
//        int moves = 0;
//
//        while(checkIfElementsNotSame(nums)){
//            int maxIdx = findMax(nums);
//            for(int i=0;i<n;i++){
//                if(i == maxIdx) continue;
//                nums[i] += 1;
//            }
//            moves++;
//        }
//
//        return moves;
//    }
//
//    private boolean checkIfElementsNotSame(int[] nums){
//        int num = nums[0];
//        for(int i=1;i<nums.length;i++){
//            if(nums[i] != num) return true;
//        }
//        return false;
//    }
//
//    private int findMax(int[] nums){
//        int max = nums[0];
//        int idx = 0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i] > max){
//                idx = i;
//                max = nums[i];
//            }
//        }
//        return idx;
//    }

    //Using Math
    // moves = Sum(nums[i] - min), i from 0 to n;
    //T.C= O(n)
    //instead of fixing the max and incrementing others, we just flipped the approach, fixed the min , and calculating how much moves each number will take to reach to the min. Our goal is simple, i.e making every element equal, either we increment or decrement doesn't matter

    public int minMoves(int[] nums) {
        int n = nums.length;
        int moves = 0;

        int min = findMin(nums);
        for(int i=0;i<n;i++){
            moves += (nums[i] - min);
        }

        return moves;
    }

    private int findMin(int[] nums){
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
        }
        return min;
    }
}
