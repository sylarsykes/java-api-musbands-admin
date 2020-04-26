package org.java.api.musbands.admin.function.members.controller.find;

import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.CONTROLLER_GET_FIND_BY_ID;
import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.CONTROLLER_GET_FIND_BY_NAME;
import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.CONTROLLER_GET_FIND_BY_EXAMPLE;
import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.CONTROLLER_REQUEST_MAPPING;
import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.FIND_BY_CONTROLLER_NAME;

import java.util.Optional;

import org.java.api.musbands.admin.function.members.exception.NotFoundEntityException;
import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;
import org.java.api.musbands.admin.function.members.service.find.IFindByFunctionMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Find all function member controller
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@RestController(FIND_BY_CONTROLLER_NAME)
@RequestMapping(CONTROLLER_REQUEST_MAPPING)
public class FindByFunctionMemberController {

	@Autowired
	private IFindByFunctionMemberService findByFunctionMemberService;
	
	/**
	 * Find one FunctionMemberModel by id
	 * 
	 * @param id
	 * 		FunctionMemberModel id
	 * @return FunctionMemberModel
	 * @throws NotFoundEntityException
	 */
	@GetMapping(path = CONTROLLER_GET_FIND_BY_ID, produces = { MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody FunctionMemberModel findById(final @PathVariable Integer id) throws NotFoundEntityException {
		
		final Optional<FunctionMemberModel> result = findByFunctionMemberService.findById(id);
		
		if (!result.isPresent()) {
			throw new NotFoundEntityException();
		}
		
		return result.get();
	}
	
	/**
	 * Find one FunctionMemberModel by name
	 * 
	 * @param id
	 * 		FunctionMemberModel id
	 * @return FunctionMemberModel
	 * @throws NotFoundEntityException
	 */
	@GetMapping(path = CONTROLLER_GET_FIND_BY_NAME, produces = { MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody FunctionMemberModel findByName(final @PathVariable String name) throws NotFoundEntityException {
		
		final Optional<FunctionMemberModel> result = findByFunctionMemberService.findByName(name);
		
		if (!result.isPresent()) {
			throw new NotFoundEntityException();
		}
		
		return result.get();
	}
	
	/**
	 * Find one FunctionMemberModel by example
	 * 
	 * @param example
	 * @return
	 */
	@GetMapping(path = CONTROLLER_GET_FIND_BY_EXAMPLE, produces = { MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody FunctionMemberModel findByExample(final @RequestBody Example<FunctionMemberModel> example) throws NotFoundEntityException {
		final Optional<FunctionMemberModel> result = findByFunctionMemberService.findByExample(example);
		
		if (!result.isPresent()) {
			throw new NotFoundEntityException();
		}
		
		return result.get();
	}
	
}
