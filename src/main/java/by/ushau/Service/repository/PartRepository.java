package by.ushau.Service.repository;

import by.ushau.Service.domain.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends JpaRepository<Part, Integer> {
    Part findByTitleContaining (String title);
}
