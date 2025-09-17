## 1. Funcionalidades mínimas:

Estas son las características básicas que debe tener el buscaminas para ser considerado funcional.

**Generales**

* Generar un tablero de tamaño configurable (por ejemplo, 8x8, 10x10).

* Colocar minas aleatoriamente en el tablero al inicio del juego.

* Calcular y mostrar el número de minas adyacentes en cada celda.

* Permitir al jugador:

  * Hacer clic en una celda para revelarla.

  * Marcar una celda con una bandera si cree que hay una mina.

* Si el jugador revela una celda con una mina → pierde.

* Si el jugador revela todas las celdas sin minas → gana.

* Mostrar un mensaje de victoria o derrota al finalizar el juego.

**Lógica del juego**

* Al revelar una celda sin minas cerca (valor 0), revelar automáticamente las celdas adyacentes vacías (efecto cascada).

* No permitir revelar celdas ya marcadas con una bandera.

* Contador de minas restantes (basado en las banderas colocadas).

* Contador de tiempo transcurrido desde que empieza el juego.

## 2. Requerimientos no funcionales

Estos no afectan directamente la jugabilidad, pero son importantes para la calidad del software.

**Código**

* El proyecto debe estar estructurado con buena organización de clases y funciones (modelo Tablero, celda, juego).

* Seguir principios de programación orientada a objetos.

* Usar nombres de variables y funciones claros y significativos.

* Comentar el código cuando sea necesario.

* Ser fácilmente mantenible y escalable.

**UI / UX (interfaz gráfica)**

* Interfaz sencilla, clara y responsiva.

* Mostrar claramente las celdas reveladas, las minas y las banderas.

* Uso de colores y símbolos comprensibles para indicar el estado de cada celda.

* Compatible con teclado o ratón, según plataforma.

**Rendimiento**

* El juego debe responder rápidamente a las acciones del usuario.

* El algoritmo de colocación de minas y de revelado debe ser eficiente, incluso en tableros grandes.

## 3. Extras futuros (opcional)

* La primera revelación no puede ser una mina.

* Niveles de dificultad (fácil, medio, difícil).

* Guardar el progreso de una partida.

* Tabla de récords.

* Sonidos al ganar, perder o hacer clic.

* Modo oscuro / claro.

* Soporte multijugador (modo competitivo).

* Personalización del número de minas y tamaño del tablero.

* Añadir una IA que juegue al buscaminas automáticamente (nivel avanzado).
