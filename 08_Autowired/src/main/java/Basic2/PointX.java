package Basic2;

import org.springframework.stereotype.Component;

/*PointX PointX = new PointX();*/
@Component("PointX") // ��������
public class PointX implements Shape{

	public PointX() {
		System.out.println("PointX()");
	}
	
	@Override
	public String make() {
		return "X�� �����";
	}

	@Override
	public String delete() {
		return "X�� �����";
	}

}
