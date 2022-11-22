package ddz4;

class Grok{

	public  void finalize()
	 {
	  System.out.println("Hello world");
	 }
	public static void main(String[] args){
		Grok hi = new Grok();
        hi.finalize();
   }

	}
