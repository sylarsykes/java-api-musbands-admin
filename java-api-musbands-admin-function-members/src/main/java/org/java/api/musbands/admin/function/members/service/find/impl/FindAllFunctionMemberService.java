package org.java.api.musbands.admin.function.members.service.find.impl;

import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.FIND_ALL_SERVICE_NAME;

import java.util.List;
import java.util.stream.Collectors;

import org.java.api.musbands.admin.function.members.domain.FunctionMember;
import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;
import org.java.api.musbands.admin.function.members.repository.FunctionMemberRepository;
import org.java.api.musbands.admin.function.members.service.find.IFindAllFunctionMemberService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Implementation of the services of IFindAllFunctionMemberService
 * 
 * @see IFindAllFunctionMemberService
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(FIND_ALL_SERVICE_NAME)
public class FindAllFunctionMemberService implements IFindAllFunctionMemberService {

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
	public List<FunctionMemberModel> findAll() {
		final List<FunctionMember> sources = functionMemberRepository.findAll();
		
		return sources.stream().map((FunctionMember source) -> {
			return mapperToModel(source);
		}).collect(Collectors.toList());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <F extends Example<FunctionMemberModel>> List<FunctionMemberModel> findAllByExample(final F example) {
		final FunctionMember entity = mapperToEntity(example.getProbe());
		final Example<FunctionMember> exampleToFind = Example.of(entity, example.getMatcher());

		final List<FunctionMember> sources = functionMemberRepository.findAll(exampleToFind);
		
		return sources.stream().map((FunctionMember source) -> {
			return mapperToModel(source);
		}).collect(Collectors.toList());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <F extends Example<FunctionMemberModel>> List<FunctionMemberModel> findAllByExampleSortable(F example, Sort sort) {
		final FunctionMember entity = mapperToEntity(example.getProbe());
		final Example<FunctionMember> exampleToFind = Example.of(entity, example.getMatcher());

		final List<FunctionMember> sources = functionMemberRepository.findAll(exampleToFind, sort);
		
		return sources.stream().map((FunctionMember source) -> {
			return mapperToModel(source);
		}).collect(Collectors.toList());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<FunctionMemberModel> findAllById(Iterable<Integer> ids) {
		
		final List<FunctionMember> sources = functionMemberRepository.findAllById(ids);
		
		return sources.stream().map((FunctionMember source) -> {
			return mapperToModel(source);
		}).collect(Collectors.toList());
	}

}
