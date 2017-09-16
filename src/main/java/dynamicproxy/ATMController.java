package dynamicproxy;

/**
 * Static proxy controller
 * @author hardik thakkar
 *
 */
public class ATMController {

	public static void main(String[] args) {

			ATMService atmService = new ATMServiceProxy(new ATMBusinessService());
			atmService.printAmount();
	}

}
