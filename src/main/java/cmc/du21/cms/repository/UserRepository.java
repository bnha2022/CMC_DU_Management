package cmc.du21.cms.repository;

import cmc.du21.cms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String username);

//    Optional<User> findByEmailIgnoreCase(String username, int isDeleted);
}
