
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controlBicis {
     public void alta(model.Bicicleta bici){
      conexion conn = new conexion(); 
       
    String sql = "insert into Bicicletas values (\""+
                 bici.getModelo()+"\",\""+
                 bici.getMarca()+"\",\""+
                 bici.getColor()+"\",\""+
                 bici.getTipo()+"\","+
                 bici.getnPiezas()+");";
    System.out.println(sql);
    conn.setQuery(sql);
    conn.close();
  }//alta
  
  public void elimina(String Modelo){
      conexion conn = new conexion();  
    String sql = "delete from Bicicletas where Modelo=\"" +Modelo+"\";";
    System.out.println(sql);
    conn.setQuery(sql);
    conn.close();
  }//elimina
  
  public void actualiza(model.Bicicleta bici,String Modelo){
      conexion conn = new conexion();  
    String sql = "update Bicicletas set Modelo=\""+ bici.getModelo()+"\",Marca=\""+
                 bici.getMarca()+"\",Color=\""+
                 bici.getColor()+"\",Tipo=\""+
                 bici.getTipo()+"\",Npiezas="+
                 bici.getnPiezas()+" where Modelo=\""+ Modelo +"\";";
    System.out.println(sql);
    conn.setQuery(sql);
    conn.close();
  }//alta
  
  public ArrayList<model.Bicicleta> listaBicicletas(){ 
        ArrayList<model.Bicicleta> bicis = new ArrayList();
        conexion conn = new conexion(); 
        ResultSet rs;
        model.Bicicleta bici;
        try {
            String sql = "Select * from Bicicletas";
            rs = conn.getQuery(sql);
            while (rs.next()) {
                String vmodelo = rs.getString("Modelo");
                String vmarca = rs.getString("Marca");
                String vcolor = rs.getString("Color");
                String vtipo = rs.getString("Tipo");
                int vnpiezas = rs.getInt("Npiezas");
                bici= new model.Bicicleta(vmodelo, vmarca, vcolor, vtipo, vnpiezas);
                bicis.add(bici);
            }//while 
           conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(controlBicis.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bicis;
    }//sobrecarga de metodos
   public ArrayList<model.Bicicleta> listaBicicletas(String modelo){ 
        ArrayList<model.Bicicleta> bicis = new ArrayList();
        conexion conn = new conexion(); 
        ResultSet rs;
        model.Bicicleta bici;
        try {
            String sql = "Select * from Bicicletas where Modelo=\""+modelo+"\"";
            rs = conn.getQuery(sql);
            while (rs.next()) {
                String vmodelo = rs.getString("Modelo");
                String vmarca = rs.getString("Marca");
                String vcolor = rs.getString("Color");
                String vtipo = rs.getString("Tipo");
                int vnpiezas = rs.getInt("Npiezas");
                bici= new model.Bicicleta(vmodelo, vmarca, vcolor, vtipo, vnpiezas);
                bicis.add(bici);
            }//while 
           conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(controlBicis.class.getName()).log(Level.SEVERE, null, ex);
        }//listaAmigos
        return bicis;
    }//listaAmigos
}
