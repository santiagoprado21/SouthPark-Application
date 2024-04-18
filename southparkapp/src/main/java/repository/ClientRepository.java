package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.southpark.domain.Client;

public interface ClientRepository extends JpaRepository<Client, String>{

}
