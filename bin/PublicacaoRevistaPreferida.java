import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

//Um aluno de ADS gosta de uma determinada revista. Essa revista 
//é publicada mensalmente sempre na segunda quarta-feira do mês. 
//Faça um programa que ajude esse aluno de ADS a se preparar, 
//mostrando todos os dias nos quais esse aluno precisará estar 
//com o dinheiro acumulado e comparecer 
//em frente a banca de revista ao longo do ano.
public class PublicacaoRevistaPreferida {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfMes = new SimpleDateFormat("MMMMM", new Locale("pt", "br"));
		
		System.out.print("Informe o ano desejado: ");
		int ano = scan.nextInt();
		
		Calendar calendario = new GregorianCalendar();
		calendario.set(calendario.YEAR, ano);
		calendario.set(calendario.MONTH, 0);
		calendario.set(calendario.DAY_OF_MONTH, 1);
		
		int contDatasPub = 0;
		while (contDatasPub < 12) {
			
			if (calendario.get(calendario.DAY_OF_WEEK_IN_MONTH) == 2 && calendario.get(calendario.DAY_OF_WEEK) == 4) {
				Date dia = calendario.getTime();
	
				System.out.println("Data de pubicação da revista no mês " + sdfMes.format(dia).toUpperCase() + ": " + sdfData.format(dia));
				contDatasPub += 1;
				
				calendario.add(calendario.MONTH, 1);
				calendario.set(calendario.DATE, 1);
				continue;
			}
			calendario.add(calendario.DATE, 1);
		}
		
	}

}
