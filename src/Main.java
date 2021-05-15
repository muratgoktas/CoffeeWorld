
public class Main {

	public static void main(String[] args) {
		Customer customer =new Customer();
		customer.setId(1);
		customer.setFirstName("Kayra");
		customer.setMiddleName("Deniz");
		customer.setLastName("GÖKTAÞ");
		customer.setNationalityId("43831127560");
		
		
		/*
		 * BaseCustomerManager customerManager =new StarbucksCustomerManager(customer);
		 * customerManager.Save(customer);
		 */
		//CheckedId checkedId =new CheckedId();
		//System.out.println(topla);
		System.out.println(CheckedId.Checked(customer));
	}

}
