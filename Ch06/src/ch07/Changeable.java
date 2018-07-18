package ch07;

public interface Changeable extends Colorable, Resize {
/*	void resize(int width,int height);
	void setForeground(String color);
	void setBackground(String color);*/
	void setFont(String font);

}
