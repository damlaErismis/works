package inheritance;

public class Main {

	public static void main(String[] args) {
		
	MuhendisSalaryCalculation muhendisSalaryCalculation = new MuhendisSalaryCalculation();
	muhendisSalaryCalculation.salaryCalculation();
	
	MudurSalaryCalculation mudurSalaryCalculation = new MudurSalaryCalculation();
	mudurSalaryCalculation.salaryCalculation();
	
	VeznedarSalaryCalculation veznedarSalaryCalculation = new VeznedarSalaryCalculation();
	veznedarSalaryCalculation.salaryCalculation();
	
	//runtime polymorphism:
	/*
	 * üst sınıfın, alt sınıf gibi hareket edebilmesidir
	 */
	BaseSalaryCalculation baseSalaryCalculation =  new MuhendisSalaryCalculation();
	baseSalaryCalculation.salaryCalculation();

	}

}
