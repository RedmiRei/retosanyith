/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g20.retoCiclo4.repositorio.crud;

import g20.retoCiclo4.modelo.CleaningProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author user
 */
public interface CleanProdCrudRepository extends MongoRepository<CleaningProduct, Integer> {
    
    
}
