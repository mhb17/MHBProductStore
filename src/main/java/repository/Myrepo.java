package repository;

import model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Myrepo extends CrudRepository<Product,Integer> {

    List<Product> findAllByName();
   // @Query("SELECT p FROM Product p")
  //  List<Product>  getAllByMHB ;
}
