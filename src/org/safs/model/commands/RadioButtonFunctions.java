
/******************************************************************************
 * RadioButtonFunctions.java
 *
 * Copyright (c) by SAS Institute Inc., Cary, NC 27513
 * General Public License: http://www.opensource.org/licenses/gpl-license.php
 *
 * !!! DO NOT EDIT THIS FILE !!!
 * This file is automatically generated from XML source.  Any changes you make 
 * here will be erased the next time the file is generated.
 *
 * The following assets are needed to generate this file:
 *
 *   RadioButtonFunctions.xml
 *   keyword_library.dtd
 *   XSLJavaCommonFunctions.xsl
 *   XSLJavaCommandModel.xsl
 *
 * Example invocation to generate:
 *
 *   msxsl.exe RadioButtonFunctions.xml XSLJavaCommandModel.xsl -o RadioButtonFunctions.java
 *
 ******************************************************************************/ 
package org.safs.model.commands;


import org.safs.model.ComponentFunction;


public class RadioButtonFunctions {

    /*****************
    Private Singleton Instance
    ****************/
    private static final RadioButtonFunctions singleton = new RadioButtonFunctions(); 

    /*****************
    Private Constructor
    Static class needing no instantiation.
    ****************/
    private RadioButtonFunctions() {}

    /*****************
    public Singleton to access class static methods via instance
    ****************/
    public static RadioButtonFunctions getInstance() { return singleton;}

    /** "Click" */
    static public final String CLICK_KEYWORD = "Click";


    /*********** <pre> 
                 Attempts to perform a standard Click on the RadioButton
                  </pre>    Supporting Engines:
    <P/><UL>
        <LI>Mercury Interactive WinRunner</LI>
        <LI>Automated QA TestComplete</LI>
    </UL>

     @param winname  Optional:NO
            The name of the window to act upon.
     @param compname  Optional:NO
            The name of the component to act upon.
     **********/
    static public ComponentFunction click (String winname, String compname) {

        if ( winname == null ) throw new IllegalArgumentException ( "click.winname = null");
        if ( compname == null ) throw new IllegalArgumentException ( "click.compname = null");

        ComponentFunction cf = new ComponentFunction(CLICK_KEYWORD, winname, compname);
        return cf;
    }


}
