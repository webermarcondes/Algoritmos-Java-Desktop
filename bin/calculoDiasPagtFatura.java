//Exercicio 5
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class calculoDiasPagtFatura {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendario = GregorianCalendar.getInstance();
			
		String dataVencimentoStr = JOptionPane.showInputDialog(null, "informe a data de vencimento da fatura no formato dia/mês/ano: ");		
		Date dataVencimento=null;
		try {
			dataVencimento = sdf.parse(dataVencimentoStr);
		}
		catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Erro! a data informada está no formato incorreto", "Erro de formato de data", JOptionPane.ERROR_MESSAGE);
		}
		
		LocalDateTime dataAtual = LocalDateTime.now();
		
		calendario.add(Calendar.DATE, (int) (dataAtual.until(dataVencimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime(), ChronoUnit.DAYS) + 10));
		if (calendario.get(calendario.DAY_OF_WEEK) == Calendar.SATURDAY) {
			calendario.add(Calendar.DAY_OF_MONTH, 2);
		}
		else if (calendario.get(calendario.DAY_OF_WEEK) == Calendar.SUNDAY) {
			calendario.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		Long diasPagt = dataAtual.until(calendario.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime(), ChronoUnit.DAYS);
		
		JOptionPane.showMessageDialog(null, "O cliente tem " + diasPagt + " dias para pagar a fatura no dia " + calendario.getTime());
				
	}

}
