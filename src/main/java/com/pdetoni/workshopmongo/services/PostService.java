package com.pdetoni.workshopmongo.services;

import com.pdetoni.workshopmongo.domain.Post;
import com.pdetoni.workshopmongo.domain.User;
import com.pdetoni.workshopmongo.dto.UserDTO;
import com.pdetoni.workshopmongo.repository.PostRepository;
import com.pdetoni.workshopmongo.repository.UserRepository;
import com.pdetoni.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
   private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }


}
