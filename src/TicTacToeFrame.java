
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
 
public class TicTacToeFrame extends JFrame
{
   private char whoseTurn = 'X';
   private boolean gameOver = false;

   private Cell[][] cells = new Cell[3][3];
 
   JLabel jlblStatus = new JLabel("It's your turn to start the game.");
 
   public TicTacToeFrame()
   {
       JPanel panel = new JPanel(new GridLayout(3, 3, 1, 1));
       for (int i = 0; i < 3; i++)
           for (int j = 0; j < 3; j++)
               panel.add(cells[i][j] = new Cell());
 
       panel.setBorder(new LineBorder(Color.red, 50));
       jlblStatus.setBorder(new LineBorder(Color.green, 30));
 
       add(panel, BorderLayout.CENTER);
       add(jlblStatus, BorderLayout.NORTH);
   }
 
 
    public boolean isFull()
    {
       for (int i = 0; i < 3; i++)
           for (int j = 0; j < 3; j++)
               if (cells[i][j].getToken() == ' ')
                   return false;
       return true;
    }
 
 
   public boolean isWon(char token)
   {
       for (int i = 0; i < 3; i++)
           if ((cells[i][0].getToken() == token)
                   && (cells[i][1].getToken() == token)
                   && (cells[i][2].getToken() == token))
           {
               return true;
           }
       
       for (int j = 0; j < 3; j++)
           if ((cells[0][j].getToken() == token)
               && (cells[1][j].getToken() == token)
               && (cells[2][j].getToken() == token))
           {
               return true;
           }
      
       if ((cells[0][0].getToken() == token)
               && (cells[1][1].getToken() == token)
               && (cells[2][2].getToken() == token))
           {
               return true;
           }
 
      
       if ((cells[0][2].getToken() == token)
               && (cells[1][1].getToken() == token)
               && (cells[2][0].getToken() == token))
           {
               return true;
           }
 
       return false;
   }
 
  
    public class Cell extends JPanel
    {
       private char token = ' ';
 
    
       public Cell()
       {
           setBorder(new LineBorder(Color.blue, 5));
           addMouseListener(new MyMouseListener());
       }
 
      
       public char getToken()
       {
           return token;
       }
 
     
       public void setToken(char c)
       {
           token = c;
           repaint();
       }
 
      
       protected void paintComponent(Graphics g)
       {
           super.paintComponent(g);
 
           if (token == 'X')
           {
               g.drawLine(10, 10, getWidth()-10 , getHeight()-10);
               g.drawLine(getWidth() - 10, 10, 10, getHeight() - 10);
           }
 
           else if (token == 'O')
           {
               g.drawOval(10, 10, getWidth()-20, getHeight()-20 );
           }
       }
 
       private class MyMouseListener extends MouseAdapter
       {
           public void mouseClicked(MouseEvent e)
           {
               if (gameOver)
                   return;
               
               // if the cell is empty and the game is not over
               if (token == ' ' && whoseTurn != ' ')
                   setToken(whoseTurn);
 
              
               if (isWon(whoseTurn))
               {
            	   if(whoseTurn == 'X')
                   jlblStatus.setText("Yes!!!!!!!!!!! you have won the game!!!! Now prepare for next play.");
            	   else
            		  jlblStatus.setText("Sorry!!!!!!! your companion has won the game!!!! Now prepare for next play.");
                   whoseTurn = ' ';
                   gameOver = true;
               }
               else if (isFull())
               {
                   jlblStatus.setText("Tie game! Game over!");
                   whoseTurn = ' ';
                   gameOver = true;
               }
               else
               {
                   whoseTurn = (whoseTurn == 'X') ? 'O' : 'X';
                   if(whoseTurn == 'X')               	   
                   jlblStatus.setText("It's your turn");
                   
                   else
                	   jlblStatus.setText("It's your companion's turn");
               }
           }
       } // end class MyMouseListener
    } // end class Cell
} // end class TicTacToeFrame*/