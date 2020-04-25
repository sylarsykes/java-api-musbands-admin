package org.java.api.musbands.admin.function.members.controller.find;

import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.CONTROLLER_REQUEST_MAPPING;
import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.FIND_ALL_CONTROLLER_NAME;

import java.util.List;

import org.java.api.musbands.admin.function.members.exception.NotFoundEntityException;
import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;
import org.java.api.musbands.admin.function.members.service.find.IFindAllFunctionMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


/**
 * Find all function member controller
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@RestController(FIND_ALL_CONTROLLER_NAME)
@RequestMapping(CONTROLLER_REQUEST_MAPPING)
public class FindAllFunctionMemberController {

	@Autowired
	private IFindAllFunctionMemberService findAllfunctionMemberService;
	
	/**
	 * Find all function members
	 * 
	 * @return List<FunctionMemberModel>
	 * @throws NotFoundEntityException
	 */
	@GetMapping(produces = { MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.OK)
	public List<FunctionMemberModel> findAll() throws NotFoundEntityException {
		final List<FunctionMemberModel> result = findAllfunctionMemberService.findAll();
		
		if (CollectionUtils.isEmpty(result)) {
			throw new NotFoundEntityException();
		}
		
		return result;
	}
}
