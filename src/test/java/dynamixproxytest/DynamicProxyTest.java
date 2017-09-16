package dynamixproxytest;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;

import dynamicproxy.ATMBusinessService;
import dynamicproxy.ATMService;
import dynamicproxy.DynamicProxy;
import dynamicproxy.DynamicProxyDemo;

public class DynamicProxyTest {

	@Test
	public void test() {
ATMService atmService = new ATMBusinessService();
		
		ClassLoader cl = DynamicProxy.class.getClassLoader();
		
		DynamicProxy ad = new DynamicProxy(atmService);
		
		ATMService proxiedService = (ATMService) Proxy.newProxyInstance(cl, new Class[]{ATMService.class}, ad);
		
		assertNotNull(proxiedService);
	}

}
