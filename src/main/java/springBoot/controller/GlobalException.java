package springBoot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalException {

	/*@ExceptionHandler(IllegalArgumentException.class)
	  public ResponseEntity<VndErrors> assertionException(final IllegalArgumentException e) {
	    return error(e, HttpStatus.NOT_FOUND, e.getLocalizedMessage());
	  }*/
	
}
