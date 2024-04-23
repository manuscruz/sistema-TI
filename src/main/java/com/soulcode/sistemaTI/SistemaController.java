package com.soulcode.sistemaTI;

import com.soulcode.sistemaTI.Models.ChamadosModel;
import com.soulcode.sistemaTI.Models.TecnicoModels;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SistemaController {

    @RequestMapping(value = "/chamados-sistema", method = RequestMethod.GET)
    public String listaChamados(Model model, @RequestParam String name){
        List<ChamadosModel> chamados = new ArrayList<>();

        // Simulando alguns chamados
        ChamadosModel chamado1 = new ChamadosModel(name, "Administrativo", "Problema com o e-mail", "Alta", LocalDate.of(2023, 2, 17));
        ChamadosModel chamado2 = new ChamadosModel(name, "Administrativo", "Problema no computador", "Média", LocalDate.of(2024, 5, 18));
        ChamadosModel chamado3 = new ChamadosModel(name, "Administrativo", "Erro no software office", "Baixa", LocalDate.of(2024, 3, 28));
        ChamadosModel chamado4 = new ChamadosModel(name, "Administrativo", "Troca de teclado", "Alta", LocalDate.of(2024, 6, 12));
        ChamadosModel chamado5 = new ChamadosModel(name, "Administrativo", "Problema na impressora", "Média", LocalDate.of(2024, 4, 19));

        chamados.add(chamado1);
        chamados.add(chamado2);
        chamados.add(chamado3);
        chamados.add(chamado4);
        chamados.add(chamado5);

        model.addAttribute("chamados", chamados);
        model.addAttribute("name", name);
        return "chamados-usuario";
    }
    @RequestMapping(value = "/historicochamado", method = RequestMethod.GET)
    public String historicoChamado(Model model, @RequestParam String name){
        List<ChamadosModel> historico = new ArrayList<>();
        TecnicoModels historico1 = new TecnicoModels("erica", "adm","xzljbfjsdibnfsvjkix","baixa", LocalDate.of(2024,5,13),"obs", "em andamento");
       return "chamados-tecnicos";
    }
}
