// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package org.intellij.sdk.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class TweeParser implements PsiParser {

    @Override
    public @NotNull ASTNode parse(final @NotNull IElementType root, final @NotNull PsiBuilder builder) {
        parseWithoutBuildingTree(root, builder, createHtmlParsing(builder));
        return builder.getTreeBuilt();
    }

    public void parseWithoutBuildingTree(@NotNull IElementType root, @NotNull PsiBuilder builder) {
        parseWithoutBuildingTree(root, builder, createHtmlParsing(builder));
    }

    private static void parseWithoutBuildingTree(@NotNull IElementType root, @NotNull PsiBuilder builder,
                                                 @NotNull TweeParsing htmlParsing) {
        builder.enforceCommentTokens(TokenSet.EMPTY);
        final PsiBuilder.Marker file = builder.mark();
        htmlParsing.parseDocument();
        file.done(root);
    }

    // to be able to manage what tags treated as single
    protected @NotNull TweeParsing createHtmlParsing(@NotNull PsiBuilder builder) {
        return new TweeParsing(builder);
    }
}