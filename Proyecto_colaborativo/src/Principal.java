import java.io.*;
public class Principal {
	static BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
	public static String pedirString(String frase) throws IOException {
		String nom;
		do {
			System.out.println(frase);
			nom=lector.readLine();
		}while(nom.length()==0);
		return nom;
	}
	
	public static Serie[] rellenarSeries() {
		Serie[] arrser = new Serie[5];
		for (int i = 0; i < 3; i++) {
			arrser[i]=new Serie();
		}
		arrser[3]= new Serie();
		
		return arrser;
	}
	
	public static void main(String[] args) {
		Serie[] arrser = rellenarSeries();

	}

}
