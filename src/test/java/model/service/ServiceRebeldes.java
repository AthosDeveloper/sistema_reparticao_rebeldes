package model.service;

import  static model.connection.Conexao.getConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import  java.sql.Connection;
/*
Essa classe fica responsável de lidar com os cadastros e da listagem das tabelas.
 */

public class ServiceRebeldes {
    Statement statement;
    public ServiceRebeldes(){
        try {
            statement = getConnection().createStatement();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
public void consultarRebeldesCadastrados(){
        String sql = "SELECT * FROM rebeldes";
        try {


            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
String nome = resultSet.getString("nome_rebelde");
Integer idade = resultSet.getInt("idade");
String genero = resultSet.getString("genero");
           String nomeBase = resultSet.getString("nome_base");
                System.out.println("nome: " + nome);
                System.out.println("idade: " + idade);
                System.out.println("gênero: " + genero);
                System.out.println("localização: " + nomeBase);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
}
public void atualizarLocalidade(String localidade, Integer id){
        String sql = "UPDATE rebeldes SET nome_base = '" + localidade + "' WHERE id_rebelde = '" + id + "'";
        try {
            statement.executeUpdate(sql);
            System.out.println("localidade atualizada ");
        }catch (SQLException e){
            e.printStackTrace();
        }
}



}


