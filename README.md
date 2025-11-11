**Descripción - Enunciado del ejercicio**
Este ejercicio consiste en desarrollar un sistema de gestión de ventas en Java con el objetivo de practicar el manejo de excepciones personalizadas y estándar.
**Nivell 1**
- Exercici 1
Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.

La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada "VendaBuidaException" i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.

L’excepció personalitzada "VendaBuidaException" ha de ser filla de la classe Exception. Al seu constructor li hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.

Escriu el codi necessari per a generar i capturar una excepció de tipus "IndexOutOfBoundsException".


**Tecnologías Utilizadas**

Lenguaje: Java SE 17
Paradigma: Programación Orientada a Objetos (POO)
Estructuras de datos: ArrayList (Java Collections Framework)
Manejo de excepciones: Checked y Unchecked Exceptions

**Requisitos**
Para ejecutar este proyecto necesitas:

Java Development Kit (JDK): Versión 8 o superior
IDE recomendado: IntelliJ IDEA, Eclipse, NetBeans o Visual Studio Code con extensión de Java
Sistema operativo: Windows, macOS o Linux

**Instalación**
- Clonar o descargar el repositorio
https://github.com/hmirodski/1.2-Java_language-nivell1.git

**Ejecución**
Abre el proyecto en tu IDE preferido
Localiza el archivo Main.java
Click derecho sobre el archivo → Run 'Main.main()' (o equivalente según tu IDE)

**Desplegament**
Este proyecto es de carácter educativo y está diseñado para ejecutarse en entorno local. No requiere despliegue en servidor.

**Contribuciones**
Este proyecto forma parte de un ejercicio académico del bootcamp IT Academy.
