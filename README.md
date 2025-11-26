 # PRRM
  Este es el proyecto intermodular de Ruben Segura, Roberto Martin y Miguel Díaz 
 <!-- pagina grafica marktdown: https://stackedit.io --> 

 # 💣 Buscaminas

[![Java](https://img.shields.io/badge/Java-24-orange.svg?style=for-the-badge&logo=java)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-Project-red.svg?style=for-the-badge&logo=apache-maven)](https://maven.apache.org/)
[![Trello](https://img.shields.io/badge/Trello-%23026AA7.svg?style=for-the-badge&logo=Trello&logoColor=white)](https://trello.com/invite/b/68c12422387f082b0f37f9a1/ATTI135013bde53ce0d26b52916d7cecb745C48FAF71/mi-tablero-de-trello)

> Implementación del clásico juego Buscaminas desarrollado en Java con interfaz gráfica Swing

## 📋 Descripción

Este proyecto recrea el conocido juego Buscaminas, desarrollado como herramienta de aprendizaje y entretenimiento. El juego estimula el pensamiento lógico, la capacidad de concentración y la deducción estratégica mientras proporciona una experiencia de entretenimiento accesible.

## ✨ Características

### Funcionalidades Principales
- 🎮 **Tablero configurable** con diferentes tamaños y niveles de dificultad
- 💣 **Generación aleatoria de minas** con primera casilla siempre segura
- 🚩 **Sistema de marcado** con banderas para señalizar minas sospechosas
- 🔢 **Cálculo automático** del número de minas adyacentes
- 🌊 **Revelado en cascada** para celdas vacías
- ⏱️ **Temporizador** para medir el tiempo de juego
- 🏆 **Sistema de victoria/derrota** con detección automática

### Características Adicionales
- 🎨 Interfaz gráfica intuitiva con Swing
- 💾 Guardado de progreso (planificado)
- 📊 Tabla de récords (planificado)
- 🌙 Modo oscuro (planificado)
- 🔊 Efectos de sonido (planificado)

## 👥 Autores

**Proyecto Intermodular** desarrollado por:
- **Rubén Segura**
- **Roberto Martín**
- **Miguel Díaz**

## 🎯 Propósito del Proyecto

El proyecto busca:
- Crear una implementación del clásico Buscaminas en Java
- Servir como herramienta de aprendizaje para el desarrollo de aplicaciones
- Proporcionar entretenimiento digital que estimule el pensamiento lógico
- Desarrollar habilidades en programación orientada a objetos
- Preparación para una futura migración a Kotlin

## 🚀 Requisitos del Sistema

- **Java:** JDK 24 o superior
- **Maven:** Para gestión de dependencias
- **IDE recomendado:** IntelliJ IDEA, Eclipse o NetBeans

## 📦 Instalación

1. Clonar el repositorio:
```bash
git clone https://github.com/tu-usuario/buscaminas.git
cd buscaminas
```

2. Compilar el proyecto con Maven:
```bash
mvn clean install
```

3. Ejecutar la aplicación:
```bash
mvn exec:java -Dexec.mainClass="es.iesjuanbosco.roberto.Main"
```

O desde tu IDE, ejecutar la clase `Main.java`

## 🎮 Cómo Jugar

1. **Iniciar el juego:** Selecciona el nivel de dificultad desde el menú principal
2. **Revelar celdas:** Clic izquierdo sobre una celda para revelar su contenido
3. **Marcar minas:** Clic derecho o pulsación larga para colocar/quitar una bandera
4. **Objetivo:** Revelar todas las celdas que no contienen minas
5. **Derrota:** Si revelas una celda con mina, pierdes la partida
6. **Victoria:** Al revelar todas las celdas seguras, ganas la partida

### Interpretación de Números
- Los números indican cuántas minas hay en las 8 celdas adyacentes
- Una celda vacía (0) revela automáticamente sus celdas vecinas

## 📐 Arquitectura del Proyecto

```
Buscaminas/
├── src/
│   └── main/
│       └── java/
│           └── es/iesjuanbosco/roberto/
│               ├── Main.java          # Punto de entrada
│               ├── Menu.java          # Menú principal
│               ├── Tablero.java       # Lógica del tablero (planificado)
│               └── Celda.java         # Lógica de celdas (planificado)
├── pom.xml                            # Configuración Maven
└── README.md
```

## 🔄 Casos de Uso

El proyecto incluye documentación detallada de casos de uso:
- Configurar Tablero
- Generar Tablero
- Jugar
- Mecánica de Celda
- Revelar Celdas
- Marcar Minas
- Comprobar Victoria/Derrota
- Guardar/Cargar Partida

Ver documentación completa en `/docs/Casos de Uso – Buscaminas.md`

## 🎨 Valor Diferencial

Nuestro Buscaminas se distingue por:
- ✨ Diseño minimalista y moderno
- 🎚️ Niveles totalmente personalizables
- ⏱️ Temporizador opcional para mayor desafío
- 🌙 Modo oscuro para reducir fatiga visual
- 📱 Interfaz responsive y escalable
- 🔊 Efectos de sonido inmersivos

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java 24
- **Framework GUI:** Swing
- **Build Tool:** Maven
- **Control de versiones:** Git
- **Gestión de proyecto:** Trello

## 📈 Roadmap

### Versión Actual (1.0)
- [x] Estructura base del proyecto
- [x] Menú principal básico
- [ ] Lógica completa del tablero
- [ ] Sistema de revelado de celdas
- [ ] Detección de victoria/derrota

### Versión Futura (2.0)
- [ ] Sistema de guardado de partidas
- [ ] Tabla de récords
- [ ] Efectos de sonido
- [ ] Modo oscuro
- [ ] Migración a Kotlin
- [ ] Versión Android

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor:
1. Haz fork del proyecto
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto es de código abierto y está disponible para fines educativos.

## 📞 Contacto

**Gestión del Proyecto:** [Tablero Trello](https://trello.com/invite/b/68c12422387f082b0f37f9a1/ATTI135013bde53ce0d26b52916d7cecb745C48FAF71/mi-tablero-de-trello)

---

⭐ Si te gusta este proyecto, no olvides darle una estrella en GitHub

**Desarrollado con ❤️ por Rubén, Roberto y Miguel**
