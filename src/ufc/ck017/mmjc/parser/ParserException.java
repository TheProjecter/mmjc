/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.parser;

import ufc.ck017.mmjc.node.*;

@SuppressWarnings("serial")
public class ParserException extends Exception
{
    Token token;

    public ParserException(@SuppressWarnings("hiding") Token token, String  message)
    {
        super(message);
        this.token = token;
    }

    public Token getToken()
    {
        return this.token;
    }
}
