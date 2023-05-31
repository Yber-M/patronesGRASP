package com.mycompany.lowcoupling;

import com.mycompany.lowcoupling.pago.PagoService;
import com.mycompany.lowcoupling.pago.Paypal_procesoPago;
import com.mycompany.lowcoupling.pago.ProcesoPago;


public class LowCoupling {

    public static void main(String[] args) {
        
        ProcesoPago proceso_pago = new Paypal_procesoPago();
        
        PagoService pago_servicio = new PagoService(proceso_pago);
        
        pago_servicio.procesoPago(100.0);
        
    }
}
