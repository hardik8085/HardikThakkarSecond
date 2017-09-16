package dynamicproxy;


/**
 * ATM Service class
 * @author hardik thakkar
 *
 */
public class ATMBusinessService implements ATMService{

	@Override
	public void printAmount() {
		System.out.println("Amount in ATM is : 50000" );
	}

}
