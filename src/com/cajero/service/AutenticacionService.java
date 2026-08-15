package com.cajero.service;
import com.cajero.model.Tarjeta;
import java.util.HashMap;
import java.util.Map;

public class AutenticacionService {
    private Map<String, Tarjeta> tarjetas = new HashMap<String, Tarjeta>();

    public AutenticacionService() {
        tarjetas.put("4557881234567890", new Tarjeta("4557881234567890", "1234", 2500.50));
        tarjetas.put("4557880987654321", new Tarjeta("4557880987654321", "5678", 150.00));
    }
    
    public Tarjeta autenticar(String numero, String pin) {
        Tarjeta t = tarjetas.get(numero);
        if (t == null) {
            throw new RuntimeException("Tarjeta no existe");
        }
        if (t.isBloqueada()) {
            throw new RuntimeException("Tarjeta BLOQUEADA por 3 intentos fallidos");
        }
        if (!t.validarPin(pin)) {
            throw new RuntimeException("PIN incorrecto. Intentos restantes: " + t.getIntentosRestantes());
        }
        return t;
    }
}