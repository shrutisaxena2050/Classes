class Employee{  
	String name;
	int emp_id;
	int dep_num;
}
class Employeedept{
	public static void main(String[] args) {

		Employee [] emp = new Employee[3];         //Declaration of array of employee

		int x=0;                                   

		emp[0] = new Employee();                  //Creating objects
		emp[1] = new Employee();
		emp[2] = new Employee();

		emp[0].name = "Suyash";                   //Assigning values
		emp[1].name = "Ayush";
        emp[2].name = "Surya";   

		emp[0].emp_id = 1001;
		emp[1].emp_id = 1002;
		emp[2].emp_id = 1003;


		emp[0].dep_num = 23;
		emp[1].dep_num = 24;
		emp[2].dep_num = 23;

		System.out.println("Employees details");

		System.out.println(" "+ emp[0].name + " " + emp[0].emp_id + " " + emp[0].dep_num);
		System.out.println(" "+ emp[1].name + " " + emp[1].emp_id + " " + emp[1].dep_num);
		System.out.println(" "+ emp[2].name + " " + emp[2].emp_id + " " + emp[2].dep_num);

		for(int i=0; i<emp.length; i++){          //Comparing deptnums by two loops
			for(int j=i+1; j<emp.length; j++){

		if(emp[i].dep_num==emp[j].dep_num){

			System.out.println( " "+ emp[i].name + " and " + emp[j].name + " works in the same department.");
			}
		  }
	    }
	}
}