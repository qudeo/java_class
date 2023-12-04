package ch01_variables;

public class Ex01_Variables {

	public static void main(String[] args) {
		// 본인의 이름(name), 나이(age), 키(height), 주소(address), 전화번호(mobile)를 입력할 수 있는 변수를 각각 선언해봅시다.
		// 를 입력할 수 있는 변수를 각각 선언해봅시다.
		String name = "김태송";
		int age = 23;
		double height = 161.6;
		String address = "인천광역시 남동구 구월말로85번길 8, A동 501호";
		String mobile = "010-4164-3202";
		
		// 변수값 출력
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(address);
		System.out.println(mobile);
		
		System.out.println("저의 이름은 " + name + " 입니다.");
	}

}
