import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		
		int i =0; //biến dùng để lặp chương trình sau khi kết thúc
		while (i<i+1)
	{
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Tinh gia tri tuyet doi");
		System.out.print("Nhap so can tinh gia tri tuyet doi: ");

		int number = scan.nextInt();

		int absolute = Math.abs(number);

		System.out.println("Gia tri tuyet doi cua " + number + " la: " + absolute);
		System.out.println();
		
	}
	
	}

}
