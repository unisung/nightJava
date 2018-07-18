package ch07;

public class InterfaceExample5 {
	public static void main(String[] args) {
		Lable obj = 
		new Lable("안녕하세요", 100, 30, "yellow", "orange", "굴림체");
		PrintLabel(obj);
		obj.resize(200, 70);
		obj.setForeground("black");
		obj.setBackground("white");
		obj.setFont("궁서체");
		PrintLabel(obj);
	}

	private static void PrintLabel(Lable obj) {
		System.out.printf("%s:%d x %d 배경색(%s) 전경색(%s) 폰트(%s) %n",
				          obj.text, obj.width,obj.height,obj.background,
				          obj.foreground,obj.font);
		
	}

}
