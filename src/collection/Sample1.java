package collection;

import java.util.*;

public class Sample1 {
	public static void main(String[] args) {
		//리스트 : 순서가 엄격하게 부여된 집합 데이터, 순번(index)이 검색의 기준점이다.
		//		 기준점이 존재하기 때문에 중복 데이터를 허용.
		//java collection은 interface이기 때문에 직접 객체로 제작할 수 없고
		//implements 되어있는 준비된 class를 객체로 조립하여 사용한다.
		List<String> L=new ArrayList<String>();
		L.add("홍길동");
		L.add("최지향");
		L.add("김철수");
		L.add(1,"김북부");//순서 가운데에 데이터 끼워넣기
		
		List<String> L2=new ArrayList<String>();
		L2.add("A");
		L2.add("B");
		L2.add("C");
		
		L.addAll(2,L2);//이렇게해야 리스트끼리 데이터가 합쳐짐
					//add로 하면 들어가는 데이터는 하나의 array로 포함관계가 형성되어 2차배열이 됨
		System.out.println(L);
		System.out.println(L2);
		
		//데이터를 입력할 때는 add()로 입력하고 꺼내올때는 get()으로 가져온다.
		System.out.println(L.get(5));
		//리스트에서 데이터의 수를 확인할 때는 length가 아니고 size()를 사용한다.
		//collection은 사용방법이 딱 정해져 있어서 사용할 때 주의해야 한다.
		System.out.println(L.size());
		
		//일반 for문
		for(int i=0;i<L.size();i++) {
			System.out.print(L.get(i)+"\t");
		}
		System.out.println();//위쪽이랑 구별하는 용도
		
		//향상된 for문
		//for(변수:집합){집합운행시 1단위마다 수행할 문장;}
		//변수의 데이터 타입과 집합데이터의 데이터 타입이 일치해야 함. 그래서 위에서 generic으로 데이터타입을 잡아놓은 것.
		//밑에 데이터 타입을 Object로 하면 데이터타입이 일치하여 오류는 나지 않지만 
		//나중에 콘솔 말고 화면띄우기를 하려면 외계어가 안뜨게 하게 toString을 다 해줘야 하므로 결국은 불편해짐.
		for(String str:L) {
			System.out.print(str+"\t");
		}
	}
}

