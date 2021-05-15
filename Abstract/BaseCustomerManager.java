
public  abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) throws Exception {
		System.out.println("Save to DB!"+ customer.getFullName());
		
	}

}
