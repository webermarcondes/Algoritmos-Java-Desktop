import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ExemploCalendar {

	public static void main(String[] args) {
		
		
		ExemploCalendar exemploCalendar = new ExemploCalendar();
		
		//ExemploCalendar.exibirDataAtualUm();
		
		//ExemploCalendar.exibirDataAtualDois();
		
		//ExemploCalendar.exibirDataAtualTres();
	
	
		ExemploCalendar.calculoData();
	}
	
	
	private static void calculoData() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar calendar = GregorianCalendar.getInstance();
	
		calendar.add(Calendar.DAY_OF_MONTH, -25);		
		Date data = calendar.getTime();
		//System.out.print(sdf.format(data));
		
	
		}
		
	

	public static void exibirDataAtualDois() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS");  //Definição de formato para datas com string
	
		//Date data = new Date();
		//System.out.print(sdf.format(data));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date data2 = sdf2.parse("31/01/100");
			System.out.print(sdf.format(data2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void exibirDataAtualTres() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar calendar = GregorianCalendar.getInstance();
	
		//System.out.print(calendar);
		
		Date dataAtual = calendar.getTime();
		//System.out.print(dataAtual);
		
		calendar.set(Calendar.YEAR, 2022);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.HOUR_OF_DAY, 11);
		calendar.set(Calendar.MINUTE, 34);
		calendar.set(Calendar.SECOND, 44);
		dataAtual = calendar.getTime();
		System.out.print(sdf.format(dataAtual));
		
		
	}
	
	public static void exibirDataAtualUm() {
		
		Date data = new Date();
		
		//Exibe a data em millisegundos
		//System.out.print(data.getTime());
		
		//Formatação de Data
		DateFormat formatoData = DateFormat.getInstance();  //getInstance é a mesma coisa do new DateFormat
		
		//System.out.print("Data atual com formatação: " + formatoData.format(data)); //o padrão de formato utilizado é a mesmo padrão de data utilizado pelo SO
		
		//Formatação de Hora
		DateFormat hora = DateFormat.getTimeInstance();
		//System.out.print("Hora formatada: " + hora.format(data));
		
		//Formatação de Data e Hora
		DateFormat dtHora = DateFormat.getDateTimeInstance();
		System.out.print(dtHora.format(data));
		
		
		System.out.print("\n----------------------------------\n");
		
		
		//Formato de Data Completo(Full)
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.print("\nData Full: " + f.format(data));
		
		//Formato de Data Longo(Long)
		DateFormat fLong = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.print("\nData Long: " + fLong.format(data));
		
		//Formato de Data Médio(medium)
		DateFormat fMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.print("\nData Medium: " + fMedium.format(data));
		
		//Formato de Data Resumido(short)
		DateFormat fShort = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.print("\nData Short: " + fShort.format(data));
		
		
	}

}
