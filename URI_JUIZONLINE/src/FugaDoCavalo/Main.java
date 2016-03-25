package FugaDoCavalo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xadrez xadrez = new Xadrez();
		xadrez.cadastrarCavalo("4c");
		xadrez.cadastrarPiao("2a");
		xadrez.cadastrarPiao("2b");
		xadrez.cadastrarPiao("2c");
		xadrez.cadastrarPiao("3d");
		xadrez.cadastrarPiao("4f");
		xadrez.cadastrarPiao("5d");
		xadrez.cadastrarPiao("7a");
		xadrez.cadastrarPiao("7d");
		xadrez.cadastrarPiao("7g");

		xadrez.formarAtaquePiao();
		xadrez.formarMovimentoCavalo();
		
	}
	
	
	public static class Xadrez {
		private static char[][] tabuleiro;
		private static char[][] ataquePiao;
		private static int[] cavaloCoordenada;
		
		public Xadrez (){
			this.tabuleiro  = new char[8][8];
			this.ataquePiao = new char[8][8];
			this.cavaloCoordenada = new int[2];
		}
		
		public void cadastrarCavalo(String entrada){
			int[] coordenada = retornaCoordenada(entrada);
			tabuleiro[coordenada[0]][coordenada[1]] = 'C';
		}
		
		public static void cadastrarPiao (String entrada){
			int[] coordenada = retornaCoordenada(entrada);
			tabuleiro[coordenada[0]][coordenada[1]] = 'P';
			cavaloCoordenada[0] = coordenada[0] ; cavaloCoordenada[1] = coordenada[1];
		}
		
		public static void formarAtaquePiao(){
			for(int x=1; x<8; x++){
				for(int i=1 ;i<7 ; i++){
					if(tabuleiro[x][i] == 'P'){
						ataquePiao[x-1][i+1] = 'A'; // A (Ataque Pião)
						ataquePiao[x-1][i-1] = 'A';
					}// fim do if
				}//fim for i
				if(tabuleiro[x][0] == 'P'){
					ataquePiao[x-1][1] = 'A';
				}
				if(tabuleiro[x][7] == 'P'){
					ataquePiao[x-1][6] = 'A';	
				}
			}//fim for x
		}
		
		public static char[][] getAtaquePiao() {
			return ataquePiao;
		}

		private void formarMovimentoCavalo(){
			if(tabuleiro[5] [1] == 'A' ){
				System.out.println("SIM");
			}
			
			
		}

		
		private static int[] retornaCoordenada(String entrada){
			int valorDaLetra = 0;
			int valorDoNumero = (Integer.parseInt(entrada.substring(0,1)) - 1);
			String letra = entrada.substring(1); 
			if(letra.equalsIgnoreCase("A")){
				valorDaLetra = 0;			
			}else if(letra.equalsIgnoreCase("B")){
				valorDaLetra = 1;
			}else if(letra.equalsIgnoreCase("C")){
				valorDaLetra = 2;
			}else if(letra.equalsIgnoreCase("D")){
				valorDaLetra = 3;
			}else if(letra.equalsIgnoreCase("E")){
				valorDaLetra = 4;
			}else if(letra.equalsIgnoreCase("F")){
				valorDaLetra = 5;
			}else if(letra.equalsIgnoreCase("G")){
				valorDaLetra = 6;
			}else{
				valorDaLetra = 7;
			}
			return (new int[]{valorDoNumero, valorDaLetra});
		}
		
		
		
	}

}
