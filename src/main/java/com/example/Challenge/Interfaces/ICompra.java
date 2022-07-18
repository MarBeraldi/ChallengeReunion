package com.example.Challenge.Interfaces;

import com.example.Challenge.Entities.Compra;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICompra extends PagingAndSortingRepository<Compra, Integer> {
}
