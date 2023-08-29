import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		Account conta1 = new Account("Fernando","20098174",0,0,"1212");
		Account conta2 = new Account("Larry","22018977",0,0,"1212");
		
		conta1.Printar();
		conta2.Printar();
		
		System.out.println("Qual valor quer depositar");
		double valDeposito = input.nextDouble();
		conta1.deposito(valDeposito);
		conta1.Printar();
		
		System.out.println("Qual valor quer sacar");
		double valSaque = input.nextDouble();
		conta1.sacar(valSaque);
		conta1.Printar();
		
		conta1.reset("1212","0000");
		conta1.printSenha();
		conta1.reset("0000","0001");
		conta1.printSenha();
		
		
	}
	
}