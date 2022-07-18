package com.example.Challenge.Services;

import com.example.Challenge.DTO.CompraDTO;
import com.example.Challenge.Entities.Compra;
import com.example.Challenge.Interfaces.ICompra;
import com.example.Challenge.Mapper.CompraMapper;
import com.example.Challenge.Repository.CompraRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("compraService")
public class CompraService implements ICompra {
    private final CompraMapper compraMapper;
    private final CompraRepository compraRepository;

    public CompraService(CompraMapper compraMapper, CompraRepository compraRepository) {
        this.compraMapper = compraMapper;
        this.compraRepository = compraRepository;
    }
    public CompraDTO add(CompraDTO entity){
        entity.setId(null);
        return compraMapper.entityToDto(compraRepository.save(compraMapper.DtoToEntity(entity)));
    }

    @Override
    public Iterable<Compra> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Compra> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Compra> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Compra> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Compra> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Compra> findAll() {
        return null;
    }

    @Override
    public Iterable<Compra> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Compra entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Compra> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
