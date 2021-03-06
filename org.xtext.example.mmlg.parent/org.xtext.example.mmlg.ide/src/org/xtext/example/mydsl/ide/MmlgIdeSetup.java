/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.MmlgRuntimeModule;
import org.xtext.example.mydsl.MmlgStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MmlgIdeSetup extends MmlgStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MmlgRuntimeModule(), new MmlgIdeModule()));
	}
	
}
