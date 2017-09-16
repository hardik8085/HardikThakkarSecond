package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Dynamic proxy invocation handler
 * @author hardik thakkar
 *
 */
public class DynamicProxy implements InvocationHandler{

	
	private Object target;
	
	public DynamicProxy(Object target) {
		this.target = target;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Audit log creation:");
		Object result = method.invoke(target, args);
		return result;
	}

}
