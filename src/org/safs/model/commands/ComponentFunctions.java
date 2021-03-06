
/******************************************************************************
 * ComponentFunctions.java
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
 *   XSLComponentFunctions.xml
 *   keyword_library.dtd
 *   XSLJavaCommonFunctions.xsl
 *   XSLJavaComponentFunctionsClass.xsl
 *
 * Example invocation to generate:
 *
 *   msxsl.exe XSLComponentFunctions.xml XSLJavaComponentFunctionsClass.xsl -o ComponentFunctions.java
 *
 ******************************************************************************/ 
package org.safs.model.commands;


import org.safs.model.ComponentFunction;


public class ComponentFunctions {

    /*****************
    Private Constructor
    Static class needing no instantiation.
    ****************/
    private ComponentFunctions () {}


    /*************************************************************
     static reference to CheckBoxFunctions.class 

      
              Actions for Checkbox objects
           

     

     **************************************************************/
     public static CheckBoxFunctions _CheckBoxFunctions = CheckBoxFunctions.getInstance();

    /*************************************************************
     static reference to ComboBoxFunctions.class 

     
				Actions for working with ComboBox objects
			

     

     **************************************************************/
     public static ComboBoxFunctions _ComboBoxFunctions = ComboBoxFunctions.getInstance();

    /*************************************************************
     static reference to ComboEditBoxFunctions.class 

      
              Actions for working with ComboEditBox objects
           

     

     **************************************************************/
     public static ComboEditBoxFunctions _ComboEditBoxFunctions = ComboEditBoxFunctions.getInstance();

    /*************************************************************
     static reference to ComboListBoxFunctions.class 

      
              Actions for ComboListBox objects
           

     

     **************************************************************/
     public static ComboListBoxFunctions _ComboListBoxFunctions = ComboListBoxFunctions.getInstance();

    /*************************************************************
     static reference to DatabaseFunctions.class 

      
              Actions for working with Database tables.
           

     

     **************************************************************/
     public static DatabaseFunctions _DatabaseFunctions = DatabaseFunctions.getInstance();

    /*************************************************************
     static reference to DatePickerFunctions.class 

      
              Actions for working with Date Picker object
           

     

     **************************************************************/
     public static DatePickerFunctions _DatePickerFunctions = DatePickerFunctions.getInstance();

    /*************************************************************
     static reference to EditBoxFunctions.class 

      
              Actions for working with EditBox objects
           

     

     **************************************************************/
     public static EditBoxFunctions _EditBoxFunctions = EditBoxFunctions.getInstance();

    /*************************************************************
     static reference to FPSpreadFunctions.class 

      
              Functions and Actions for FarPoint Spread objects.
           

     
              This is not supported by Rational Robot out-of-the-box.  You need
	      a proxy from one of IBM's 3rd party partners for this to work.

	      This proxy requires at least version 2003.06.15 of Robot.
           

     **************************************************************/
     public static FPSpreadFunctions _FPSpreadFunctions = FPSpreadFunctions.getInstance();

    /*************************************************************
     static reference to FlexColorFunctions.class 

      
              Actions for working with Flex ColorPicker objects
           

     

     **************************************************************/
     public static FlexColorFunctions _FlexColorFunctions = FlexColorFunctions.getInstance();

    /*************************************************************
     static reference to FlexDateFunctions.class 

      
              Actions for working with Flex DateChooser or DateField objects
           

     

     **************************************************************/
     public static FlexDateFunctions _FlexDateFunctions = FlexDateFunctions.getInstance();

    /*************************************************************
     static reference to FlexNumericStepperFunctions.class 

      
              Actions for working with Flex NumericStepper objects
           

     

     **************************************************************/
     public static FlexNumericStepperFunctions _FlexNumericStepperFunctions = FlexNumericStepperFunctions.getInstance();

    /*************************************************************
     static reference to FlexSliderFunctions.class 

      
              Actions for working with Flex Slider objects
           

     

     **************************************************************/
     public static FlexSliderFunctions _FlexSliderFunctions = FlexSliderFunctions.getInstance();

    /*************************************************************
     static reference to GenericMasterFunctions.class 

     
              Generic actions available for ALL types of Windows and Components.
           

     

     **************************************************************/
     public static GenericMasterFunctions _GenericMasterFunctions = GenericMasterFunctions.getInstance();

    /*************************************************************
     static reference to GenericObjectFunctions.class 

      
              Actions for working with GENERIC objects
           

     

     **************************************************************/
     public static GenericObjectFunctions _GenericObjectFunctions = GenericObjectFunctions.getInstance();

    /*************************************************************
     static reference to GraphicControlFunctions.class 

      
              Actions for working with GraphicControl objects
           

     

     **************************************************************/
     public static GraphicControlFunctions _GraphicControlFunctions = GraphicControlFunctions.getInstance();

    /*************************************************************
     static reference to HTMLFunctions.class 

      
              Actions for working with HTML objects
           

     

     **************************************************************/
     public static HTMLFunctions _HTMLFunctions = HTMLFunctions.getInstance();

    /*************************************************************
     static reference to HTMLDocumentFunctions.class 

      
              Actions for working with HTMLDocument objects
           

     

     **************************************************************/
     public static HTMLDocumentFunctions _HTMLDocumentFunctions = HTMLDocumentFunctions.getInstance();

    /*************************************************************
     static reference to HTMLImageFunctions.class 

      
              Actions for working with HTMLImage objects
           

     

     **************************************************************/
     public static HTMLImageFunctions _HTMLImageFunctions = HTMLImageFunctions.getInstance();

    /*************************************************************
     static reference to HTMLLinkFunctions.class 

      
              Actions for working with HTMLLink objects
           

     

     **************************************************************/
     public static HTMLLinkFunctions _HTMLLinkFunctions = HTMLLinkFunctions.getInstance();

    /*************************************************************
     static reference to HTMLTableFunctions.class 

      
              Actions for working with HTMLTable objects
           

     
                
                NOTE: The RobotJ version has enabled *ALL* of the
                keywords available to the JavaTableFunctions. See that
                documentation for a description of those keywords.
                The only differences are thus:  The columns cannot be
                named, but must evaluate to a numerical value.
                
           

     **************************************************************/
     public static HTMLTableFunctions _HTMLTableFunctions = HTMLTableFunctions.getInstance();

    /*************************************************************
     static reference to JavaMenuFunctions.class 

      
              Actions for working with Java Swing JMenu objects
           

     

     **************************************************************/
     public static JavaMenuFunctions _JavaMenuFunctions = JavaMenuFunctions.getInstance();

    /*************************************************************
     static reference to JavaTableFunctions.class 

      
              Actions for working with JavaTable objects
           

     

     **************************************************************/
     public static JavaTableFunctions _JavaTableFunctions = JavaTableFunctions.getInstance();

    /*************************************************************
     static reference to JavaTreeFunctions.class 

      
              Actions for working with Java Swing JTree objects
           

     

     **************************************************************/
     public static JavaTreeFunctions _JavaTreeFunctions = JavaTreeFunctions.getInstance();

    /*************************************************************
     static reference to DotNetTableFunctions.class 

      
              Actions for working with DotNetTable objects
           

     

     **************************************************************/
     public static DotNetTableFunctions _DotNetTableFunctions = DotNetTableFunctions.getInstance();

    /*************************************************************
     static reference to DotNetMenuFunctions.class 

      
				Actions for working with .NET Menu objects
           

     

     **************************************************************/
     public static DotNetMenuFunctions _DotNetMenuFunctions = DotNetMenuFunctions.getInstance();

    /*************************************************************
     static reference to DotNetTreeFunctions.class 

      
              Actions for working with .NET Tree objects
           

     

     **************************************************************/
     public static DotNetTreeFunctions _DotNetTreeFunctions = DotNetTreeFunctions.getInstance();

    /*************************************************************
     static reference to LabelFunctions.class 

      
              Actions for Label objects
           

     

     **************************************************************/
     public static LabelFunctions _LabelFunctions = LabelFunctions.getInstance();

    /*************************************************************
     static reference to ListBoxFunctions.class 

      
              Actions for working with ListBox objects
           

     

     **************************************************************/
     public static ListBoxFunctions _ListBoxFunctions = ListBoxFunctions.getInstance();

    /*************************************************************
     static reference to ListViewFunctions.class 

      
              Actions for working with ListView objects
           

     

     **************************************************************/
     public static ListViewFunctions _ListViewFunctions = ListViewFunctions.getInstance();

    /*************************************************************
     static reference to PopupMenuFunctions.class 

      
              Actions for ACTIVE Popup Menus
           

      
              Actions for ACTIVE Popup Menus.
              The popup menu must usually already be up and active for each of these Actions.
              
              It is important to recognize certain issues with Popup menus, especially as 
              we need to differentiate between Java popups and Win32 popups.
              
              Win32 popup menus are generally found as the topmost active popup window.  
              Because of this, we generally can just look for the topmost active popup 
              window and we don't need any type of recognition information to locate it.
              
              Java popup menus are generally NOT implemented as normal Win32 popup menus 
              and we generally DO need to have window and component recognition information 
              for Java popup menus.              
              
              For RC and Win32 popups: Unless otherwise indicated, the Window and Component 
              references are not used and can be anything.  They just cannot be blank.
              
              For Java popups: Unless otherwise indicated, valid recognition information for 
              the Java window and "child" popup menu must be provided.
              
              Also refer to JavaMenuFunctions for support specific to Java menus and 
              popup menus.                
           

     **************************************************************/
     public static PopupMenuFunctions _PopupMenuFunctions = PopupMenuFunctions.getInstance();

    /*************************************************************
     static reference to ProgressBarFunctions.class 

      
              Actions for working with Progress Bar object.
           

     
              For Android progress bar, there are two modes indeterminate and determinate.
              In indeterminate mode, the progress is ignored and the progress bar shows an infinite animation instead.
              In this case, the keyword SetProgress will not work and GetProgress will return 0. These 2 keywords
              only work for progress bar in determinate mode.
              Note:Keyword SetRating and GetRating will ONLY work for RatingBar object. RatingBar is a subclass
                          of ProgressBar, so SetProgress and GetProgress can work for it.
           

     **************************************************************/
     public static ProgressBarFunctions _ProgressBarFunctions = ProgressBarFunctions.getInstance();

    /*************************************************************
     static reference to PushButtonFunctions.class 

      
              Actions for working with PushButton objects
           

     

     **************************************************************/
     public static PushButtonFunctions _PushButtonFunctions = PushButtonFunctions.getInstance();

    /*************************************************************
     static reference to RadioButtonFunctions.class 

      
              Actions for working with RadioButton objects
           

     

     **************************************************************/
     public static RadioButtonFunctions _RadioButtonFunctions = RadioButtonFunctions.getInstance();

    /*************************************************************
     static reference to ScrollBarFunctions.class 

      
              Actions for working with ScrollBar objects
           

     

     **************************************************************/
     public static ScrollBarFunctions _ScrollBarFunctions = ScrollBarFunctions.getInstance();

    /*************************************************************
     static reference to SSTreeFunctions.class 

      
              Actions for working with Sheridan Class=SSTree objects
           

     

     **************************************************************/
     public static SSTreeFunctions _SSTreeFunctions = SSTreeFunctions.getInstance();

    /*************************************************************
     static reference to TabControlFunctions.class 

      
              Actions for working with TabControl objects
           

     

     **************************************************************/
     public static TabControlFunctions _TabControlFunctions = TabControlFunctions.getInstance();

    /*************************************************************
     static reference to TableViewFunctions.class 

      
              Actions for working with TableView objects
           

     

     **************************************************************/
     public static TableViewFunctions _TableViewFunctions = TableViewFunctions.getInstance();

    /*************************************************************
     static reference to ToolBarFunctions.class 

      
              Actions for working with ToolBar objects.
           

      
              Toolbars come in many different flavors.  The toolbar support defined here is 
              not going to work for all toolbars in all different environments.  The tester 
              will have to experiment using these commands against their specific toolbar.
           

     **************************************************************/
     public static ToolBarFunctions _ToolBarFunctions = ToolBarFunctions.getInstance();

    /*************************************************************
     static reference to TimePickerFunctions.class 

      
              Actions for working with Time Picker object
           

     

     **************************************************************/
     public static TimePickerFunctions _TimePickerFunctions = TimePickerFunctions.getInstance();

    /*************************************************************
     static reference to TreeViewFunctions.class 

      
              Actions for working with TreeView objects
           

     
				RJ Implementation:
					For each command, the 5th parameter "TextValue" must be given as full path with separator "->". Example: "Parent->Child"
			

     **************************************************************/
     public static TreeViewFunctions _TreeViewFunctions = TreeViewFunctions.getInstance();

    /*************************************************************
     static reference to VSFlexGridFunctions.class 

      
              Functions and Actions for VSFlexGrid objects.
           

     
              This serves as an example of a new core library servicing a custom component.
           

     **************************************************************/
     public static VSFlexGridFunctions _VSFlexGridFunctions = VSFlexGridFunctions.getInstance();

    /*************************************************************
     static reference to WindowFunctions.class 

      
              Actions for working with Window objects
           

     

     **************************************************************/
     public static WindowFunctions _WindowFunctions = WindowFunctions.getInstance();

}
