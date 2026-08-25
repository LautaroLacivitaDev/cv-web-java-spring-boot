package com.lautaro.cv;

import com.lautaro.cv.model.EducationItem;
import com.lautaro.cv.model.Experience;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Controller
public class CvController {

    @GetMapping("/")
    public String home(Model model) {

        final String email = "lautarolacivita.dev@gmail.com";
        final String phone = "+54 9 11 2324 2157";

        model.addAttribute("fullName", "Lautaro Alejo Lacivita");
        model.addAttribute("title", "Jr. Software Developer");
        model.addAttribute("location", "Capital Federal, Argentina");
        model.addAttribute("phone", phone);
        model.addAttribute("phoneHref", toTelHref(phone));
        model.addAttribute("email", email);
        model.addAttribute("gmailUrl", buildGmailComposeUrl(email, "Contacto desde el portfolio"));
        model.addAttribute("linkedin", "linkedin.com/in/lautarolacivita");
        model.addAttribute("linkedinUrl", "https://linkedin.com/in/lautarolacivita");

        model.addAttribute("skills", List.of(
                "Java", "Spring Boot", "SQL", "GitHub", "HTML", "CSS", "Scrum"
        ));

        model.addAttribute("experiences", List.of(
                new Experience(
                        "Team Leader",
                        "Nike",
                        "12/2021 - 06/2026",
                        List.of(
                                "Desarrollo de habilidades de liderazgo, planificación, comunicación y resolución de problemas.",
                                "Coordinación de equipos de alto rendimiento, aplicando metodologías orientadas a resultados y mejora continua.",
                                "Seguimiento y análisis de objetivos mediante métricas de desempeño para optimizar procesos.",
                                "Priorización de tareas y gestión de flujos de trabajo eficientes, con enfoque en metodologías ágiles (Scrum).",
                                "Implementación de instancias de feedback profesional para potenciar el rendimiento individual y del equipo.",
                                "Ejecución de auditorías de inventario y conciliaciones de caja."
                        )
                )
        ));

        model.addAttribute("education", List.of(
                new EducationItem("Analista en Sistemas", "ORT Argentina", "En curso")
        ));

        model.addAttribute("courses", List.of(
                new EducationItem("SQL con PostgreSQL", "Udemy", "Finalizado"),
                new EducationItem("Problem Solving", "HackerRank", "Finalizado"),
                new EducationItem("POO en Java", "Udemy", "Finalizado"),
                new EducationItem("Git y GitHub", "Udemy", "Finalizado"),
                new EducationItem("N8N + MCP Automation", "Udemy", "Finalizado"),
                new EducationItem("English Certificate 73/100 C2 Proficient", "EF SET", "Finalizado"),
                new EducationItem("Java: Spring Boot", "Udemy", "Finalizado"),
                new EducationItem("Master en Java", "Udemy", "En curso")
        ));

        return "index";
    }

    /**
     * Arma la URL de "Redactar" de Gmail con destinatario y asunto precargados,
     * para que el botón de contacto abra Gmail en el navegador en vez de
     * depender de un cliente de correo local configurado (mailto:).
     */
    private String buildGmailComposeUrl(String toEmail, String subject) {
        String encodedTo = URLEncoder.encode(toEmail, StandardCharsets.UTF_8);
        String encodedSubject = URLEncoder.encode(subject, StandardCharsets.UTF_8);
        return "https://mail.google.com/mail/?view=cm&fs=1&to=" + encodedTo + "&su=" + encodedSubject;
    }

    /** Normaliza el teléfono mostrado a un href tel: válido (solo dígitos y +). */
    private String toTelHref(String displayPhone) {
        return "tel:" + displayPhone.replaceAll("[^\\d+]", "");
    }
}
