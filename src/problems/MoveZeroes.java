package problems;

/**
 * ����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
 *
 * ʾ��:
 *
 * ����: [0,1,0,3,12]
 * ���: [1,3,12,0,0]
 * ˵��:
 *
 * ������ԭ�����ϲ��������ܿ�����������顣
 * �������ٲ���������
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        printNumber(nums);
    }

    /**
     * ���������ôӺ���ǰ�����������������������ǰ��
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
     * �ж�������ÿ������ǰ����ĸ����������������ǰ�ƶ���λ
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
