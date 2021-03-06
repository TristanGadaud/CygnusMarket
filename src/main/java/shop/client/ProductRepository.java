package shop.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Override
    List<Product> findAll();

    Product findByNameIgnoreCaseAndCategoryIgnoreCase(String name, String category);

    List<Product> findByCategoryIgnoreCase(String category);

    List<Product> findByCategoryIgnoreCaseOrNameIgnoreCase(String qry1, String qry2);

    List<Product> findAllByOrderByCategory();

    @Override
    <S extends Product> List<S> saveAll(Iterable<S> iterable);

    Product findByIdOrPrice(int id, double price);


}
