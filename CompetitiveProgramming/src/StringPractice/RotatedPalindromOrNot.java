package StringPractice;

public class RotatedPalindromOrNot {

	public boolean isStringPalindromeChecker(String modifiedString, String originalString, int startPtr, int endPtr) {
		boolean isStringPalindrome = false;
		while (startPtr >= 0 && endPtr < modifiedString.length()) {
			if (modifiedString.charAt(startPtr) == modifiedString.charAt(endPtr)) {
				startPtr--;
				endPtr++;
				if(endPtr - startPtr + 1 == originalString.length()) {
					isStringPalindrome = true;
					break;
				}
			} else {
				break;
			}
		}
		return isStringPalindrome;
	}

	public boolean isRotatedPalindromeOrNot(String testStr) {
		String newTestStr = testStr + testStr;
		boolean isStringPalindrome = false;
		for (int i = 0; i < newTestStr.length(); i++) {
			isStringPalindrome = isStringPalindromeChecker(newTestStr, testStr, i, i)
					|| isStringPalindromeChecker(newTestStr, testStr, i, i + 1);
			if(isStringPalindrome) {
				break;
			}

		}
		return isStringPalindrome;
	}

	public static void main(String[] args) {
		RotatedPalindromOrNot obj = new RotatedPalindromOrNot();
		System.out.println(obj.isRotatedPalindromeOrNot("CBAABCD")); //"CBA ABCDCBA ABCD"
		System.out.println(obj.isRotatedPalindromeOrNot("BAABCC"));
	}
}
