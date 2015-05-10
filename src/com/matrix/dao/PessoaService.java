package com.matrix.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.matrix.domain.Pessoa;
import com.matrix.utility.DBUtility;
public class PessoaService {
 
 private Connection connection;

 public PessoaService() {
  connection = DBUtility.getConnection();
 }


 public List<Pessoa> getAll() {
  List<Pessoa> pessoas = new ArrayList<Pessoa>();
  try {
   Statement statement = connection.createStatement();
   ResultSet rs = statement.executeQuery("select * from tab_dev");
   while (rs.next()) {
	Pessoa p = new Pessoa();   
    p.setNome(rs.getString("nome"));
    p.setTime(rs.getString("time"));
    p.setAdmin(rs.getString("admin"));
    pessoas.add(p);
   }
  } catch (SQLException e) {
   e.printStackTrace();
  }

  return pessoas;
 }
 
}