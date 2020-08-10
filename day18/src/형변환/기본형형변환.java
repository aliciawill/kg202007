package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		//기본형 데이터 타입
		int a = 100;//-21억~21억(4바이트)
		byte b = 100; //-128~127(1바이트)
		long c = 100000000000L; //21억 이상(8바이트)
		short d = 2000;//-2만 ~ 2만(2바이트)
		//long(8)<- int(4)<- short(2)<- byte(1)
		//double(8)<- float(4)
		double e = 11.4567;
		float f = 11.55F;		
		
		
		byte n1 = 100;
		int n2 = n1; //int(큰)<-byte(작은):자동타입변환
					 //자동형변환
		byte n3 = (byte)n2;//byte(작)<-int(큰):
					//강제형변환, 작게 만들어줄 수 있는 범주에 있을 때 
					//강제형변환 가능하다.
		//byte n4 = 1000;
	}
}





