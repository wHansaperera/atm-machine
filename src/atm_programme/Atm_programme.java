
package atm_programme;
import java.util.Scanner;

public class Atm_programme {
  
    
    public static void withdraw(float withdraw){
    
    }

    public static void main(String[] args) {
        float balance=100000.00f;//initial balance
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Choose what you want");
        System.out.println("___________________________");
        System.out.println("Enter 1 to withdraw");
        System.out.println("Enter 2 to deposit");
        System.out.println("Enter 3 to check balance");
        System.out.println("Enter 4 to exit");
        int input_choose =sc.nextInt();
       
        switch(input_choose){
        
            case 1:
                System.out.println("--------------------");
                System.out.println("Enter withdraw amount");
                float withdraw_amount=sc.nextFloat();
                if (withdraw_amount<=balance){
               balance=balance-withdraw_amount;
               
                }
                else {
                
                    System.out.println("Your account balance not help for your withdraw");}
                
            break;
                
            case 2: System.out.println("--------------------");
                System.out.println("Enter deposit amount");   
                float deposit_amount=sc.nextFloat();
                balance = balance+deposit_amount;
                break;
                
            case 3: System.out.println("--------------------");
                    System.out.println("Your balance is "+balance);
                    break;
                        
            case 4: System.exit(0);
        
        
        }
        }
    }
    
}
