package conditioner.repository;

import conditioner.model.ConditionerEntity;
import conditioner.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {


    Optional<UserEntity> findByEmail(String email);
}