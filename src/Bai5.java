import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while (i<i+1)
		{
		System.out.println("Chuyen doi do C sang do F");
		System.out.println();
		System.out.print("Nhap do C muon chuyen doi: ");
		
		int C = scan.nextInt() //nhập độ C
				;
		float F = (1.8f*C + 32); //chuyển đổi sang độ F
		
		System.out.print (C + " do C = ");
		
		System.out.println(F+ " do F");
		System.out.println();
		}
		
	}

}
