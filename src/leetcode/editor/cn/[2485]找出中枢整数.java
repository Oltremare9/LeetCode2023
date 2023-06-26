package leetcode.editor.cn;//给你一个正整数 n ，找出满足下述条件的 中枢整数 x ：
//
// 
// 1 和 x 之间的所有元素之和等于 x 和 n 之间所有元素之和。 
// 
//
// 返回中枢整数 x 。如果不存在中枢整数，则返回 -1 。题目保证对于给定的输入，至多存在一个中枢整数。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 8
//输出：6
//解释：6 是中枢整数，因为 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21 。
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：1
//解释：1 是中枢整数，因为 1 = 1 。
// 
//
// 示例 3： 
//
// 
//输入：n = 4
//输出：-1
//解释：可以证明不存在满足题目要求的整数。 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 1000 
// 
//
// Related Topics 数学 前缀和 👍 46 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution2485 {
    public int pivotInteger(int n) {
        int leftSum =0;
        int rightSum = 0;
        int leftIndex = 1;
        int rightIndex = n;
        while(leftIndex < rightIndex){
            if(leftSum >= rightSum) {
                rightSum += rightIndex;
                rightIndex--;
            }else{
                leftSum += leftIndex;
                leftIndex++;
            }
        }
        if(leftSum == rightSum){
            return leftIndex;
        }else{
            return -1;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
