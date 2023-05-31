
package com.mycompany.lowcoupling.pago;

public class PagoService {
    private ProcesoPago pp;

    public PagoService(ProcesoPago pp) {
        this.pp = pp;
    }
    
    public void procesoPago(double monto) {
        pp.procesoPago(monto);
    }
}
