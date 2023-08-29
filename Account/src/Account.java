public class Account {
	private String nome,num,senha;
	private double saldo,limite;
	
	public Account(String nome,String num, double saldo, double limite,String senha) {
		
		this.nome = nome;
		this.senha = senha;
		this.num = num;
		this.limite = limite;
		
	}
	
	public void deposito (double valDeposito) {
		if(valDeposito > 0.0)
			saldo = saldo + valDeposito;
	}
	
	public void sacar (double valSaque) {

		if(valSaque > saldo)
			System.out.println("Valor não disponivel");
		else
			saldo = saldo - valSaque;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNum() {
		return num;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void printSenha() {
		System.out.printf("Senha:%s",getSenha());
	}
	
	public void Printar() {
		System.out.printf("Nome:%s || Numero da conta:%s || Saldo disponivel: %.2f || Limite:%.2f%n",
				getNome(),getNum(),getSaldo(),getLimite());
		
	}
	
	public void reset(String senhaAntiga,String senhaNova) {
		if(senhaAntiga == senha)
			senha = senhaNova;
		else
			System.out.println("Senha errada");
	}
	
}