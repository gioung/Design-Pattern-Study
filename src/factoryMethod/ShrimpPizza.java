package factoryMethod;

public class ShrimpPizza implements Pizza{

	public ShrimpPizza() {
		System.out.println("���������� �ֹ��ϼ̽��ϴ�.");
	}

	@Override
	public void makePizza() {
		System.out.println("���������ڰ� ����������ϴ�.");
		
	}

}