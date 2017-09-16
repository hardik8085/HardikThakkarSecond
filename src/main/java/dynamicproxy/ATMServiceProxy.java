package dynamicproxy;

/**
 * Static proxy 
 * @author hardik thakkar
 *
 */
public class ATMServiceProxy implements ATMService {

	ATMService atmService = null;

	public ATMServiceProxy(ATMService atmService) {
		this.atmService = atmService;
	}

	@Override
	public void printAmount() {

		atmService.printAmount();
	}

}
