package br.com.aulapdv.syspdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pagamento extends JpaRepository<Pagamento, Integer>{
    
}