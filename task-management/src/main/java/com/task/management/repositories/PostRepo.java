package com.task.management.repositories;

import com.task.management.entities.Post;
import com.task.management.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo  extends JpaRepository<Post,Long>
{

}
