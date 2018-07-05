
package simpleatm;

import static java.lang.Float.parseFloat;

public class deposit extends javax.swing.JFrame {
    public static float addbalance;
    public deposit() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        deposit = new javax.swing.JLabel();
        panel_1 = new javax.swing.JPanel();
        Label_1 = new javax.swing.JLabel();
        pinPanel = new javax.swing.JPanel();
        depositLabel = new javax.swing.JLabel();
        panel_2 = new javax.swing.JPanel();
        Label_2 = new javax.swing.JLabel();
        panel_3 = new javax.swing.JPanel();
        Label_3 = new javax.swing.JLabel();
        panel_4 = new javax.swing.JPanel();
        Label_4 = new javax.swing.JLabel();
        panel_5 = new javax.swing.JPanel();
        Label_5 = new javax.swing.JLabel();
        panel_6 = new javax.swing.JPanel();
        Label_6 = new javax.swing.JLabel();
        panel_7 = new javax.swing.JPanel();
        Label_7 = new javax.swing.JLabel();
        panel_8 = new javax.swing.JPanel();
        Label_8 = new javax.swing.JLabel();
        panel_9 = new javax.swing.JPanel();
        Label_9 = new javax.swing.JLabel();
        panel_0 = new javax.swing.JPanel();
        Label_0 = new javax.swing.JLabel();
        next = new javax.swing.JPanel();
        nextLabel1 = new javax.swing.JLabel();
        panel_dot = new javax.swing.JPanel();
        Label_dot = new javax.swing.JLabel();
        panel_dot1 = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(11, 59, 151));
        jPanel3.setPreferredSize(new java.awt.Dimension(525, 498));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\Exercise1&2\\SimpleATM\\img\\cancel.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        deposit.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        deposit.setForeground(new java.awt.Color(255, 255, 255));
        deposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deposit.setText("DEPOSIT");

        panel_1.setBackground(new java.awt.Color(2, 179, 246));
        panel_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_1MouseClicked(evt);
            }
        });

        Label_1.setBackground(new java.awt.Color(246, 0, 118));
        Label_1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_1.setForeground(new java.awt.Color(255, 255, 255));
        Label_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_1.setText("1");
        Label_1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pinPanel.setBackground(new java.awt.Color(34, 81, 191));

        depositLabel.setBackground(new java.awt.Color(34, 81, 191));
        depositLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 28)); // NOI18N
        depositLabel.setForeground(new java.awt.Color(255, 255, 255));
        depositLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pinPanelLayout = new javax.swing.GroupLayout(pinPanel);
        pinPanel.setLayout(pinPanelLayout);
        pinPanelLayout.setHorizontalGroup(
            pinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        pinPanelLayout.setVerticalGroup(
            pinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(depositLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        panel_2.setBackground(new java.awt.Color(2, 179, 246));
        panel_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_2MouseClicked(evt);
            }
        });

        Label_2.setBackground(new java.awt.Color(246, 0, 118));
        Label_2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_2.setForeground(new java.awt.Color(255, 255, 255));
        Label_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_2.setText("2");
        Label_2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_3.setBackground(new java.awt.Color(2, 179, 246));
        panel_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_3MouseClicked(evt);
            }
        });

        Label_3.setBackground(new java.awt.Color(246, 0, 118));
        Label_3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_3.setForeground(new java.awt.Color(255, 255, 255));
        Label_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_3.setText("3");
        Label_3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_4.setBackground(new java.awt.Color(2, 179, 246));
        panel_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_4MouseClicked(evt);
            }
        });

        Label_4.setBackground(new java.awt.Color(246, 0, 118));
        Label_4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_4.setForeground(new java.awt.Color(255, 255, 255));
        Label_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_4.setText("4");
        Label_4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_4Layout = new javax.swing.GroupLayout(panel_4);
        panel_4.setLayout(panel_4Layout);
        panel_4Layout.setHorizontalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_4Layout.setVerticalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_5.setBackground(new java.awt.Color(2, 179, 246));
        panel_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_5MouseClicked(evt);
            }
        });

        Label_5.setBackground(new java.awt.Color(246, 0, 118));
        Label_5.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_5.setForeground(new java.awt.Color(255, 255, 255));
        Label_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_5.setText("5");
        Label_5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_5Layout = new javax.swing.GroupLayout(panel_5);
        panel_5.setLayout(panel_5Layout);
        panel_5Layout.setHorizontalGroup(
            panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_5Layout.setVerticalGroup(
            panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_6.setBackground(new java.awt.Color(2, 179, 246));
        panel_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_6MouseClicked(evt);
            }
        });

        Label_6.setBackground(new java.awt.Color(246, 0, 118));
        Label_6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_6.setForeground(new java.awt.Color(255, 255, 255));
        Label_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_6.setText("6");
        Label_6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_6Layout = new javax.swing.GroupLayout(panel_6);
        panel_6.setLayout(panel_6Layout);
        panel_6Layout.setHorizontalGroup(
            panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_6Layout.setVerticalGroup(
            panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_7.setBackground(new java.awt.Color(2, 179, 246));
        panel_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_7MouseClicked(evt);
            }
        });

        Label_7.setBackground(new java.awt.Color(246, 0, 118));
        Label_7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_7.setForeground(new java.awt.Color(255, 255, 255));
        Label_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_7.setText("7");
        Label_7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_7Layout = new javax.swing.GroupLayout(panel_7);
        panel_7.setLayout(panel_7Layout);
        panel_7Layout.setHorizontalGroup(
            panel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_7Layout.setVerticalGroup(
            panel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_8.setBackground(new java.awt.Color(2, 179, 246));
        panel_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_8MouseClicked(evt);
            }
        });

        Label_8.setBackground(new java.awt.Color(246, 0, 118));
        Label_8.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_8.setForeground(new java.awt.Color(255, 255, 255));
        Label_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_8.setText("8");
        Label_8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_8Layout = new javax.swing.GroupLayout(panel_8);
        panel_8.setLayout(panel_8Layout);
        panel_8Layout.setHorizontalGroup(
            panel_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panel_8Layout.setVerticalGroup(
            panel_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_9.setBackground(new java.awt.Color(2, 179, 246));
        panel_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_9MouseClicked(evt);
            }
        });

        Label_9.setBackground(new java.awt.Color(246, 0, 118));
        Label_9.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_9.setForeground(new java.awt.Color(255, 255, 255));
        Label_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_9.setText("9");
        Label_9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_9Layout = new javax.swing.GroupLayout(panel_9);
        panel_9.setLayout(panel_9Layout);
        panel_9Layout.setHorizontalGroup(
            panel_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_9Layout.setVerticalGroup(
            panel_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_0.setBackground(new java.awt.Color(2, 179, 246));
        panel_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_0MouseClicked(evt);
            }
        });

        Label_0.setBackground(new java.awt.Color(246, 0, 118));
        Label_0.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_0.setForeground(new java.awt.Color(255, 255, 255));
        Label_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_0.setText("0");
        Label_0.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_0Layout = new javax.swing.GroupLayout(panel_0);
        panel_0.setLayout(panel_0Layout);
        panel_0Layout.setHorizontalGroup(
            panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_0Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_0, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_0Layout.setVerticalGroup(
            panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        next.setBackground(new java.awt.Color(246, 0, 118));
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });

        nextLabel1.setBackground(new java.awt.Color(246, 0, 118));
        nextLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        nextLabel1.setForeground(new java.awt.Color(255, 255, 255));
        nextLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextLabel1.setText("NEXT >");

        javax.swing.GroupLayout nextLayout = new javax.swing.GroupLayout(next);
        next.setLayout(nextLayout);
        nextLayout.setHorizontalGroup(
            nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nextLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nextLayout.setVerticalGroup(
            nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nextLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_dot.setBackground(new java.awt.Color(2, 179, 246));
        panel_dot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_dotMouseClicked(evt);
            }
        });

        Label_dot.setBackground(new java.awt.Color(246, 0, 118));
        Label_dot.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Label_dot.setForeground(new java.awt.Color(255, 255, 255));
        Label_dot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_dot.setText(".");
        Label_dot.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel_dotLayout = new javax.swing.GroupLayout(panel_dot);
        panel_dot.setLayout(panel_dotLayout);
        panel_dotLayout.setHorizontalGroup(
            panel_dotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dotLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panel_dotLayout.setVerticalGroup(
            panel_dotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dotLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_dot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_dot1.setBackground(new java.awt.Color(2, 179, 246));
        panel_dot1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_dot1MouseClicked(evt);
            }
        });

        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\Exercise1&2\\SimpleATM\\img\\delete.png")); // NOI18N
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_dot1Layout = new javax.swing.GroupLayout(panel_dot1);
        panel_dot1.setLayout(panel_dot1Layout);
        panel_dot1Layout.setHorizontalGroup(
            panel_dot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_dot1Layout.setVerticalGroup(
            panel_dot1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(pinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(panel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panel_7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(panel_8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panel_9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(panel_0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panel_dot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(53, 53, 53)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deposit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_dot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        new atmGUI().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void panel_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_1MouseClicked
        depositLabel.setText(depositLabel.getText()+Label_1.getText());
    }//GEN-LAST:event_panel_1MouseClicked

    private void panel_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_2MouseClicked
        depositLabel.setText(depositLabel.getText()+Label_2.getText());
    }//GEN-LAST:event_panel_2MouseClicked

    private void panel_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_3MouseClicked
        depositLabel.setText(depositLabel.getText()+Label_3.getText());
    }//GEN-LAST:event_panel_3MouseClicked

    private void panel_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_4MouseClicked
        depositLabel.setText(depositLabel.getText()+Label_4.getText());
    }//GEN-LAST:event_panel_4MouseClicked

    private void panel_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_5MouseClicked
        depositLabel.setText(depositLabel.getText()+Label_5.getText());
    }//GEN-LAST:event_panel_5MouseClicked

    private void panel_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_6MouseClicked
        depositLabel.setText(depositLabel.getText()+Label_6.getText());
    }//GEN-LAST:event_panel_6MouseClicked

    private void panel_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_7MouseClicked
        depositLabel.setText(depositLabel.getText()+Label_7.getText());
    }//GEN-LAST:event_panel_7MouseClicked

    private void panel_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_8MouseClicked
        depositLabel.setText(depositLabel.getText()+Label_8.getText());
    }//GEN-LAST:event_panel_8MouseClicked

    private void panel_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_9MouseClicked
        depositLabel.setText(depositLabel.getText()+Label_9.getText());
    }//GEN-LAST:event_panel_9MouseClicked

    private void panel_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_0MouseClicked
        depositLabel.setText(depositLabel.getText()+Label_0.getText());
    }//GEN-LAST:event_panel_0MouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        depositLabel.setText(depositLabel.getText().substring(0,
            depositLabel.getText().length()-1));
    }//GEN-LAST:event_deleteMouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        addbalance = parseFloat(depositLabel.getText());
        this.dispose();
        if(addbalance != 0){
            new depositSuccess().setVisible(true);
        }else{
            new invalidDeposit().setVisible(true);
        }
    }//GEN-LAST:event_nextMouseClicked

    private void panel_dotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dotMouseClicked
       depositLabel.setText(depositLabel.getText()+Label_dot.getText());
    }//GEN-LAST:event_panel_dotMouseClicked

    private void panel_dot1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dot1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_dot1MouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_0;
    private javax.swing.JLabel Label_1;
    private javax.swing.JLabel Label_2;
    private javax.swing.JLabel Label_3;
    private javax.swing.JLabel Label_4;
    private javax.swing.JLabel Label_5;
    private javax.swing.JLabel Label_6;
    private javax.swing.JLabel Label_7;
    private javax.swing.JLabel Label_8;
    private javax.swing.JLabel Label_9;
    private javax.swing.JLabel Label_dot;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel deposit;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel next;
    private javax.swing.JLabel nextLabel1;
    private javax.swing.JPanel panel_0;
    private javax.swing.JPanel panel_1;
    private javax.swing.JPanel panel_2;
    private javax.swing.JPanel panel_3;
    private javax.swing.JPanel panel_4;
    private javax.swing.JPanel panel_5;
    private javax.swing.JPanel panel_6;
    private javax.swing.JPanel panel_7;
    private javax.swing.JPanel panel_8;
    private javax.swing.JPanel panel_9;
    private javax.swing.JPanel panel_dot;
    private javax.swing.JPanel panel_dot1;
    private javax.swing.JPanel pinPanel;
    // End of variables declaration//GEN-END:variables

}
