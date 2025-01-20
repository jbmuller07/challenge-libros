<h1 align="center">  :books:|  Catálogo de Libros y Autores |:books:  </h1>
<p align="center">
    <img src="https://img.shields.io/badge/STATUS-EN_DESARROLLO-green">
    <img src="https://img.shields.io/badge/Java-17-orange.svg">
    <img src="https://img.shields.io/badge/License-MIT-green.svg">
  </p>
  
## :blue_book: Descripción del Proyecto
Este es un desafio de programación que tiene como objetivo crear un Catálogo de Libros que ofrezca interacción textual (vía consola) con los usuarios, proporcionando al menos 5 opciones de interacción. Los libros se buscarán a través de una API específica, donde se podrán realizar solicitudes, manipular datos JSON, guardarlos en una base de datos y, finalmente filtrar y mostrar los libros/autores de interés.
## :hammer: Funcionalidades
1. **Buscar libro por nombre:** Realiza una búsqueda en la API y guarda los resultados en la base de datos.
2. **Mostrar libros registrados:** Lista todos los libros almacenados localmente.
3. **Mostrar autores registrados:** Muestra todos los autores registrados en la base de datos.
4. **Autores vivos por años:** Lista autores que estaban vivos en un año específico.
5. **Libros por idiomas:** Filtra libros por el idioma seleccionado.
6. **Estadísticas de libros:** Genera estadísticas sobre descargas.
7. **Top 10 libros más descargados:** Lista los libros con mayor número de descargas.
8. **Buscar autor por nombre:** Busca autores en la base de datos y, si no existen, los consulta en la API y los almacena.
9. **Listar autores por atributos:** Filtra autores por año de nacimiento o fallecimiento.

## :construction: Requisitos
- **Java 17 o superior**
- **Spring Boot 3.0 o superior**
- **PostgreSQL 13 o superior**

## :arrow_forward: Uso
El programa presenta un menú en la terminal con opciones numeradas para acceder a las distintas funcionalidades. Por ejemplo:
```text
======= Menú Principal =======
1 - Buscar libro por nombre
2 - Mostrar libros registrados
3 - Mostrar autores registrados
4 - Mostrar autores vivos en año especifico
5 - Mostrar libros por idiomas
6 - Generar estadísticas de libros
7 - Mostrar Top 10 libros más descargados
8 - Buscar autor por nombre
9 - Listar autores por año de nacimiento o fallecimiento
0 - Salir
=============================
```

## :wrench: Características Técnicas
- **Persistencia:** Usa Spring Data JPA para interactuar con PostgreSQL.
- **API Externa:** Consume datos desde `https://gutendex.com/books/`.
- **Deserialización:** Usa Jackson para manejar JSON.
- **Interfaz:** Basada en línea de comandos.

## 📝 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

## 👤 Autor

- Jonathan Muller
- GitHub: [@jbmuller07](https://github.com/jbmuller07)
