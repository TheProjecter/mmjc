/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.analysis;

import java.util.*;
import ufc.ck017.mmjc.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPProgram().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        {
            List<PNextclass> copy = new ArrayList<PNextclass>(node.getNextclass());
            Collections.reverse(copy);
            for(PNextclass e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getMainclass() != null)
        {
            node.getMainclass().apply(this);
        }
        outAProgram(node);
    }

    public void inAMainclass(AMainclass node)
    {
        defaultIn(node);
    }

    public void outAMainclass(AMainclass node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMainclass(AMainclass node)
    {
        inAMainclass(node);
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            Collections.reverse(copy);
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAn() != null)
        {
            node.getAn().apply(this);
        }
        if(node.getCn() != null)
        {
            node.getCn().apply(this);
        }
        outAMainclass(node);
    }

    public void inAExtNextclass(AExtNextclass node)
    {
        defaultIn(node);
    }

    public void outAExtNextclass(AExtNextclass node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExtNextclass(AExtNextclass node)
    {
        inAExtNextclass(node);
        {
            List<PMethod> copy = new ArrayList<PMethod>(node.getMethod());
            Collections.reverse(copy);
            for(PMethod e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVar());
            Collections.reverse(copy);
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExt() != null)
        {
            node.getExt().apply(this);
        }
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAExtNextclass(node);
    }

    public void inANonextNextclass(ANonextNextclass node)
    {
        defaultIn(node);
    }

    public void outANonextNextclass(ANonextNextclass node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANonextNextclass(ANonextNextclass node)
    {
        inANonextNextclass(node);
        {
            List<PMethod> copy = new ArrayList<PMethod>(node.getMethod());
            Collections.reverse(copy);
            for(PMethod e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVar());
            Collections.reverse(copy);
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outANonextNextclass(node);
    }

    public void inAVar(AVar node)
    {
        defaultIn(node);
    }

    public void outAVar(AVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVar(AVar node)
    {
        inAVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAVar(node);
    }

    public void inAMethod(AMethod node)
    {
        defaultIn(node);
    }

    public void outAMethod(AMethod node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMethod(AMethod node)
    {
        inAMethod(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            Collections.reverse(copy);
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PVar> copy = new ArrayList<PVar>(node.getLocal());
            Collections.reverse(copy);
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PVar> copy = new ArrayList<PVar>(node.getParam());
            Collections.reverse(copy);
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAMethod(node);
    }

    public void inAIfStatement(AIfStatement node)
    {
        defaultIn(node);
    }

    public void outAIfStatement(AIfStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfStatement(AIfStatement node)
    {
        inAIfStatement(node);
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getI() != null)
        {
            node.getI().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAIfStatement(node);
    }

    public void inAVatbStatement(AVatbStatement node)
    {
        defaultIn(node);
    }

    public void outAVatbStatement(AVatbStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVatbStatement(AVatbStatement node)
    {
        inAVatbStatement(node);
        if(node.getV() != null)
        {
            node.getV().apply(this);
        }
        if(node.getI() != null)
        {
            node.getI().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAVatbStatement(node);
    }

    public void inAAtbStatement(AAtbStatement node)
    {
        defaultIn(node);
    }

    public void outAAtbStatement(AAtbStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtbStatement(AAtbStatement node)
    {
        inAAtbStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAAtbStatement(node);
    }

    public void inAWhileStatement(AWhileStatement node)
    {
        defaultIn(node);
    }

    public void outAWhileStatement(AWhileStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileStatement(AWhileStatement node)
    {
        inAWhileStatement(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAWhileStatement(node);
    }

    public void inAPrintStatement(APrintStatement node)
    {
        defaultIn(node);
    }

    public void outAPrintStatement(APrintStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrintStatement(APrintStatement node)
    {
        inAPrintStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAPrintStatement(node);
    }

    public void inAManyStatement(AManyStatement node)
    {
        defaultIn(node);
    }

    public void outAManyStatement(AManyStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAManyStatement(AManyStatement node)
    {
        inAManyStatement(node);
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            Collections.reverse(copy);
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAManyStatement(node);
    }

    public void inAMcallExpression(AMcallExpression node)
    {
        defaultIn(node);
    }

    public void outAMcallExpression(AMcallExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMcallExpression(AMcallExpression node)
    {
        inAMcallExpression(node);
        {
            List<PExpression> copy = new ArrayList<PExpression>(node.getPar());
            Collections.reverse(copy);
            for(PExpression e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getObj() != null)
        {
            node.getObj().apply(this);
        }
        outAMcallExpression(node);
    }

    public void inAPlusExpression(APlusExpression node)
    {
        defaultIn(node);
    }

    public void outAPlusExpression(APlusExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExpression(APlusExpression node)
    {
        inAPlusExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAPlusExpression(node);
    }

    public void inAMinusExpression(AMinusExpression node)
    {
        defaultIn(node);
    }

    public void outAMinusExpression(AMinusExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpression(AMinusExpression node)
    {
        inAMinusExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMinusExpression(node);
    }

    public void inAMultExpression(AMultExpression node)
    {
        defaultIn(node);
    }

    public void outAMultExpression(AMultExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExpression(AMultExpression node)
    {
        inAMultExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAMultExpression(node);
    }

    public void inAAndExpression(AAndExpression node)
    {
        defaultIn(node);
    }

    public void outAAndExpression(AAndExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndExpression(AAndExpression node)
    {
        inAAndExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAAndExpression(node);
    }

    public void inAGthanExpression(AGthanExpression node)
    {
        defaultIn(node);
    }

    public void outAGthanExpression(AGthanExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGthanExpression(AGthanExpression node)
    {
        inAGthanExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAGthanExpression(node);
    }

    public void inALthanExpression(ALthanExpression node)
    {
        defaultIn(node);
    }

    public void outALthanExpression(ALthanExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALthanExpression(ALthanExpression node)
    {
        inALthanExpression(node);
        if(node.getR() != null)
        {
            node.getR().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outALthanExpression(node);
    }

    public void inAVectorExpression(AVectorExpression node)
    {
        defaultIn(node);
    }

    public void outAVectorExpression(AVectorExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVectorExpression(AVectorExpression node)
    {
        inAVectorExpression(node);
        if(node.getI() != null)
        {
            node.getI().apply(this);
        }
        if(node.getL() != null)
        {
            node.getL().apply(this);
        }
        outAVectorExpression(node);
    }

    public void inALengthExpression(ALengthExpression node)
    {
        defaultIn(node);
    }

    public void outALengthExpression(ALengthExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALengthExpression(ALengthExpression node)
    {
        inALengthExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outALengthExpression(node);
    }

    public void inANotExpression(ANotExpression node)
    {
        defaultIn(node);
    }

    public void outANotExpression(ANotExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotExpression(ANotExpression node)
    {
        inANotExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outANotExpression(node);
    }

    public void inANewvecExpression(ANewvecExpression node)
    {
        defaultIn(node);
    }

    public void outANewvecExpression(ANewvecExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANewvecExpression(ANewvecExpression node)
    {
        inANewvecExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outANewvecExpression(node);
    }

    public void inAVarExpression(AVarExpression node)
    {
        defaultIn(node);
    }

    public void outAVarExpression(AVarExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarExpression(AVarExpression node)
    {
        inAVarExpression(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAVarExpression(node);
    }

    public void inANewobjExpression(ANewobjExpression node)
    {
        defaultIn(node);
    }

    public void outANewobjExpression(ANewobjExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANewobjExpression(ANewobjExpression node)
    {
        inANewobjExpression(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outANewobjExpression(node);
    }

    public void inANumberExpression(ANumberExpression node)
    {
        defaultIn(node);
    }

    public void outANumberExpression(ANumberExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberExpression(ANumberExpression node)
    {
        inANumberExpression(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberExpression(node);
    }

    public void inABtrueExpression(ABtrueExpression node)
    {
        defaultIn(node);
    }

    public void outABtrueExpression(ABtrueExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABtrueExpression(ABtrueExpression node)
    {
        inABtrueExpression(node);
        outABtrueExpression(node);
    }

    public void inABfalseExpression(ABfalseExpression node)
    {
        defaultIn(node);
    }

    public void outABfalseExpression(ABfalseExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABfalseExpression(ABfalseExpression node)
    {
        inABfalseExpression(node);
        outABfalseExpression(node);
    }

    public void inASelfExpression(ASelfExpression node)
    {
        defaultIn(node);
    }

    public void outASelfExpression(ASelfExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASelfExpression(ASelfExpression node)
    {
        inASelfExpression(node);
        outASelfExpression(node);
    }

    public void inAInttType(AInttType node)
    {
        defaultIn(node);
    }

    public void outAInttType(AInttType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInttType(AInttType node)
    {
        inAInttType(node);
        if(node.getIntt() != null)
        {
            node.getIntt().apply(this);
        }
        outAInttType(node);
    }

    public void inAIntvType(AIntvType node)
    {
        defaultIn(node);
    }

    public void outAIntvType(AIntvType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntvType(AIntvType node)
    {
        inAIntvType(node);
        if(node.getIntv() != null)
        {
            node.getIntv().apply(this);
        }
        outAIntvType(node);
    }

    public void inABoolType(ABoolType node)
    {
        defaultIn(node);
    }

    public void outABoolType(ABoolType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolType(ABoolType node)
    {
        inABoolType(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outABoolType(node);
    }

    public void inAClassType(AClassType node)
    {
        defaultIn(node);
    }

    public void outAClassType(AClassType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAClassType(AClassType node)
    {
        inAClassType(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAClassType(node);
    }
}