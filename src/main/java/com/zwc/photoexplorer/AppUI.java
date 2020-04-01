package com.zwc.photoexplorer;

import java.awt.*;

import javax.swing.*;

/**
 * app端显示和交互
 */
public class AppUI {

    JFrame frame;
    TextField textField;

    public AppUI() throws Exception {

        // 窗口
        frame = new JFrame("图片浏览器");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setLocation(700, 400);

        // 文本框
        textField = new TextField("启动中...");
        frame.getContentPane().add(textField);
        frame.setVisible(true);
    }

    public void updateText(String text) {
        textField.setText(text);
        frame.repaint();
    }
}