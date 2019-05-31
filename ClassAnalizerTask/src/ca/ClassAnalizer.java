package ca;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassAnalizer {

	public static void main(String[] args) throws Exception {

		Door door = new Door();
		
		Class<? extends Door> test = door.getClass();
		
		Method[] methods = test.getMethods();
		
		Field[] fields = test.getDeclaredFields();
		
		String interfaces = test.getInterfaces()[0].getSimpleName();
		
		
		System.out.println(test.getCanonicalName());
		
		 System.out.println("-------------------------");
		
		 for (Method method:methods) 
	            System.out.println(method.getName());
		 
		 System.out.println("-------------------------");
		 
		 for (Field field:fields) 
	            System.out.println(field.getName() + " " +  field.getType().getName());
		 
		 System.out.println("-------------------------");
		 
		 System.out.println(interfaces);
		 
		 System.out.println("-------------------------");
		 
		 Field field = door.getClass().getDeclaredField("color");
		 
		field.setAccessible(true);
		 
		field.set(door, "zielone");
		 
		 door.close();
		 
	}
	
	
	
}
