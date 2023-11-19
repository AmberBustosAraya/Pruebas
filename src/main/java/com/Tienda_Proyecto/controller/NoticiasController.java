package com.Tienda_Proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticiasController {

    @GetMapping("/Noticias")
    public String mostrarNoticias() {
        return "Noticias/Noticias";
    }
}
