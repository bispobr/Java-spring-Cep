package com.example.cep.controller;

import com.example.cep.dto.ResultdoDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Busca-cep")
public class CepBuscaController {

    @GetMapping("{cep}")
    @Operation(description = "Endpoint responsável por buscar cep informado")
    @ApiResponse(responseCode = "200", description = "solicitação bem sucedida")
    public ResultdoDTO buscarCep(@PathVariable("cep") String cep){
        RestTemplate restTemplate =  new RestTemplate();
        ResponseEntity<ResultdoDTO> resp = restTemplate.getForEntity(String.format("https://viacep.com.br/ws/%s/json/",cep), ResultdoDTO.class);
        return resp.getBody();
    }
}
