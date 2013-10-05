/**
 *
 * $Id$
 */
package com.github.kanafghan.welipse.webdsl.validation;

import org.eclipse.emf.ecore.ETypedElement;

/**
 * A sample validator interface for {@link com.github.kanafghan.welipse.webdsl.DynamicImage}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DynamicImageValidator {
	boolean validate();

	boolean validateSource(ETypedElement value);
}
