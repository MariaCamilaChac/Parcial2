import java.io.*;


public class cuatro {
	 static BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
	 static BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter (System.out));
	    
 public static void main(String[] args) throws IOException {
	   
	 int [] dias = new int [7];
	 bw.write (" ingrese los precios por d�a");
	 bw.flush();

	 int i;
	 for (i = 0; i < dias.length; i++) {
		 
		 int valor = Integer.parseInt(br.readLine() );
		 dias[i] = valor;
	 }
	 
	 int Menor = dias[0];
	 int Mayor = dias[0];
	 int diferencia=0;
	 
	 for (int j = 0; j < dias.length; j++) {
			
			 if(dias[j] < Menor){
				 
				 Menor = dias[j];
			 }
		 
	 }
	 
	 System.out.println(Menor);
	 
	 for (int x = 0; x < dias.length; x++) {
			 
			 
			 if(dias[x] > Mayor){
	 
				 Mayor = dias[x];
			 }		  
      }

	 System.out.println(Mayor);
	 
	 diferencia = Mayor - Menor;
	 
	 System.out.println("La ganancia es de " + diferencia);
	 
   }
}
