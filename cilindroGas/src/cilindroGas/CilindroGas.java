package cilindroGas;

public class CilindroGas {

	private int idCilindro;
	private double capacidadeMaxima;
	private double capacidadeAtual;
	private double qtdeUltimoConsumo;
	
	public CilindroGas(int idCilindro,float capacidadeMaxima) {
		this.idCilindro = idCilindro;
		this.capacidadeMaxima = capacidadeMaxima;
		this.capacidadeAtual = capacidadeMaxima;	
	}
	
	public int getIdCilindro() {
		return idCilindro;
	}
	
	public double getCapacidadeMaxima() {
		return capacidadeMaxima;
	
	}
	public void setCapacidadeMaxima(double capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public double getCapacidadeAtual() {
		return capacidadeAtual;
	}
	
	public double getQtdeUltimoConsumo() {
		return qtdeUltimoConsumo;
	}
	
	public boolean registrarConsumo(double qtde) {
		
		if (qtde <= this.capacidadeAtual) {
			this.qtdeUltimoConsumo = qtde;
			this.capacidadeAtual -= qtde;
			return true;
		}
			return false; 
	}
	
}
