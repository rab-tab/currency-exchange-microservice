package com.myapp.microservices.currencyexchangeservice.repository;

import com.myapp.microservices.currencyexchangeservice.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {
    ExchangeValue findByFromAndTo(String from ,String to);

}
