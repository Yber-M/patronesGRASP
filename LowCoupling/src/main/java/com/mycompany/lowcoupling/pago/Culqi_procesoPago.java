package com.mycompany.lowcoupling.pago;


public class Culqi_procesoPago implements ProcesoPago{

    @Override
    public void procesoPago(double monto) {
        System.out.println("Procesando pago con Culqi: $" + monto);
    }
    
}
