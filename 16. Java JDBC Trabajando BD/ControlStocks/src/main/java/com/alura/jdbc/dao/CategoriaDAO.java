package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alura.jdbc.modelo.Categoria;
import com.alura.jdbc.modelo.Producto;

public class CategoriaDAO {

    private Connection conect;

    public CategoriaDAO(Connection conect) {
        this.conect = conect;
    }

    public List<Categoria> listar() {
        List<Categoria> resultado = new ArrayList<>();

        try {
            String sql = "select * from categorias";
            
            System.out.println(sql);
            
            final PreparedStatement statement = conect.prepareStatement(sql);

            try (statement) {
                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        resultado.add(new Categoria(
                                resultSet.getInt("id"),
                                resultSet.getString("nombre")));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }

    public List<Categoria> listarConProductos() {
        List<Categoria> resultado = new ArrayList<>();

        try {
            String sql = "select * "
                    + "from categorias c inner join productos p "
                    + "on c.id = p.categoriaID";
            
            System.out.println(sql);
            
            final PreparedStatement statement = conect
                    .prepareStatement(sql);

            try (statement) {
                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        int categoriaID = resultSet.getInt("c.id");
                        String categoriaNombre = resultSet.getString("c.nombre");
                        
                        Categoria categoria = resultado
                            .stream()
                            .filter(cat -> cat.getId().equals(categoriaID))
                            .findAny().orElseGet(() -> {
                                Categoria cat = new Categoria(
                                        categoriaID, categoriaNombre);
                                resultado.add(cat);
                                
                                return cat;
                            });
                        
                        Producto producto = new Producto(
                                resultSet.getInt("p.id"),
                                resultSet.getString("p.nombre"),
                                resultSet.getInt("p.cantidad"));
                        
                        categoria.agregar(producto);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }

}
