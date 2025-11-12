# 1.2 Java Language - Nivel 1: Gestión de Excepciones

## 📄 Descripción - Enunciado del ejercicio

### Enunciado

**Ejercicio 1:**

Crea una clase denominada "Producte" con los atributos nombre y precio, y otra clase denominada "Venda". Esta clase tiene como atributos una colección de productos y el precio total de la venta.

La clase "Venda" tiene un método denominado `calcularTotal()` que lanza la excepción personalizada "VendaBuidaException" y muestra por pantalla "Per fer una venda primer has d'afegir productes" si la colección de productos está vacía. Si la colección tiene productos, entonces debe recorrer la colección y guardar la suma de todos los precios de los productos en el atributo precio total de la venta.

La excepción personalizada "VendaBuidaException" debe ser hija de la clase Exception. En su constructor se le debe pasar el mensaje "Per fer una venda primer has d'afegir productes" y cuando capturemos la excepción, debemos mostrarla por pantalla con el método `getMessage()` de la excepción.

Escribe el código necesario para generar y capturar una excepción de tipo "IndexOutOfBoundsException".

---

## 💻 Tecnologías Utilizadas

- **Lenguaje**: Java SE 17
- **Paradigma**: Programación Orientada a Objetos (POO)
- **Estructuras de datos**: ArrayList (Java Collections Framework)
- **Manejo de excepciones**: Checked y Unchecked Exceptions
- **Control de versiones**: Git
- **IDE**: IntelliJ IDEA

---

## 📋 Requisitos

Para ejecutar este proyecto necesitas:

- **Java Development Kit (JDK)**: Versión 8 o superior (recomendado JDK 17)
- **IDE recomendado**: IntelliJ IDEA, Eclipse, NetBeans o Visual Studio Code con extensión de Java
- **Sistema operativo**: Windows, macOS o Linux
- **Git**: Para clonar el repositorio

### Verificar instalación de Java
```bash
java -version
javac -version
```

---

## 🛠️ Instalación

### 1. Clonar el repositorio
```bash
git clone https://github.com/hmirodski/1.2-Java_language-nivell1.git
```

### 2. Verificar la estructura del proyecto
```
1.2-Java_language-nivell1/
│
├── src/
│   ├── Main.java
│   ├── Product.java
│   ├── Sale.java
│   └── VendaBuidaException.java
│
├── .gitignore
└── README.md
```

### 3. Configurar el IDE (opcional)

**Para IntelliJ IDEA:**
1. Abre IntelliJ IDEA
2. File → Open → Selecciona la carpeta del proyecto
3. Espera que el IDE indexe los archivos

---

## ▶️ Ejecución

Ejecución desde un IDE

**IntelliJ IDEA:**
1. Abre el archivo `Main.java`
2. Haz clic derecho sobre el archivo
3. Selecciona **Run 'Main.main()'**




## 🌐 Despliegue

Este proyecto es de carácter educativo y está diseñado para ejecutarse en entorno local. 


## 🤝 Contribuciones

Este proyecto forma parte de un ejercicio académico del bootcamp de Java IT Academy.

