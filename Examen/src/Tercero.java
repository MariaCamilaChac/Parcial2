import java.util.Scanner;

	public class Tercero {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			System.out.println("Digite tama�o del arreglo");
			int Tama�o = sc.nextInt();
			
			int Tam [] = new int [Tama�o] ;
			
			System.out.println("Escriba los numeros dentro del arreglo");
			
			for (int i = 0; i <  Tam.length; i++) {
				
				Tam[i] = sc.nextInt(); 
				
			}
			
		
			int Aux = 0;
			
			for (int i = 0; i < Tam.length; i++) {
				for (int j = 0; j < Tam.length; j++) {
					
					if(!(Tam[i] == Tam[j])){
						
						Aux = Tam[j];
						
					}
			}
			
		}
			System.out.println("El Numero que no se repite es "	+ Aux);
	}
}