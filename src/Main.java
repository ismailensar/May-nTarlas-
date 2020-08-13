import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int row,column;
		System.out.println("Mayýn Tarlasýna Hoþgeldiniz !");
		System.out.println("Lütfen Oynamak Ýstediðiniz Boyutlarý Giriniz : ");
		System.out.print("Satýr Sayýsý : ");
		row = scan.nextInt();
		System.out.print("Sütun Sayýsý : ");
		column = scan.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row,column);
		mayin.run();

	}

}
