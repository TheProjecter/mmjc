/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.node;

import ufc.ck017.mmjc.symbolTable.TypeSymbol;

public abstract class PExpression extends Node
{
	// Edited to make type-checking easier
	protected TypeSymbol type = null;
	
	public void setType(TypeSymbol t) {
		type = t;
	}
	
	public TypeSymbol getType() {
		return type;
	}
}