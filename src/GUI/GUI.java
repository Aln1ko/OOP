package GUI;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI{


    public static void gui(String[] args) {
        JFrame frame = new JFrame("My window");
        frame.setSize(800 ,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new GridLayout(3,1));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        JButton button1 = new Buttons("New Game");// кнопки выровнять по центру панельки
        JButton button2 = new Buttons("Continue");//изменить цвет кнопки при наведении
        JButton button3 = new Buttons("Exit");

        JButton button_confirm = new Buttons("confirm");
        button_confirm.setPreferredSize(new Dimension(200,100));

        Font  f1  = new Font(Font.SERIF, Font.PLAIN,  25);
        JTextField name = new JTextField(20);
        JTextField sex = new JTextField(20);
        JTextField difficult = new JTextField(20);
        //JMenu menu1=new JMenu("menu1");
        //button1.add(menu1);

        panel1.add(button1);
        panel2.add(button2);
        panel3.add(button3);

        JLabel vivod1 = new JLabel();
        JLabel vivod2 = new JLabel();
        JLabel vivod3 = new JLabel();
        JLabel vivod4 = new JLabel();
        JLabel vivod5 = new JLabel();
        JLabel vivod6 = new JLabel();

        vivod1.setFont(f1);
        vivod2.setFont(f1);
        vivod3.setFont(f1);
        vivod4.setFont(f1);
        vivod5.setFont(f1);
        vivod6.setFont(f1);

        button3.addActionListener(new ActionListener() {//нужно сюда дописать сохранение в файл может вызываться когда
            //персонаж ещё не создан
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setLayout(new GridLayout(4,1));
                panel1.remove(button1);
                panel2.remove(button2);
                panel3.remove(button3);

                frame.add(panel4);

                difficult.setText("from 1 to 3");
                name.setFont(f1);
                sex.setFont(f1);
                difficult.setFont(f1);
                //sex.getText(); получишь введеную строку
                JLabel label1 = new JLabel("name");
                JLabel label2 = new JLabel("sex");
                JLabel label3 = new JLabel("difficult");
                JLabel label4 = new JLabel("      ");
                JLabel label5 = new JLabel("          ");
                JLabel label6 = new JLabel("  ");

                label1.setFont(f1);
                label2.setFont(f1);
                label3.setFont(f1);

                panel1.add(label1);
                panel1.add(label4);

                panel2.add(label2);
                panel2.add(label5);

                panel3.add(label3);
                panel3.add(label6);

                panel1.add(name);
                panel2.add(sex);
                panel3.add(difficult);
                panel4.add(button_confirm);

                frame.revalidate();
                frame.repaint();

            }
        });

        JButton button4 = new Buttons("Rest options");
        JButton button5 = new Buttons("Study options");
        JButton button6 = new Buttons("Work options");
        JButton button7 = new Buttons("Shop options");

        JPanel panel6 =new JPanel();
        JPanel panel7 =new JPanel();

        button_confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name.getText().equals("") || sex.getText().equals(""))
                {
                    name.setText("Write name");
                    sex.setText("Write sex");
                }
                if (!(difficult.getText().equals("1") || difficult.getText().equals("2") || difficult.getText().equals("3"))) {
                    difficult.setText("Write number from 1 to 3 pls");
                }
                else
                {
                    vivod1.setText( "Name " + name.getText());//это нужно будет убрать и записывать данные
                    vivod2.setText("Sex " + sex.getText());//в классе герой сделал так чтобы был хоть какой-то вывод


                    makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);

                    panel1.add(button4);
                    panel2.add(button5);
                    panel3.add(button6);
                    panel4.add(button7);
                    panel5.add(button3);

                    frame.revalidate();
                    frame.repaint();
                }
            }
        });

        JButton button41 = new Buttons("Go on polyana");
        JButton button42 = new Buttons("Something with cart");
        JButton button43 = new Buttons("Drink alchogol");
        JButton button44 = new Buttons("Make gachimuchi");

        vivod3.setText("Marks:2");
        vivod4.setText("Moral points:3");
        vivod5.setText("Money:9");
        vivod6.setText("Number of step:7");


        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);

                panel1.add(button41);
                panel2.add(button42);
                panel3.add(button43);
                panel4.add(button44);

                frame.revalidate();
                frame.repaint();

            }
        });

        button41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button43.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton button51 = new Buttons("Make lab");
        JButton button52 = new Buttons("Make homework");
        JButton button53 = new Buttons("Go to university");
        JButton button54 = new Buttons("Make kurs work");

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);

                panel1.add(button51);
                panel2.add(button52);
                panel3.add(button53);
                panel4.add(button54);

                frame.revalidate();
                frame.repaint();
            }
        });

        button51.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button52.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button53.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button54.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton button61 = new Buttons("Go to dance");
        JButton button62 = new Buttons("Do junior work");
        JButton button63 = new Buttons("Rozdavat listovki");
        JButton button64 = new Buttons("Do senior work");

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);

                panel1.add(button61);
                panel2.add(button62);
                panel3.add(button63);
                panel4.add(button64);

                frame.revalidate();
                frame.repaint();
            }
        });

        button61.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button62.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button63.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button64.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        JButton button71 = new Buttons("Buy coursework");
        JButton button72 = new Buttons("Buy diploma");
        JButton button73 = new Buttons("Buy girl");
        JButton button74 = new Buttons("Buy drink");

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);

                panel1.add(button71);
                panel2.add(button72);
                panel3.add(button73);
                panel4.add(button74);

                frame.revalidate();
                frame.repaint();

            }
        }) ;
        button71.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button72.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button73.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });

        button74.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
            }
        });




        frame.setVisible(true);
    }

    private static void makeScreen(JPanel panel1,JPanel panel2,JPanel panel3,JPanel panel4,JPanel panel5,JPanel
            panel6,JPanel panel7
            ,JFrame frame,JLabel vivod1,JLabel vivod2,JLabel vivod3,JLabel vivod4,JLabel vivod5,JLabel vivod6)
    {
        panel1.removeAll();
        panel2.removeAll();
        panel3.removeAll();
        panel4.removeAll();
        panel5.removeAll();
        panel6.removeAll();
        panel7.removeAll();

        frame.remove(panel1);
        frame.remove(panel2);
        frame.remove(panel3);
        frame.remove(panel4);
        frame.remove(panel5);
        frame.remove(panel6);
        frame.remove(panel7);


        frame.setLayout(new GridLayout(1,2));

        frame.add(panel6);
        frame.add(panel7);
        panel7.setLayout(new GridLayout(5,1));
        panel7.add(panel1);
        panel7.add(panel2);
        panel7.add(panel3);
        panel7.add(panel4);
        panel7.add(panel5);

        panel6.add(vivod1);
        panel6.add(vivod2);
        panel6.add(vivod3);
        panel6.add(vivod4);
        panel6.add(vivod5);
        panel6.add(vivod6);
    }

}



class Buttons extends JButton{
    public Buttons(String s) {
        //super(s);
        setText(s);
        setVisible(true);
        setPreferredSize(new Dimension(175,75));
    }
}