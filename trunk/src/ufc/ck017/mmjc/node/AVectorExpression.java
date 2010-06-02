/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import ufc.ck017.mmjc.analysis.*;
import ufc.ck017.mmjc.translate.tree.Exp;

@SuppressWarnings("nls")
public final class AVectorExpression extends PExpression
{
    private PExpression _l_;
    private PExpression _i_;

    public AVectorExpression()
    {
        // Constructor
    }

    public AVectorExpression(
        @SuppressWarnings("hiding") PExpression _l_,
        @SuppressWarnings("hiding") PExpression _i_)
    {
        // Constructor
        setL(_l_);

        setI(_i_);

    }

    @Override
    public Object clone()
    {
        return new AVectorExpression(
            cloneNode(this._l_),
            cloneNode(this._i_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVectorExpression(this);
    }

    public PExpression getL()
    {
        return this._l_;
    }

    public void setL(PExpression node)
    {
        if(this._l_ != null)
        {
            this._l_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._l_ = node;
    }

    public PExpression getI()
    {
        return this._i_;
    }

    public void setI(PExpression node)
    {
        if(this._i_ != null)
        {
            this._i_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._i_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._l_)
            + toString(this._i_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._l_ == child)
        {
            this._l_ = null;
            return;
        }

        if(this._i_ == child)
        {
            this._i_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._l_ == oldChild)
        {
            setL((PExpression) newChild);
            return;
        }

        if(this._i_ == oldChild)
        {
            setI((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

	@Override
	public int getLine() {
		return _l_.getLine();
	}

	@Override
	public int getPos() {
		return _l_.getPos();
	}
}
