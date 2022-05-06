package cms.repository;


import cms.entity.CMCUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<CMCUser, Long> {

    CMCUser findByUsername(String username);

}
