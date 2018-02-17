package com.everest.agile.atacado.api.repositories;

import java.util.Date;
import java.util.List;

import com.everest.agile.atacado.api.entities.Cliente;
import com.everest.agile.atacado.api.entities.NotaFiscal;
import com.everest.agile.atacado.api.entities.pk.NotaFiscalId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, NotaFiscalId> {


	public List<NotaFiscal> findByCarga(Integer id);

	public NotaFiscal findById(NotaFiscalId id);

	public List<NotaFiscal>  findByDataEmissaoBetween(Date inicio, Date fim);

	public List<NotaFiscal>  findByDestinatario(Cliente cliente);
	
	@Query("select count(*) from NotaFiscal nf  where nf.carga = :cargaId")
	public Integer countByCarga(@Param("cargaId") Integer carga);
	
}
