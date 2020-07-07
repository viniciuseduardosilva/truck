package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.model.Caminhoneiro;
import br.com.model.Destino;
import br.com.model.Origem;
import br.com.model.response.Result;
import br.com.service.CaminhoneiroService;
import br.com.service.MapService;

@RestController
@RequestMapping(path = "/")
public class CaminhoneiroController {
	
	@Autowired
	private CaminhoneiroService caminhoneiroService;
	
	@Autowired
	private MapService mapService;
	
	
    @PostMapping("salvar")
    public Caminhoneiro salvar(@RequestBody Caminhoneiro caminhoneiro) {
        return caminhoneiroService.salva(caminhoneiro);
    }
    
    @PostMapping("lista")
    public List<Caminhoneiro> lista(){
    	return caminhoneiroService.buscaTodos();
    }
    
    @PostMapping("carga")
    public List<Caminhoneiro> carga(){
    	return caminhoneiroService.buscaCargas();
    }

    @PostMapping("veiculos")
    public Integer veiculos(){
    	return caminhoneiroService.buscaVeiculos();
    }
    
    @GetMapping("caminhoneiro/{id}")
    public Caminhoneiro caminhoneiro(@PathVariable Long id){
    	return caminhoneiroService.buscaCaminhonheiro(id);
    }
    
    @PutMapping("atualiza")
    public void atualizar(@RequestBody Caminhoneiro caminhoneiro) {
    	caminhoneiroService.salva(caminhoneiro);
    }
    
    @PostMapping("localorigem")
    public ResponseEntity<Result> localOrigem(@RequestBody Origem origem) {
    	String longuitude = origem.getLongitudeOrigem();
    	String latidude = origem.getLatitudeOrigem();
    	return mapService.consulta(longuitude, latidude);
    }
    
    @PostMapping("localdestino")
    public ResponseEntity<Result> localDestino(@RequestBody Destino destino) {
    	String longuitude = destino.getLongitudeDestino();
    	String latidude = destino.getLatitudeDestino();
    	return mapService.consulta(longuitude, latidude);
    }
    
}
