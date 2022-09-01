package com.Forum.CursosForum.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.Forum.CursosForum.Service.CursoService;

@RestController
public class CursoController {

    @Autowired
   CursoService cursoService;

}
