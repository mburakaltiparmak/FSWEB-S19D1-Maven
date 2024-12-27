package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable,Long> {
    @Query(value = "select v.id,v.name,v.price,v.is_grown_on_tree from fsweb.vegetable v order by v.price desc",nativeQuery = true)
    List<Vegetable> sortByPriceDesc();
    @Query(value = "select v.id,v.name,v.price,v.is_grown_on_tree from fsweb.vegetable v order by v.price asc",nativeQuery = true)
    List<Vegetable> sortByPriceAsc();
    @Query(value = "select v.id,v.name,v.price,v.is_grown_on_tree from fsweb.vegetable v where v.name ilike'%:param'",nativeQuery = true)
    List<Vegetable> findByParam(String param);
}
