package ch03;

public class Point3D extends Point{
    int z;
	
	public Point3D(int x, int y,int z) {
		super(x, y);
		this.z=z;
	}

	//접근제어자는
	//상속관계에서
	//부모클래스의 메소드보다
	//더 좁은 접근제어를 할수 없음
	//부모메소드의 범위보다 크거나 같아야함.
	protected int getZ() {
		return z;
	}
	
	public int getX() {
		return x;
	}
	protected int getY() {
		return y;
	}
	

}
