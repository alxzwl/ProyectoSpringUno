package com.enterprise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		// Creacion del ClassPathApplicationContext que cargara al archivo de
		// configuracion "applicitionContext.xml"
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Crear una instancia a la que se le cargara el bean
		Empleados Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		// Uso del bean
		System.out.println(Juan.getTareas());

		// Se cierra el objeto del contexto para liberar recursos
		contexto.close();
	}

}
