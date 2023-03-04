package inheritance;

public class MudurSalaryCalculation extends BaseSalaryCalculation{
	
	public MudurSalaryCalculation() {
		super(1000,300);
	}
	public void salaryCalculation() {
		this.maas = (this.maas*oran/20);
		System.out.println("Manager Salary: " + this.maas);
	}

}
