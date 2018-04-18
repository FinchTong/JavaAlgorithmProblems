package utils;

/**
 * @author finch
 * @date 2018/4/18
 */
public class ArrayUtils {

	public static void printInts(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void printListNode(ListNode listNode) {
		while (listNode != null) {
			System.out.print(listNode.val + " ");
			listNode = listNode.next;
		}
		System.out.println();
	}

}
