package UserService;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UserRepository.UserRepository;



@Service
public class UserService {
	@Autowired 
   private UserRepository repo;
    	public List<User> getAllUser(){
            return ((List)(repo.findAll()));
        }
         public Optional<User> getByUserId(Integer id){
            return repo.findById(id);
        }

         public User addNewUser(User user){
            return repo.save(user);
        }

		
     public  void updateUser(User user){
            repo.save(user);
        }
}




