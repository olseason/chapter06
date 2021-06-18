package echo.ex02;

public class MultithreadApp {

	public static void main(String[] args) throws Exception{
		
		DigitThread thread = new DigitThread();
		thread.start();   //start() 내부에 출장준비(이동, 자리세팅)-->  내부에서 run() 실행 
		//thread.run();   //비교 해보기 
		
		
		for(char ch='A'; ch<='Z';ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
		
		
		
		

	}

}
