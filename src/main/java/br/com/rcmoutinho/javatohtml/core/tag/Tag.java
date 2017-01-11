package br.com.rcmoutinho.javatohtml.core.tag;

import java.util.LinkedHashMap;
import java.util.Map;

import br.com.rcmoutinho.javatohtml.core.Element;

/**
 * Implementação genérica para tag HTML &lt;???&gt; desejada. <br>
 * Utilizar apenas nos casos onde a tag não tem suporte nativo.
 * 
 * @rcmoutinho
 * @author rodrigo.moutinho
 * @date 11 de jan de 2017
 * @email rcm1989@gmail.com
 */
public class Tag extends Element<Tag> {

	private String name;

	/**
	 * Define the tag name.
	 * 
	 * @param name
	 *            {@link String}
	 */
	public Tag(String name) {
		this.name = name;
	}

	@Override
	protected String getName() {
		return this.name;
	}

	@Override
	protected Map<String, String> getSpecificAttributesMap() {
		return new LinkedHashMap<String, String>();
	}

	@Override
	protected Tag getType() {
		return this;
	}
}