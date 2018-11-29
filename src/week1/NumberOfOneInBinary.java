package week1;

public class NumberOfOneInBinary {

	/**
	 * 递归的方式计算二进制数中一共有几个1
	 * @param n
	 * @return
	 */
	public static int numberOfOneRecursively(int n) {
		if (n==0){
			return 0;
		}else{
			if(n%2==0){
				return n/2;
			}
			else if(n%2==1){
				return n/2+1;
			}
			
	
			
			
	/**
	 * 循环的方式计算二进制数中一共有几个1
	 * @param n
	 * @return
	 */
	public static int numberOfOneIteratively(int n) {
		if(n==0){
			return 0;
		}else{
			int count=0;
		 	while(n!=0){
			count++;
			n=n&(n-1);
		}
		
	}
}
