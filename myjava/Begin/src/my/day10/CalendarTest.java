package my.day10;

import java.util.Calendar;

import my.util.MyUtil;

public class CalendarTest {

	public static void main(String[] args) {
		
		/* Date 클래스 보다 조금더 향상시켜서 나온 것이 Calendar 클래스이다.
		     간단한 날짜표현에는 Date 클래스를 사용하는 것이 더 나을 수 있으며,
		     두개 날짜사이의 날짜연산을 할 경우에는 메소드기능이 더 많이 추가된 
		   Calendar 클래스를 사용하는 것이 나을 수 있다.
		 */
		Calendar currentdate = Calendar.getInstance(); // 현재날짜와 시간을 얻어온다.
		
		int year = currentdate.get(Calendar.YEAR);
		
		int month = currentdate.get(Calendar.MONTH);
		String strMonth = month<10?"0"+month:String.valueOf(month);
		/* 주의해야할 것은 get(Calendar.MONTH)로 얻어오는 값의 범위가 1~12가 아닌, 0~11 이라는 것이다. 
		      그래서 get(Calendar.MONTH)로 얻어오는 값이 0이면 1월을 의미하고 11이면 12월을 의미한다.
		      그러므로 현재월을 표현하려면 ( currentdate.get(Calendar.MONTH) + 1 ) 으로 해야한다. 
		      괄호없이 today.get(Calendar.MONTH) + 1로 하면 이상한 값이 나온다. (괄호유무조심!!) 
		*/
		
		int month2 = currentdate.get(Calendar.MONTH)+1;
		String strMonth2 = month2<10?"0"+month2:String.valueOf(month);
		
		System.out.println("올 해의 년도 : " + year);
        System.out.println("월(0~11, 0:1월): " + strMonth);
        System.out.println("월(1~12, 1:1월): " + strMonth2);
        
        System.out.println("이 해의 몇 째 주: " + currentdate.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 째 주: " + currentdate.get(Calendar.WEEK_OF_MONTH));
        
        // 아래의 Calendar.DATE 와 Calendar.DAY_OF_MONTH 는 같은 것이다.
        int day = currentdate.get(Calendar.DATE);
		String strDay = day<10?"0"+day:String.valueOf(day);
        
		System.out.println("이 달의 몇 일: " + currentdate.get(Calendar.DATE));
        System.out.println("이 달의 몇 일: " + currentdate.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 달의 몇 일: " + strDay);
        System.out.println("이 해의 몇 일: " + currentdate.get(Calendar.DAY_OF_YEAR));
        
        // 1:일요일, 2:월요일, 3:화요일, 4:수요일, 5:목요일, 6:금요일, 7:토요일
        System.out.println("요일(1~7, 1:일요일): " + currentdate.get(Calendar.DAY_OF_WEEK)); 
        System.out.println("이 달의 몇 째 요일: " + currentdate.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        
        String dayname = "";
        switch (currentdate.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				dayname = "일";
				break;
	
			case 2:
				dayname = "월";
				break;
				
			case 3:
				dayname = "화";
				break;	
				
			case 4:
				dayname = "수";
				break;	
				
			case 5:
				dayname = "목";
				break;	
				
			case 6:
				dayname = "금";
				break;
				
			case 7:
				dayname = "토";
				break;	
		}
        
        System.out.println("오늘은 " + dayname + "요일 입니다.");
        // 오늘은 월요일 입니다.
        
        System.out.println("오전_오후(0:오전, 1:오후): " + currentdate.get(Calendar.AM_PM));
        System.out.println("시간(0~11): " + currentdate.get(Calendar.HOUR));
        System.out.println("시간(0~23): " + currentdate.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59): " + currentdate.get(Calendar.MINUTE));
        System.out.println("초(0~59): " + currentdate.get(Calendar.SECOND));
        System.out.println("1000분의 1초(0~999): " + currentdate.get(Calendar.MILLISECOND));
        
        // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60초)
        System.out.println("TimeZone(-12~+12): " + (currentdate.get(Calendar.ZONE_OFFSET)/(60*60*1000))); 
        
        // 이 달의 마지막 일을 찾는다.
        System.out.println("이 달의 마지막 날: " + currentdate.getActualMaximum(Calendar.DATE) ); 

		System.out.println("");
		
        String today = year+"-"+strMonth2+"-"+strDay;
        today += " " + currentdate.get(Calendar.HOUR_OF_DAY) +":"+ ( currentdate.get(Calendar.MINUTE)<10?"0"+currentdate.get(Calendar.MINUTE):currentdate.get(Calendar.MINUTE) ) +":"+ ( currentdate.get(Calendar.SECOND)<10?"0"+currentdate.get(Calendar.SECOND):currentdate.get(Calendar.SECOND) );         
        
        switch (currentdate.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				today += " 일요일";
				break;
			case 2:
				today += " 월요일";
				break;	
			case 3:
				today += " 화요일";
				break;
			case 4:
				today += " 수요일";
				break;
			case 5:
				today += " 목요일";
				break;
			case 6:
				today += " 금요일";
				break;	
			case 7:
				today += " 토요일";
				break;
		}
        
        System.out.println("현재는 " + today + " 입니다.");
        
        System.out.println("\n===================\n");
        
        System.out.println("현재는 " + MyUtil.currentTime2() + " 입니다."); 

	}

}
