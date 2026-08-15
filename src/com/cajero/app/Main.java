package com.cajero.app;
import com.cajero.model.Tarjeta;
import com.cajero.service.AutenticacionService;
import com.cajero.service.CajeroService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutenticacionService auth = new AutenticacionService();
        CajeroService cajero = new CajeroService();
        Tarjeta tarjetaActual = null;

        System.out.println("=== CAJERO AUTOMATICO - BANCO ===");
        System.out.print("Ingrese numero de tarjeta (usa 4557881234567890): ");
        String num = sc.nextLine();
        System.out.print("Ingrese PIN (1234): ");
        String pin = sc.nextLine();

        try {
            tarjetaActual = auth.autenticar(num, pin);
            System.out.println("Bienvenido!");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            return;
        }

        String input;
        int opc;
        do {
            System.out.println("\n1. Consultar saldo  2. Retirar  3. Depositar  4. Historial  0. Salir");
            System.out.print("Opcion: ");
            input = sc.nextLine();
            try {
                opc = Integer.parseInt(input);
            } catch (Exception e) {
                opc = -1;
            }
            
            try {
                if (opc == 1) {
                    cajero.consultarSaldo(tarjetaActual);
                } else if (opc == 2) {
                    System.out.print("Monto a retirar (ej: 100): ");
                    double m = Double.parseDouble(sc.nextLine().replace(",", "."));
                    cajero.retirar(tarjetaActual, m);
                } else if (opc == 3) {
                    System.out.print("Monto a depositar (ej: 100): ");
                    double m = Double.parseDouble(sc.nextLine().replace(",", "."));
                    cajero.depositar(tarjetaActual, m);
                } else if (opc == 4) {
                    cajero.verHistorial();
                }
            } catch (Exception e) { 
                System.out.println("ERROR: " + e.getMessage()); 
            }
        } while (opc != 0);
        System.out.println("Gracias por usar nuestro cajero!");
    }
}