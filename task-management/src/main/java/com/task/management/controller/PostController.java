package com.task.management.controller;

import com.task.management.entities.Post;
import com.task.management.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {
    @Autowired private PostRepo postRepo;
    @PostMapping("/save")
    public Post saveData(@RequestBody Post post){

        return postRepo.save(post);
    }
    @GetMapping("/get")
    public List<Post> getData()
    {
        return postRepo.findAll();
    }
    @PutMapping("/update")
public Post updateDate(@RequestBody Post post){
        return postRepo.save(post);
    }
@DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable("id") long id){

        postRepo.deleteById(id);
        return "Data Deleted Successfully";
}
}
