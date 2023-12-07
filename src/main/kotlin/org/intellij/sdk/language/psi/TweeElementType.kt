package org.intellij.sdk.language.psi

import com.intellij.psi.tree.IElementType
import org.intellij.sdk.language.TweeLanguage
import org.jetbrains.annotations.NonNls

class TweeElementType(@NonNls debugName: String) : IElementType(debugName, TweeLanguage)
