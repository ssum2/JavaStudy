// import java.lang.*;
// import Member1;

public class Member1MainTest 
{
	public static void main(String[] args) 
	{
		Member1 me = new Member1();	
		me.userid = "seoyh";
		me.pwd = "qwer1234$";
		me.name = "서영학";
		me.age = 25;
		me.address = "경기도 군포시";

		me.showInfo();

		System.out.println("");

        Member1 you = new Member1("irin","abcd0070!","아이린",22,"서울시 강남구");
        you.showInfo();


	}
}
