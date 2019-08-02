import java.util.*;
class Decitorom {

	String roman =" ";
	int decimal;

	void getdecimal(){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the decimal num:");
		decimal= sc. nextInt();
		
	}
    
    
    void operation(){

    	//13 elements roman array
    	String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        //13 elements decimal array
    	int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int temp=decimal; //Cppying decimal to temp

    	if (decimal >= 1 && decimal <= 3999){  

            for (int i = 0; i < 13; i++) { //Loop for 13 elements

                while(decimal >= decimals[i]){  //Comparing each value with array

                    decimal = decimal - decimals[i];
                     
                    roman = roman + romanSymbols[i]; //Getting roman value
                }
            }

            System.out.println("Roman equivalent of " + temp + " is : " + roman);
        }
           
        else{
           	System.out.println("invalid number");
        }

    } 


}

class Decitoroman{
	public static void main(String[] args) {
		
		Decitorom dr = new Decitorom();

		dr.getdecimal();
		dr.operation();

	}
}