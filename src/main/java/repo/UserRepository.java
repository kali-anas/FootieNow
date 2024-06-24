package repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.sabanciuniv.model.User;  // Correct import path is crucial

public interface UserRepository extends MongoRepository<User, String> {
    // Optionally define methods for user-specific queries, like findByUsername
}
