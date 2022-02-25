package cmc.du21.cms.repository;

import cmc.du21.cms.entity.CMCUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<CMCUser, Long> {

    CMCUser findByUsername(String username);

}
