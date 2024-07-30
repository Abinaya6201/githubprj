package UserRepository;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
		@Repository
		public interface UserRepository extends CrudRepository<User, Integer >{
			//List<Venue> findByVenueId(Integer Id);
	}


