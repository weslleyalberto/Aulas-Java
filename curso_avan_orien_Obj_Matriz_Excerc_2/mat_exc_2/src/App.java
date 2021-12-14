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
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);
        System.out.println(y2);
        System.out.println("Y2: " + sf.format(y2));
        System.out.println("Y1: " + sf1.format(y1));
        System.out.println("X1: "  + sf1.format(x1));
        System.out.println("X2: " + sf1.format(x2));
        System.out.println("X3: " + sf1.format(x3));
        System.out.println("X4: " + sf1.format(x4));

    }
}
