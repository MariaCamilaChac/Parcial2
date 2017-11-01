import java.io.*;
public class primero {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Digite tamaño del arreglo");
		
		int T = Integer.parseInt(br.readLine());
		
		System.out.println("Escriba los numeros dentro del arreglo");
		
		String Num1 = br.readLine();
		
		String Num2 [] = Num1.split(",");
		
		System.out.println("Digite el numero de la diferencia");
		int D = Integer.parseInt(br.readLine());
		int count = 0;
		
		for (int l = 0; l < Num2.length ; l++) {
			for (int h = l; h < Num2.length ; h++) {	
			
				int a = Integer.parseInt(Num2[l]);
				int b = Integer.parseInt(Num2[h]);
				int c = (a - b);
				
				if(Math.abs(c) == Math.abs(D))
				{
					count += 1;
					String Pareja = "(" + Num2[l] + " , " + Num2[h] + ")";
					System.out.println(Pareja);
				}
			}	
		}
		
		System.out.println("El total de parejas con diferencia es " + count);

	}

}

