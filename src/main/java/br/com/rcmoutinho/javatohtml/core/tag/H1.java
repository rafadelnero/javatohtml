package br.com.rcmoutinho.javatohtml.core.tag;

import java.util.LinkedHashMap;
import java.util.Map;

import br.com.rcmoutinho.javatohtml.core.Element;

/**
 * Implementação da tag HTML &lt;h1&gt;. <br>
 * <br>
 * Ref.: http://www.w3schools.com/tags/tag_hn.asp
 * 
 * @rcmoutinho
 * @author rodrigo.moutinho
 * @date 11 de jan de 2017
 * @email rcm1989@gmail.com
 */
public class H1 extends Element<H1> {

	@Override
	protected String getName() {
		return "h1";
	}

	@Override
	protected Map<String, String> getSpecificAttributesMap() {
		return new LinkedHashMap<String, String>();
	}

	@Override
	protected H1 getType() {
		return this;
	}
}