package mongo.repository.cases;

import mongo.entity.cases.HotelCase;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/3/31.
 */
@Repository
public interface HotelRepository extends MongoRepository<HotelCase, ObjectId>{

	public HotelCase findByTitle(String title);
}
