package pkg_trial;

public class EmployeeImpl {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "John", "HR", 50000);
		Employee emp2 = new Employee(102, "Mickel", "Sales", 55000);
		Employee emp3 = new Employee(103, "Sid", "Markettinh", 60000);
		Employee emp4 = new Employee(104, "Nil", "IT", 75000);
		Employee emp5 = new Employee(105, "Danil", "Finance", 52000);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		
		
		System.out.println();
		System.out.println("By using setters and getters");
		System.out.println();
		
		
		Employee emp6 = new Employee();
		Employee emp7 = new Employee();
		Employee emp8 = new Employee();
		Employee emp9 = new Employee();
		Employee emp10 = new Employee();
		
		
		emp6.setId(106);
		emp7.setId(107);
		emp8.setId(108);
		emp9.setId(109);
		emp10.setId(110);
		
		
		
		emp6.setName("Jack");
		emp7.setName("Emma");
		emp8.setName("Mia");
		emp9.setName("Alica");
		emp10.setName("Diana");
		
		
		emp6.setDepartment("Finance");
		emp7.setDepartment("Sales");
		emp8.setDepartment("Marketting");
		emp9.setDepartment("HR");
		emp10.setDepartment("IT");
		
		
		emp6.setSalary(62000);
		emp7.setSalary(65000);
		emp8.setSalary(68000);
		emp9.setSalary(72000);
		emp10.setSalary(66000);
		
		System.out.println("Employee [Id:" + emp6.getId()+ ",Name:" + emp6.getName()+ ", Department:"+ emp6.getDepartment()+ ", Salary:" + emp6.getSalary()+"]");
		System.out.println("Employee [Id:" + emp7.getId()+ ",Name:" + emp7.getName()+ ", Department:"+ emp7.getDepartment()+ ", Salary:" + emp7.getSalary()+"]");
		System.out.println("Employee [Id:" + emp8.getId()+ ",Name:" + emp8.getName()+ ", Department:"+ emp8.getDepartment()+ ", Salary:" + emp8.getSalary()+"]");
		System.out.println("Employee [Id:" + emp9.getId()+ ",Name:" + emp9.getName()+ ", Department:"+ emp9.getDepartment()+ ", Salary:" + emp9.getSalary()+"]");
		System.out.println("Employee [Id:" + emp10.getId()+ ",Name:" + emp10.getName()+ ", Department:"+ emp10.getDepartment()+ ", Salary:" + emp10.getSalary()+"]");
		
		
		


	}

}
