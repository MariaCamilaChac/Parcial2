import java.util.Scanner;

public class segundo {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tama�o del arreglo");
        int tm = sc.nextInt();
        int Array [] = new int [tm];
        int Array_1[] = new int [tm];
        
        for (int i = 0; i < Array.length; i++) {
            
            Array[i] = sc.nextInt();
            
        }
        
        
        for (int i = 0; i < Array.length ; i++) {
            int Valor = 1;
            for (int j = 0; j < Array.length; j++) {
                
               if(i!=j)
               {
                   
                   Valor *= Array[j];
                   Array_1[i] = Valor;
                   
               }  
            }
            
           
        }
        
         for (int k = 0; k < Array_1.length; k++) {
                    
                    System.out.println(Array_1[k]);
                    
                }
        
    }
    
}
