package ALendadeFlaviousJosephus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner ler2 = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int rodadas = ler2.nextInt();
		int cont = 0;
		while(cont < rodadas) {
			cont ++;
			String entrada = "";
			try {
				entrada = in.readLine();
			} catch (IOException e){}
			entrada = entrada.trim();
			int quantidade = Integer.parseInt(entrada.substring(0, entrada.indexOf(" ")));
			int pulos = Integer.parseInt(entrada.substring(entrada.indexOf(" ") + 1, entrada.length()));

			int[] lista = new int[quantidade];
			for (int i = 0; i < quantidade; i++) {
				lista[i] = i + 1;
			}
			int contagem = -1;
			int contPulos = 0;
			while (quantPessoas(lista) != 1) {
				while (contPulos != pulos) {
					contagem++;
					if (lista[contagem] != 0)
						contPulos++;
					if ((contagem + 1 == quantidade) && (contPulos == pulos)) {
						lista[contagem] = 0;
						contagem = -1;
						contPulos = 0;
						if(quantPessoas(lista) == 1) break;
					} else if (contagem + 1 == quantidade) contagem = -1;
				}
				if(quantPessoas(lista) == 1) break;
				lista[contagem] = 0;
				contPulos = 0;
			}

			System.out.println("Case " + (cont) + ": " + retonaNumeor(lista));
		}
		ler2.close();
	}

	public static int quantPessoas(int[] lista) {
		int quant = 0;
		for (int i : lista) {
			if (i != 0) {
				quant += 1;
			}
		}
		return quant;
	}

	public static int retonaNumeor(int[] lista) {
		for (int x : lista) {
			if (x != 0) {
				return x;
			}
		}
		return 0;
	}
}
