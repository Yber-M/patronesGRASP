
package com.mycompany.lowcoupling.pago;


public class PagoEfectivo_procesoPago implements ProcesoPago{

    @Override
    public void procesoPago(double monto) {
        System.out.println("Procesando pago con Stripe: S/ " + monto);
    }
    
}
