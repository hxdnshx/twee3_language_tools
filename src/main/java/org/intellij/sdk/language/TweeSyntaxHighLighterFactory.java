package org.intellij.sdk.language;

import com.intellij.ide.highlighter.HtmlFileHighlighter;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import org.jetbrains.annotations.NotNull;

public class TweeSyntaxHighLighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {
    @Override
    protected @NotNull SyntaxHighlighter createHighlighter() {
        return new HtmlFileHighlighter();
    }
}