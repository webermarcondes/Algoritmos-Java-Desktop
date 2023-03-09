import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

//Faça um Programa que exiba todas as segundas feiras de um mês
public class segundasFeirasDoMes {

	public static void main(String args[]) {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		
		System.out.print("Digite o mês desejado: ");
		int mes = scan.nextInt();
		
		System.out.print("Digite o ano desejado: ");
		int ano = scan.nextInt();
		
		LocalDate data = LocalDate.of(ano, mes, 1);
		while(data.getMonthValue() == mes) {
			if (data.getDayOfWeek() == DayOfWeek.MONDAY) {
				cont += 1;
				System.out.print(cont +"° Segunda-feira: " + data.format(formatoData) + "\n");
			}
			
			data = data.with(TemporalAdjusters.next(DayOfWeek.MONDAY));			
		}
	}
}
