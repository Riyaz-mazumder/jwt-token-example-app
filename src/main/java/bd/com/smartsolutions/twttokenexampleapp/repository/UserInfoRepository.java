package bd.com.smartsolutions.twttokenexampleapp.repository;

import bd.com.smartsolutions.twttokenexampleapp.model.UserInfo; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> { 
	Optional<UserInfo> findByName(String username); 
}

