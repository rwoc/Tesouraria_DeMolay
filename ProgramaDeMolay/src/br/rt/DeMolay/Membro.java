package br.rt.DeMolay;

public class Membro {
	private String id;
	private String nome;
	private String apelido;
	private String dataDeNascimento;
	private String nomeDaMae;
	private String nomeDoPai;
	private String nomeDoCapitulo;
	private String bairro;
	private String endereco;
	private String numeroDoEndereco;
	private String nomeCidade;
	private String telefone;
	private String celular;
	private String email;
	private char grau;
	
	public Membro(String id, String nome,  String dataDeNascimento, String nomeDaMae, String nomeDoPai, String nomeDoCapitulo, 
			String bairro, String endereco, String numeroDoEndereco, String telefone, String celular, String email, char grau, String cidade,
			String apelido){

		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.nomeDaMae = nomeDaMae;
		this.nomeDoPai = nomeDoPai;
		this.nomeDoCapitulo = nomeDoCapitulo;
		this.bairro = bairro;
		this.endereco = endereco;
		this.numeroDoEndereco = numeroDoEndereco;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.grau = grau;
		this.nomeCidade = cidade;
		this.apelido = apelido;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apelido == null) ? 0 : apelido.hashCode());
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((dataDeNascimento == null) ? 0 : dataDeNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + grau;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeCidade == null) ? 0 : nomeCidade.hashCode());
		result = prime * result + ((nomeDaMae == null) ? 0 : nomeDaMae.hashCode());
		result = prime * result + ((nomeDoCapitulo == null) ? 0 : nomeDoCapitulo.hashCode());
		result = prime * result + ((nomeDoPai == null) ? 0 : nomeDoPai.hashCode());
		result = prime * result + ((numeroDoEndereco == null) ? 0 : numeroDoEndereco.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Membro other = (Membro) obj;
		if (apelido == null) {
			if (other.apelido != null)
				return false;
		} else if (!apelido.equals(other.apelido))
			return false;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (dataDeNascimento == null) {
			if (other.dataDeNascimento != null)
				return false;
		} else if (!dataDeNascimento.equals(other.dataDeNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (grau != other.grau)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeCidade == null) {
			if (other.nomeCidade != null)
				return false;
		} else if (!nomeCidade.equals(other.nomeCidade))
			return false;
		if (nomeDaMae == null) {
			if (other.nomeDaMae != null)
				return false;
		} else if (!nomeDaMae.equals(other.nomeDaMae))
			return false;
		if (nomeDoCapitulo == null) {
			if (other.nomeDoCapitulo != null)
				return false;
		} else if (!nomeDoCapitulo.equals(other.nomeDoCapitulo))
			return false;
		if (nomeDoPai == null) {
			if (other.nomeDoPai != null)
				return false;
		} else if (!nomeDoPai.equals(other.nomeDoPai))
			return false;
		if (numeroDoEndereco == null) {
			if (other.numeroDoEndereco != null)
				return false;
		} else if (!numeroDoEndereco.equals(other.numeroDoEndereco))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}


	public String getApelido() {
		return this.apelido;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


	public String getNomeDoCapitulo() {
		return nomeDoCapitulo;
	}


	public void setNomeDoCapitulo(String nomeDoCapitulo) {
		this.nomeDoCapitulo = nomeDoCapitulo;
	}


	public String getNumeroDoEndereco() {
		return numeroDoEndereco;
	}


	public void setNumeroDoEndereco(String numeroDoEndereco) {
		this.numeroDoEndereco = numeroDoEndereco;
	}


	public String getNomeCidade() {
		return nomeCidade;
	}


	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	public String getNomeDoPai() {
		return nomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	public String getNomeCapitulo() {
		return nomeDoCapitulo;
	}
	public void setNomeCapitulo(String nomeCapitulo) {
		this.nomeDoCapitulo = nomeCapitulo;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumeroCasa() {
		return numeroDoEndereco;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroDoEndereco = numeroCasa;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGrau() {
		return grau;
	}
	public void setGrau(char grau) {
		this.grau = grau;
	}
	
	public String toString(){
		return this.nome;
	}

}
