package Solid.LSP;

public class RegisteredUserPayment implements NewPayment,PreviousPayment {

    String name;
    public RegisteredUserPayment(String userName){
        this.name = userName;
    }

    @Override
    public void previousPaymentInfo() {
        System.out.println("Recuperando los detalles de los ultimos pagos de "+name+".");
    }

    @Override
    public void newPayment() {
        System.out.println("Procesando la actual solicitud de pago de "+name+".");
    }
}
