package GameTimeSimulation;

public class SaleManager implements SaleService {

	@Override
	public void addSale(Sale sale) {
		System.out.println(sale.getSaleId() + "Added Sale");
		
	}

	@Override
	public void deleteSale(Sale sale) {
		System.out.println(sale.getSaleId() + "Deleted Sale");
		
	}

	@Override
	public void updateSale(Sale sale) {
		System.out.println(sale.getSaleId() + "Updated Sale");
		
	}

}
