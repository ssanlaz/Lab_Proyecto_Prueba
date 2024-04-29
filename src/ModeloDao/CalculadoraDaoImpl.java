package ModeloDao;

public class CalculadoraDaoImpl implements CalculadoraDao {

	@Override
	public int sumar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int restar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public int multiplicar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int dividir(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}

	@Override
	public int resto(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1%num2;
	}

}
