package sample2;

public class PointImpl implements Point{

	private double xpos; // 3.0 x��ǥ
	private double ypos; // 4.0 y��ǥ
	
	@Override
	public double getXpos() {
		return xpos;
	}

	@Override
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}

	@Override
	public double getYpos() {
		return ypos;
	}

	@Override
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}

}

