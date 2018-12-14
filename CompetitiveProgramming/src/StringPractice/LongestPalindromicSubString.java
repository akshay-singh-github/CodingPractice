package StringPractice;

// Space Optimized

public class LongestPalindromicSubString {
	public String getPalindrome(String originalString, int startPtr, int endPtr) {
		
		while (startPtr >= 0 && endPtr < originalString.length()) {
			if (originalString.charAt(startPtr) == originalString.charAt(endPtr)) {
				startPtr--;
				endPtr++;
			} else {
				break;
			}
		}
		return originalString.substring(startPtr+1, endPtr);
	}

	public String getLongestPalindromicSubsequence(String testStr) {
		int maxLen = Integer.MIN_VALUE;
		String finalStr = null;
		for (int i = 0; i < testStr.length(); i++) {
			String temResult1 = getPalindrome(testStr,i, i);
			String temResult2 = getPalindrome(testStr,i, i+1);
			String tempFinal = (temResult1.length()>temResult2.length())? temResult1:temResult2;
			if(tempFinal.length()>maxLen) {
				maxLen=tempFinal.length();
				finalStr = tempFinal;
			}

		}
		return finalStr;
	}

	public static void main(String[] args) {
		LongestPalindromicSubString obj = new LongestPalindromicSubString();
		System.out.println(obj.getLongestPalindromicSubsequence("bananas")); //"CBA ABCDCBA ABCD"
		System.out.println(obj.getLongestPalindromicSubsequence("abracadabra"));
	}

}
