package org.java.api.musbands.admin.function.members.repository;

import javax.transaction.Transactional;

import org.java.api.musbands.admin.function.members.domain.FunctionMember;
import org.java.api.musbands.admin.function.members.model.FunctionMemberModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * FunctionMember Rest Repository
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@RepositoryDefinition(domainClass = FunctionMember.class, idClass = Integer.class)
@RepositoryRestResource(collectionResourceRel = "functionMembers", 
	collectionResourceDescription = @Description("FunctionMember Rest Repository"), 
		excerptProjection = FunctionMemberModel.class, itemResourceRel = "functionMember", path = "functionMembers")
@Transactional
public interface FunctionMemberRepository extends JpaRepository<FunctionMember, Integer> {

}
