package com.ecodeup.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ecodeup.conexion.Conexion;
import com.ecodeup.model.Cliente;

public class ClienteDAO {
	private Connection connection;
	private PreparedStatement statement;
	private boolean estadoOperacion;


	
	
	// obtener lista de productos
	public List<Cliente> obtenerClientes() throws SQLException {
		ResultSet resultSet = null;
		List<Cliente> listaClientes= new ArrayList<>();

		String sql = null;
		estadoOperacion = false;
		connection = obtenerConexion();

		try {
			sql = "SELECT * FROM clientes";
			statement=connection.prepareStatement(sql);
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Cliente p=new Cliente();
				p.setId(resultSet.getInt(1));
				p.setNombre(resultSet.getString(2));
				p.setApellido(resultSet.getString(3));
				p.setEmail(resultSet.getString(4));
				
				listaClientes.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaClientes;
	}


	// obtener conexion pool
	private Connection obtenerConexion() throws SQLException {
		return Conexion.getConnection();
	}

}
