
public class Chapter07 {
	public static void main(String[] args) {
		int load = 11;
		if (load <= 5) {
			System.out.println("とても近いです");
		} else if (load <= 10) {
			System.out.println("近いです");
		} else if (load <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String signal = "green";
		switch(signal) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
		case "green":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号機の色ではありません");
		}
	}
}
