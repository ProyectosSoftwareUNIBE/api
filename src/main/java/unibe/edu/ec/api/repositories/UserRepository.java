package unibe.edu.ec.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import unibe.edu.ec.api.documents.User;

public interface UserRepository extends MongoRepository<User, String> {

}
