package org.intellij.sdk.language;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.xml.IXmlLeafElementType;

public interface TweeTokenType {
    IElementType TWEE_START_MACRO_START = new IXmlLeafElementType("TWEE_START_MACRO_START");
    IElementType TWEE_MACRO_END = new IXmlLeafElementType("TWEE_MACRO_END");
}
