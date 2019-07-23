import java.util.*;

class Leap{        
int year;              //Declaring variables
boolean ifleap=true; 

void getyear() {       //Mehtod of taking input 

	Scanner sc= new Scanner(System.in);
	System.out.print("Enter year: " );
	year=sc.nextInt();

    }
 
void leapyear(){       //Method of checking leap year

 	if(year%4==0){
 		    ifleap=true;
 	    }

 	else if(year%100==0){
 			ifleap=false;
 	    }

 	else if(year%400==0){
 		   ifleap=true;
 	    }
 	
 	else{
 		   ifleap=false;
 	    }
    }


void showyear(){         //Method of output
	if(ifleap==true){
		System.out.println("The year " + year + " is a leap year.");
	    }
	else{
		System.out.println("The year " + year + " is not a leap year.");
	    }
    }
	
}

class Leapnew{
	public static void main(String[] args) {

		Leap l = new Leap();     //Creating object

		l.getyear();              //Caling methods

		l.leapyear();

		l.showyear();
	}
}