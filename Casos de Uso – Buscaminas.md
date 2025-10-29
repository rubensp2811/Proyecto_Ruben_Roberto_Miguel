# Casos de Uso – Buscaminas  
**Versión:** 1.0  
**Fecha:** 29/10/25  
**Autor:** Roberto Martín  

---

## 📊 Diagrama de Casos de Uso (PlantUML)

```plantuml
@startuml
left to right direction
skinparam packageStyle rectangle
actor "Jugador" as Player

usecase UC_Jugar as "Jugar"
usecase UC_MecanicaCelda as "Mecánica Celda"
usecase UC_Generar as "Generar Tablero"
usecase UC_Revelar as "Revelar Celdas"
usecase UC_Marcar as "Marcar Minas"
usecase UC_Comprobar as "Comprobar Victoria/Derrota"
usecase UC_Configurar as "Configurar Tablero"
usecase UC_Guardar as "Guardar Tablero"
usecase UC_Nueva as "Generar Nueva Partida"
usecase UC_Resultados as "Mostrar Resultados"

Player --> UC_Jugar
Player --> UC_Configurar
Player --> UC_Guardar
Player --> UC_Nueva
Player --> UC_Resultados

UC_Jugar .> UC_MecanicaCelda : <<include>>
UC_MecanicaCelda .> UC_Revelar : <<include>>
UC_MecanicaCelda .> UC_Marcar : <<include>>
UC_Jugar .> UC_Comprobar : <<include>>
UC_Jugar .> UC_Generar : <<include>>
UC_Generar .> UC_Configurar : <<include>>
@endum

---

# Caso de Uso: Jugar  

## Descripción  
Iniciar ronda  

## Actores  
- Jugador  

## Precondición  
- Elegir Dificultad  

---

## Flujos  

| Flujo Principal                           | Flujo Alternativo                    |
|------------------------------------------|--------------------------------------|
| 1. Iniciar Partida                       |                                      |
| 2. Crear Tablero (celdas vacías)         |                                      |
| 3. Pulsación corta celda                 | Pulsación larga celda → Marcar celda (bandera) |
| 4. Generar Tablero (meter minas)         |                                      |
| 5. Mecánica celda                        |                                      |
| 6. Comprobar Victoria                    | Comprobar Victoria                   |
| 7. No Victoria → Volver al Punto 1       | Victoria → Volver al Punto 3         |

---

# Caso de Uso: Mecánica Celda  

## Descripción  
Controlar las acciones al interactuar con una celda (revelar, marcar, comprobar resultado).  

## Actores  
- Jugador  
- Sistema  

## Precondición  
- Tablero generado y partida en curso.  

---

## Flujos  

| Flujo Principal | Flujo Alternativo |
|-----------------|------------------|
| 1. Jugador selecciona una celda. | Si la celda está marcada → no se puede revelar. |
| 2. El sistema verifica si hay minas colocadas. | Si no hay → invocar generación de minas (Primera celda segura). |
| 3. Revelar la celda seleccionada. | Si es mina → Finalizar partida (Derrota). |
| 4. Si el valor es 0 → Revelar celdas adyacentes (cascada). | |
| 5. Actualizar contador de minas y celdas reveladas. | |
| 6. Comprobar condición de victoria. | Si cumple → Mostrar mensaje de victoria. |

---

# Caso de Uso: Generar Tablero  

## Descripción  
Generar el tablero con minas aleatorias y calcular los números adyacentes.  

## Actores  
- Sistema  

## Precondición  
- Partida iniciada.  
- Tamaño del tablero y cantidad de minas definidos.  

---

## Flujos  

| Flujo Principal | Flujo Alternativo |
|-----------------|------------------|
| 1. Crear la matriz de celdas vacías. | |
| 2. Calcular coordenadas posibles para colocar minas. | |
| 3. Colocar minas aleatoriamente. | Si es primer clic → excluir esa celda. |
| 4. Calcular el número de minas adyacentes en cada celda. | |
| 5. Marcar el tablero como listo para jugar. | |

---

# Caso de Uso: Marcar Minas  

## Descripción  
Permitir al jugador marcar una celda con bandera para señalar una posible mina.  

## Actores  
- Jugador  

## Precondición  
- La celda no debe estar revelada.  

---

## Flujos  

| Flujo Principal | Flujo Alternativo |
|-----------------|------------------|
| 1. Pulsación larga o clic derecho sobre una celda. | |
| 2. El sistema alterna el estado de bandera (colocar/quitar). | |
| 3. Actualizar contador de minas restantes. | |
| 4. Refrescar visualmente la celda. | Si la celda ya está revelada → no permitir marcar. |

---

# Caso de Uso: Revelar Celdas  

## Descripción  
Revelar el contenido de una celda y aplicar las reglas correspondientes.  

## Actores  
- Jugador  
- Sistema  

## Precondición  
- Tablero generado.  

---

## Flujos  

| Flujo Principal | Flujo Alternativo |
|-----------------|------------------|
| 1. Jugador hace clic en una celda. | Si está marcada → no se revela. |
| 2. El sistema muestra el contenido (número o vacío). | Si contiene mina → termina la partida. |
| 3. Si el valor es 0 → Revelar celdas adyacentes automáticamente. | |
| 4. Actualizar interfaz y contadores. | |

---

# Caso de Uso: Mecánica Ganar  

## Descripción  
Verificar si el jugador ha ganado tras cada acción.  

## Actores  
- Sistema  

## Precondición  
- Se ha revelado o marcado al menos una celda.  

---

## Flujos  

| Flujo Principal | Flujo Alternativo |
|-----------------|------------------|
| 1. Comprobar si todas las celdas sin minas están reveladas. | |
| 2. Si se cumple → el jugador gana la partida. | Si se revela una mina → derrota. |
| 3. Mostrar pantalla de victoria. | |
| 4. Permitir reiniciar o salir. | |

---

# Caso de Uso: Guardar Tablero  

## Descripción  
Guardar el estado actual del juego para continuar más tarde.  

## Actores  
- Jugador  
- Sistema  

## Precondición  
- Partida activa.  

---

## Flujos  

| Flujo Principal | Flujo Alternativo |
|-----------------|------------------|
| 1. Jugador selecciona opción “Guardar”. | |
| 2. El sistema guarda datos del tablero y progreso. | Si falla guardado → mostrar error. |
| 3. Confirmar guardado exitoso. | |

---

# Caso de Uso: Generar Nueva Partida (Mecánica Continuar)  

## Descripción  
Permitir al jugador iniciar una nueva partida o continuar una anterior.  

## Actores  
- Jugador  
- Sistema  

## Precondición  
- Menú principal cargado o partida finalizada.  

---

## Flujos  

| Flujo Principal | Flujo Alternativo |
|-----------------|------------------|
| 1. Seleccionar “Nueva Partida” o “Continuar”. | |
| 2. Si es nueva → crear nuevo tablero. | Si es continuar → cargar partida guardada. |
| 3. Mostrar tablero en pantalla. | Si no existe partida guardada → mostrar aviso. |

---

# Caso de Uso: Configurar Tablero  

## Descripción  
Permitir elegir el tamaño del tablero y el número de minas.  

## Actores  
- Jugador  

## Precondición  
- Estar en el menú de configuración.  

---

## Flujos  

| Flujo Principal | Flujo Alternativo |
|-----------------|------------------|
| 1. Seleccionar tamaño de tablero. | |
| 2. Elegir cantidad de minas. | |
| 3. Confirmar configuración. | Si valores no válidos → mostrar mensaje de error. |

---

# Caso de Uso: Comprobar Victoria/Derrota  

## Descripción  
Comprobar al final de cada turno si se ha ganado o perdido la partida.  

## Actores  
- Sistema  

## Precondición  
- Se ha revelado o marcado una celda.  

---

## Flujos  

| Flujo Principal | Flujo Alternativo |
|-----------------|------------------|
| 1. Comprobar si se ha revelado una mina. | Si es así → Derrota. |
| 2. Comprobar si todas las celdas sin minas están reveladas. | Si es así → Victoria. |
| 3. Mostrar resultado final. | |

---

# Caso de Uso: Mostrar Resultados  

## Descripción  
Mostrar los mejores tiempos y estadísticas de partidas ganadas.  

## Actores  
- Jugador  
- Sistema  

## Precondición  
- Partida finalizada con victoria.  

---

## Flujos  

| Flujo Principal | Flujo Alternativo |
|-----------------|------------------|
| 1. Registrar tiempo de victoria. | |
| 2. Guardar resultado en archivo local. | Si no existe → crear nuevo archivo. |
| 3. Mostrar tabla de récords. | |
