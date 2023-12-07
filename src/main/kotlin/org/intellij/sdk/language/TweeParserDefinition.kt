package org.intellij.sdk.language

import com.intellij.lang.*
import com.intellij.lexer.HtmlLexer
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.*
import com.intellij.psi.tree.*
import com.intellij.psi.xml.XmlTokenType
import org.intellij.sdk.language.parser.TweeParser
import org.intellij.sdk.language.psi.*
import org.jetbrains.annotations.NotNull

class TweeParserDefinition : ParserDefinition {
    companion object {
        val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS: TokenSet = TokenSet.create(TweeTypes.COMMENT)
        val FILE: IFileElementType = IFileElementType(TweeLanguage)
    }

    @NotNull
    override fun createLexer(project: Project): Lexer {
        return TweeLexer()
    }

    @NotNull
    override fun getWhitespaceTokens(): TokenSet {
        return XmlTokenType.WHITESPACES;
    }

    @NotNull
    override fun getCommentTokens(): TokenSet {
        return XmlTokenType.COMMENTS;
    }

    @NotNull
    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    @NotNull
    override fun createParser(project: Project): PsiParser {
        return org.intellij.sdk.language.TweeParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return TweeFile(viewProvider)
    }

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    @NotNull
    override fun createElement(node: ASTNode): PsiElement {
        return TweeTypes.Factory.createElement(node)
    }
}
