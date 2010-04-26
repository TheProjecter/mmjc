/* This file was generated by SableCC (http://www.sablecc.org/). */

package ufc.ck017.mmjc.lexer;

import java.io.*;
import ufc.ck017.mmjc.node.*;

@SuppressWarnings("nls")
public class Lexer
{
    protected Token token;
    protected State state = State.INITIAL;

    private PushbackReader in;
    private int line;
    private int pos;
    private boolean cr;
    private boolean eof;
    private final StringBuffer text = new StringBuffer();

    @SuppressWarnings("unused")
    protected void filter() throws LexerException, IOException
    {
        // Do nothing
    }

    public Lexer(@SuppressWarnings("hiding") PushbackReader in)
    {
        this.in = in;
    }
 
    public Token peek() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        return this.token;
    }

    public Token next() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        Token result = this.token;
        this.token = null;
        return result;
    }

    protected Token getToken() throws IOException, LexerException
    {
        int dfa_state = 0;

        int start_pos = this.pos;
        int start_line = this.line;

        int accept_state = -1;
        int accept_token = -1;
        int accept_length = -1;
        int accept_pos = -1;
        int accept_line = -1;

        @SuppressWarnings("hiding") int[][][] gotoTable = Lexer.gotoTable[this.state.id()];
        @SuppressWarnings("hiding") int[] accept = Lexer.accept[this.state.id()];
        this.text.setLength(0);

        while(true)
        {
            int c = getChar();

            if(c != -1)
            {
                switch(c)
                {
                case 10:
                    if(this.cr)
                    {
                        this.cr = false;
                    }
                    else
                    {
                        this.line++;
                        this.pos = 0;
                    }
                    break;
                case 13:
                    this.line++;
                    this.pos = 0;
                    this.cr = true;
                    break;
                default:
                    this.pos++;
                    this.cr = false;
                    break;
                }

                this.text.append((char) c);

                do
                {
                    int oldState = (dfa_state < -1) ? (-2 -dfa_state) : dfa_state;

                    dfa_state = -1;

                    int[][] tmp1 =  gotoTable[oldState];
                    int low = 0;
                    int high = tmp1.length - 1;

                    while(low <= high)
                    {
                        int middle = (low + high) / 2;
                        int[] tmp2 = tmp1[middle];

                        if(c < tmp2[0])
                        {
                            high = middle - 1;
                        }
                        else if(c > tmp2[1])
                        {
                            low = middle + 1;
                        }
                        else
                        {
                            dfa_state = tmp2[2];
                            break;
                        }
                    }
                }while(dfa_state < -1);
            }
            else
            {
                dfa_state = -1;
            }

            if(dfa_state >= 0)
            {
                if(accept[dfa_state] != -1)
                {
                    accept_state = dfa_state;
                    accept_token = accept[dfa_state];
                    accept_length = this.text.length();
                    accept_pos = this.pos;
                    accept_line = this.line;
                }
            }
            else
            {
                if(accept_state != -1)
                {
                    switch(accept_token)
                    {
                    case 0:
                        {
                            @SuppressWarnings("hiding") Token token = new0(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 1:
                        {
                            @SuppressWarnings("hiding") Token token = new1(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 2:
                        {
                            @SuppressWarnings("hiding") Token token = new2(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 3:
                        {
                            @SuppressWarnings("hiding") Token token = new3(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 4:
                        {
                            @SuppressWarnings("hiding") Token token = new4(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 5:
                        {
                            @SuppressWarnings("hiding") Token token = new5(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 6:
                        {
                            @SuppressWarnings("hiding") Token token = new6(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 7:
                        {
                            @SuppressWarnings("hiding") Token token = new7(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 8:
                        {
                            @SuppressWarnings("hiding") Token token = new8(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 9:
                        {
                            @SuppressWarnings("hiding") Token token = new9(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 10:
                        {
                            @SuppressWarnings("hiding") Token token = new10(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 11:
                        {
                            @SuppressWarnings("hiding") Token token = new11(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 12:
                        {
                            @SuppressWarnings("hiding") Token token = new12(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 13:
                        {
                            @SuppressWarnings("hiding") Token token = new13(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 14:
                        {
                            @SuppressWarnings("hiding") Token token = new14(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 15:
                        {
                            @SuppressWarnings("hiding") Token token = new15(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 16:
                        {
                            @SuppressWarnings("hiding") Token token = new16(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 17:
                        {
                            @SuppressWarnings("hiding") Token token = new17(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 18:
                        {
                            @SuppressWarnings("hiding") Token token = new18(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 19:
                        {
                            @SuppressWarnings("hiding") Token token = new19(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 20:
                        {
                            @SuppressWarnings("hiding") Token token = new20(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 21:
                        {
                            @SuppressWarnings("hiding") Token token = new21(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 22:
                        {
                            @SuppressWarnings("hiding") Token token = new22(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 23:
                        {
                            @SuppressWarnings("hiding") Token token = new23(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 24:
                        {
                            @SuppressWarnings("hiding") Token token = new24(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 25:
                        {
                            @SuppressWarnings("hiding") Token token = new25(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 26:
                        {
                            @SuppressWarnings("hiding") Token token = new26(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 27:
                        {
                            @SuppressWarnings("hiding") Token token = new27(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 28:
                        {
                            @SuppressWarnings("hiding") Token token = new28(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 29:
                        {
                            @SuppressWarnings("hiding") Token token = new29(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 30:
                        {
                            @SuppressWarnings("hiding") Token token = new30(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 31:
                        {
                            @SuppressWarnings("hiding") Token token = new31(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 32:
                        {
                            @SuppressWarnings("hiding") Token token = new32(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 33:
                        {
                            @SuppressWarnings("hiding") Token token = new33(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 34:
                        {
                            @SuppressWarnings("hiding") Token token = new34(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 35:
                        {
                            @SuppressWarnings("hiding") Token token = new35(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 36:
                        {
                            @SuppressWarnings("hiding") Token token = new36(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 37:
                        {
                            @SuppressWarnings("hiding") Token token = new37(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 38:
                        {
                            @SuppressWarnings("hiding") Token token = new38(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    }
                }
                else
                {
                    if(this.text.length() > 0)
                    {
                        throw new LexerException(
                            "[" + (start_line + 1) + "," + (start_pos + 1) + "]" +
                            " Unknown token: " + this.text);
                    }

                    @SuppressWarnings("hiding") EOF token = new EOF(
                        start_line + 1,
                        start_pos + 1);
                    return token;
                }
            }
        }
    }

    Token new0(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TIntt(line, pos); }
    Token new1(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TIntv(text, line, pos); }
    Token new2(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBool(line, pos); }
    Token new3(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TClasstk(line, pos); }
    Token new4(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPublic(line, pos); }
    Token new5(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TExtends(line, pos); }
    Token new6(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TIf(line, pos); }
    Token new7(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TWhile(line, pos); }
    Token new8(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TElse(line, pos); }
    Token new9(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TReturn(line, pos); }
    Token new10(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTrue(line, pos); }
    Token new11(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TFalse(line, pos); }
    Token new12(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TThis(line, pos); }
    Token new13(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNew(line, pos); }
    Token new14(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLength(line, pos); }
    Token new15(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TString(line, pos); }
    Token new16(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TMain(text, line, pos); }
    Token new17(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPrint(line, pos); }
    Token new18(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLbrace(line, pos); }
    Token new19(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRbrace(line, pos); }
    Token new20(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLparen(line, pos); }
    Token new21(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRparen(line, pos); }
    Token new22(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLcurbr(line, pos); }
    Token new23(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRcurbr(line, pos); }
    Token new24(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDot(line, pos); }
    Token new25(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TComma(line, pos); }
    Token new26(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TSemi(line, pos); }
    Token new27(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPlus(line, pos); }
    Token new28(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TMinus(line, pos); }
    Token new29(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTimes(line, pos); }
    Token new30(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TGthan(line, pos); }
    Token new31(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLthan(line, pos); }
    Token new32(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TAnd(line, pos); }
    Token new33(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNeg(line, pos); }
    Token new34(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBe(line, pos); }
    Token new35(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TId(text, line, pos); }
    Token new36(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNumber(text, line, pos); }
    Token new37(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBlank(text, line, pos); }
    Token new38(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TComment(text, line, pos); }

    private int getChar() throws IOException
    {
        if(this.eof)
        {
            return -1;
        }

        int result = this.in.read();

        if(result == -1)
        {
            this.eof = true;
        }

        return result;
    }

    private void pushBack(int acceptLength) throws IOException
    {
        int length = this.text.length();
        for(int i = length - 1; i >= acceptLength; i--)
        {
            this.eof = false;

            this.in.unread(this.text.charAt(i));
        }
    }

    protected void unread(@SuppressWarnings("hiding") Token token) throws IOException
    {
        @SuppressWarnings("hiding") String text = token.getText();
        int length = text.length();

        for(int i = length - 1; i >= 0; i--)
        {
            this.eof = false;

            this.in.unread(text.charAt(i));
        }

        this.pos = token.getPos() - 1;
        this.line = token.getLine() - 1;
    }

    private String getText(int acceptLength)
    {
        StringBuffer s = new StringBuffer(acceptLength);
        for(int i = 0; i < acceptLength; i++)
        {
            s.append(this.text.charAt(i));
        }

        return s.toString();
    }

    private static int[][][][] gotoTable;
/*  {
        { // INITIAL
            {{9, 9, 1}, {10, 10, 2}, {13, 13, 3}, {32, 32, 4}, {33, 33, 5}, {38, 38, 6}, {40, 40, 7}, {41, 41, 8}, {42, 42, 9}, {43, 43, 10}, {44, 44, 11}, {45, 45, 12}, {46, 46, 13}, {47, 47, 14}, {49, 57, 15}, {59, 59, 16}, {60, 60, 17}, {61, 61, 18}, {62, 62, 19}, {65, 82, 20}, {83, 83, 21}, {84, 90, 20}, {91, 91, 22}, {93, 93, 23}, {97, 97, 20}, {98, 98, 24}, {99, 99, 25}, {100, 100, 20}, {101, 101, 26}, {102, 102, 27}, {103, 104, 20}, {105, 105, 28}, {106, 107, 20}, {108, 108, 29}, {109, 109, 20}, {110, 110, 30}, {111, 111, 20}, {112, 112, 31}, {113, 113, 20}, {114, 114, 32}, {115, 115, 20}, {116, 116, 33}, {117, 118, 20}, {119, 119, 34}, {120, 122, 20}, {123, 123, 35}, {125, 125, 36}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {{9, 9, 1}, {10, 10, 37}, {13, 32, -2}, },
            {{9, 32, -2}, },
            {},
            {{38, 38, 38}, },
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {{42, 42, 39}, {47, 47, 40}, },
            {{48, 57, 41}, },
            {},
            {},
            {},
            {},
            {{48, 57, 42}, {65, 90, 43}, {95, 95, 44}, {97, 122, 43}, },
            {{48, 95, -22}, {97, 115, 43}, {116, 116, 45}, {117, 120, 43}, {121, 121, 46}, {122, 122, 43}, },
            {},
            {},
            {{48, 95, -22}, {97, 110, 43}, {111, 111, 47}, {112, 122, 43}, },
            {{48, 95, -22}, {97, 107, 43}, {108, 108, 48}, {109, 122, 43}, },
            {{48, 107, -27}, {108, 108, 49}, {109, 119, 43}, {120, 120, 50}, {121, 122, 43}, },
            {{48, 95, -22}, {97, 97, 51}, {98, 122, 43}, },
            {{48, 95, -22}, {97, 101, 43}, {102, 102, 52}, {103, 109, 43}, {110, 110, 53}, {111, 122, 43}, },
            {{48, 95, -22}, {97, 100, 43}, {101, 101, 54}, {102, 122, 43}, },
            {{48, 100, -31}, {101, 101, 55}, {102, 122, 43}, },
            {{48, 95, -22}, {97, 116, 43}, {117, 117, 56}, {118, 122, 43}, },
            {{48, 100, -31}, {101, 101, 57}, {102, 122, 43}, },
            {{48, 95, -22}, {97, 103, 43}, {104, 104, 58}, {105, 113, 43}, {114, 114, 59}, {115, 122, 43}, },
            {{48, 103, -35}, {104, 104, 60}, {105, 122, 43}, },
            {},
            {},
            {{9, 32, -2}, },
            {},
            {{0, 41, 61}, {42, 42, 62}, {43, 4095, 61}, },
            {{0, 9, 63}, {10, 10, 64}, {11, 12, 63}, {13, 13, 65}, {14, 4095, 63}, },
            {{48, 57, 41}, },
            {{48, 122, -22}, },
            {{48, 122, -22}, },
            {{48, 122, -22}, },
            {{48, 95, -22}, {97, 113, 43}, {114, 114, 66}, {115, 122, 43}, },
            {{48, 95, -22}, {97, 114, 43}, {115, 115, 67}, {116, 122, 43}, },
            {{48, 110, -26}, {111, 111, 68}, {112, 122, 43}, },
            {{48, 95, -22}, {97, 97, 69}, {98, 122, 43}, },
            {{48, 114, -48}, {115, 115, 70}, {116, 122, 43}, },
            {{48, 115, -23}, {116, 116, 71}, {117, 122, 43}, },
            {{48, 107, -27}, {108, 108, 72}, {109, 122, 43}, },
            {{48, 122, -22}, },
            {{48, 115, -23}, {116, 116, 73}, {117, 122, 43}, },
            {{48, 95, -22}, {97, 109, 43}, {110, 110, 74}, {111, 122, 43}, },
            {{48, 95, -22}, {97, 118, 43}, {119, 119, 75}, {120, 122, 43}, },
            {{48, 95, -22}, {97, 97, 43}, {98, 98, 76}, {99, 122, 43}, },
            {{48, 115, -23}, {116, 116, 77}, {117, 122, 43}, },
            {{48, 95, -22}, {97, 104, 43}, {105, 105, 78}, {106, 122, 43}, },
            {{48, 116, -33}, {117, 117, 79}, {118, 122, 43}, },
            {{48, 104, -60}, {105, 105, 80}, {106, 122, 43}, },
            {{0, 4095, -41}, },
            {{0, 41, 81}, {42, 42, 62}, {43, 46, 81}, {47, 47, 82}, {48, 4095, 81}, },
            {{0, 4095, -42}, },
            {},
            {{10, 10, 83}, },
            {{48, 104, -60}, {105, 105, 84}, {106, 122, 43}, },
            {{48, 115, -23}, {116, 116, 85}, {117, 122, 43}, },
            {{48, 107, -27}, {108, 108, 86}, {109, 122, 43}, },
            {{48, 114, -48}, {115, 115, 87}, {116, 122, 43}, },
            {{48, 100, -31}, {101, 101, 88}, {102, 122, 43}, },
            {{48, 100, -31}, {101, 101, 89}, {102, 122, 43}, },
            {{48, 114, -48}, {115, 115, 90}, {116, 122, 43}, },
            {{9, 9, 91}, {32, 32, 92}, {48, 122, -22}, },
            {{48, 95, -22}, {97, 102, 43}, {103, 103, 93}, {104, 122, 43}, },
            {{48, 122, -22}, },
            {{48, 107, -27}, {108, 108, 94}, {109, 122, 43}, },
            {{48, 116, -33}, {117, 117, 95}, {118, 122, 43}, },
            {{48, 114, -48}, {115, 115, 96}, {116, 122, 43}, },
            {{48, 100, -31}, {101, 101, 97}, {102, 122, 43}, },
            {{48, 107, -27}, {108, 108, 98}, {109, 122, 43}, },
            {{0, 41, 99}, {42, 42, 100}, {43, 4095, 99}, },
            {},
            {},
            {{48, 109, -56}, {110, 110, 101}, {111, 122, 43}, },
            {{48, 100, -31}, {101, 101, 102}, {102, 122, 43}, },
            {{48, 100, -31}, {101, 101, 103}, {102, 122, 43}, },
            {{48, 114, -48}, {115, 115, 104}, {116, 122, 43}, },
            {{48, 122, -22}, },
            {{48, 109, -56}, {110, 110, 105}, {111, 122, 43}, },
            {{48, 100, -31}, {101, 101, 106}, {102, 122, 43}, },
            {{9, 32, -75}, {91, 91, 107}, },
            {{9, 91, -93}, },
            {{48, 115, -23}, {116, 116, 108}, {117, 122, 43}, },
            {{48, 104, -60}, {105, 105, 109}, {106, 122, 43}, },
            {{48, 113, -47}, {114, 114, 110}, {115, 122, 43}, },
            {{48, 122, -22}, },
            {{48, 122, -22}, },
            {{48, 100, -31}, {101, 101, 111}, {102, 122, 43}, },
            {{0, 4095, -83}, },
            {{0, 41, 81}, {42, 42, 100}, {43, 4095, -64}, },
            {{48, 102, -76}, {103, 103, 112}, {104, 122, 43}, },
            {{48, 95, -22}, {97, 108, 43}, {109, 109, 113}, {110, 122, 43}, },
            {{48, 95, -22}, {97, 97, 114}, {98, 122, 43}, },
            {{48, 122, -22}, },
            {{48, 95, -22}, {97, 99, 43}, {100, 100, 115}, {101, 122, 43}, },
            {{48, 122, -22}, },
            {{9, 9, 116}, {32, 32, 117}, },
            {{48, 103, -35}, {104, 104, 118}, {105, 122, 43}, },
            {{48, 95, -22}, {97, 98, 43}, {99, 99, 119}, {100, 122, 43}, },
            {{48, 109, -56}, {110, 110, 120}, {111, 122, 43}, },
            {{48, 122, -22}, },
            {{48, 122, -22}, },
            {{46, 46, 121}, {48, 122, -22}, },
            {{48, 109, -56}, {110, 110, 122}, {111, 122, 43}, },
            {{48, 114, -48}, {115, 115, 123}, {116, 122, 43}, },
            {{9, 32, -109}, {93, 93, 124}, },
            {{9, 93, -118}, },
            {{48, 122, -22}, },
            {{9, 9, 125}, {32, 32, 126}, {48, 122, -22}, },
            {{48, 122, -22}, },
            {{111, 111, 127}, },
            {{48, 122, -22}, },
            {{48, 122, -22}, },
            {},
            {{9, 32, -121}, {115, 115, 128}, },
            {{9, 115, -127}, },
            {{117, 117, 129}, },
            {{116, 116, 130}, },
            {{116, 116, 131}, },
            {{97, 97, 132}, },
            {{46, 46, 133}, },
            {{116, 116, 134}, },
            {{112, 112, 135}, },
            {{105, 105, 136}, },
            {{114, 114, 137}, },
            {{99, 99, 138}, },
            {{105, 105, 139}, },
            {{9, 9, 140}, {32, 32, 141}, },
            {{110, 110, 142}, },
            {{9, 32, -140}, {118, 118, 143}, },
            {{9, 118, -142}, },
            {{116, 116, 144}, },
            {{111, 111, 145}, },
            {{108, 108, 146}, },
            {{105, 105, 147}, },
            {{110, 110, 148}, },
            {{100, 100, 149}, },
            {},
            {{9, 9, 150}, {32, 32, 151}, },
            {{9, 32, -151}, {109, 109, 152}, },
            {{9, 109, -152}, },
            {{97, 97, 153}, },
            {{105, 105, 154}, },
            {{110, 110, 155}, },
            {},
        }
    };*/

    private static int[][] accept;
/*  {
        // INITIAL
        {-1, 37, 37, 37, 37, 33, -1, 20, 21, 29, 27, 25, 28, 24, -1, 36, 26, 31, 34, 30, 35, 35, 18, 19, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 22, 23, 37, 32, -1, 38, 36, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 6, 35, 35, 35, 35, 35, 35, 35, 35, -1, -1, 38, 38, 38, 35, 35, 35, 35, 35, 35, 35, 0, 35, 13, 35, 35, 35, 35, 35, -1, 38, 38, 35, 35, 35, 35, 8, 35, 35, -1, -1, 35, 35, 35, 12, 10, 35, -1, -1, 35, 35, 35, 3, 35, 11, -1, 35, 35, 35, 7, 15, 35, 35, 35, -1, -1, 14, 4, 9, -1, 2, 5, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, -1, -1, -1, -1, -1, -1, 16, },

    };*/

    public static class State
    {
        public final static State INITIAL = new State(0);

        private int id;

        private State(@SuppressWarnings("hiding") int id)
        {
            this.id = id;
        }

        public int id()
        {
            return this.id;
        }
    }

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Lexer.class.getResourceAsStream("lexer.dat")));

            // read gotoTable
            int length = s.readInt();
            gotoTable = new int[length][][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][][];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                    length = s.readInt();
                    gotoTable[i][j] = new int[length][3];
                    for(int k = 0; k < gotoTable[i][j].length; k++)
                    {
                        for(int l = 0; l < 3; l++)
                        {
                            gotoTable[i][j][k][l] = s.readInt();
                        }
                    }
                }
            }

            // read accept
            length = s.readInt();
            accept = new int[length][];
            for(int i = 0; i < accept.length; i++)
            {
                length = s.readInt();
                accept[i] = new int[length];
                for(int j = 0; j < accept[i].length; j++)
                {
                    accept[i][j] = s.readInt();
                }
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"lexer.dat\" is either missing or corrupted.");
        }
    }
}