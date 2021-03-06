package mongo.repository.cases;

import mongo.entity.cases.CommercialCase;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/3/31.
 */
@Repository
public interface CommercialRepository extends MongoRepository<CommercialCase, ObjectId> {
	CommercialCase findByTitle(String title);
}
