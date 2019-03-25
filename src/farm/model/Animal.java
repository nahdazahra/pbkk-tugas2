package farm.model;

public class Animal {
	
	String species;
	String products;
	int numOf;
	String food;

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String species, String product, int numOf, String food) {
		this.species = species;
		this.products = product;
		this.numOf = numOf;
		this.food = food;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", products=" + products + ", numOf=" + numOf + ", food=" + food + "]";
	}
	
}
