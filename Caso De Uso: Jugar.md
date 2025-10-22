# Caso de Uso: Jugar
**Versión:** 1.0  
**Fecha:** 22/10/25  
**Autor:** Ruben Segura  

---

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
| 2. Crear Tablero (celdas vacías)        |                                      |
| 3. Pulsación corta celda                | Pulsación larga celda → Marcar celda (bandera) |
| 4. Generar Tablero (meter minas)        |                                      |
| 5. Mecánica celda                       |                                      |
| 6. Comprobar Victoria                   | Comprobar Victoria                   |
| 7. No Victoria → Volver al Punto 1      | Victoria → Volver al Punto 3         |
