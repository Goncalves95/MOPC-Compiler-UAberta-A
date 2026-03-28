# Generated from grammar/MOCP.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .MOCPParser import MOCPParser
else:
    from MOCPParser import MOCPParser

# This class defines a complete generic visitor for a parse tree produced by MOCPParser.

class MOCPVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MOCPParser#program.
    def visitProgram(self, ctx:MOCPParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCPParser#principal_func.
    def visitPrincipal_func(self, ctx:MOCPParser.Principal_funcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCPParser#block.
    def visitBlock(self, ctx:MOCPParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCPParser#statement.
    def visitStatement(self, ctx:MOCPParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCPParser#declaration.
    def visitDeclaration(self, ctx:MOCPParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCPParser#tipo.
    def visitTipo(self, ctx:MOCPParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCPParser#assignment.
    def visitAssignment(self, ctx:MOCPParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCPParser#return_stmt.
    def visitReturn_stmt(self, ctx:MOCPParser.Return_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCPParser#function_call.
    def visitFunction_call(self, ctx:MOCPParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCPParser#expr.
    def visitExpr(self, ctx:MOCPParser.ExprContext):
        return self.visitChildren(ctx)



del MOCPParser