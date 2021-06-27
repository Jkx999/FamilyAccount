/**
 * 
 */
package Utility;
import java.util.Scanner;
/**
 * @description
 * @author jkx
 * @version
 * @date 2021年6月26日
 */
public class Utility {
	static Scanner scan = new Scanner(System.in);
	
	/**
	 * 
	 * @Description 读取键盘，如果用户键入’1’-’4’中的任意字符，则方法返回。返回值为用户键入字符。
	 * @return
	 */
	public static char readMenuSelected() {
		char key;
		for( ; ; ) {
			String str = readKeyBoard(1);
			key = str.charAt(0);
			if(key != '1' && key != '2' && key != '3' && key != '4') {
				System.out.print("输入错误,请重新输入:");
			}else {
				break;
			}
		}
		return key;
	}
	
	/**
	 * @Description 从键盘读取一个不超过4位长度的整数，并将其作为方法的返回值。
	 * @return
	 */
	public static int readMoney() {
		int money;
		for( ; ; ) {
			String str = readKeyBoard(4);
			try {
				money = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e) {
				System.out.print("输入错误,请重新输入:");
			}
		}
		return money;
	}
	
	/**
	 * @Description 从键盘读取一个不超过8位长度的字符串，并将其作为方法的返回值。
	 * @return
	 */
	public static String readExplain() {
		String str = readKeyBoard(8);
		return str;
	}
	
	/**
	 * @Description 从键盘读取‘Y’或’N’，并将其作为方法的返回值。
	 * @return
	 */
	public static char readConfirm() {
		char confirm;
		for( ; ; ) {
			String str = readKeyBoard(1).toUpperCase();
			confirm = str.charAt(0);
			if(confirm != 'Y' && confirm != 'N') {
				System.out.print("输入错误,请重新输入:");
			}else {
				break;
			}
		}
		return confirm;
	}
	
	public static String readKeyBoard(int limit) {
		String str = "";
		while(scan.hasNext()) {
			str = scan.nextLine();
			if(str.length() > limit || str.length() < 0) {
				System.out.print("输入错误(不大于" + limit + "),请重新输入:");
			}else {
				break;
			}
		}
		return str;
	}
}