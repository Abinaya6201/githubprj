package UserController;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UserService.UserService;
@RestController
@RequestMapping("user/api/v1.0")
public class UserController {
	
	@Autowired
     private UserService service;
	@GetMapping("/all")
    List<User>getAllUser(){ 
	   return service.getAllUser();
    }
        @GetMapping("all/{id}")
        
        Optional<User>UserById(@PathVariable Integer id){
        	return service.getByUserId(id);
        }
        @PostMapping("/all")
	     User addNewUser(@RequestBody User user){
	        return service.addNewUser(user);
	    }



	 @PutMapping("/all/{id}") 
	 void updateUser(@RequestBody User user){ 
		 service.updateUser(user);
		 }
	 }




