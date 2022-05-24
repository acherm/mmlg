/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.mmlg.ui.internal.MmlgActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MmlgExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MmlgActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MmlgActivator activator = MmlgActivator.getInstance();
		return activator != null ? activator.getInjector(MmlgActivator.ORG_XTEXT_EXAMPLE_MYDSL_MMLG) : null;
	}

}