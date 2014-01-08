package ManagedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import Entidade.Pessoa;

@ViewScoped
@ManagedBean
public class PessoaBean {

	public Pessoa pessoa;
	
	public PessoaBean(){
		pessoa = new Pessoa();
		pessoa.setNome("Kellerman Paulo da Mota");
		pessoa.setEndereco("Rua Formosa numero 137");
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
