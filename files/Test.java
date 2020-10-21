class Test{
	public static void main(String[] args){
		System.out.println("Message from main repository");
	}
	public static String messageSideB(String message){
		System.out.println(message);
	}
	public static String messageSideA(String message){
		System.out.println(message+" modified.");
	}
}
