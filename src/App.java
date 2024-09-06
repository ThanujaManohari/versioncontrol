public class App {
    public static void main(String[] args) throws Exception {
        //This is Question1.
        int number1 =10;
        int number2 =15;
        //Question1.a
        if(number1 == number2){
            System.out.println("Both numbers are equal");
        }
        else{
            System.out.println("Numbers are different");
        }

        //Question1.b
        if(number1>number2){
            System.out.println("Number1 is greater than Number2");
        }
        else{
            System.out.println("Number1 is lower than Number2"); 
        }

        //Question1.c
        if(number1>=number2){
            System.out.println("Number1 is equal or greater than Number2");
        }
        else{
            System.out.println("Number1 is lower than Number2"); 
        }

        //Question1.d
        if(number1!=number2){
            System.out.println("Number1 is not equal to Number2");
        }
        else{
            System.out.println("other thing"); 
        }

        //Question 2
        number1 = 20;
        number2 = 30;
        int number3 = 40;

        //Question2.a
        if(number1==number2 && number2==number3){
            System.out.println("All numbers are equal");
        }
        else{
            System.out.println("All numbers are not equal");
        }

        //Question2.b
        if(number1==number2 || number2==number3){
            System.out.println("Number1 and number2 or number2 and number 3 equal");
        }
        else{
            System.out.println("numbers are different");
        }

        //Question2.c
        if(number1>=number2 && number1>=number3){
            System.out.println("Number 1 is the greatest");
        }
        else{
            System.out.println("Number 1 is not the greatest");
        }

        //Question2.d
        if(number1>number2){
            System.out.println("Number1 is greater than number2");
        }
        else{
            if(number2>number3){
                System.out.println("number2 is greater than number3");
            }
            else{
                System.out.println("Number 2 is not greater than number3");
            }
            
        }

        //Question2.e
        if(number1==number2){
            System.out.println("Number1 is equal to number2");
        }
        else{
            if(number2==number3){
                System.out.println("number2 is equal to number3");
            }
            else{
                System.out.println("Number 2 is not equal to number3");
            }
            
        }
 
        //Question3
        String name1 = "Thanuja";
        String name2 = "Pawani";
        String name3 = "Thanuja";
 
        //Question3.a
        if(name1.equals(name2)){
            System.out.println("Name 1 and name2 are same");
        }
        else{
            System.out.println("Name 1 and name2 are different");
            }

            //Question3.b
        if(!name1.equals(name2)){
            System.out.println("Name 1 and name2 are not equal");
        }
        else{
            System.out.println("Name 1 and name2 are equal");
            }


        //Question3.c
        if(name1.equals(name2)){
            System.out.println("Name 1 and name2 are same");
        }
        else{
            if(name1.equals(name3)){
                System.out.println("Name1 & Name3 are equal");
            }
            else{
            System.out.println("Name 1 and name3 are different");
            }
            }
            
        }

    }

