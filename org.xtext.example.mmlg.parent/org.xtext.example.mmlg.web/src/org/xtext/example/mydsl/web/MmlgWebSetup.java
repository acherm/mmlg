/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.MmlgRuntimeModule;
import org.xtext.example.mydsl.MmlgStandaloneSetup;
import org.xtext.example.mydsl.ide.MmlgIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class MmlgWebSetup extends MmlgStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MmlgRuntimeModule(), new MmlgIdeModule(), new MmlgWebModule()));
	}
	
}
