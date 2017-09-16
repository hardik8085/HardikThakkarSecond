package dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * dynamic proxy demo
 * @author hardik thakkar
 *
 */
public class DynamicProxyDemo {

	public static void main(String[] args) {

		
		ATMService atmService = new ATMBusinessService();
		
		ClassLoader cl = DynamicProxy.class.getClassLoader();
		
		DynamicProxy ad = new DynamicProxy(atmService);
		
		ATMService proxiedService = (ATMService) Proxy.newProxyInstance(cl, new Class[]{ATMService.class}, ad);
		
		proxiedService.printAmount();
		
	}

}
