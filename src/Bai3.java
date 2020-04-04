import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Tinh chu vi va dien tich hinh chu nhat");
		
		//Khai báo các biến
		int length = 1; //chiều dài
		int width = 1;	//chiều rộng
		int i = 0; 		//lặp chương trình
		
		while (i<i+1)
	{
		//Nhập chiều dài
		do
		{
			if (length <= 0)
			{
				System.out.println("Vui long nhap gia tri lon hon 0"); //xuất ra màn hình câu yêu cầu khi người dùng nhập sai
			}
			System.out.print("Nhap chieu dai hinh chu nhat: ");
			length = scan.nextInt();
			System.out.println();
		}
		while (length <= 0);//vòng lặp yêu cầu người dùng nhập số lớn hơn 0
		
		
		
		//Nhập chiều rộng
		do 
		{
			if (width <= 0)
			{
				System.out.println("Vui long nhap gia tri lon hon 0");
			}
			if (width > length)
			{
				System.err.println("Vui long nhap chieu rong be hon chieu dai");
			}
			System.out.print("Nhap chieu rong hinh chu nhat: ");
			width = scan.nextInt();
			System.out.println();
		}
		while (width <=0 || length < width);//nếu người dùng nhập chiều rộng lớn hơn chiều dài sẽ yêu cầu nhập lại
		

		int perimeter = 2 * (length + width);
		int area = length * width;

		System.out.println("Chu vi hinh chu nhat la: " + perimeter);
		System.out.println("Dien tich hinh chu nhat la: " + area);
		System.out.println();
		
	}
		
	}

}
