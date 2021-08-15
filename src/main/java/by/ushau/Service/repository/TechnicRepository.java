package by.ushau.Service.repository;

import by.ushau.Service.domain.Technic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicRepository extends JpaRepository<Technic, Integer> {
    Technic findBtModelContaining(String model);

}
