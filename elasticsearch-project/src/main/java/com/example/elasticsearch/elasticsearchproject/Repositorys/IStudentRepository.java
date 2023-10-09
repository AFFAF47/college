package com.example.elasticsearch.elasticsearchproject.Repositorys;

import com.example.elasticsearch.elasticsearchproject.Models.Student;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends MongoRepository<Student, ObjectId> {
}
