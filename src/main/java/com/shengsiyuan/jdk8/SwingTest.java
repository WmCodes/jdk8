package com.shengsiyuan.jdk8;

import javax.swing.*;

/**
 * @author wangmeng
 * @date 2019/4/15
 * @desciption
 */
public class SwingTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton = new JButton("My JButton");
       /*    jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed!");
            }
        });*/


        jButton.addActionListener(event -> System.out.println("Button pressed!"));

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
