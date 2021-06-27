/**
 * 
 */
package FamilyAccount;

import Utility.Utility;

/**
 * @description
 * @author jkx
 * @version
 * @date 2021年6月26日
 */
public class FamilyAccount {

	public static void main(String[] args) {
		int balanced = 10000;
		String details = "收支\t账户金额\t\t收支金额\t\t说  明\n";
		boolean condition = true;
		do {
			System.out.println("---------------家庭收支记账软件---------------");
			System.out.println("\t\t 1.收支明细");
			System.out.println("\t\t 2.登记收入");
			System.out.println("\t\t 3.登记支出");
			System.out.println("\t\t 4.退    出");
			System.out.print("\t\t请选择(1-4):");
			char key = Utility.readMenuSelected();
			switch(key) {
				case '1':
					System.out.println("\n---------------家庭收支记账软件---------------");
					System.out.println(details);
					System.out.println("---------------------------------------------");
					break;
				case '2':
					System.out.print("收入金额:");
					int earning = Utility.readMoney();
					balanced += earning;
					System.out.print("收入说明:");
					String earningexplain = Utility.readExplain();
					details += "收入\t" + balanced + "\t\t" + earning + "\t\t" + earningexplain + "\n";
					break;
				case '3':
					System.out.print("支出金额:");
					int expand = Utility.readMoney();
					balanced -= expand;
					System.out.print("支出说明:");
					String expandexplain = Utility.readExplain();
					details += "支出\t" + balanced + "\t\t" + expand + "\t\t" + expandexplain + "\n";
					break;
				case '4':
					System.out.print("确认是否退出(Y/N):");
					char confirm = Utility.readConfirm();
					if(confirm == 'Y') {
						condition = false;
					}
			}
		}while(condition);
	}

}
