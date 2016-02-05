package br.rt.DeMolay;

public class Pagamento {
	private Membro membro;
	private int mes;
	private int ano;
	
	public Pagamento(Membro membro, int mes, int ano){
		this.membro = membro;
		this.mes = mes;
		this.ano = ano;
		
	}

	public Membro getMembro() {
		return membro;
	}

	public void setMembro(Membro membro) {
		this.membro = membro;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
