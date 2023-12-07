package org.intellij.sdk.language.psi

import com.intellij.psi.tree.IElementType
import org.intellij.sdk.language.TweeLanguage
import org.jetbrains.annotations.NonNls

class TweeTokenType(@NonNls debugName: String) : IElementType(debugName, TweeLanguage) {
    override fun toString(): String {
        return "TweeTokenType.${super.toString()}"
    }
}
