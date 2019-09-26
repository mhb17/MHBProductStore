package repository;


import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class Repo {
    @Autowired
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    @PersistenceContext
    EntityManager entityManager;

    public void save(Product product){

    jdbcTemplate.update("insert into pro values (?,?,?)",product.getId(),product.getName(),product.getName());
        System.out.println("sds");
    }
    public void saveEM (Product product)
    {
        entityManager.persist(product);
    }

//    public List<Product> getAll()
//    {
//        TypedQuery<Product> query = entityManager.createQuery("From model.Product p",Product.class);
//        return query.getResultList();
//    }

     public ArrayList show(){

        SqlRowSet sqlRowSet =jdbcTemplate.queryForRowSet("Select * from pro");

        ArrayList<String> map = new ArrayList();

        do
        {
            sqlRowSet.next();
            String name = sqlRowSet.getString("name");
            int id = sqlRowSet.getInt("id");
            String desc = sqlRowSet.getString("dec");
            map.add(name);
            map.add(id+"");
            map.add(desc);
            //System.out.println(sqlRowSet.isLast());
        }while (!sqlRowSet.isLast());

        return map;
    }
    public ArrayList<Product> generateProduct(ArrayList<String> array)
    {

        Product product;
        ArrayList<Product> products = new ArrayList<>();
        for (int i =0 ; i<array.size();)
        {
            product = new Product();
            //System.out.println(products.get(i).toString());
            System.out.print(array.get(i));
            product.setName(array.get(i));
            i++;
            product.setId(Integer.parseInt(array.get(i)));
            System.out.print(array.get(i));
            i++;
            product.setDesc(array.get(i));
            //System.out.println(array.get(i));
            //System.out.println((i<array.size())+ " < ");
            i++;
            products.add(product);


            //System.out.println(products.get(i).toString());

          //  System.out.println(product.getId());
         }
         for (int i =0 ;i<products.size();i++)
             System.out.println(products.get(i).toString());

        return products;
    }
}
