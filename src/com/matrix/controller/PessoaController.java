package com.matrix.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matrix.dao.PessoaService;
import com.matrix.domain.Pessoa;


@RestController
public class PessoaController {
	
	PessoaService p =new PessoaService();
	
	 @RequestMapping(value="/dev",method = RequestMethod.GET,headers="Accept=application/json")
	 public List<Pessoa> getPessoas() {	 
	  List<Pessoa> pessoas =p.getAll();
	  return pessoas;
	
	 }
	 

}