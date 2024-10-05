package lk.ijse.ijse.gdse.aad67.notecollectorv2.dao;

import lk.ijse.gdse.aad67.notecollecter67.entity.impl.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserEntity,String> {
}
