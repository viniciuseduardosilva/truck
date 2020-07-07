package br.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.service.PracaService;

@RestController
@RequestMapping(path = "/")
public class PracaController {
	
	@Autowired
	private PracaService pracaService;
	
	@GetMapping("dia/{dia}")
    public Integer veiculos(@PathVariable String dia){
    	return pracaService.qtdDias(dia);
    }

    @GetMapping("semana/{dia}")
    public Integer semana(@PathVariable String dia){
    	return pracaService.qtdSemana(dia);
    }
    
    @GetMapping("ano/{ano}")
    public Integer ano(@PathVariable String ano){
    	return pracaService.qtdAno(ano);
    }
    
}
