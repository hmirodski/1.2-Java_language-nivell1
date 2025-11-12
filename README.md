# 1.2 Java Language - Nivel 1: Gestión de Excepciones

## 📄 Descripción - Enunciado del ejercicio

### Enunciado

**Ejercicio 1:**
Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda". Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.

La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada "VendaBuidaException" i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.

L’excepció personalitzada "VendaBuidaException" ha de ser filla de la classe Exception. Al seu constructor li hem de passar el missatge “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.

Escriu el codi necessari per a generar i capturar una excepció de tipus "IndexOutOfBoundsException".

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

