package com.cajero.model;
import java.time.LocalDateTime;

public class Transaccion {
    private String tipo;
    private double monto;
    private LocalDateTime fecha;
    private double saldoRestante;

    public Transaccion(String tipo, double monto, double saldoRestante) {
        this.tipo = tipo;
        this.monto = monto;
        this.saldoRestante = saldoRestante;
        this.fecha = LocalDateTime.now();
    }
    @Override
    public String toString() {
        return String.format("[%s] %s: S/ %.2f | Saldo: S/ %.2f", 
            fecha.toString(), tipo, monto, saldoRestante);
    }
}