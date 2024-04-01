package com.poo.views.menu;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.poo.views.introduction.question01.question1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.poo.views.menu.ScreensActions.changeScreen;
import static com.poo.views.menu.ScreensActions.getScreens;

public class IntroductionView extends JScrollPane {

    private final Dimension buttonSize = new Dimension(250, 30);
    private final Border roundedBorder = new LineBorder(Color.BLACK, 1, true);
    private final Insets buttonMargin = new Insets(10, 0, 1, 0);

    public IntroductionView() {
        int questionNumber = 0;

        JPanel introductionPanel = new JPanel();
        introductionPanel.setLayout(new BoxLayout(introductionPanel, BoxLayout.Y_AXIS));

        JPanel buttoPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        TitledBorder title = new TitledBorder("Introdução ao Java");
        title.setTitleFont(new Font("Arial", Font.BOLD, 20));

        introductionPanel.setBorder(title);

        JButton question1Button = new JButton("Questão 01");
        JButton question2Button = new JButton("Questão 02");
        JButton question3Button = new JButton("Questão 03");
        JButton question4Button = new JButton("Questão 04");
        JButton question5Button = new JButton("Questão 05");
        JButton question6Button = new JButton("Questão 06");
        JButton question7Button = new JButton("Questão 07");
        JButton question8Button = new JButton("Questão 08");
        JButton question9Button = new JButton("Questão 09");
        JButton question10Button = new JButton("Questão 10");
        JButton question11Button = new JButton("Questão 11");
        JButton question12Button = new JButton("Questão 12");
        JButton question13Button = new JButton("Questão 13");
        JButton question14Button = new JButton("Questão 14");
        JButton question15Button = new JButton("Questão 15");
        JButton question16Button = new JButton("Questão 16");
        JButton question17Button = new JButton("Questão 17");
        JButton question18Button = new JButton("Questão 18");
        JButton question19Button = new JButton("Questão 19");
        JButton question20Button = new JButton("Questão 20");
        JButton question21Button = new JButton("Questão 21");
        JButton question22Button = new JButton("Questão 22");
        JButton backButton = new JButton("Voltar ");

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if (!command.equals("question23")) {
                    getScreens().add(newQuestionPanel(command), command);
                    changeScreen(command);
                    return;
                }
                changeScreen("appView");
                return;
            }
        };

        for (JButton button : new JButton[] { question1Button, question2Button, question3Button, question4Button,
                question5Button,
                question6Button, question7Button, question8Button, question9Button, question10Button, question11Button,
                question12Button,
                question13Button, question14Button, question15Button, question16Button, question17Button,
                question18Button, question19Button,
                question20Button, question21Button, question22Button, backButton }) {

            gbc.gridy++;
            button.setName("question" + (++questionNumber));
            button.setActionCommand(button.getName());
            button.addActionListener(actionListener);
            button.setPreferredSize(buttonSize);
            button.setBorder(roundedBorder);
            gbc.insets = buttonMargin;
            buttoPanel.add(button, gbc);
        }

        introductionPanel.add(buttoPanel);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        getVerticalScrollBar().setUnitIncrement(16);
        setViewportView(introductionPanel);
    }

    private JPanel newQuestionPanel(String question) {
        switch (question) {
            case "question1":
                return new question1();
            default:
                return new JPanel();
        }
    }
}
