package polymorphism;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {

	public static void main(String[] args) {

		/*BaseCreditManager creditManager = new StudentCreditManager();
		System.out.println(creditManager.creditCalculate(1000.0));
		// metodumuz double değil de void olsaydı aşağıdaki gibi de ekrana yazardı.
		// creditManager.creditCalculate(1000.0);
		
		BaseCreditManager creditManager2 = new TeacherCreditManager();
		System.out.println(creditManager2.creditCalculate(1000.0));*/
		
		// herkesin aynı kredi miktarı için ödeyeceği parayı görmek için,
		// tek tek yazdırmak yerine object array yapalım:
		BaseCreditManager [] baseCreditManagers = new BaseCreditManager[] {
				new SoldierCreditManager(), new StudentCreditManager(),
				new TeacherCreditManager()};
		
		for(BaseCreditManager creditManager : baseCreditManagers) {
			System.out.println(creditManager.creditCalculate(1000.0));
		}
		// Soldier için farklı bi değer implemente etmediğimiz için,
		// base'deki oranları kullandı.
		
			
		
		
	}

}
