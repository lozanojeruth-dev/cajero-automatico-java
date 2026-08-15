# 🏧 Cajero Automático - Java POO

Simulador de cajero automático con autenticación, bloqueo por intentos y validaciones de banco real.

## 🚀 Funcionalidades
- **Autenticación segura:** Bloqueo de tarjeta tras 3 intentos fallidos.
- **Operaciones:** Consultar saldo, Retirar, Depositar, Historial (últimas 5).
- **Validaciones reales:** Solo billetes de S/10,20,50,100,200, límite S/1000 por retiro, montos múltiplos de 10.
- **POO:** Paquetes `com.cajero.app`, `model`, `service`.

## 💳 Tarjetas de prueba
| Número | PIN | Saldo inicial |
| :--- | :--- | :--- |
| 4557881234567890 | 1234 | S/ 2500.50 |
| 4557880987654321 | 5678 | S/ 150.00 |

## ▶️ Cómo ejecutar
1. Abrir en NetBeans
2. Run `Main.java` (F6)
3. Usar tarjetas de prueba

## 📸 Demo
Retiro, depósito, validación de billetes y historial funcionando con `BUILD SUCCESSFUL`.

Desarrollado en Java 8+ con NetBeans.
