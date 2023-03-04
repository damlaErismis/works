package polymorphism;

public class TeacherCreditManager extends BaseCreditManager{
	
	public double creditCalculate(double tutar) {
		return tutar*1.20;
	}

}
