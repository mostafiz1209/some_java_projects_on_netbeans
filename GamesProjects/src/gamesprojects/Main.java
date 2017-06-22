package gamesprojects;

import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) {
        GamePlay gamePlay=new GamePlay();
        JFrame obj=new JFrame();
        obj.setVisible(true);
        obj.setBounds(460,40,700,600);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.add(gamePlay);
        
    }
    
}
