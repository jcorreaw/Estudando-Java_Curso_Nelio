package EnumeraçõesEComposição;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1192, new Date(), StatusDoPedido.PAGAMENTOPENDENTE);
        System.out.println(pedido);

        StatusDoPedido os1 = StatusDoPedido.ENVIADO;
        System.out.println(os1);

        StatusDoPedido os2 = StatusDoPedido.valueOf("ENVIADO");
        System.out.println(os2);

    }
}
