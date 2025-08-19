public class Codigo2 {
	public static void main(String[] args) {
		// Produtos e seus respectivos preços: Xuxu:4.99 ... Maçã:3.99
		String[] produtos = {"Xuxu", "Melão", "Goiaba", "Maçã"};
		double[] precos = {4.99, 2.99, 1.99, 3.99};
		
		//BubbleSort
		for (int x = 0; x < produtos.length - 1; x++) {
			for (int y = x + 1; y < produtos.length; y++) { // Changed inner loop start to x + 1
				if (produtos[x].compareTo(produtos[y]) > 0) {
					// Trocar produtos
					String auxProduto = produtos[x];
					produtos[x] = produtos[y];
					produtos[y] = auxProduto;

					// Trocar precos simultaneamente
					double auxPreco = precos[x];
					precos[x] = precos[y];
					precos[y] = auxPreco;
				}
			}
		}
		
		for (int cont = 0; cont < produtos.length; cont++) {
			System.out.println(produtos[cont] + ": " + precos[cont]);
		}
	}
}