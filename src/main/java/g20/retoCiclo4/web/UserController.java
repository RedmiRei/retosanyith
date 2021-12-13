/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g20.retoCiclo4.web;

import g20.retoCiclo4.modelo.User;
import g20.retoCiclo4.servicio.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Karen Gonzalez G20
 */
/*
@RestController
*/
@RestController
/**
 * @RequestMapping("/api/user")
 */
@RequestMapping("/api/user")
/**
 * @CrossOrigin("*")
 */
@CrossOrigin("*")
public class UserController {
    /**
     *  @Autowired
     */
    @Autowired
    /**
     * Atributo UserService
     */
    private UserService userService;
     /**
      * @GetMapping("/all")
      * @return userService.getAll();
      */
     @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }
    
    /**
     * @GetMapping("/{id}")
     * @param id
     * @return userService.getUser(id)
     */
     @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }
    
    /**
     * @PostMapping("/new")
     * @param user
     * @return userService.create(user)
     */
      @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
    
    /**
     * @PutMapping("/update")
     * @param user
     * @return userService.update(user)
     */
    @PutMapping("/update")
    /**
     * @ResponseStatus(HttpStatus.CREATED)
     */
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
    
    /**
     * @DeleteMapping("/{id}")
     * @param id
     * @return userService.delete(id)
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }
    /*@GetMapping("/{email}/{password}")
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.authenticateUser(email, password);
    }*/
    
    /**
     * @GetMapping("/{email}/{password}")
     * @param email
     * @param password
     * @return userService.authenticateUser(email,password)
     */
    @GetMapping("/{email}/{password}")
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password){
        return userService.authenticateUser(email,password);
    }
    
    /**
     * @GetMapping("/emailexist/{email}")
     * @param email
     * @return userService.emailExists(email);
     */
    @GetMapping("/emailexist/{email}")
    public boolean emailExists(@PathVariable("email") String email) {
        return userService.emailExists(email);
    }
    
}
