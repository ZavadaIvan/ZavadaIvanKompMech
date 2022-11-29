package ddz10;


public class Tem5_zavd2_13 {
	public static void main(String[] args) {
        String message = "aabcbb";
        System.out.println(message.replaceAll("([A-Za-z])\\1+", "$1"));
    }
}

