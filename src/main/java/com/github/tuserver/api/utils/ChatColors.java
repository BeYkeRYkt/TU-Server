package com.github.tuserver.api.utils;

import java.util.Map;

import org.apache.commons.lang3.Validate;

import com.google.common.collect.Maps;

public enum ChatColors {
	BLACK('0'), DARK_BLUE('1'), DARK_GREEN('2'), DARK_AQUA('3'), DARK_RED('4'), DARK_PURPLE('5'), GOLD('6'), GRAY('7'), DARK_GRAY('8'), BLUE('9'), GREEN('a'), AQUA('b'), RED('c'), LIGHT_PURPLE('d'), YELLOW('e'), WHITE('f'), OBFUSCATED('k', true), BOLD('l', true), STRIKETHROUGH('m', true), UNDERLINE('n', true), ITALIC('o', true), RESET('r');

	private final char formattingCode;
	private final boolean fancyStyling;
	private final String controlString;
	private final static Map<Character, ChatColors> BY_CHAR = Maps.newHashMap();

	private ChatColors(char code) {
		this(code, false);
	}

	private ChatColors(char code, boolean fancyStyling) {
		this.formattingCode = code;
		this.fancyStyling = fancyStyling;
		this.controlString = "\u00a7" + code;
	}

	public char getFormattingCode() {
		return this.formattingCode;
	}

	public boolean isFancyStyling() {
		return this.fancyStyling;
	}

	public boolean isColor() {
		return !this.fancyStyling && this != RESET;
	}

	public String getFriendlyName() {
		return this.name().toLowerCase();
	}

	@Override
	public String toString() {
		return this.controlString;
	}

	public char getChar() {
		return formattingCode;
	}

	public static ChatColors getByChar(String code) {
		Validate.notNull(code, "Code cannot be null");
		Validate.isTrue(code.length() > 0, "Code must have at least one char");

		return BY_CHAR.get(code.charAt(0));
	}

	public static String translateAlternateColorCodes(char altColorChar, String textToTranslate) {
		char[] b = textToTranslate.toCharArray();
		for (int i = 0; i < b.length - 1; i++) {
			if (b[i] == altColorChar && "0123456789AaBbCcDdEeFfKkLlMmNnOoRr".indexOf(b[i + 1]) > -1) {
				b[i] = '\u00A7';
				b[i + 1] = Character.toLowerCase(b[i + 1]);
			}
		}
		return new String(b);
	}

	static {
		for (ChatColors color : values()) {
			BY_CHAR.put(color.getChar(), color);
		}
	}
}