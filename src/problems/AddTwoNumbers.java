package problems;

import utils.ArrayUtils;
import utils.ListNode;


/**
 * 题目： 两数相加
 * <p>
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 *
 * @author finch
 * @date 2018/4/18
 */
public class AddTwoNumbers {

	/**
	 *
	 * 链表的每一位都相加，需要记得进位
	 *
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode node = new ListNode(0);
		ListNode head = node;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int sum = carry;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			carry = sum / 10;
			sum = sum % 10;
			node.next = new ListNode(sum);
			node = node.next;
		}

		if (carry != 0) {
			node.next = new ListNode(carry);
		}

		return head.next;
	}

	public static void main(String[] args) {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		ListNode a = new ListNode(2);
		a.next = new ListNode(4);
		a.next.next = new ListNode(3);

		ListNode b = new ListNode(5);
		b.next = new ListNode(6);
		b.next.next = new ListNode(4);

		ListNode listNode = addTwoNumbers.addTwoNumbers(a, b);
		ArrayUtils.printListNode(listNode);

	}

}