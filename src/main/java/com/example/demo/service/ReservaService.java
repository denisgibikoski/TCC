package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Reserva;

@Service
public interface ReservaService {

	List<Reserva> getTodas();
	
}
