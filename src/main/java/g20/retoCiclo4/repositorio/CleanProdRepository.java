/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g20.retoCiclo4.repositorio;

import g20.retoCiclo4.modelo.CleaningProduct;
import g20.retoCiclo4.repositorio.crud.CleanProdCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public class CleanProdRepository {
    @Autowired
    private CleanProdCrudRepository cleanProdCrudRepository;

    public List<CleaningProduct> getAll(){
        return cleanProdCrudRepository.findAll();
    }

    public Optional<CleaningProduct> getCleaningProduct(int id){
        return cleanProdCrudRepository.findById(id);
    }

    public CleaningProduct save(CleaningProduct cleaningProduct){
        return cleanProdCrudRepository.save(cleaningProduct);
    }

    public void update(CleaningProduct cleaningProduct){
        cleanProdCrudRepository.save(cleaningProduct);
    }

    public void delete(CleaningProduct cleaningProduct){
        cleanProdCrudRepository.delete(cleaningProduct);
    }
    
}
