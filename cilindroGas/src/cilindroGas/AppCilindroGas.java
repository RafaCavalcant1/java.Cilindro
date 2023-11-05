/*
Implemente uma aplicação para:
a) Armazenar em um array 3 objetos da classe CilindroGas com a capacidade máxima de 50,
60 e 70 unidade de gás, respectivamente.
b) Receber e registrar 2 consumos para o primeiro cilindro do array.
c) Receber e registrar 3 consumos para o segundo cilindro do array. Um dos consumos deve se de
100 unidades de gás.
d) Mostrar o identificador, a capacidade atual e a quantidade do último consumo de todos os
cilindros.
e) Mostrar a capacidade total (com base na capacidade atual) dos cilindros.
Obs.: Os itens “b” e “c” devem testar se a operação pode ser realizada.
 */
package cilindroGas;

import java.util.Scanner;

public class AppCilindroGas {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		CilindroGas[] cilindroArray = new CilindroGas [3];
		
		CilindroGas cilindroGas = new CilindroGas(1, 50);
		cilindroArray[0]= cilindroGas;
		
		cilindroGas = new CilindroGas(2, 60);
		cilindroArray[1]= cilindroGas;
		
		cilindroGas = new CilindroGas(3, 70);
		cilindroArray[2]= cilindroGas;
		
		for(int i = 0; i<2;i++) {
			double qtdeConsumida;
			
			do {
			System.out.println("Quantidade consumida no primeiro cilindro: ");
			qtdeConsumida = input.nextDouble();
			if(qtdeConsumida<1) {
				System.out.println("valor não pode ser negativo ou 0");
			}
			}while(qtdeConsumida<1);
			
			if(cilindroArray[0].registrarConsumo(qtdeConsumida)== false) {
				System.out.println("Quantidade indisponível");
			}
			System.out.println("o identificador é: " + cilindroArray[0].getIdCilindro());
			System.out.println("Capacidade atual: " + cilindroArray[0].getCapacidadeAtual());
			System.out.println("ultimo consumo: " + cilindroArray[1].getQtdeUltimoConsumo());
		}
		
		
		for(int i = 0; i<3;i++) {
			double qtdeConsumida;
			
			do {
			System.out.println("Quantidade consumida no segundo cilindro: ");
			qtdeConsumida = input.nextDouble();
			if(qtdeConsumida<1) {
				System.out.println("valor não pode ser negativo ou 0");
			}
			}while(qtdeConsumida<1);
			
			if(cilindroArray[1].registrarConsumo(qtdeConsumida)== false) {
				System.out.println("Quantidade indisponível");
			}
			System.out.println("o identificador é: " + cilindroArray[1].getIdCilindro());
			System.out.println("Capacidade atual: " + cilindroArray[1].getCapacidadeAtual());
			System.out.println("ultimo consumo: " + cilindroArray[1].getQtdeUltimoConsumo());
		}
		
		double capacidadeTotal = 0;
		for(int i = 0; i<cilindroArray.length;i++) {
			capacidadeTotal+= cilindroArray[i].getCapacidadeAtual();	
		}
		System.out.println("A capacidade total é de: "+ capacidadeTotal);

		
		input.close();
	}
}
