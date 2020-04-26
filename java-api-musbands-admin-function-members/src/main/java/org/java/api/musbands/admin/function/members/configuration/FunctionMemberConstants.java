package org.java.api.musbands.admin.function.members.configuration;

/**
 * FunctionMemberConstants
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public final class FunctionMemberConstants {
	// CACHE //
	public static final String CACHE_NAME = "${musbands.admin.cache.cache-name}";
	public static final String CACHE_MANGER_BEAN_NAME = "${musbands.admin.cache.cache-manager}";

	// CONTROLLER //
	public static final String CONTROLLER_REQUEST_NAME = "functionMembers";
	public static final String CONTROLLER_NAME = "functionMemberController";
	public static final String FIND_ALL_CONTROLLER_NAME = "findAllFunctionMemberController";
	public static final String FIND_BY_CONTROLLER_NAME = "findByFunctionMemberController";
	public static final String CREATE_CONTROLLER_NAME = "createFunctionMemberController";

	// CONTROLLER PATH //
	public static final String CONTROLLER_REQUEST_MAPPING = "${spring.data.rest.base-path}/" + CONTROLLER_REQUEST_NAME;
	public static final String CONTROLLER_GET_FIND_BY_ID = "/findOne/id/{id}";
	public static final String CONTROLLER_GET_FIND_BY_NAME = "/findOne/name/{name}";
	public static final String CONTROLLER_GET_FIND_BY_EXAMPLE = "/findOne/example";
	public static final String CONTROLLER_GET_FIND_ALL_BY_EXAMPLE = "/findAll/example";
	public static final String CONTROLLER_GET_FIND_ALL_BY_EXAMPLE_SORTABLE = "/findAll/example/sort";
	public static final String CONTROLLER_PUT_UPDATE = "/{id}";
	public static final String CONTROLLER_DELETE_DELETE = "/{id}";

	// MAPPER //
	public static final String MAPPER_RESOURCE_FUNCTION = "functionMemberMapperToResourceFunction";
	public static final String MAPPER_RESOURCE_ASSEMBLER = "functionMemberResourceAssembler";
	public static final String MAPPER_ENTITY_FUNCTION = "functionMemberMapperToEntityFunction";
	public static final String MAPPER_AUDIT_ENTITY_FUNCTION = "functionMemberAuditMapperToEntityFunction";
	public static final String MAPPER_AUDIT_RESOURCE_FUNCTION = "functionMemberAuditMapperToResourceFunction";
	public static final String MAPPER_AUDIT_RESOURCE_ASSEMBLER = "functionMemberAuditResourceAssembler";
	public static final String MAPPER_SIMPLE_ENTITY_FUNCTION = "functionMemberSimpleMapperToEntityFunction";
	public static final String MAPPER_SIMPLE_RESOURCE_FUNCTION = "functionMemberSimpleMapperToResourceFunction";
	public static final String MAPPER_SIMPLE_RESOURCE_ASSEMBLER = "functionMemberSimpleResourceAssembler";

	// REPOSITORY //
	public static final String REPOSITORY_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_REST_RESOURCE_PATH = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_NAME = "functionMemberRepository";
	public static final String REPOSITORY_AUDIT_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_AUDIT_REST_RESOURCE_PATH = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_AUDIT_NAME = "functionMemberAuditRepository";
	public static final String REPOSITORY_SIMPLE_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_SIMPLE_REST_RESOURCE_PATH = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_SIMPLE_NAME = "functionMemberSimpleRepository";
	public static final String REPOSITORY_TABLE_NAME = "function_member";
	public static final String REPOSITORY_ENTITY_NAME = "functionMember";

	// RESOURCE //
	public static final String RESOURCE_BUILDER_NAME = "functionMemberResourceBuilder";
	public static final String RESOURCE_AUDIT_BUILDER_NAME = "functionMemberAuditResourceBuilder";
	public static final String RESOURCE_SIMPLE_BUILDER_NAME = "functionMemberSimpleResourceBuilder";
	public static final String RESOURCE_ASSEMBLER_NAME = "functionMemberResourceAssembler";
	public static final String MAILTO_BUILDER_NAME = "functionMemberMailTOBuilder";

	// SERVICE //
	public static final String FIND_ALL_SERVICE_NAME = "findAllFunctionMemberService";
	public static final String FIND_BY_SERVICE_NAME = "findByFunctionMemberService";
	public static final String SERVICE_AUDIT_NAME = "functionMemberAuditService";
	public static final String SERVICE_SIMPLE_NAME = "functionMemberSimpleService";

	// PRIVATE //
	/**
	 * The caller references the constants using
	 * <tt>FunctionMemberConstants.EMPTY_STRING</tt>, and so on. Thus, the caller
	 * should be prevented from constructing objects of this class, by declaring
	 * this private constructor.
	 */
	private FunctionMemberConstants() {
		throw new AssertionError();
	}

}
