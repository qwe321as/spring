package sample4;

public class CalcImpl implements Calc{
	
	private int su1; // 9, setter 
	private int su2; // 4, ������
	
	public void setSu1(int su1) {
		System.out.println("setSu1(int su1)");
		this.su1 = su1;
	}
	
	public CalcImpl(int su2) {
		System.out.println("CalcImpl(int su2)");
		this.su2 = su2;
	}
	
	@Override
	public void calculate() {
		
		System.out.println("���� : " + (su1 + su2));
		System.out.println("���� : " + (su1 - su2));
		System.out.println("���� : " + (su1 * su2));
		System.out.println("������ : " + (su1 / su2));
		System.out.println("������ : " + (su1 % su2));
		
	}
	
}
