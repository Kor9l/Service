package by.ushau.Service.repository;

import by.ushau.Service.domain.OrderWorks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderWorksRepository extends JpaRepository<OrderWorks, Integer> {
}
