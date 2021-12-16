import java.util.Date;
import entities.Pedido;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
       Pedido pedido = new Pedido(1080,new Date(), OrderStatus.PAGAMENTO_PENDENTE);
       OrderStatus os1 = OrderStatus.ENTREGUE;
       OrderStatus os2 = OrderStatus.valueOf("PROCESSANDO");
       System.out.println(pedido);
       System.out.println(os1);
       System.out.println(os2);
    }
}
