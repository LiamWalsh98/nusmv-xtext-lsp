/*
 * generated by Xtext 2.21.0
 */
package org.xtext.nusmv.language.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class NuSMVAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/nusmv/language/parser/antlr/internal/InternalNuSMV.tokens");
	}
}
