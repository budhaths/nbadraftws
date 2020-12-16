package com.nbadraftws.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * The type Global exception handler
 * 
 * @author suraj.budhathoki
 *
 */

@ControllerAdvice
public class GlobalExceptionHandler {
	
	/**
	 * 
	 * @param ResourceNotFoundException ex
	 * @param WebRequest request
	 * @return response entity
	 * 
	 */
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundException (ResourceNotFoundException ex, WebRequest request){
		 ErrorResponse errorDetails =
			        new ErrorResponse(new Date(), HttpStatus.NOT_FOUND.toString(), ex.getMessage(), request.getDescription(false));
	     return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

}
