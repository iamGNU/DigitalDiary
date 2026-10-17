package com.connectakash.journalApp.repository;
import com.connectakash.journalApp.entity.JournalEntry;
import com.connectakash.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, ObjectId>{
    User findByUserName(String username);
}
