package com.example.restservice1.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restservice1.entity.OrderReceived;

@Repository
@Qualifier(value="orderReceivedRepository")
public interface OrderReceivedRepository extends JpaRepository<OrderReceived, Long> {

}
