 /* Michael L. Kelley Jr.
  * HelloWorldTeacher.java
  * Hello World Teacher is a reference for learning new computer programming languages
  * 7/13/12
 */

  // Packages and imports

 import java.io.IOException;
 import java.io.PrintStream;
 import javax.swing.JOptionPane;
 import javax.swing.*;
 import java.awt.*;

  // HelloWorldTeacher class

 class HelloWorldTeacher
 {

 	 // Try to set the Look and Feel of application

      // Set native Look and feel

  public static void setNativeLookAndFeel() {
    	try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch(Exception e) {
      System.out.println("Error setting native LAF: " + e); // Error
    }
  }

	  // Set Java Look and feel

  public static void setJavaLookAndFeel() {
    try {
      UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    } catch(Exception e) {
      System.out.println("Error setting Java LAF: " + e); // Error
    }
  }
      // Set Motif look and feel

   public static void setMotifLookAndFeel() {
    try {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    } catch(Exception e) {
      System.out.println("Error setting Motif LAF: " + e); // Error
    }
  }
        // Main method

   public static void main(String[] args)
    throws IOException
  {
  	// While statement to see what language the user has selected

   while (true)
    {

     // Display the menu
      String choice1 = JOptionPane.showInputDialog("View 'Hello World' syntax for:\n\n 1. C\n 2. C++\n 3. Java\n 4. BASIC\n 5. Python\n 6. Ruby\n 7. Lua\n 8. Visual Basic\n 9. C#\n10. Perl\n11. Pascal\n  \n(Choose a number: 1-11. Cancel to exit");

     int choice = Integer.parseInt(choice1);

       // If loop to check choice variable
      if (choice < 10)
     {
        while (((choice == 10 ? 1 : 0) | (choice == 13 ? 1 : 0)) != 0);
        if (((choice < 1 ? 1 : 0) | (choice > 10 ? 1 : 0) & (choice != 12 ? 1 : 0)) != 0) continue;
      }
     if (choice >= 13) break;
      System.out.println("\n");

      // Switch to chose which code should be displayed to the user

     switch (choice)
    {
    case 1:		// C
       JOptionPane.showMessageDialog(null, "#include <stdio.h>\n int main(void) {\n printf(\"Hello, world!\\n\");\n return 0;\n }");
        break;
    case 2:		// C++
       JOptionPane.showMessageDialog(null, "#include <iostream>\n using namespace std;\n int main() {\n cout <<\"Hello, world!\"<< endl;\n return 0;\n }");
       break;
	case 3:		// Java
        JOptionPane.showMessageDialog(null, "public class Hello {\n public static void main(String[] args) {\n System.out.println(\"Hello world!\" );\n }\n }");
         break;
    case 4:		// BASIC
      JOptionPane.showMessageDialog(null, "10 PRINT \"Hello, world!\"\n 20 END");
        break;
    case 5:		// Python
       JOptionPane.showMessageDialog(null, "print \"Hello, world!\"");
        break;
    case 6:		// Ruby
      JOptionPane.showMessageDialog(null, "print \"Hello, world!\\n\"");
       break;
    case 7:		// Lua
      JOptionPane.showMessageDialog(null, "print \"Hello, world!\"");
       break;
    case 8:		// Visual Basic
       JOptionPane.showMessageDialog(null, "MsgBox \"Hello, world!\"");
       break;
    case 9:		// C#
       JOptionPane.showMessageDialog(null, "public class Hello { public static void main(){ System.Console.WriteLine(Hello World!); } }");
       break;
    case 10:	// Pearl
       JOptionPane.showMessageDialog(null, "print \"Hello, world!\\n\";");
       break;
    case 11: 	// Pascal
         JOptionPane.showMessageDialog(null, "program Hello;\n begin\n writeln('Hello, world!;);\n end.");
       }

    System.out.println();
   }
    System.exit(0);			// Exit
  }
}