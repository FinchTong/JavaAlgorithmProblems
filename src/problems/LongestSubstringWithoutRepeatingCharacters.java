package problems;


/**
 * 题目：无重复字符的最长子串
 * <p>
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 示例：
 * <p>
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * <p>
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * <p>
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 *
 * @author finch
 * @date 2018/4/18
 */
public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {

		char[] chars = s.toCharArray();
		StringBuilder longestStr = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int num = containChar(stringBuilder.toString(), chars[i]);
			if (num == -1) {
				stringBuilder.append(chars[i]);
			} else {
				String string = (String) stringBuilder.subSequence(num + 1, stringBuilder.length());
				stringBuilder = new StringBuilder(string);
				stringBuilder.append(chars[i]);
			}
			if (longestStr.length() < stringBuilder.length()) {
				longestStr = stringBuilder;
			}
		}
		return longestStr.length();
	}

	/**
	 * 判断字符串是否包含目标字符
	 *
	 * @param str 字符串
	 * @param c   目标自负
	 * @return 字符串第几位包括，如果返回为-1则不包含
	 */
	private int containChar(String str, char c) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (chars[i] == c) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String str = "pwwkew";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(str));
	}
}
