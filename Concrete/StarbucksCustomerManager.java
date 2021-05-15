
public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void Save(Customer customer) throws Exception {

		if (this.customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			throw new Exception("Not a valid person");
		}

	}

}
