package com.weigao.real.estat.app.repository;

import com.weigao.real.estat.app.domain.Home;
import com.weigao.real.estat.app.domain.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {

    public Home findByProperty(Property property);
}
