package com.mycompany.lowcoupling.pago;


public class Paypal_procesoPago  implements ProcesoPago{

    @Override
    public void procesoPago(double monto) {
        System.out.println("Procesando pago con PayPal: S/ " + monto);
    }
    
}
