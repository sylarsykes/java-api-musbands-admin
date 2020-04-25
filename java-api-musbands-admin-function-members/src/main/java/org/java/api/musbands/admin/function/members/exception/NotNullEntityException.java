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
@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public final class NotNullEntityException extends RuntimeException {
	private static final long serialVersionUID = 8007203199956028231L;

	/**
	 * Deafult constructor
	 */
	public NotNullEntityException() {
		super();
	}

	/**
	 * Message constructor 
	 * 
	 * @param message
	 */
	@ConstructorProperties({ "message"})
	public NotNullEntityException(final String message) {
		super(message);
	}
	
	/**
	 * AllArgsConstructor
	 * 
	 * @param message
	 * @param cause
	 */
	@ConstructorProperties({ "message", "cause"})
	public NotNullEntityException(final String message, final Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * Cause constructor
	 * 
	 * @param cause
	 */
	@ConstructorProperties({ "cause"})
	public NotNullEntityException(final Throwable cause) {
		super(cause);
	}

}
