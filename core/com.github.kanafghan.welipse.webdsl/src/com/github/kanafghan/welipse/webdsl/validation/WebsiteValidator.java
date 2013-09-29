/**
 *
 * $Id$
 */
package com.github.kanafghan.welipse.webdsl.validation;

import com.github.kanafghan.welipse.webdsl.Page;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link com.github.kanafghan.welipse.webdsl.Website}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WebsiteValidator {
	boolean validate();

	boolean validatePages(EList<Page> value);
	boolean validateHome(Page value);
	boolean validateName(String value);
}
