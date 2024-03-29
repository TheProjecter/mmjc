/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import ufc.ck017.mmjc.analysis.*;

@SuppressWarnings("nls")
public final class ABtrueExpression extends PExpression
{
    private TTrue _true_;

    public ABtrueExpression()
    {
        // Constructor
    }

    public ABtrueExpression(
        @SuppressWarnings("hiding") TTrue _true_)
    {
        // Constructor
        setTrue(_true_);

    }

    @Override
    public Object clone()
    {
        return new ABtrueExpression(
            cloneNode(this._true_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABtrueExpression(this);
    }

    public TTrue getTrue()
    {
        return this._true_;
    }

    public void setTrue(TTrue node)
    {
        if(this._true_ != null)
        {
            this._true_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._true_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._true_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._true_ == child)
        {
            this._true_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._true_ == oldChild)
        {
            setTrue((TTrue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

	@Override
	public int getLine() {
		return _true_.getLine();
	}

	@Override
	public int getPos() {
		return _true_.getPos();
	}
}
