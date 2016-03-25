package JogoMatematicoDePaula;
import java.io.IOException;
import java.util.Scanner;


 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    		Scanner ler = new Scanner(System.in);
		int quant = ler.nextInt();

		for (int x = 0; x < quant; x++) {
			String entrada = ler.next();
			String[] array = entrada.split("");
			int nun1 = Integer.parseInt(array[0]);
			int nun2 = Integer.parseInt(array[2]);
			int resultado = 0;

			if (nun1 == nun2) {
				resultado = nun1 * nun2;
			} else if (Character.isUpperCase(array[1].charAt(0))) {
				resultado = nun2 - nun1;
			} else {
				resultado = nun2 + nun1;
			}
			System.out.println(resultado);
			ler.close();
		}

    }
 
}