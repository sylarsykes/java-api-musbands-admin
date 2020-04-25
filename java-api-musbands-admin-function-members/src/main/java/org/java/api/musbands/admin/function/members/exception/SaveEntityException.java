package org.java.api.musbands.admin.function.members.exception;

import java.beans.ConstructorProperties;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Not found entity exception
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public final class SaveEntityException extends RuntimeException {

	private static final long serialVersionUID = -8744397402728801988L;

	/**
	 * Deafult constructor
	 */
	public SaveEntityException() {
		super();
	}

	/**
	 * Message constructor 
	 * 
	 * @param message
	 */
	@ConstructorProperties({ "message"})
	public SaveEntityException(final String message) {
		super(message);
	}
	
	/**
	 * AllArgsConstructor
	 * 
	 * @param message
	 * @param cause
	 */
	@ConstructorProperties({ "message", "cause"})
	public SaveEntityException(final String message, final Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Cause constructor
	 * 
	 * @param cause
	 */
	@ConstructorProperties({ "cause"})
	public SaveEntityException(final Throwable cause) {
		super(cause);
	}

}
