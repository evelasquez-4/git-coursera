class Test{
	public static void main(String[] args){
		System.out.println("Message from main repository");
		messageSideA("Hola");
		messageSideB("Mundo");
	}
	public static void messageSideB(String message){
		System.out.println(message+"modified by B side");
	}
	public static void messageSideA(String message){
		System.out.println(message+" modified.");
	}
}
