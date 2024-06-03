import java.util.Scanner;
public class Switchcase {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int res2 = 0;
        double num1, num2, res = 0;
        
        
        System.out.println("Que operacion desea realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
    
        
        int operacion = sc.nextInt();
        
        
        System.out.println("Ingrese primer valor");
        
        num1 = sc.nextDouble();
        
        System.out.println("Ingrese segundo valor");
        
        num2 = sc.nextDouble();
        
        switch (operacion){
            case 1 : 
                res=num1+num2;
                res2= (int) (num1+num2);
                break;
            
            case 2 :
                res=num1-num2;
                res2= (int) (num1-num2);
                break;
          
            case 3 :
                res=num1*num2;
                res2= (int) (num1*num2);
                break;
              
            case 4 :
                res=num1/num2;
                res2= (int) (num1/num2);
                break;
             
        }
        System.out.println("El resultado de tu operacion con decimal es: "+res);
        System.out.println("Y sin decimal es igual a: "+res2);
    }
    
}