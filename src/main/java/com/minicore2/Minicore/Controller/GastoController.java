package com.minicore2.Minicore.Controller;

import com.minicore2.Minicore.Models.Departamento;
import com.minicore2.Minicore.Service.GastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/gastos")
public class GastoController {

    @Autowired
    private GastoService gastoService;

    @GetMapping("/filtrar-deptos")
    public String getSumGastosByDepartamento(
            @RequestParam String startDate,
            @RequestParam String endDate,
            Model model) {
        Map<Departamento, Double> gastos = gastoService.getSumGastosByDateRangeAndDepartamento(startDate, endDate);
        model.addAttribute("gastos", gastos);
        model.addAttribute("startDate", startDate);
        model.addAttribute("endDate", endDate);
        return "gastos";
    }
}
