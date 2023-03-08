package dataFormatada;

/*data formatada no padrão Dia/Mes/Ano Hora:Minuto:Segundo*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class dataFormatadaClasse {
	
	public static void main(String args[]) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date();
		
		System.out.println("Data formatada em dias/meses/anos Horas:Minutos:Segundos :" + sdf.format(data));
	}

}
