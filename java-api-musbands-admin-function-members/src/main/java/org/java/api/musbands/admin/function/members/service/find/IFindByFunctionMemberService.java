package org.java.api.musbands.admin.function.members.service.find;

import java.util.Optional;

import org.java.api.musbands.admin.function.members.exception.IncorrectResultSizeException;
import org.java.api.musbands.admin.function.members.exception.NotFoundEntityException;
import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;
import org.springframework.data.domain.Example;

/**
 * IFindByAdminService define services for find a entity AdminSimple.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 * @param <T> Type of class.
 * @param <R> Resourse of class.
 * @param <N> Class of identifier.
 */
public interface IFindByFunctionMemberService {

	/**
	 * Returns a single entity matching the given {@link Example} or {@literal null}
	 * if none was found.
	 *
	 * @param example must not be {@literal null}.
	 * @return Optional<R> a single entity matching the given {@link Example} or
	 *         {@link Optional#empty()} if none was found.
	 * @throws NotFoundEntityException      if no entity exists for given
	 *                                      {@code id}.
	 * @throws IncorrectResultSizeException if the Example yields more than one
	 *                                      result.
	 */
	Optional<FunctionMemberModel> findByExample(Example<FunctionMemberModel> example) throws NotFoundEntityException, IncorrectResultSizeException;

	/**
	 * Retrieves an entity by its id.
	 * 
	 * @param id must not be {@literal null}.
	 * @return Optional<R> the entity with the given id or
	 *         {@literal Optional#empty()} if none found
	 * @throws IllegalArgumentException if {@code id} is {@literal null}.
	 */
	Optional<FunctionMemberModel> findById(Integer id) throws NotFoundEntityException;

	/**
	 * Find by name.
	 * 
	 * @param name Value of the attribute name
	 * @return Optional<R>
	 * @throws NotFoundEntityException      if no entity exists for given
	 *                                      {@code id}.
	 * @throws IncorrectResultSizeException if there is more than one result.
	 */
	Optional<FunctionMemberModel> findByName(final String name) throws NotFoundEntityException, IncorrectResultSizeException;
}
