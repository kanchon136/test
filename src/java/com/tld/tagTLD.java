package com.tld;


 
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JEE
 */
public class tagTLD  extends SimpleTagSupport{
    public void doTag() throws JspException,IOException{
        DateFormat df= DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        getJspContext().getOut().write(df.format(new Date()));
    }
    
}
