package com.pdetoni.workshopmongo.repository;

import com.pdetoni.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
