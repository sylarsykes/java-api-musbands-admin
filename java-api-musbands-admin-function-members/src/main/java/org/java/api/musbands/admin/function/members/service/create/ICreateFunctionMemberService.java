package org.java.api.musbands.admin.function.members.service.create;

import org.java.api.musbands.admin.function.members.exception.NotNullEntityException;
import org.java.api.musbands.admin.function.members.exception.SaveEntityException;
import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;

/**
 * ICreateAdminService define the service for the creation of AdminSimple.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public interface ICreateFunctionMemberService {

	/**
	 * Saves a given entity. Use the returned instance for further operations as the
	 * save operation might have changed the entity instance completely.
	 * 
	 * @param R entity must not be {@literal null}.
	 * @return the saved entity will never be {@literal null}.
	 */
	FunctionMemberModel create(FunctionMemberModel entity) throws NotNullEntityException, SaveEntityException;
}
