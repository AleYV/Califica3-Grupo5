package Solid.LSP;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {

    List<PreviousPayment> previousPayments = new ArrayList<>();
    static List<NewPayment> newPayments = new ArrayList<>();

    public void addPreviousPayment(PreviousPayment user) {
        previousPayments.add(user);
    }

    public void addNewPayment(NewPayment user) {
        newPayments.add(user);
    }

    public void showPreviousPayments() {
        for(PreviousPayment payments : previousPayments){
            payments.previousPaymentInfo();
            System.out.println("------");
        }
    }

    public static void processNewPayments() {
        for(NewPayment payment : newPayments){
            payment.newPayment();
            System.out.println("------");
        }
    }
}
