package co.edu.umb.ds.review.persistence.repositories;

import co.edu.umb.ds.review.persistence.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT * FROM review WHERE product_id = :productId"
    )
    List<Review> getReviewsByProductId(@Param("productId") Long productId);
}