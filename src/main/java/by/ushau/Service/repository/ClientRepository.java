package by.ushau.Service.repository;

import by.ushau.Service.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findByFullNameContaining(String fullName);
}
