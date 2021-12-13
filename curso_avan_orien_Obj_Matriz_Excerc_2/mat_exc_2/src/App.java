import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class App {
    public static void main(String[] args) throws ParseException {
        //Locale.setDefault(Locale.US);
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date y1 = sf.parse("25/08/2021");
        Date y2  = sf1.parse("25/08/2021 18:00:03");
        System.out.println(y2);
        System.out.println(y1);

    }
}
