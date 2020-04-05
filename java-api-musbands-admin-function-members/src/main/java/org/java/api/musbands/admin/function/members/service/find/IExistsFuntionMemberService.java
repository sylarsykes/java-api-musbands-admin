package org.java.api.musbands.admin.function.members.service.find;

import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;
import org.springframework.data.domain.Example;

/**
 * IExistsByAdminService define services for check exists an entity AdminSimple.
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public interface IExistsFuntionMemberService {

	/**
	 * Checks whether the data store contains elements that match the given {@link Example}.
	 *
	 * @param example the {@link Example} to use for the existence check. Must not be {@literal null}.
	 * @return {@literal true} if the data store contains elements that match the given {@link Example}.
	 */
	boolean exists(Example<FunctionMemberModel> example);

	/**
	 * Returns whether an entity with the given id exists.
	 * 
	 * @param id must not be {@literal null}.
	 * @return boolean {@literal true} if an entity with the given id exists,
	 *         {@literal false} otherwise.
	 * @throws IllegalArgumentException if {@code id} is {@literal null}.
	 */
	boolean existsById(Integer id);

}
