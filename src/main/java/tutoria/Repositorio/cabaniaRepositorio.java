/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria.Repositorio;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tutoria.Modelo.Cabania;
import tutoria.Interface.InterfaceCabania;

/**
 *
 * @author cesartbossa
 */
@Repository
public class cabaniaRepositorio {
    @Autowired
    private InterfaceCabania crud;
    

    public List<Cabania> getAll(){
        return (List<Cabania>) crud.findAll();       
    }
    
    public Optional <Cabania> getCabania(int id){
        return crud.findById(id);
    }
    
    public Cabania save(Cabania cabania){
        return crud.save(cabania);
    }
     public void delete(Cabania cabania){
        crud.delete(cabania);
    }
    
}