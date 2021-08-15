package by.ushau.Service.repository;

import by.ushau.Service.domain.OrderParts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderPartsRepository extends JpaRepository<OrderParts, Integer> {
}
