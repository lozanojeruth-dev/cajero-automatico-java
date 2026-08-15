package com.cajero.model;

public class Tarjeta {
    private String numeroTarjeta;
    private String pin;
    private double saldo;
    private boolean bloqueada;
    private int intentosFallidos;

    public Tarjeta(String numeroTarjeta, String pin, double saldo) {
        this.numeroTarjeta = numeroTarjeta;
        this.pin = pin;
        this.saldo = saldo;
        this.bloqueada = false;
        this.intentosFallidos = 0;
    }
    public String getNumeroTarjeta() { return numeroTarjeta; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public boolean isBloqueada() { return bloqueada; }
    
    public boolean validarPin(String pinIngresado) {
        if (bloqueada) return false;
        if (this.pin.equals(pinIngresado)) {
            intentosFallidos = 0;
            return true;
        } else {
            intentosFallidos++;
            if (intentosFallidos >= 3) bloqueada = true;
            return false;
        }
    }
    public int getIntentosRestantes() { return 3 - intentosFallidos; }
}