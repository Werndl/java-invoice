package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.Map;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Map<Product, Integer> products;

	public void addProduct(Product product) {
		this.addProduct(product, 1);
	}

	public void addProduct(Product product, Integer quantity) {
		this.products.put(product, quantity);
	}

	public BigDecimal getNetPrice() {
		return new BigDecimal(0);
	}

	public BigDecimal getTax() {
		return new BigDecimal(0);
	}

	public BigDecimal getGrossPrice() {
		return new BigDecimal(0);
	}
}
