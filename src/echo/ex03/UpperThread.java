package echo.ex03;

public class UpperThread extends Thread {

	//필드
	
		//생성자
		
		//gs
		
		//일반
		@Override
		public void run() {

			for (char ch = 'A'; ch <= 'Z'; ch++) {
				System.out.println(ch);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
	
}
