# Cajero Automatico - Java POO

Simulador de cajero automatico con autenticacion, bloqueo por intentos y validaciones de banco real, desarrollado aplicando principios de Programacion Orientada a Objetos.

## Funcionalidades

- Autenticacion segura: Bloqueo de tarjeta tras 3 intentos fallidos de PIN.
- Operaciones principales: Consultar saldo, Retirar, Depositar, Ver historial de ultimas 5 transacciones.
- Validaciones de negocio: Solo billetes de S/10, 20, 50, 100, 200, limite de S/1000 por retiro, montos multiplos de 10.
- Arquitectura en capas: Paquetes com.cajero.app, com.cajero.model, com.cajero.service.

## Tarjetas de prueba

| Numero de Tarjeta | PIN | Saldo inicial |
| :--- | :--- | :--- |
| 4557881234567890 | 1234 | S/ 2500.50 |
| 4557880987654321 | 5678 | S/ 150.00 |

## Como ejecutar

1. Clonar el repositorio o abrir el proyecto en NetBeans.
2. Ejecutar la clase Main.java ubicada en com.cajero.app (Run / F6).
3. Ingresar una de las tarjetas de prueba para acceder al menu.

## Tecnologias

- Java
- NetBeans IDE
- Git / GitHub
- POO, Manejo de Excepciones, Colecciones

## Evidencia

Proyecto compilado y ejecutado correctamente con BUILD SUCCESSFUL, validando retiros, depositos, historial y validacion de billetes no validos.

Autor: Jeruth Lozano
