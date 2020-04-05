package org.java.api.musbands.admin.function.members.controller.find;

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
 * @author Juan
 *
 */
@RestController("functionMemberFindAllController")
@RequestMapping("api/admin/1.0/functionMembers")
public class FunctionMemberFindAllController {

	@Autowired
	private IFindAllFunctionMemberService findAllfunctionMemberService;
	
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
