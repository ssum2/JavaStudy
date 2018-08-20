package my.day10;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		Calendar currentdate = Calendar.getInstance();
		

        int year = currentdate.get(Calendar.YEAR);
        
        String strMon = currentdate.get(Calendar.MONTH)<10? "0"+currentdate.get(Calendar.MONTH):String.valueOf(currentdate.get(Calendar.MONTH));
        
        String strDate = currentdate.get(Calendar.DATE)<10? "0"+currentdate.get(Calendar.DATE):String.valueOf(currentdate.get(Calendar.DATE));
        
        
        
		
		 // 요일 출력하기; 내가 그냥 배열로 해본 것
        System.out.println("--------- 배열로 요일 출력해보기 ----------");
        String dayArr[] = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String dayname ="";
 		int dayname2 = currentdate.get(Calendar.DAY_OF_WEEK);
         for(int i=0; i<dayArr.length; i++) {
         	if(i+1==dayname2) {
         		dayname = dayArr[i];
         		break;
         	}
         	else continue;
         	
         } // end of for
         
         System.out.println("오늘은 "+dayname+"입니다.");

         
         // 시간
         String ampm = (currentdate.get(Calendar.AM_PM)==0)? "AM":"PM"; // AM 0 PM 1
         String strHour = currentdate.get(Calendar.HOUR)+1<10? "0"+currentdate.get(Calendar.HOUR):String.valueOf(currentdate.get(Calendar.HOUR)); // 0~11 까지 -> +1
         String strMin = currentdate.get(Calendar.MINUTE)<10? "0"+currentdate.get(Calendar.MINUTE):String.valueOf(currentdate.get(Calendar.MINUTE));
         String strSec = currentdate.get(Calendar.SECOND)<10? "0"+currentdate.get(Calendar.SECOND):String.valueOf(currentdate.get(Calendar.SECOND));
         
         String today_currentTime = year+"년 "+strMon+"월 "+strDate+"일 "+dayname+" "+strHour+":"+strMin+":"+strSec+ampm;
         
         System.out.println(today_currentTime);
      
         
	} // end of main()

} // end of class
