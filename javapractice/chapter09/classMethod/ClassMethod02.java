package classMethod;

import classMethod.human.Human02;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		Human02 tanaka = new Human02("田中", 26);
		System.out.println("名前は" + tanaka.name + "で、年齢は" + tanaka.age + "です。");
	}
}
