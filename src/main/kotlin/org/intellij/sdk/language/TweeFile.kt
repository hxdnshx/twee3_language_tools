package org.intellij.sdk.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.intellij.sdk.language.TweeFileType
import org.intellij.sdk.language.TweeLanguage
import org.jetbrains.annotations.NotNull

class TweeFile(@NotNull viewProvider: FileViewProvider) : PsiFileBase(viewProvider, TweeLanguage) {

    override fun getFileType(): FileType = TweeFileType

    override fun toString(): String = "Twee File"
}
