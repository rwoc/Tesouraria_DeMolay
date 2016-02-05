package br.rt.DeMolay;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Gerenciador {
	List<Membro> listaDeMembros;
	List<Pagamento> ListaPagamentos;
	
	public Gerenciador(){
		listaDeMembros = new ArrayList<Membro>();
		ListaPagamentos = new ArrayList<Pagamento>();
	}
	
	public void CadastrarMembro(Membro m){
		this.listaDeMembros.add(m);
	}
	
	public void CadastrarPagamento(Pagamento p){
		this.ListaPagamentos.add(p);
	}
	
	public Membro ConsultarMembro(String texto, int tipoPesquisa){
		if(tipoPesquisa == 1){
			return ConsultarID(texto);
		}else if(tipoPesquisa == 2){
			return ConsultarNome(texto);
		}else{
			return null;
		}
	}
	
	private Membro ConsultarID(String id){
		for(Membro m:this.listaDeMembros){
			if(m.getId().equalsIgnoreCase(id)){
				return m;
			}//fim do if
		}//fim do for
		return null;
	}
	
	private Membro ConsultarNome(String nome){
		for(Membro m:this.listaDeMembros){
			if(m.getNome().equalsIgnoreCase(nome)){
				return m;
			}//fim do if
		}//fim do for
		return null;
	}
	
	public void removeLista(int tipo, String texto){
		this.listaDeMembros.remove(ConsultarMembro(texto, tipo));
	}
	
	
	public List<Membro> getList (){
		return listaDeMembros;
	}
	
}