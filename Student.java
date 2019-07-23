class Student{  //Compile class

    String name;         //Declaring variables
    int roll_num;
}
class StudentTestDrive{         //Main class

public static void main(String []args){
	
	Student s = new Student();         //Creating object

	s.name= "John";                    //Assigning values                      
	s.roll_num= 69;

	System.out.println("The name is " + s.name + " the roll_num is " + s.roll_num); //Printing values
	}
}
