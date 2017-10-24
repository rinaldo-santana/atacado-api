package com.everest.agile.atacado.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.everest.agile.atacado.api.entities.NotaFiscal;
import com.everest.agile.atacado.api.entities.pk.NotaFiscalId;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, NotaFiscalId> {

	public List<NotaFiscal> findByCarga(Integer id);
	
	@Query("select count(*) from NotaFiscal nf  where nf.carga = :cargaId")
	public Integer countByCarga(@Param("cargaId") Integer carga);
	
	
	
}
