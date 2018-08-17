package my.day9;

public class ArrayCopy {
	/* 	>>>>> 배열의 복사 <<<<<<

		  배열은 한번 생성하면 그 크기를 변경할 수 없기 때문에 
		  더 많은 저장공간이 필요하다면 현재 사용중인 배열보다 더 큰 배열을 새로 만들고
		  이전 배열로부터 내용을 복사해야한다. 
		  배열 간의 내용을 복사하려면 for문을 사용하거나 
		 System클래스의 arraycopy()메소드를 사용하면 된다. 
	*/

	/*
		System.arraycopy(src, srcPos, dest, destPos, length); 
		
		배열 src의 내용을 새배열 dest 로 복사하는데, 
		복사할 내용은 배열 src의 인덱스 srcPos의 위치부터 시작해서 
		length 만큼을 새배열 dest 의 인덱스 destPos인 위치에 복사한다. 
		이때 복사되어지는 새배열(dest)의 위치가 적절하지 못하여 
		복사하려는 내용(src)보다 여유공간이 적으면 
		ArrayIndexOutOfBoundsException이 발생한다. 
	*/
	public static void main(String[] args) {

		String[] friendArr = {"김상원","이고은","최민주"};
		
		System.out.println("A. 기존 배열 friendArr");
		for(int i=0; i<friendArr.length; i++) {
			String str = (i<friendArr.length-1)? ",":"\n";
			System.out.print(friendArr[i]+str);
		}
		
		// 이 상태에서 친구 두 명을 더 추가하고 싶을 때! ArrayIndexOutOfBoundsException
		
		// 1. for문을 이용한 배열 복사-----------------------------------------
		
		// 1) 새로 받아올 더 큰 배열을 만든다
		String[] newFriendArr = new String[5]; 
		
		// 2) for문으로 기존 내용을 새로운 배열값에 대입
		for(int i=0; i<friendArr.length; i++) {
			newFriendArr[i] = friendArr[i];
		}
		
		// 3) 나머지 배열 방에 새로 넣을 값 대입
		newFriendArr[3] = "김혜원";
		newFriendArr[4] = "배수미";
		
		// 4) 기존의 배열은 필요없기 때문에 null로 없앰
		friendArr = null;
		
		// 5) 출력하기
		System.out.println("\nB. 새로운 배열 newFriendArr; for문을 이용한 배열 복사");
		for(int i=0; i<newFriendArr.length; i++) {
			String str = (i<newFriendArr.length-1)? ",":"\n";
			System.out.print(newFriendArr[i]+str);
		}
		// ------------------------------------------------------------
		
		System.out.println("\n=====================================");
		// 2. system클래스의 arraycopy();를 이용한 배열 복사---------------------
		System.out.println("A. 기존 배열 friendArr2");
		String[] friendArr2 = {"박민규","홍윤성","최민주"};
		for(int i=0; i<friendArr2.length; i++) {
			String str = (i<friendArr2.length-1)? ",":"\n";
			System.out.print(friendArr2[i]+str);
		}
		
		// 1) 새로 받아올 더 큰 배열 만들기
		String[] newFriendArr2 = new String[5];
		
		// 2) arraycopy() 메소드 사용
		System.arraycopy(friendArr2, 0, newFriendArr2, 0, friendArr2.length); 
//		System.arraycopy(소스(원본), 소스 출발지 방, 도착지(새로운 배열), 도착지의 시작점, 소스에서 받아올 만큼의 배열 길이);
		
		// 3) 나머지 배열 방에 새로 넣을 값 대입
		newFriendArr2[3] = "정구현";
		newFriendArr2[4] = "백승범";
		
		// 4) 출력하기
		System.out.println("\nB. 새로운 배열 newFriendArr2; arraycopy();을 이용한 배열 복사");
		for(int i=0; i<newFriendArr2.length; i++) {
			String str = (i<newFriendArr2.length-1)? ",":"\n";
			System.out.print(newFriendArr2[i]+str);
		}
		// ------------------------------------------------------------
		
	} // end of main()

} // end of class
