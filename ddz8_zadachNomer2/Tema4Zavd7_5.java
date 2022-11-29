package ddz7_zadachNomer2;

public class Tema4Zavd7_5 {
	public static void main(String[] args) {
		Model noviy = new Model();
		noviy.connectToSiemensOnline();
		noviy.startCall("095642545");
		noviy.breakCall();
		System.out.println(noviy.searchForCall());
		noviy.acceptCall("095642545");
		System.out.println(noviy.searchForCall());

    }
	
}
