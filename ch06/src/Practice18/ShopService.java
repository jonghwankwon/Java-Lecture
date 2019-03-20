package Practice18;

public class ShopService {
	private static ShopService singletone = new ShopService();
	
	private ShopService() {		
	}
	public static ShopService getInstance() {
		return singletone;
	}
}
