package aug.manas.splitter.data;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import aug.manas.splitter.model.Group;

@Repository
public interface GroupRepository extends MongoRepository<Group, String> {

}