package org.java.api.musbands.admin.function.members.model;

import java.time.LocalDateTime;

import javax.validation.constraints.Size;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.lang.Nullable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * Model FunctionMember
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 * @see https://js-joda.github.io/js-joda/manual/LocalDateTime.html
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
public class FunctionMemberModel extends RepresentationModel<FunctionMemberModel> {

	public static final int MAX_LENGTH_NAME = 256;
	public static final int MAX_LENGTH_DESCRIPTION = 10000;
	
	Integer id;
	
	@NonNull
	@Size(min = 1, max = MAX_LENGTH_NAME)
	String name;
	
	@Nullable
	@Size(min = 0, max = MAX_LENGTH_DESCRIPTION)
	String description;
	
	@NonNull
	String createdBy;

	@NonNull
	LocalDateTime createdDate;

	@Nullable
	String lastModifiedBy;

	@Nullable
	LocalDateTime lastModifiedDate;
	
}
