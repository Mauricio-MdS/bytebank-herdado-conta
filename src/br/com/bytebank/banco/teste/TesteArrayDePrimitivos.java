package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
//		idades[0] = 15;
//		idades[1] = 75;
//		idades[2] = 54;
//		idades[3] = 23;
//		idades[4] = 45;
//		
//		int idadeSelecionada = idades[3];
//		System.out.println(idadeSelecionada);
//		System.out.println(idades.length);
//		
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * (i+1);
			System.out.println(idades[i]);
		}
	}

}
