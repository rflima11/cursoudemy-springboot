package com.rodolfo.cursomc.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.rodolfo.cursomc.service.exceptions.ObjectNotFoundException;
import com.rodolfo.cursomc.resources.exceptions.StandartError;

@ControllerAdvice
public class ResourceExceptionHandler {

	
	public ResponseEntity<StandartError> objectNotFoundException(ObjectNotFoundException e, HttpServletRequest request){
		
		StandartError err = new StandartError(e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
