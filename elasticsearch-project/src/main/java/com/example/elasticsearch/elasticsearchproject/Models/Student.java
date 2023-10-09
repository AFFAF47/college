package com.example.elasticsearch.elasticsearchproject.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "students")
public class Student {
    @Id
    private ObjectId id;

    @Indexed(unique = true)
    private String studentId;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private String phone;
    @NonNull
    private String department;
}
