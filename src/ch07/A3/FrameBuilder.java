package ch07.A3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameBuilder extends Builder {
    private JFrame frame = new JFrame();
    private Box box = new Box(BoxLayout.Y_AXIS); //Box는 가로 또는 세로로 븥일 떄 사용 

    @Override
    public void makeTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void makeString(String str) {
        JLabel label = new JLabel(str);
        // EmptyBorde를 만들어 스페이스를 차지하는데 선은 업다
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        box.add(label); //스트링
    }

    @Override
    public void makeItems(String[] items) {
        Box innerbox = new Box(BoxLayout.Y_AXIS);
        for (String caption: items) {
            JButton button = new JButton(caption);
            
            button.addActionListener(e -> {
                System.out.println(e.getActionCommand());
            });

            innerbox.add(button); //아이템
        }
        innerbox.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        box.add(innerbox);
    }

    @Override
    public void close() {
        frame.getContentPane().add(box);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { //윈도우 종료
                System.exit(0);
            }
        });
    }

    public JFrame getFrameResult() {
        return frame;
    }
}
