package Solid.LSP;

public class GuestUserPayment implements NewPayment{

    @Override
    public void newPayment() {
        System.out.println("Procesando la actual solicitud de pago como invitado.");
    }
}
