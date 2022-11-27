package ddz7;

import java.util.Scanner;

public class Tem4Zavd6_10 {
	public static void main(String[] args) {
		int men= 0;
		Autho[] result = new Autho[] {new Hatchbeck("Lexus CT200h", 12500.49,56,98), 
				new Sedan("Suzuki Ciaz", 25145.45,40,87),
				new Krossover("Kia Soul", 27854.63,65,134),
				new Sedan("Chevrolet Onix ll", 40126.65,38,97),
				new Hatchbeck("Audi A5", 20500.49,25,85), 
				new Krossover("Nissan Juke", 36754.36,57,121)};
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		do {
			System.out.println("Меню");
			System.out.println("1-порахувати вартість автопарку");
			System.out.println("2-відсортувати по розходу палива");
			System.out.println("3-знайти автомобілі швидкість яких лежить в діапазоні");
			System.out.println("4-вихід");
			men = in.nextInt();
			if (men == 1) {
				double summm = 0;
				for (int i = 0; i < result.length; i++) {
					summm = summm + result[i].GetVartist();
				}
				System.out.println(summm);
			}
			else if (men == 2) {
				boolean isSorted = false;
				Autho zminna;
				while(!isSorted) {
					isSorted = true;
					for (int i = 0; i < result.length-1; i++) {
						if(result[i].getRozhod()>result[i+1].getRozhod()) {
							isSorted = false;
							zminna = result[i];
							result[i] = result[i+1];
							result[i+1] = zminna;
						}
					}
				}
				for (int i = 0; i < result.length; i++) {
					System.out.println(result[i]);
				}
			}
			else if (men == 3) {
				int m = in.nextInt();
				int n = in.nextInt();
				for (int i = 0; i < result.length; i++) {
					if(result[i].getShvidkist()>=m & result[i].getShvidkist()<=n) {
						System.out.println(result[i]);
					}
				}
			}
		}while(men != 4);
		
	}
}
