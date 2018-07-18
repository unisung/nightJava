package ch03;

public class Point {
  int x,y;

public Point(int x, int y) {
	this.x = x;
	this.y = y;
}

//private <default<protected<public
protected int getX() {
	return x;
}

protected int getY() {
	return y;
}
 

  
}
