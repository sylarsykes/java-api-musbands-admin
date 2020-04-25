package org.java.api.musbands.admin.function.members.service.find.impl;

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
 * Find all function member services
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service("findAllFunctionMemberService")
public class FindAllFunctionMemberService implements IFindAllFunctionMemberService {

	@Autowired	
	private FunctionMemberRepository functionMemberRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<FunctionMemberModel> findAll() {
		final List<FunctionMember> sources = functionMemberRepository.findAll();
		
		return sources.stream().map((FunctionMember source) -> {
			return modelMapper.map(source, FunctionMemberModel.class);
		}).collect(Collectors.toList());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <F extends Example<FunctionMemberModel>> List<FunctionMemberModel> findAllByExample(F example) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <F extends Example<FunctionMemberModel>> List<FunctionMemberModel> findAllByExampleSortable(F example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<FunctionMemberModel> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

}
