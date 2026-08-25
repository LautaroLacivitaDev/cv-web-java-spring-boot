# CV Portfolio — Lautaro Lacivita

A personal CV portfolio built as a web application using **Java, Spring Boot and Thymeleaf**.

The project was created as a practical application of Java and web development concepts, combining a Spring MVC backend with a Thymeleaf frontend to render professional information dynamically.

## 🚀 Tech Stack

### Backend

- **Java 17** — Main programming language.
- **Spring Boot 3.3.4** — Application framework and project configuration.
- **Spring MVC** — Handles HTTP requests and follows a Model-View-Controller structure.
- **Maven** — Dependency management and project build lifecycle.

### Frontend

- **Thymeleaf** — Server-side template engine used to render dynamic content from Java models.
- **HTML5** — Page structure and semantic content.
- **CSS3** — Responsive layout, styling and visual design.

### Testing

- **Spring Boot Starter Test** — Testing dependencies provided by the Spring Boot ecosystem.

## 🏗️ Architecture

The application follows a simple MVC structure appropriate for the scope of a personal portfolio:

```text
HTTP Request
     │
     ▼
Controller
     │
     ▼
Java Models
     │
     ▼
Thymeleaf Template
     │
     ▼
HTML + CSS
```

### Project structure

```text
src/
└── main/
    ├── java/com/lautaro/cv/
    │   ├── CvApplication.java
    │   ├── CvController.java
    │   └── model/
    │       ├── Experience.java
    │       └── EducationItem.java
    │
    └── resources/
        ├── templates/
        │   └── index.html
        ├── static/
        │   ├── css/
        │   │   └── style.css
        │   └── files/
        │       └── cv-lautaro-lacivita.pdf
        └── application.properties
```

### Main components

**`CvApplication.java`**  
Entry point of the Spring Boot application.

**`CvController.java`**  
Handles the main route and prepares the information that is passed to the Thymeleaf view.

**`Experience.java`**  
Java model representing professional experience and its associated highlights.

**`EducationItem.java`**  
Java model representing education and courses.

**`index.html`**  
Main Thymeleaf template responsible for rendering the portfolio.

**`style.css`**  
Contains the visual design, layout and responsive styles.

## 💡 Concepts demonstrated

This project applies several concepts relevant to Java and web development:

- Object-Oriented Programming (OOP).
- Encapsulation and immutable model attributes.
- Separation of responsibilities between controllers, models and views.
- Model-View-Controller (MVC).
- Spring Boot application configuration.
- Spring MVC request handling.
- Dynamic server-side rendering with Thymeleaf.
- Maven dependency and build management.
- HTML5 and CSS3.
- Responsive web design.

## ⚙️ Requirements

To run the project locally, you need:

- **Java 17** or newer.
- **Maven 3.8+**.
- A web browser.

You can verify your installations with:

```bash
java -version
mvn -version
```

## ▶️ Run locally

Clone the repository:

```bash
git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
```

Enter the project directory:

```bash
cd cv-portfolio
```

Start the Spring Boot application:

```bash
mvn spring-boot:run
```

Then open:

```text
http://localhost:8080
```

The application should now be available locally in your browser.

## 📦 Build the executable JAR

To create the production-ready JAR:

```bash
mvn clean package
```

The generated file will be located at:

```text
target/cv-portfolio-1.0.0.jar
```

It can be executed with:

```bash
java -jar target/cv-portfolio-1.0.0.jar
```

Then access the application at:

```text
http://localhost:8080
```

## 📄 Downloadable CV

The project includes a PDF version of the CV under:

```text
src/main/resources/static/files/cv-lautaro-lacivita.pdf
```

The PDF can be replaced whenever the CV is updated.

## 🎨 Customization

Most visual customization can be done from:

```text
src/main/resources/static/css/style.css
```

The professional information displayed by the application is managed from the Java layer and rendered dynamically through Thymeleaf.

## 🌐 Live Demo

> Add the deployed application URL here once the project is published online.

**Live Demo:** `https://YOUR-DEPLOYED-URL`

## 👨‍💻 About Me

**Lautaro Lacivita**  
Systems Analysis student focused on software development, with a particular interest in Java and backend technologies.

This project is part of my personal portfolio and demonstrates my current knowledge of Java, Spring Boot and web application development.
