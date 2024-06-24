package repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.sabanciuniv.model.Comment;  // Ensure correct package path

public interface CommentRepository extends MongoRepository<Comment, String> {
    // Custom methods for retrieving comments based on certain criteria can be added
}
