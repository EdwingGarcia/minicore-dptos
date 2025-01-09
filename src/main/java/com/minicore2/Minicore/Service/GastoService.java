package com.minicore2.Minicore.Service;

import com.minicore2.Minicore.Models.Departamento;
import com.minicore2.Minicore.Models.Gasto;
import com.minicore2.Minicore.Repositories.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class GastoService {

    @Autowired
    private GastoRepository gastoRepository;


    public Map<Departamento, Double> getSumGastosByDateRangeAndDepartamento(String startDate, String endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);
        List<Gasto> allGastos = gastoRepository.findAll();


        return allGastos.stream()
                .filter(gasto -> !gasto.getFecha().isBefore(start) && !gasto.getFecha().isAfter(end))
                .collect(Collectors.groupingBy(
                        Gasto::getDepartamento,
                        Collectors.summingDouble(Gasto::getMonto)
                ));
    }

}