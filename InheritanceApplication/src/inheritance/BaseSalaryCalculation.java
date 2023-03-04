package inheritance;

// nesnelerin attribute'leri ve activity'leri olur.
public class BaseSalaryCalculation {

	public int maas;
	public int oran;

	// constructor method
	public BaseSalaryCalculation(int maas, int oran) {
		this.maas = maas;
		this.oran = oran;
	}
	
	// parametreli constructor kullandıysak, 
	// bir de default constructor da olmak zorunda javada
	public BaseSalaryCalculation() {
		
	}
	
	//maaş hesaplama methodu
	public void salaryCalculation() {
		this.maas = (this.maas*oran/20); // fix formul
		System.out.println(this.maas);
		
	}



}
