package com.example.salon.Repository;

import com.example.salon.Model.Serv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServRepository extends JpaRepository<Serv,Integer> {

    Serv findServById(Integer id);

    List<Serv> findServByCategory(String category);
}
