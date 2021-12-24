package entities;

public class ScannerContract extends Eletronico implements Scanner {

    public ScannerContract(String serialMumber) {
        super(serialMumber);
       
    }

    @Override
    public void scanear(String doc) {
        System.out.println("Scaneando . . . " + doc);
        
    }
    
}
