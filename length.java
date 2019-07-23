import java.util.*;

class length{

	int meters;             
    int cms;

    void getlength(){  //Method for enter length

    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter meters:");
    	meters=sc.nextInt();

    	System.out.println("Enter cms:");
    	cms=sc.nextInt();
        }

    void showlength(){   //Method for displaying length

    	System.out.println(" Meters : " + meters + " Centimeters : " + cms);
        }

    void addition(length l1, length l2){   //Method for addition of length
		cms=l1.cms+l2.cms;
		meters=l1.meters+l2.meters+cms/100;
		cms=cms%100;
	    }

}

class lengthnew{
	public static void main(String[] args) {

    length l1 = new length();              //Creating objects of length
    length l2 = new length();
	length l3 = new length(); 
   
		System.out.println("Enter first length");
		l1.getlength();                            //Calling getlength method to enter length

		System.out.println("Enter second length");
		l2.getlength();

		l3.addition(l1,l2);                       //Calling addition method for adding two lengths

        System.out.println(" Total length : " );  
  		l3.showlength();                         //Calling showlength method to display total length


	}
}