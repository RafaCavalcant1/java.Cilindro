package cilindroGas;

public class AppCilindroGas2 {

	public static void main(String[] args) {
		
		CilindroGas cilindro = new CilindroGas(1, 50);
		
		System.out.println("id:" + cilindro.getIdCilindro());
		System.out.println("capacidade maxima: " + cilindro.getCapacidadeMaxima());
		System.out.println("Capacidade atual: " + cilindro.getCapacidadeAtual());
		System.out.println("Ultimo consumo"+ cilindro.getQtdeUltimoConsumo());
		
		
		if(cilindro.registrarConsumo(10) == true) {
			System.out.println("Operação realizada");
		}
		else {
			System.out.println("Quantidade insuficiente");
		}
	
		if(cilindro.registrarConsumo(5) == true) {
			System.out.println("Operação realizada");
		}
		else {
			System.out.println("Quantidade insuficiente");
		}
	
		if(cilindro.registrarConsumo(40) == true) {
			System.out.println("Operação realizada");
		}
		else {
			System.out.println("Quantidade insuficiente");
		}
		
		System.out.println("Capacidade atual: " + cilindro.getCapacidadeAtual());
	}
}
