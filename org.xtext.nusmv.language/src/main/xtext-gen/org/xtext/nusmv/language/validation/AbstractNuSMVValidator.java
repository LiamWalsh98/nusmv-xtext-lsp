/*
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractNuSMVValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.nusmv.language.nuSMV.NuSMVPackage.eINSTANCE);
		return result;
	}
}
