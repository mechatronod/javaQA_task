public class Employee {
	
	@SuppressWarnings("unused")
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	
	//constructor methods 
	public Employee(String name,double salary,int workHours,int hireYear) {
		this.name = name;
		this.salary = salary;
		this.hireYear = hireYear;
		this.workHours = workHours;	
	}
	
	public Employee() {
		System.out.println(" empty object created ");
	}

	//tax method
	private double tax() {
		if(salary<0) {
			//System.out.println(" salary can't be negative ");
			return 0;
		}
		if(salary>1000) {
			return 0.03 * salary;
			
		}
		return 0;
	}
	
	//bonus method
	private int bonus() {
		if(workHours<0) {
			//System.out.println(" workHours can't be negative ");
			return 0;
		}
		if(workHours>40) {
			return (workHours-40)*30;
		}
		return 0;
	}
	
	private double raiseSalary() {
		int totalYear = (2021 - hireYear);
		if(totalYear < 10) {
			return salary * 0.05;
		}
		if(totalYear >= 10 && totalYear <= 19) {
			return salary * 0.10;
		}
		if(totalYear > 19) {
			return salary * 0.15;
		}
		return 0;
	}
	
	
	@Override
	public String toString() {
		
		System.out.println(
				"adi:"+ name + 
				", maasi:" + salary + 
				", calisma Saati: " + workHours +
				", baslangic yili: " + hireYear +
				", Vergi: " + tax() +
				", Bonus: " + bonus() +
				", maas artisi: " + raiseSalary() + 
				", toplam maas: " + ( (salary - tax()) + bonus() )
				);
		
		return "";
	}
	
}



