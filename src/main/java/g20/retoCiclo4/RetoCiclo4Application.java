package g20.retoCiclo4;

import g20.retoCiclo4.repositorio.crud.CleanProdCrudRepository;
import g20.retoCiclo4.repositorio.crud.OrderCrudRepository;
import g20.retoCiclo4.repositorio.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class RetoCiclo4Application implements CommandLineRunner {

    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private CleanProdCrudRepository cleanProdCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public static void main(String[] args) {
        SpringApplication.run(RetoCiclo4Application.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        cleanProdCrudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
        System.out.println("Database ready to go...!");
    }

}
