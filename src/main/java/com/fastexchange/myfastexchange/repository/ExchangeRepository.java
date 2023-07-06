package com.fastexchange.myfastexchange.repository;

import com.fastexchange.myfastexchange.model.Exchanges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchanges, Long> {
}
