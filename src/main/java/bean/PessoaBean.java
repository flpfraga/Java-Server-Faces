package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;

import model.Endereco;
import model.Pessoa;
import repository.EnderecoRepository;
import repository.PessoaRepository;

@ManagedBean
@ViewScoped
public class PessoaBean {

	private HtmlInputText inputNome;
	private HtmlInputSecret inputPassword;
	private HtmlInputText inputCidade;
	PessoaRepository pessoaRepository;
	EnderecoRepository enderecoRepository;
	
	
	public void adicionar() {
		System.out.println(inputNome.getLocalValue());	
		System.out.println(inputPassword.getLocalValue());	
		System.out.println(inputCidade.getLocalValue());
		Pessoa pessoa = new Pessoa();
		pessoa.setNome((String) inputNome.getLocalValue());
		pessoa.setPassword((String) inputPassword.getLocalValue());
		Endereco endereco = new Endereco();
		endereco.setCidade((String) inputCidade.getLocalValue());
		endereco.setPessoa(pessoa);
		pessoaRepository = new PessoaRepository();
		enderecoRepository = new EnderecoRepository();
		pessoaRepository.salvar(pessoa);
		enderecoRepository.salvar(endereco);
	}
	
	
	public HtmlInputText getInputNome() {
		return inputNome;
	}
	public void setInputNome(HtmlInputText inputNome) {
		this.inputNome = inputNome;
	}
	public HtmlInputSecret getInputPassword() {
		return inputPassword;
	}
	public void setInputPassword(HtmlInputSecret inputPassword) {
		this.inputPassword = inputPassword;
	}
	public HtmlInputText getInputCidade() {
		return inputCidade;
	}
	public void setInputCidade(HtmlInputText inputCidade) {
		this.inputCidade = inputCidade;
	}
	
}
