package org.intellij.sdk.language

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory
import org.jetbrains.annotations.NotNull

/**
 * Note: This class is only used with the fileTypeFactory extension point
 * for versions of the IntelliJ Platform prior to v2019.2
 */
class TweeFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(@NotNull fileTypeConsumer: FileTypeConsumer) {
        fileTypeConsumer.consume(TweeFileType)
    }
}