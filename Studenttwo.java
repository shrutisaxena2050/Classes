class Studenttwo{     //Compile class

	int roll_num;            //Declaring variables
	int phonenumber;           
	String address;
	String name;
}
class StudenttwoTestDrive{                 //Main class
	public static void main(String[] args) {
		
	
	Studenttwo s1 = new Studenttwo();           //Object for first student
	
	s1.roll_num = 11;                          //Assigning values of first student
	s1.phonenumber = 6272;
	s1.address = "texstreet";
	s1.name = "Sam";

	Studenttwo s2 = new Studenttwo();          //Object for second student

	s2.roll_num = 12;                        //Assigning values of first student
	s1.phonenumber = 6272;
	s2.phonenumber = 5572;
	s2.address = "bankstreet";
	s2.name = "John";

	System.out.println("The name of first student " + s1.name + " roll_num " + s1.roll_num + "phone num" + s1.phonenumber + " address " + s1.address); //Printing values of first student

	System.out.println("The name of second student " + s2.name + " roll_num " + s2.roll_num + "phone num" + s2.phonenumber + " address " + s2.address); //Printing values of second student
	}
}