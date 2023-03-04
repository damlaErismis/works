package inheritance;

public class MuhendisSalaryCalculation extends BaseSalaryCalculation{

	public MuhendisSalaryCalculation() {
		super(1000,200);
	}
	public void salaryCalculation() {
		this.maas = (this.maas*oran/20);
		System.out.println("Engineer Salary: " + this.maas);
	}

	
	
	

}
