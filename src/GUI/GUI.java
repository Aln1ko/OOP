package GUI;


import Game.*;
import Manager.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI{

    public static void gui(Manager manager, MyCharacter hero) {
        final boolean[] gameStatus = {false};
        ChangeAtributs changeAtributs = new ChangeAtributs();

        JFrame frame = new JFrame("My window");
        frame.setSize(800 ,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JFrame loss = new JFrame("LOSS");
        loss.setSize(400,300);
        loss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loss.setLocationRelativeTo(null);
        loss.setLayout(new GridLayout(2,1));
        JPanel loss1 = new JPanel();
        JPanel loss2 = new JPanel();
        loss.add(loss1);
        loss.add(loss2);
        JButton buttonLoss = new Buttons("OK");
        buttonLoss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loss.dispose();
                frame.dispose();
            }
        });
        JLabel labelLoss = new JLabel("YOU LOSS (one o the points < 0)");
        loss1.add(labelLoss);
        loss2.add(labelLoss);


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
            //manager.continueOldGame();
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
                    Difficult_Game temp = new Difficult_Game();
                    //hero(name.getText(),sex.getText(),difficult.getText());
                    hero.set_Name(name.getText());
                    hero.set_sex(sex.getText());
                    temp.fill_difficult(hero,Integer.parseInt(difficult.getText()));
                    vivod1.setText( "Name " + hero.get_Name());//это нужно будет убрать и записывать данные
                    vivod2.setText("Sex " + hero.get_sex());//в классе герой сделал так чтобы был хоть какой-то вывод
                    vivod3.setText("Marks " + hero.get_marks());//в классе герой сделал так чтобы был хоть какой-то вывод
                    vivod4.setText("Moral points " + hero.get_moral_points());//в классе герой сделал так чтобы был хоть какой-то вывод
                    vivod5.setText("Money " + hero.get_money());//в классе герой сделал так чтобы был хоть какой-то вывод
                    vivod6.setText("Number of step " + hero.get_number_of_step());//в классе герой сделал так чтобы был хоть какой-то вывод

                    makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);

                    panel1.add(button4);
                    panel2.add(button5);
                    panel3.add(button6);
                    panel4.add(button7);
                    panel5.add(button3);

                    frame.revalidate();
                    frame.repaint();
                    manager.proverkaGUI(hero);
                }
            }
        });

        JButton button41 = new Buttons("Go on polyana");
        JButton button42 = new Buttons("Something with cart");
        JButton button43 = new Buttons("Drink alchogol");
        JButton button44 = new Buttons("Make gachimuchi");

        vivod3.setText("Name:"+hero.get_Name());
        vivod4.setText("Moral points:" + hero.get_moral_points());
        vivod5.setText("Money:" + hero.get_money());
        vivod6.setText("Number of step:"+ hero.get_number_of_step());

        Rest a = new Rest();

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
                a.go_to_polyana(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        button42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                a.make_cart_be_on_tree(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }



            }
        });

        button43.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                a.drink_alchogol(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }



            }
        });

        button44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                a.make_gachimuchi(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        Study b = new Study();

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
                b.make_lab(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        button52.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                b.make_homework(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        button53.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                b.go_to_university(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        button54.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                b.napisat_kursovu(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        Work c = new Work();

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
                c.go_to_dance(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        button62.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                c.coder_work(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        button63.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                c.rozdavat_listovki(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        button64.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                c.senior_work(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        Shop d = new Shop();

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
                d.buy_coursework(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        button72.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                d.buy_diploma(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });


        button73.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                d.buy_girl(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        button74.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут действие соответсвующие тому что написанно на кнопке
                d.buy_drink(hero);
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                manager.continueOldGame();
                vivod1.setText("Name: " + hero.get_Name());
                vivod2.setText("Sex: " + hero.get_sex());
                vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
                vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
                vivod5.setText("Money: " + Integer.toString(hero.get_money()));
                vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
                makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
                panel1.add(button4);
                panel2.add(button5);
                panel3.add(button6);
                panel4.add(button7);
                panel5.add(button3);
                frame.revalidate();
                frame.repaint();
                gameStatus[0] =manager.proverkaGUI(hero);
                if(gameStatus[0]) {
                    loss.setVisible(true);
                }


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

    /*public static void EndGameBeforeLossGUI(JPanel panel1,JPanel panel2,JPanel panel3,JPanel panel4,JPanel panel5,JPanel
            panel6,JPanel panel7
            ,JFrame frame,JLabel vivod1,JLabel vivod2,JLabel vivod3,JLabel vivod4,JLabel vivod5,JLabel vivod6,MyCharacter hero){
        vivod1.setText("Name: " + hero.get_Name());
        vivod2.setText("Sex: " + hero.get_sex());
        vivod3.setText("Marks: " + Integer.toString(hero.get_marks()));
        vivod4.setText("Moral points: " + Integer.toString(hero.get_moral_points()));
        vivod5.setText("Money: " + Integer.toString(hero.get_money()));
        vivod6.setText("Number of step: " + Integer.toString(hero.get_number_of_step()));
        makeScreen(panel1,panel2,panel3,panel4,panel5,panel6,panel7,frame,vivod1,vivod2,vivod3,vivod4,vivod5,vivod6);
        panel1.add(button4);
        panel2.add(button5);
        panel3.add(button6);
        panel4.add(button7);
        panel5.add(button3);
        frame.revalidate();
        frame.repaint();
    }*/


}



class Buttons extends JButton{
    public Buttons(String s) {
        //super(s);
        setText(s);
        setVisible(true);
        setPreferredSize(new Dimension(175,75));
    }
}