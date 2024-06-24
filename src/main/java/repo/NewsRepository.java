package repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.sabanciuniv.model.News;

@Repository

public interface NewsRepository extends MongoRepository<News, String> {
    // Define custom queries for News if needed
}
