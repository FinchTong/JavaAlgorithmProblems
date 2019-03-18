package problems;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        printNumber(nums);
    }

    /**
     * 笨方法，让从后往前数，发现零就让所有数组向前移
     * @param nums
     */
    public static void moveZeroes1(int[] nums) {
        if(nums.length == 1) {
            return;
        }
        for (int i=nums.length-1; i>=0; i--) {
            if(nums[i] == 0) {
                for (int j=i; j<nums.length-1; j++) {
                    int first = nums[j];
                    int last = nums[j+1];
                    nums[j] = last;
                    nums[j+1] = first;
                }

            }

        }
    }

    /**
     * 判断数组中每个数字前面零的个数，来让这个数向前移动几位
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int zeroNumber = 0;
        for (int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                zeroNumber++;
            } else {
                nums[i-zeroNumber] = nums[i];
            }
        }
        for (int j=nums.length-zeroNumber; j<nums.length; j++) {
            nums[j] = 0;
        }
    }

    private static void printNumber(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
