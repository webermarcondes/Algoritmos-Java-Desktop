package dataproject.diferencaDatas;

//Exercicio 6
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import javax.swing.JOptionPane;

public class calculoDiferencaDatas {
	
	public static void main (String args[]) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	String dataNascimento1Str = JOptionPane.showInputDialog(null, "Digite a primeira data no formato dia/mês/ano: ");
	String dataNascimento2Str = JOptionPane.showInputDialog(null, "Digite a segunda data no formato dia/mês/ano: ");
	
	Date dataNascimento1 = null;
	Date dataNascimento2 = null;
	try {
		dataNascimento1 = sdf.parse(dataNascimento1Str);
		dataNascimento2 = sdf.parse(dataNascimento2Str);
	}
	catch(ParseException ex) {
		JOptionPane.showMessageDialog(null, "Erro! as Datas devem ser especificadas no formato dia/mês/ano", "Erro de formato de data", JOptionPane.ERROR_MESSAGE);
	}
	
	LocalDateTime dataNascimento1LocalDateTime = dataNascimento1.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	LocalDateTime dataNascimento2LocalDateTime = dataNascimento2.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	
	System.out.println("Diferença da data1 pra 2 em anos: " + dataNascimento1LocalDateTime.until(dataNascimento2LocalDateTime, ChronoUnit.YEARS));
	
	System.out.println("Diferença da data1 pra 2 em meses: " + dataNascimento1LocalDateTime.until(dataNascimento2LocalDateTime, ChronoUnit.MONTHS));
	
	System.out.println("Diferença da data1 pra 2 em dias: " + dataNascimento1LocalDateTime.until(dataNascimento2LocalDateTime, ChronoUnit.DAYS));
	
	System.out.println("Diferença da data1 pra 2 em minutos: " + dataNascimento1LocalDateTime.until(dataNascimento2LocalDateTime, ChronoUnit.MINUTES));
	
	}
}
