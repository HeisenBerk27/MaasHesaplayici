package sinif;

public class Employee {
	
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	 Employee(String name,double salary,int workHours,int hireYear){
		 this.name = name; 
		 this.salary = salary;
		 this.workHours = workHours;
		 this.hireYear = hireYear;
	}	
	 
	 public  double tax(){
		 if(salary>1000) {
			 double vergi = salary * 0.3;
			 return salary= salary-vergi;
			 
		 }else {
			 return 0;
		 }
		 
	 }
	 
	 public double bonus() {
			if(workHours>40) {
				int bonusPara = (workHours - 40) * 30; 
				return salary = salary + bonusPara;
			}else {
				return 0;
			}
		
		}
	
	 public double raiseSalary() {
		 if(hireYear - 2021 < 10){
			 salary = salary * 1.05;
		 }else if(hireYear - 2021 >9 && hireYear - 2021 < 20) {
			 salary = salary * 1.10;
		 }else {
			 salary = salary * 1.15;
		 }
		 return salary;
		 
	 }
	 
	 public double totalSalary() {
	        return salary + bonus() - tax();
	    }
	 
	 public String toString() {
	        return "Adı : " + name + "\nMaaşı : " + salary + "\nÇalışma Saati : " + workHours + "\nBaşlangıç Yılı : " + hireYear
	                + "\nVergi : " + tax() + "\nBonus : " + bonus() + "\nMaaş Artışı : " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : "
	                + totalSalary() + "\nToplam Maaş : " + (salary + raiseSalary() + bonus());
	    }
	 
	 
}
