# TAREA

*Fecha de Revisión*: 19/11/2015

## Instrucciones:
Usted fue contratado por el Deportivo Árabe Unido para que desarrolle la primera fase de un proyecto en Java donde se simule todas las actividades a ejecutarse antes, durante y luego de un partido de fútbol. 

Este proyecto constará del paquete arabeunido, que está conformado por una interfaz (Integrante), una clase abstracta (Equipo) y tres clases concretas (Jugador, Entrenador, Masajista):
* Todo futbolista, entrenador y masajista conforman un equipo, y éste a su vez se asocian a un integrante.
* Todo integrante debe concentrarse, viajar, entrenar y jugar partidos. 
* Todo equipo está formado por una identificación, su nombre, sus apellidos y la edad.
* El jugador maneja una dorsal y una posición; además, debe responder a entrevistas.
* El entrenador tiene una identifación única ante la federación y puede planificar una jugada. 
* El masajista maneja años de experiencia y dará masajes cuando sea necesario; además, puede tener o no una credencial.

Para validar que el diagrama de clases para este proyecto esté bien diseñado, el punto de contacto en el Deportivo Árabe Unido le solicita simular lo siguiente en la clase Principal:
* Haga que el equipo tenga 15 jugadores, 1 entrenador y 2 masajistas. Puede inventar los datos personales.
* Antes del partido: el entrenador planifica jugadas para entrenar, los jugadores entrenan, el masajista da un masaje sobre 3 jugadores, todos se concentran en el partido.
* Durante el partido: juegan 11 jugadores, el entrenador planifica jugadas.
* La probabilidad de meter goles es de un 10%. Usted debe inventar la regla para generar dicha probabilidad. Le recomiendo usar la clase Random.
* La probabilidad de que le metan un gol al portero es de 5%. Usted debe inventar la regla para generar dicha probabilidad. Le recomiendo usar la clase Random.
* Luego del partido: darán entrevista los jugadores que metieron el gol, al portero y al entrenador; los masajistas darán masajes a todos los jugadores.
* Si el equipo perdió, el portero dará comentarios negativos. De lo contrario, el portero dará comentarios positivos.
* Los masajistas con mayor experiencia y con credencial atenderán más jugadores que los que no tienen credencial.
