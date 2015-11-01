# TAREA

*Fecha de Revisión*: 12/11/2015

## Instrucciones:
1. Elabore un diagrama de clases y desarrolle un programa en Java que simule un cajero automático (ATM). El cajero automático debe poder realizar las siguientes acciones:
 * Encender. Un operador enciende la máquina luego del mantenimiento.
 * Apagar la máquina. Un operador apaga una máquina para que un técnico le de mantenimiento.
 * Iniciar una sesión. Se da cuando el cliente inserta una tarjeta dentro del cajero automático.
 * Hacer una transacción. Inicia dentro de una sesión cuando el cliente elige un tipo de transacción del menú de opciones.
 * Retiro. Es un tipo de transacción donde el cliente elige la cuenta de donde retirará y la cantidad de dinero a retirar.
 * PIN inválido. Extensión que entra en función cuando el usuario se equivoca al menos 3 veces al tratar de ingresar su número de cuatro dígitos, PIN. Se debe bloquear la cuenta por 1 día y notificar al banco.
Tome en consideración que tenemos tres posibles actores: cliente, operador y banquero.
