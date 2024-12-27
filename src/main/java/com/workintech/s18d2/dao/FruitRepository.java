package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit,Long> {
    @Query(value = "select f.id, f.name, f.price, f.fruit_type from fsweb.fruit f order by f.price desc",nativeQuery = true)
    List<Fruit> sortByPriceDesc();
    @Query(value = "select f.id, f.name, f.price, f.fruit_type from fsweb.fruit f order by f.price asc",nativeQuery = true)
    List<Fruit> sortByPriceAsc();
    @Query(value = "select f.id,f.name,f.price,f.fruit_type from fsweb.fruit f where f.name ilike '%:param'",nativeQuery = true)
    List<Fruit> findByParam(String param);


}
