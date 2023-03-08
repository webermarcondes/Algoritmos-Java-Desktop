import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDataToDateClasse {

	public static void main(String args[]) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataStr = "07/03/2023 21:47:15";		
		Date data = null;
		try {
			data = sdf.parse(dataStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(data);
	}
}
