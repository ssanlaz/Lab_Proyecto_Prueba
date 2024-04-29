package TestingCalculadora;

import ModeloDao.CalculadoraDao;
import ModeloDao.CalculadoraDaoImpl;

public class TestCalculadora {

	public static void main(String[] args) {
		 
		CalculadoraDao cdao= new CalculadoraDaoImpl();
		
		System.out.println(cdao.sumar(10, 20));
		System.out.println(cdao.restar(1, 10));
		System.out.println(cdao.multiplicar(5, 2));

	}

}
