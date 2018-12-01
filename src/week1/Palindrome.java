package week1;

public class Palindrome {

	/**
	 * 判断一个单词是否对称
	 * @param word
	 * @return
	 */
	public static boolean isPalindrome(String word) {
		int l =word.length();
	if (l==0 || l==1) {
		return true;
		}
	else if (word.charAt(0) != word.charAt(l-1) ){
		  return false;
		  }
	else return isPalindrome(word.substring(1,l-2));
    }
	}
}
