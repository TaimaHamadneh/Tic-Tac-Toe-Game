package Tic_Tac_Toe_Game;

import java.awt.Color;
import java.util.Hashtable;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class PlayerVsPC extends javax.swing.JFrame {

    private String startGame = "X";
    private int PlayerX = 0;
    private int PlayerO = 0;
    boolean checker;
    Color color = new Color(0, 102, 153);
    Color pink = new Color(255, 102, 204);
    boolean isUserTurn = true;
    Hashtable<Integer, String> hash_table = new Hashtable<Integer, String>();
    private String playerX = "X";
    private String playerO = "O";
    String[][] board = new String[3][3];
    static class Move {
        int row, col;
    };

    public PlayerVsPC() {
        initComponents();
        jButton1.setBackground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton3.setBackground(Color.WHITE);
        jButton4.setBackground(Color.WHITE);
        jButton5.setBackground(Color.WHITE);
        jButton6.setBackground(Color.WHITE);
        jButton7.setBackground(Color.WHITE);
        jButton8.setBackground(Color.WHITE);
        jButton9.setBackground(Color.WHITE);
        jButton13.setBackground(Color.WHITE);
        jButton14.setBackground(Color.WHITE);
        jButton15.setBackground(Color.WHITE);

        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton4);
        group.add(jRadioButton3);
        jRadioButton4.setSelected(true);

        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");

        hash_table.put(1, jButton1.getText());
        hash_table.put(2, jButton1.getText());
        hash_table.put(3, jButton1.getText());
        hash_table.put(4, jButton1.getText());
        hash_table.put(5, jButton1.getText());
        hash_table.put(6, jButton1.getText());
        hash_table.put(7, jButton1.getText());
        hash_table.put(8, jButton1.getText());
        hash_table.put(9, jButton1.getText());
    }

    private void newGame() {
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);

        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");

        jButton1.setBackground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton3.setBackground(Color.WHITE);
        jButton4.setBackground(Color.WHITE);
        jButton5.setBackground(Color.WHITE);
        jButton6.setBackground(Color.WHITE);
        jButton7.setBackground(Color.WHITE);
        jButton8.setBackground(Color.WHITE);
        jButton9.setBackground(Color.WHITE);

        isUserTurn = true;
    }

    private void getFalseEnabled() {
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }

    private void getTrueEnabled() {
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 153));
        jButton4.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton4.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 130));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 130));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 153));
        jButton3.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton3.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 180, 130));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 153));
        jButton2.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton2.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 180, 130));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 153));
        jButton5.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton5.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 180, 130));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 102, 153));
        jButton6.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton6.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 180, 130));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 153));
        jButton7.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton7.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton7.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 180, 130));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 102, 153));
        jButton8.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton8.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton8.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 180, 130));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 102, 153));
        jButton9.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton9.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton9.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 180, 130));

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setForeground(new java.awt.Color(255, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Games & Quizzes ");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 540, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 580, 530));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setForeground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setForeground(new java.awt.Color(255, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 102, 153));
        jButton13.setText("Exit");
        jButton13.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton13.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton13.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 50));

        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 102, 153));
        jButton14.setText("New Game");
        jButton14.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton14.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton14.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 270, 50));

        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 102, 153));
        jButton15.setText("Reset");
        jButton15.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton15.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton15.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 270, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 290, 230));

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setForeground(new java.awt.Color(255, 204, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton3.setBackground(new java.awt.Color(255, 204, 204));
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButton3.setText("Level 2");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 40));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Change Levels ");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jRadioButton4.setBackground(new java.awt.Color(255, 204, 204));
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButton4.setText("Level 1");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 40));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 190));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 320, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        this.setVisible(false);
        MainPage p = new MainPage();
        p.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        newGame();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void chooseAplayer() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
            jLabel5.setText("It's Player O to play !! ");
        } else {
            startGame = "X";
            jLabel5.setText("It's Player X to play !! ");
        }
    }

    private boolean tie() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        if (b1 != "" && b2 != "" && b3 != "" && b4 != "" && b5 != "" && b6 != "" && b7 != "" && b8 != "" && b9 != "") {
            return true;
        }
        return false;
    };
    
    private boolean isGameFinished() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();

        //player X rows 
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(color);
            jButton2.setBackground(color);
            jButton3.setBackground(color);
            PlayerX++;
            getFalseEnabled();
            return true;
        }

        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton4.setBackground(color);
            jButton5.setBackground(color);
            jButton6.setBackground(color);
            PlayerX++;
            getFalseEnabled();
            return true;

        }
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton7.setBackground(color);
            jButton8.setBackground(color);
            jButton9.setBackground(color);
            PlayerX++;
            getFalseEnabled();
            return true;
        }

        //player O rows 
        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(pink);
            jButton2.setBackground(pink);
            jButton3.setBackground(pink);
            PlayerO++;
            getFalseEnabled();
            return true;
        }

        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton4.setBackground(pink);
            jButton5.setBackground(pink);
            jButton6.setBackground(pink);
            PlayerO++;
            getFalseEnabled();
            return true;
        }
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton7.setBackground(pink);
            jButton8.setBackground(pink);
            jButton9.setBackground(pink);
            PlayerO++;
            getFalseEnabled();
            return true;
        }

        //player X colums
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(color);
            jButton4.setBackground(color);
            jButton7.setBackground(color);
            PlayerX++;
            getFalseEnabled();
            return true;
        }

        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton2.setBackground(color);
            jButton5.setBackground(color);
            jButton8.setBackground(color);
            PlayerX++;
            getFalseEnabled();
            return true;

        }
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(color);
            jButton6.setBackground(color);
            jButton9.setBackground(color);
            PlayerX++;
            getFalseEnabled();
            return true;
        }
        //player O colums
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(pink);
            jButton4.setBackground(pink);
            jButton7.setBackground(pink);
            PlayerO++;
            getFalseEnabled();
            return true;
        }

        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton2.setBackground(pink);
            jButton5.setBackground(pink);
            jButton8.setBackground(pink);
            PlayerO++;
            getFalseEnabled();
            return true;
        }
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(pink);
            jButton6.setBackground(pink);
            jButton9.setBackground(pink);
            PlayerO++;
            getFalseEnabled();
            return true;
        }

        //player X diagonal
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(color);
            jButton5.setBackground(color);
            jButton9.setBackground(color);
            PlayerX++;
            getFalseEnabled();
            return true;
        }

        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(color);
            jButton5.setBackground(color);
            jButton7.setBackground(color);
            PlayerX++;
            getFalseEnabled();
            return true;
        }

        //player O diagonal
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(pink);
            jButton5.setBackground(pink);
            jButton9.setBackground(pink);
            PlayerO++;
            getFalseEnabled();
            return true;
        }

        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(pink);
            jButton5.setBackground(pink);
            jButton7.setBackground(pink);
            PlayerO++;
            getFalseEnabled();
            return true;
        }
        return false;
    }

    public void makePcMove() {

        Random rand = new Random();
        int computerMove;
        while (true) {
            computerMove = rand.nextInt(9) + 1;
            if (isValidMove(String.valueOf(computerMove))) {
                break;
            }
        }
        if (computerMove == 1) {
            jButton1.setText(startGame);
        }
        if (computerMove == 2) {
            jButton2.setText(startGame);
        }
        if (computerMove == 3) {
            jButton3.setText(startGame);
        }
        if (computerMove == 4) {
            jButton4.setText(startGame);
        }
        if (computerMove == 5) {
            jButton5.setText(startGame);
        }
        if (computerMove == 6) {
            jButton6.setText(startGame);
        }
        if (computerMove == 7) {
            jButton7.setText(startGame);
        }
        if (computerMove == 8) {
            jButton8.setText(startGame);
        }
        if (computerMove == 9) {
            jButton9.setText(startGame);
        }
    }

    private boolean isValidMove(String position) {
        switch (position) {
            case "1":
                return (jButton1.getText() == "");
            case "2":
                return (jButton2.getText() == "");
            case "3":
                return (jButton3.getText() == "");
            case "4":
                return (jButton4.getText() == "");
            case "5":
                return (jButton5.getText() == "");
            case "6":
                return (jButton6.getText() == "");
            case "7":
                return (jButton7.getText() == "");
            case "8":
                return (jButton8.getText() == "");
            case "9":
                return (jButton9.getText() == "");
            default:
                return false;
        }
    }

    private void storeRowCol() {
        board[0][0] = jButton1.getText();
        board[0][1] = jButton2.getText();
        board[0][2] = jButton3.getText();
        board[1][0] = jButton4.getText();
        board[1][1] = jButton5.getText();
        board[1][2] = jButton6.getText();
        board[2][0] = jButton7.getText();
        board[2][1] = jButton8.getText();
        board[2][2] = jButton9.getText();
    }

    private Boolean isMovesLeft(String board[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == "") {
                    return true;
                }
            }
        }
        return false;
    }

    private int evaluateFunction(String b[][]) {
        // Checking for Rows for X or O victory.
        for (int row = 0; row < 3; row++) {
            if (b[row][0] == b[row][1]
                    && b[row][1] == b[row][2]) //00  01   && 01 02
            {
                if (b[row][0] == playerX) {
                    return +1;
                } else if (b[row][0] == playerO) {
                    return -1;
                }
            }
        }
        // Checking for Columns for X or O victory.
        for (int col = 0; col < 3; col++) {
            if (b[0][col] == b[1][col]
                    && b[1][col] == b[2][col]) {
                if (b[0][col] == playerX) {
                    return +1;
                } else if (b[0][col] == playerO) {
                    return -1;
                }
            }
        }
        // Checking for Diagonals for X or O victory.
        if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
            if (b[0][0] == playerX) {
                return +1;
            } else if (b[0][0] == playerO) {
                return -1;
            }
        }

        if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
            if (b[0][2] == playerX) {
                return +1;
            } else if (b[0][2] == playerO) {
                return -1;
            }
        }
        return 0;
    }

    private int minimax(String board[][], int depth, Boolean isMaximizingPlayer) {
        int score = evaluateFunction(board);//0
        if (score == 1) {
            return score;
        }
        if (score == -1) {
            return score;
        }
        if (isMovesLeft(board) == false) {
            return 0;
        }

        // If this maximizer's move
        if (isMaximizingPlayer) {
            int best = -1000000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check if cell is empty
                    if (board[i][j] == "") {// Make the move
                        board[i][j] = playerX;
                        // Call minimax recursively and choose
                        // the maximum value
                        best = Math.max(best, minimax(board, depth + 1, !isMaximizingPlayer));
                        // Undo the move
                        board[i][j] = "";
                    }
                }
            }
            return best;
        } // If this minimizer's move
        else {
            int best = 1000000;
            // Traverse all cells
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check if cell is empty
                    if (board[i][j] == "") {
                        board[i][j] = playerO;
                        // Call minimax recursively and choose
                        // the minimum value
                        best = Math.min(best, minimax(board, depth + 1, !isMaximizingPlayer));
                        // Undo the move
                        board[i][j] = "";
                    }
                }
            }
            return best;
        }
    }

    private Move findBestMove(String board[][]) {
        int bestVal = -1000;
        Move bestMove = new Move();//bestMOve.row , col
        bestMove.row = -1;
        bestMove.col = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == "") {
                    board[i][j] = playerX;
                    int moveVal = minimax(board, 0, false);
                    board[i][j] = "";
                    if (moveVal > bestVal) {
                        bestMove.row = i;
                        bestMove.col = j;
                        bestVal = moveVal;
                    }
                }
            }
        }
        System.out.printf("The value of the best Move " + "is : %d\n\n", bestVal);
        return bestMove;
    }

    public void makePcMoveMini() {
        storeRowCol();
        Move bestMove = findBestMove(board);
        if (bestMove.row == 0) {
            if (bestMove.col == 0) {
                jButton1.setText(startGame);
            }
            if (bestMove.col == 1) {
                jButton2.setText(startGame);
            }
            if (bestMove.col == 2) {
                jButton3.setText(startGame);
            }
        }
        if (bestMove.row == 1) {
            if (bestMove.col == 0) {
                jButton4.setText(startGame);
            }
            if (bestMove.col == 1) {
                jButton5.setText(startGame);
            }
            if (bestMove.col == 2) {
                jButton6.setText(startGame);
            }
        }
        if (bestMove.row == 2) {
            if (bestMove.col == 0) {
                jButton7.setText(startGame);
            }
            if (bestMove.col == 1) {
                jButton8.setText(startGame);
            }
            if (bestMove.col == 2) {
                jButton9.setText(startGame);
            }
        }
    }

   

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (isUserTurn && jRadioButton4.isSelected() && jButton5.getText() == "") {
            jButton5.setText(startGame);
            level1();         
        }
        if (isUserTurn && jRadioButton3.isSelected() && jButton5.getText() == "") {
            jButton5.setText(startGame);
            level2();
        }
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        newGame();
        jRadioButton4.setSelected(true);
        jRadioButton3.setSelected(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void level1() {
        getFalseEnabled();
        isUserTurn = false;
        chooseAplayer();
        if (isGameFinished() == false) {
            if (tie() == false) {
                makePcMove();
                if (isGameFinished() == false) {
                    getTrueEnabled();
                    isUserTurn = true;
                    chooseAplayer();
                } else {
                    getFalseEnabled();
                }
            } 
            else {
                JOptionPane.showMessageDialog(this, "Tie, No winner in this game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public void level2() {
        getFalseEnabled();
        isUserTurn = false;
        chooseAplayer();
        if (isGameFinished() == false) {
            if (tie() == false) {
                makePcMoveMini();
                if (isGameFinished() == false) {
                    getTrueEnabled();
                    isUserTurn = true;
                    chooseAplayer();
                } else {
                    getFalseEnabled();
                }
            } 
            else {
                JOptionPane.showMessageDialog(this, "Tie, No winner in this game", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    

   
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isUserTurn && jRadioButton4.isSelected() && jButton1.getText() == "") {
            jButton1.setText(startGame);
            level1();
        }
        if (isUserTurn && jRadioButton3.isSelected() && jButton1.getText() == "") {        
            
            jButton1.setText(startGame);
             level2();
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (isUserTurn && jRadioButton4.isSelected() && jButton2.getText() == "") {
            jButton2.setText(startGame);
            level1();
        }
        if (isUserTurn && jRadioButton3.isSelected() && jButton2.getText() == "") {
            jButton2.setText(startGame);
            level2();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (isUserTurn && jRadioButton4.isSelected() && jButton3.getText() == "") {
            jButton3.setText(startGame);
            level1();
        }
        if (isUserTurn && jRadioButton3.isSelected() && jButton3.getText() == "") {
            jButton3.setText(startGame);
            level2();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (isUserTurn && jRadioButton4.isSelected() && jButton4.getText() == "") {
            jButton4.setText(startGame);
            level1();
        }
        if (isUserTurn && jRadioButton3.isSelected() && jButton4.getText() == "") {
            jButton4.setText(startGame);
            level2();
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (isUserTurn && jRadioButton4.isSelected() && jButton6.getText() == "") {
            jButton6.setText(startGame);
            level1();
        }
        if (isUserTurn && jRadioButton3.isSelected() && jButton6.getText() == "") {
            jButton6.setText(startGame);
            level2();
        }
         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (isUserTurn && jRadioButton4.isSelected() && jButton7.getText() == "") {
            jButton7.setText(startGame);
            level1();
        }
        if (isUserTurn && jRadioButton3.isSelected() && jButton7.getText() == "") {
            jButton7.setText(startGame);
            level2();
        }
         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (isUserTurn && jRadioButton4.isSelected() && jButton8.getText() == "") {
            jButton8.setText(startGame);
            level1();
        }
        if (isUserTurn && jRadioButton3.isSelected() && jButton8.getText() == "") {
            jButton8.setText(startGame);
            level2();
        }
         
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (isUserTurn && jRadioButton4.isSelected() && jButton9.getText() == "") {
            jButton9.setText(startGame);
            level1();
        }
        if (isUserTurn && jRadioButton3.isSelected() && jButton9.getText() == "") {
            jButton9.setText(startGame);
            level2();
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

private int alphaBeta(int player, int depth, int alpha, int beta)
{
        if (isGameFinished() || depth == 9) {
            return evaluateFunction(board);
        }
        if (player == PlayerX) {
            int bestValue = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == " ") {
                        board[i][j] = playerX;
                        bestValue = Math.max(bestValue, alphaBeta(PlayerO, depth + 1, alpha, beta));
                        board[i][j] = " ";
                        alpha = Math.max(alpha, bestValue);
                        if (alpha >= beta)
                        {
                            return bestValue;
                        }
                    }
                }
            }
            return bestValue;
        } 
        else {
            int bestValue = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == " ") {
                        board[i][j] = playerO;
                        bestValue = Math.min(bestValue, alphaBeta(PlayerX , depth + 1, alpha, beta));
                        board[i][j] = " ";
                        beta = Math.min(beta, bestValue);
                        if (beta <= alpha) 
                        {
                            return bestValue;
                        }
                    }
               





        }
            }
        return bestValue;
    
        }   
}
public void makeMove() {
    int bestValue = Integer.MIN_VALUE;
    int bestRow = -1;
    int bestCol = -1;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == " ") {
                board[i][j] = playerX;
                int value = alphaBeta(PlayerO, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                board[i][j] = " ";
                if (value > bestValue) {
                    bestValue = value;
                    bestRow = i;
                    bestCol = j;
                }
            }
        }
    }
    board[bestRow][bestCol] = playerX;
}
private void computerNeverLose()
{
  
      Random rand = new Random();
      int randomNumber = rand.nextInt(10) ;//0---9
      //startOf Game
      if(randomNumber==1)
      {
          
          jButton1.setText("x");
      }
      else if(randomNumber==3)
      {
                    jButton3.setText("x");

      }
       else if(randomNumber==7)
      {
                    jButton7.setText("x");

      }
      else if(randomNumber==9)
      {
                    jButton9.setText("x");

      }
      else 
      {
           jButton1.setText("x");
      }
     
     
} /*public static void main(String args[]) {
  
    PlayerVsPC game = new PlayerVsPC();
               
                System.out.print("start");
                //level2();
                if (game.jRadioButton3.isSelected()){
                    System.out.print("inside loop");
                    game.makePcMoveMini();
                }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
            }
        });
    }  */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
