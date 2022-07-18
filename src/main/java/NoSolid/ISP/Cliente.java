package NoSolid.ISP;

// import java.util.ArrayList;
// import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion sin ISP");
        Impresora impresora = new ImpresoraAvanzada();
        impresora.printDocument();
        impresora.sendFax();
        impresora = new ImpresoraBasica();
        impresora.printDocument();
        impresora .sendFax();

        System.out.println("------------");

        List<Impresora> impresoras = new ArrayList<>();
        impresoras.add(new ImpresoraAvanzada());
        impresoras.add(new ImpresoraBasica());
        impresoras.forEach((i) -> {
            Consumer<Impresora> dispositivo = Impresora::printDocument;
            dispositivo.accept(i);
        });
        //impresora.sendFax();// Lanza un error
    }

}
