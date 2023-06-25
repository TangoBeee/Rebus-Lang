import java.util.HashMap;
import java.util.Map;

public class RebusInterpreter extends RebusBaseVisitor<Object> {
    private final Map<String, Object> variables = new HashMap<>();

    @Override
    public Object visitVariableDeclaration(RebusParser.VariableDeclarationContext ctx) {
        String id = ctx.ID().getText();
        if (ctx.expression() != null) {
            Object value = visit(ctx.expression());
            variables.put(id, value);
        } else {
            variables.put(id, null);
        }
        return null;
    }

    @Override
    public Object visitVariableAssignment(RebusParser.VariableAssignmentContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expression());
        variables.put(id, value);
        return null;
    }

    @Override
    public Object visitPrintStatement(RebusParser.PrintStatementContext ctx) {
        Object value = visit(ctx.expression());
        System.out.println(value);
        return null;
    }

    @Override
    public Object visitExpression(RebusParser.ExpressionContext ctx) {
        if (ctx.atom() != null) {
            return visit(ctx.atom());
        } else if (ctx.op != null) {
            Object left = visit(ctx.expression(0));
            Object right = visit(ctx.expression(1));
            switch (ctx.op.getType()) {
                case RebusParser.ADD -> {
                    return (int) left + (int) right;
                }
                case RebusParser.SUB -> {
                    return (int) left - (int) right;
                }
                case RebusParser.MUL -> {
                    return (int) left * (int) right;
                }
                case RebusParser.DIV -> {
                    return (int) left / (int) right;
                }
            }
        } else if (ctx.expression().size() == 1) {
            return visit(ctx.expression(0));
        } else if (ctx.SUB() != null) {
            return -(int) visit(ctx.expression(0));
        }
        return null;
    }

    @Override
    public Object visitAtom(RebusParser.AtomContext ctx) {
        if (ctx.ID() != null) {
            return variables.get(ctx.ID().getText());
        } else if (ctx.INT() != null) {
            return Integer.parseInt(ctx.INT().getText());
        } else if (ctx.STRING() != null) {
            return ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1);
        }
        return null;
    }
}