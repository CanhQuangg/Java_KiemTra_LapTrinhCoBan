import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		//biến i dùng để lặp lại chương trình khi đã kết thúc
		
		while (i<i+1)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap vao hai so nguyen:");
		
		System.out.print("So thu nhat: ");
		int firstNumber = scan.nextInt();
		//nhập vào từ bàn phím số thứ nhất
		
		System.out.print("So thu hai: ");
		int secondNumber = scan.nextInt();
		//nhập vào từ bàn phím số thứ hai
		
		//tính tổng hai số
		int addition = firstNumber + secondNumber;
		System.out.println("Tong cua hai so la: "+addition);
		
		//tính hiệu hai số
		int subtraction = firstNumber - secondNumber;
		System.out.println("Hieu hai so la: "+ subtraction);
		
		//tính tích hai số
		int multiplication = firstNumber * secondNumber;
		System.out.println("Tich hai so la: "+ multiplication);
		
		//tính thương hai số
		int division = firstNumber / secondNumber;
		System.out.println("Thuong hai so la: "+ division);
		
		//phần dư của phép chia hai số
		int remainder = firstNumber % secondNumber;
		if (remainder >0)
		{
			System.out.println("So du khi thuc hien phep chia la: "+ remainder);
		}
		else 
		{
			System.out.println("Khong co so du khi thuc hien phep chia");
		}
		System.out.println("Ket thuc chuong trinh.");
		System.out.println();
	}
		
	}

}
