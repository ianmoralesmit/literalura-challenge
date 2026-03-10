# 📚 LiterAlura - Catálogo de Libros

¡Bienvenido al **LiterAlura**! Este es un desafío de programación desarrollado para el programa **Oracle Next Education (ONE)** en conjunto con **Alura Latam**. La aplicación permite interactuar con un catálogo de libros consumiendo datos reales de la API **Gutendex**.

## 🚀 Funcionalidades
La aplicación es una herramienta de consola (CLI) que ofrece las siguientes opciones:
1. **Buscar libro por título:** Consulta la API externa y, si el libro existe, lo registra automáticamente en la base de datos junto con su autor.
2. **Listar libros registrados:** Muestra todos los libros que ya fueron guardados en la base de datos local.
3. **Listar autores registrados:** Muestra la lista de autores cuyos libros han sido guardados.
4. **Listar autores vivos en un año determinado:** Filtra los autores registrados que estaban con vida en el año que el usuario ingrese.
5. **Listar libros por idioma:** Permite buscar libros guardados filtrando por siglas de idioma (es, en, fr, pt).

## 🛠️ Tecnologías Utilizadas
* **Java 17**
* **Spring Boot 3.2.4**
* **Spring Data JPA**
* **PostgreSQL** (Base de datos relacional)
* **Jackson** (Para el mapeo de JSON)
* **Maven** (Gestor de dependencias)



## 📋 Requisitos Previos
Antes de correr el proyecto, necesitás tener instalado:
* **JDK 17** o superior.
* **PostgreSQL** (con una base de datos llamada `literalura`).
* **IntelliJ IDEA** (u otro IDE de Java).

## 🔧 Configuración
1. Cloná este repositorio.
2. Configurá tus credenciales de PostgreSQL en el archivo `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
