package org.java.api.musbands.admin.function.members.service.find.impl;

import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.FIND_BY_SERVICE_NAME;

import java.util.Optional;

import org.java.api.musbands.admin.function.members.domain.FunctionMember;
import org.java.api.musbands.admin.function.members.exception.IncorrectResultSizeException;
import org.java.api.musbands.admin.function.members.exception.NotFoundEntityException;
import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;
import org.java.api.musbands.admin.function.members.repository.FunctionMemberRepository;
import org.java.api.musbands.admin.function.members.service.find.IFindByFunctionMemberService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * Implementation of the services of IFindByFunctionMemberService
 * 
 * @see IFindByFunctionMemberService
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(FIND_BY_SERVICE_NAME)
public class FindByFunctionMemberService implements IFindByFunctionMemberService {

	@Autowired	
	private FunctionMemberRepository functionMemberRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	/**
	 * Map entity to model
	 * 
	 * @param source
	 * 		Entity object
	 * 
	 * @return FunctionMemberModel
	 */
	private FunctionMemberModel mapperToModel(final FunctionMember source) {
		return modelMapper.map(source, FunctionMemberModel.class);
	}
	
	/**
	 * Map model to entity
	 * 
	 * @param source
	 * 		Model object
	 * 
	 * @return FunctionMember
	 */
	private FunctionMember mapperToEntity(final FunctionMemberModel source) {
		return modelMapper.map(source, FunctionMember.class);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Optional<FunctionMemberModel> findByExample(final Example<FunctionMemberModel> example) throws NotFoundEntityException, IncorrectResultSizeException {
		final FunctionMember entity = mapperToEntity(example.getProbe());
		
		final Example<FunctionMember> exampleToFind = Example.of(entity, example.getMatcher());

		final Optional<FunctionMember> source = functionMemberRepository.findOne(exampleToFind);
		
		// Convert entity to resource
		return Optional
				.of(source.flatMap((input) -> (input == null) ? Optional.empty() : Optional.of(mapperToModel(input)))
						.orElseThrow(NotFoundEntityException::new));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Optional<FunctionMemberModel> findById(final Integer id) throws NotFoundEntityException {
		
		final Optional<FunctionMember> source = functionMemberRepository.findById(id);
		
		// Convert entity to resource
		return Optional
				.of(source.flatMap((input) -> (input == null) ? Optional.empty() : Optional.of(mapperToModel(input)))
						.orElseThrow(NotFoundEntityException::new));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Optional<FunctionMemberModel> findByName(final String name) throws NotFoundEntityException, IncorrectResultSizeException {
		
		final Optional<FunctionMember> source = functionMemberRepository.findByName(name);
		
		// Convert entity to resource
		return Optional
				.of(source.flatMap((input) -> (input == null) ? Optional.empty() : Optional.of(mapperToModel(input)))
						.orElseThrow(NotFoundEntityException::new));
	}

}
