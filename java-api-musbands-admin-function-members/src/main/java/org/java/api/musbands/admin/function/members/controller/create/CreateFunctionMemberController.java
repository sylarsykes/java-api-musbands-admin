package org.java.api.musbands.admin.function.members.controller.create;

import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.CONTROLLER_REQUEST_MAPPING;
import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.CREATE_CONTROLLER_NAME;

import javax.validation.Valid;

import org.java.api.musbands.admin.function.members.exception.NotNullEntityException;
import org.java.api.musbands.admin.function.members.exception.SaveEntityException;
import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;
import org.java.api.musbands.admin.function.members.service.create.ICreateFunctionMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create function member controller
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@RestController(CREATE_CONTROLLER_NAME)
@RequestMapping(CONTROLLER_REQUEST_MAPPING)
public class CreateFunctionMemberController {

	@Autowired
	private ICreateFunctionMemberService createFunctionMemberService;

	/**
	 * Create function member
	 * 
	 * @param entity
	 * 
	 * @return FunctionMemberController
	 */
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = { MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.OK)
	public FunctionMemberModel create(final @RequestBody @Valid FunctionMemberModel entity) throws NotNullEntityException, SaveEntityException {
		final FunctionMemberModel create = createFunctionMemberService.create(entity);
		
		return create;
	}
}
