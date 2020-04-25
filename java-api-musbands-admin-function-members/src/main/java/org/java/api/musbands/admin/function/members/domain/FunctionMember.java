package org.java.api.musbands.admin.function.members.domain;

import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.REPOSITORY_ENTITY_NAME;
import static org.java.api.musbands.admin.function.members.configuration.FunctionMemberConstants.REPOSITORY_TABLE_NAME;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
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
 * Entity FunctionMember
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Table(name = REPOSITORY_TABLE_NAME)
@Entity(name = REPOSITORY_ENTITY_NAME)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder(toBuilder = true)
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
@EntityListeners({ AuditingEntityListener.class })
public class FunctionMember implements Persistable<Integer> {

	public static final int MAX_LENGTH_NAME = 256;
	public static final int MAX_LENGTH_DESCRIPTION = 10000;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	Integer id;

	@Column(name = "name", nullable = false, unique = true, length = MAX_LENGTH_NAME)
	@NonNull
	@Size(min = 1, max = MAX_LENGTH_NAME)
	String name;
	
	@Column(name = "description", nullable = true, columnDefinition = "TEXT", length = MAX_LENGTH_DESCRIPTION)
	@Nullable
	@Size(min = 0, max = MAX_LENGTH_DESCRIPTION)
	String description;
	
	@Column(name = "created_by", nullable = false, insertable = true, updatable = false, length = 60)
	@NonNull
	@CreatedBy
	String createdBy;

	@Column(name = "created_date", nullable = false, insertable = true, updatable = false)
	@NonNull
	@CreatedDate
	LocalDateTime createdDate;

	@Column(name = "last_modify_by", nullable = true, insertable = false, updatable = true, length = 60)
	@Nullable
	@LastModifiedBy
	String lastModifiedBy;

	@Column(name = "last_modified_date", nullable = true, insertable = false, updatable = true)
	@Nullable
	@LastModifiedDate
	LocalDateTime lastModifiedDate;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isNew() {
		return null == getId();
	}

}
