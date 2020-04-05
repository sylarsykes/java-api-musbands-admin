package org.java.api.musbands.admin.function.members.service.find;

import java.util.List;

import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

/**
 * IFindAllAdminService define find services.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public interface IFindAllFunctionMemberService {

	/**
	 * Returns all instances of the type.
	 * 
	 * @return List<R> all entities
	 */
	List<FunctionMemberModel> findAll();

	/**
	 * Returns all entities matching the given {@link Example}. In case no match
	 * could be found an empty {@link Iterable} is returned.
	 *
	 * @param example must not be {@literal null}.
	 * @return List<R> all entities matching the given {@link Example}.
	 */
	<F extends Example<FunctionMemberModel>> List<FunctionMemberModel> findAllByExample(F example);

	/**
	 * Returns all entities matching the given {@link Example} applying the given
	 * {@link Sort}. In case no match could be found an empty {@link Iterable} is
	 * returned.
	 *
	 * @param example must not be {@literal null}.
	 * @param sort    the {@link Sort} specification to sort the results by, must
	 *                not be {@literal null}.
	 * @return List<R> all entities matching the given {@link Example}.
	 */
	<F extends Example<FunctionMemberModel>> List<FunctionMemberModel> findAllByExampleSortable(F example, Sort sort);

	/**
	 * Returns all instances of the type with the given IDs.
	 * 
	 * @param ids
	 * @return List<R>
	 */
	List<FunctionMemberModel> findAllById(Iterable<Integer> ids);
}
