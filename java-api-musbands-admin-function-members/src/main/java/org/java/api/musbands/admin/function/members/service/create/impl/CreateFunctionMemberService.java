package org.java.api.musbands.admin.function.members.service.create.impl;

import org.java.api.musbands.admin.function.members.domain.FunctionMember;
import org.java.api.musbands.admin.function.members.exception.NotNullEntityException;
import org.java.api.musbands.admin.function.members.exception.SaveEntityException;
import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;
import org.java.api.musbands.admin.function.members.repository.FunctionMemberRepository;
import org.java.api.musbands.admin.function.members.service.create.ICreateFunctionMemberService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create function member service
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service("createFunctionMemberService")
public class CreateFunctionMemberService implements ICreateFunctionMemberService {

	@Autowired	
	private FunctionMemberRepository functionMemberRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionMemberModel create(FunctionMemberModel entity) throws NotNullEntityException, SaveEntityException {
		if (entity == null) {
			throw new NotNullEntityException();
		}
		
		FunctionMember functionMemberCreated = null;
		
		try {
			functionMemberCreated = functionMemberRepository.save(modelMapper.map(entity, FunctionMember.class));
		} catch (Exception e) {
			throw new SaveEntityException(e);
		}
		
		return modelMapper.map(functionMemberCreated, FunctionMemberModel.class);
	}

}
