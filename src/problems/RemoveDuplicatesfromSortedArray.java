package problems;

/**
 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
 *
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
 *
 * ʾ�� 1:
 *
 * �������� nums = [1,1,2],
 *
 * ����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2��
 *
 * �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 * ʾ�� 2:
 *
 * ���� nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * ����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��
 *
 * �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 * ˵��:
 *
 * Ϊʲô������ֵ��������������Ĵ���������?
 *
 * ��ע�⣬�����������ԡ����á���ʽ���ݵģ�����ζ���ں������޸�����������ڵ������ǿɼ��ġ�
 *
 * ����������ڲ���������:
 *
 * // nums ���ԡ����á���ʽ���ݵġ�Ҳ����˵������ʵ�����κο���
 * int len = removeDuplicates(nums);
 *
 * // �ں������޸�����������ڵ������ǿɼ��ġ�
 * // ������ĺ������صĳ���, �����ӡ�������иó��ȷ�Χ�ڵ�����Ԫ�ء�
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 */
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int size = removeDuplicates(nums);
        for (int i=0; i<size; i++) {
            System.out.println(nums[i]);
        }

    }

    /**
     * ˫ָ��
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int j = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }


    /**
     * ��Ŀ˵���������飬�Σ��������������forѭ��
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        int size = nums.length;
        for (int k=0; k<nums.length; k++) {
            int val = nums[k];
            int number = 0;
            for (int i=k+1; i<size; i++) {
                if(nums[i] == val) {
                    number++;
                } else {
                    nums[i-number] = nums[i];
                }
            }
            size = size-number;
        }
        return size;
    }
}
