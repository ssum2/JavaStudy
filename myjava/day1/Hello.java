// 1�� �ּ���

/*
   ������ 
   �ּ���
*/

/**
   ����ȭ �ּ�
   ==> javadoc �� �̿��ؼ� API ������ ���鶧 ����Ѵ�.
*/

// ==== *** CLASS(Ŭ����)�� ���� *** ====
/*
   CLASS(Ŭ����)�� ��� ���ø����̼�(���θ�)���۽� 
   �ʿ��� ��ǰ�� ���赵���̶�� ��������.

   1. ��Ű�� ����
      ==> ��Ű���� Ŭ������ ����Ǿ��� ���丮 ��ζ�� ���� �ȴ�.

	  package ��Ű����; ==> �̶� ��Ű������ �ݵ�� �ҹ��ڷ� �����ؾ� �Ѵ�.
      
	  ��> package my.com;


   2. import ��

      ��> import ��Ű����.Ŭ������;

	     import java.lang.String;
		 import java.lang.System;
		 import java.lang.*;

   3. Ŭ���� ����

   4. �������ϱ�

   5. �����ϱ�


*/

//import java.lang.System;
//import java.lang.*;

import java.util.Date;

public class Hello  // class ���� ù���ڴ� �빮�ڷ� �ؾ� �Ѵ�.
                    // ���� ����� ���ϸ� class��� �����ϰ� �ؾ� �ϸ�, 
					// Ȯ���ڴ� .java �̴�.
{ // class body(��ü)�� { �� �����ؼ� } �� ������.
	
  // main() �޼ҵ� : �ܼ�(�����) ���α׷��� ���������� �����̴�.
  //               java��� ��ɾ �����Ű�� ���� ���� �ش� Ŭ������ main()�޼ҵ带 ã�Ƽ� ��������ش�.

 public static void main(String[] args) {
	
	System.out.print("Hello Java~~~");
    System.out.print("�ȳ��ϼ���? �ݰ����ϴ�.");
	System.out.println("Hi Java!!");
    System.out.println("�ڹٸ� ������ ������ô�.");
    // System.out.�� �ܼ�ȭ��(�����)�� ���ϴ� ���̴�.

    System.out.print("������ �������Դϴ�.");
    System.out.print("\n��ſ� �Ϸ�Ǽ���.");

	System.out.println("\n\n==== Ư������ ====\n");
    /*
       Escape ���� ==> �����
       -- �μ��� �� ���ų� Ű����� ǥ���� �� ���� Ư���� ���ڸ� ����Ű��,
          ��������(\)�� �Ѱ��� ���ڸ� �����Ͽ� �ۼ��Ѵ�.

       \n  ==> ����.     ��ũ��(ȭ��) Ŀ���� ��ġ�� �������� ó������ �ű��.
	   \t  ==> ������.    ��ũ��(ȭ��) Ŀ���� ���� ������ �ű��.
	   \r  ==> ĳ���� ����. ��ũ��(ȭ��) Ŀ���� ��ġ�� ���� ���� ó������ �ű��.
	                    ���������� �ʴ´�. �� ��ȣ ������ ���� ���ڸ� ���� �����.  
       \\  ==> ���������� ����Ҷ� ����Ѵ�.
	   \"  ==> ū ����ǥ�� ����Ҷ� ����Ѵ�.
	   \'  ==> ���� ����ǥ�� ����Ҷ� ����Ѵ�.
	*/
	System.out.println("����\t����\t����");
    System.out.println("99\t88\t77");

    System.out.println("");

	System.out.println("�̹��� ĳ���� ������ �Ẽ���?\r��");
	System.out.println("�̹��� ĳ���� ������ �Ẽ���?\rA");

	System.out.println("");
	System.out.println("\"C:\\myjava\\day1\\hello.java\"");
	System.out.println("\'C:\\myjava\\day1\\hello.java\'");

    System.out.println("\n=== ���� ===\n");
	/*
       ��ҿ� ���� '���޷�'
	   �����Ⱑ "���ܿ� ���Ƕ�"���� 
		c:\���޷�.hwp
	*/
    System.out.print("��ҿ� ���� \'���޷�\'\n�����Ⱑ \"���ܿ� ���Ƕ�\"����\n\tc:\\���޷�.hwp");

    System.out.println("\n\n== ������ ��¥ ==");
    System.out.println(new Date());
	// new Date()�� �ý���(��ǻ��)�� ���� ��¥�ð��� �˷��ִ� ���̴�.

  }

}

/*
   �� �ڹ� �����Ϸ� : javac.exe �ڹټҽ��ڵ带 ����Ʈ�ڵ�� �������Ѵ�.
                 �����ϸ� .class ������ �����ȴ�.
	 ��> javac Hello.java

   �� �ڹ� ���������� : java.exe �����Ϸ��� ������ ����Ʈ�ڵ带 �ؼ��ϰ� �����Ѵ�.
     ��> java Hello
	 
   �� ����Ʈ�ڵ� : JVM(Java Virtual Machine)��
               ������ �� �ִ� ����.
			  JVM�� ����Ʈ�ڵ带 �ٽ� �ش� �ü��(O.S)�� 
			  ����� ��ȯ�Ͽ� �ü��(O.S)�� �����Ѵ�. 

   
*/
