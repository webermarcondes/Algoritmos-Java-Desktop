import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class QtdDiasMesDoAno {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano desejado: ");
		Integer ano = scan.nextInt();
		
		Locale brasil = new Locale("pt", "BR");
		for(Month mes: Month.values()) {
			YearMonth anoMes = YearMonth.of(ano, mes);
			System.out.println(mes.getDisplayName(TextStyle.FULL, brasil) + " -> " + anoMes.lengthOfMonth() + " dias");
		}
	}

}
