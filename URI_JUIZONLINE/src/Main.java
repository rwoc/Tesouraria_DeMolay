import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String entrada = in.readLine();
		System.out.println("Você digitou:" + entrada +"teste");
		entrada = entrada.trim();
		System.out.println("Você digitou:" + entrada +"teste");
		
		/*
		int x = 0;
		int quantidade = Integer.parseInt(entrada.substring(0, entrada.indexOf(" ")));
		if(entrada.substring(entrada.length()-1).equals(" ")) x =1;
		System.out.println(entrada.substring(entrada.length()).equals(" "));
		int pulos = Integer.parseInt(entrada.substring(entrada.indexOf(" ") + 1, entrada.length()- x));
		
		System.out.println(quantidade);
		System.out.println(pulos);
		
		Scanner ler = new Scanner(System.in);
		
		String entrada = ler.nextLine();
		String[] array = entrada.split("");
		int posicaoEspaco = 0;
		
		for(int x=0; x<array.length; x++){
			if(array[x] == " ") posicaoEspaco = x;
		}
		
		String StrinNumero = "";
		for(int x=0; x<posicaoEspaco ;x++){
			StrinNumero += array[x];
		}
		System.out.println(StrinNumero);
		int numeroDePessoas = Integer.parseInt(StrinNumero);
		
		String StringPulos = "";
		for(int x=posicaoEspaco+1; x<entrada.length() ; x++){
			StringPulos += array[x];
		}
		int numeroPulos = Integer.parseInt(StringPulos);
		
		System.out.println("Numero pulos :" + numeroPulos);
		System.out.println("Numero pessoas :" + numeroDePessoas);
		*/
	}

}
