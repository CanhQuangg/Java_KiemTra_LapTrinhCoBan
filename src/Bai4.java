import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while (i<i+1) //lặp lại chương trình khi đã chạy xong
	{
			int dayInput = 1;
			do
			{			
				if (dayInput < 1) //xuất ra màn hình yêu cầu khi người dùng nhập sai
				{
					System.out.println("Vui long nhap so ngay lon hon 0.");
				}
				System.out.print("Nhap vao so ngay: ");
				dayInput = scan.nextInt();
				System.out.println();
				
			}
			while (dayInput<1);//lặp lại lệnh nhập khi người dùng nhập số ngày bé hơn 1
				
		int year = dayInput/365; //Tính năm
		
		int week = (dayInput % 365)/7; //Tính tuần 
		
		int dayOutput = dayInput - (year*365) - (week*7);//Tính ngày
		
		System.out.println("Ta duoc:");
		System.out.println(year + " Nam");
		System.out.println(week + " Tuan");
		System.out.println(dayOutput + " Ngay");
		System.out.println();
		
	}
	}
}
