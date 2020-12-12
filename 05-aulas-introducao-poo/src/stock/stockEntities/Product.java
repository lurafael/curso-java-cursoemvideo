package stock.stockEntities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return 	name 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", " + quantity + " units, $" 
				+ String.format("%.2f", totalValueInStock());
	}
	
	//Sobrescrevemos o método .toString para que ao digitar algo que precise voltar com esse texto formatado,
	//Não precisamos chamar variavel.toString(), somente com o nome da variável pois o java identifica que 
	//será uma string que será retornada pelo println e chama o toString automaticamente.
}
