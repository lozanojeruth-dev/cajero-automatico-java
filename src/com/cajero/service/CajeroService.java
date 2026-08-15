package com.cajero.service;
import com.cajero.model.Tarjeta;
import com.cajero.model.Transaccion;
import java.util.ArrayList;
import java.util.List;

public class CajeroService {
    private List<Transaccion> historial = new ArrayList<Transaccion>();

    public void consultarSaldo(Tarjeta t) {
        System.out.printf("Saldo actual: S/ %.2f%n", t.getSaldo());
    }
    
    public void retirar(Tarjeta t, double monto) {
        if (monto <= 0) {
            throw new RuntimeException("Monto invalido");
        }
        if (((int)monto) % 10 != 0) {
            throw new RuntimeException("Solo billetes de S/10,20,50,100,200");
        }
        if (monto > t.getSaldo()) {
            throw new RuntimeException("Saldo insuficiente");
        }
        if (monto > 1000) {
            throw new RuntimeException("Limite por retiro S/ 1000");
        }
        
        t.setSaldo(t.getSaldo() - monto);
        historial.add(new Transaccion("RETIRO", monto, t.getSaldo()));
        System.out.printf("Retiro exitoso S/ %.2f. Nuevo saldo S/ %.2f%n", monto, t.getSaldo());
    }
    
    public void depositar(Tarjeta t, double monto) {
        if (monto <= 0) {
            throw new RuntimeException("Monto invalido");
        }
        t.setSaldo(t.getSaldo() + monto);
        historial.add(new Transaccion("DEPOSITO", monto, t.getSaldo()));
        System.out.printf("Deposito S/ %.2f. Nuevo saldo S/ %.2f%n", monto, t.getSaldo());
    }
    
    public void verHistorial() {
        if (historial.isEmpty()) { 
            System.out.println("Sin transacciones"); 
            return; 
        }
        System.out.println("--- Ultimas transacciones ---");
        int inicio = 0;
        if (historial.size() > 5) {
            inicio = historial.size() - 5;
        }
        for (int i = inicio; i < historial.size(); i++) {
            System.out.println(historial.get(i));
        }
    }
}