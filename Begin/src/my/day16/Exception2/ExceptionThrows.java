package my.day16.Exception2;

public class ExceptionThrows {
	private String name;
	private String point;
	private String hakjum;
	
	
	public ExceptionThrows() {}
	
	public ExceptionThrows(String name, String point, String hakjum) {
		super();
		this.name = name;
		this.point = point;
		this.hakjum = hakjum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPoint() {
		return point;
	}
	
	public void setPoint(String point) 
			throws NumberFormatException {	
//			throws >> 예외처리 책임을 메소드를 쓰는 쪽으로 넘겨버림 (그쪽에서 예외처리를 해야함)
		
		this.point = point;
		
		int jumsu = Integer.parseInt(point);
		
		switch (jumsu/10) {
		case 10:
		case 9:
			hakjum = "A";
			break;
		case 8:
			hakjum = "B";
			break;
		case 7:
			hakjum = "C";
			break;
		case 6:
			hakjum = "D";
			break;
		default:
			hakjum = "F";
			break;
		}
		
	}
	
	public String getHakjum() {
		return hakjum;
	}
	
	
}
