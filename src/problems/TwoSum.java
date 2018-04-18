package problems;

/**
 * 题目： 两数相加
 * <p>
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * <p>
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author finch
 * @date 2018/4/18
 */
public class TwoSum {

	/**
	 * 傻方法，两个for循环让数组每位相加
	 *
	 * @param nums 整数数组
	 * @param target 目标值
	 * @return 数组中目标值对应的下标
	 */
	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (target == nums[i] + nums[j]) {
					return new int[]{i, j};
				}
			}
		}
		return new int[2];
	}


}