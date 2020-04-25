module musbands.api.admin.function.members {
	exports org.java.api.musbands.admin.function.members.domain;

	requires java.desktop;
	requires java.persistence;
	requires spring.data.commons;
	requires lombok;
	requires spring.core;
	requires spring.hateoas;
	requires spring.data.jpa;
	requires spring.data.rest.core;
	requires java.transaction;
	requires spring.web;
	requires spring.beans;
	requires modelmapper;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires java.validation;
	requires org.apache.tomcat.embed.core;
}