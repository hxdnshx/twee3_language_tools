package org.intellij.sdk.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon
import org.intellij.sdk.language.TweeIcons

object TweeFileType : LanguageFileType(TweeLanguage) {

    override fun getName(): String = "Twee file"

    override fun getDescription(): String = "Twee language file"

    override fun getDefaultExtension(): String = "twee"

    override fun getIcon(): Icon? = TweeIcons.FILE
}
