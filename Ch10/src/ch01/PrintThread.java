package ch01;

public class PrintThread extends Thread {
    SharedArea sharedArea;

	@Override
	public void run() {
		while(sharedArea.isReady != true)
              continue;
        System.out.println(sharedArea.result);

	}
    
    
    
}
