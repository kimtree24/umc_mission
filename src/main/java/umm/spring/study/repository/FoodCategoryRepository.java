package umm.spring.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umm.spring.study.domain.FoodCategory;

public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {
}
