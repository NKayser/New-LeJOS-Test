package HelloWorld;

/*
 * Example on how to check the buttons pressed
 */
import lejos.hardware.Button;

public class ButtonsTest {
   
   public static void main(String[] args)
   {
      int pressed;
      //print the button name until the pressed button is escape
      while(Button.getButtons()!=Button.ID_ESCAPE)
      {
         // block the thread until a button is pressed  
         Button.waitForAnyPress();
         pressed = Button.getButtons();
         //left button
         if(pressed == Button.ID_LEFT){
            System.out.println("Left");
         }
         //right button
         if(pressed == Button.ID_RIGHT){
            System.out.println("Right");
         }
         //up button
         if(pressed == Button.ID_UP){
            System.out.println("Up");
         }
         //down button
         if(pressed == Button.ID_DOWN){
            System.out.println("Down");
         }
         //enter button
         if(pressed == Button.ID_ENTER){
            System.out.println("Enter");
         }
         //escape button
         if(pressed == Button.ID_ESCAPE){
            System.out.println("Escape");
         }
      }
   }
}