package repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.sabanciuniv.model.Match;  // Adjust the import path as necessary

public interface MatchRepository extends MongoRepository<Match, String> {
    // Add custom queries to find matches by various attributes
}
