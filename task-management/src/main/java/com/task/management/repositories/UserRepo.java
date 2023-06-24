package com.task.management.repositories;
import com.task.management.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo  extends JpaRepository<User,Integer>
        {
             public User findByUsernameOrEmail(String username,String password);

            public User findByUsernameOrPassword(String username, String password);

}
