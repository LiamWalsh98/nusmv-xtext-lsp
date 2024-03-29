/*
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.nusmv.language.NuSMVRuntimeModule;
import org.xtext.nusmv.language.NuSMVStandaloneSetup;
import org.xtext.nusmv.language.ide.NuSMVIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class NuSMVWebSetup extends NuSMVStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new NuSMVRuntimeModule(), new NuSMVIdeModule(), new NuSMVWebModule()));
	}
	
}
