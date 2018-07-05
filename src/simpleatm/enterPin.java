
package simpleatm;

import static java.lang.Integer.parseInt;

public class enterPin extends javax.swing.JFrame {
    public static int textInt;
    public static int pinVal = 0;

    public enterPin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pinPanel = new javax.swing.JPanel();
        pinLabel = new javax.swing.JLabel();
        nextPanel = new javax.swing.JPanel();
        nextLabel = new javax.swing.JLabel();
        panel_1 = new javax.swing.JPanel();
        Label_1 = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(11, 59, 151));
        jPanel1.setPreferredSize(new java.awt.Dimension(783, 553));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ENTER PIN");

        pinPanel.setBackground(new java.awt.Color(34, 81, 191));

        pinLabel.setBackground(new java.awt.Color(34, 81, 191));
        pinLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 28)); // NOI18N
        pinLabel.setForeground(new java.awt.Color(255, 255, 255));
        pinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pinPanelLayout = new javax.swing.GroupLayout(pinPanel);
        pinPanel.setLayout(pinPanelLayout);
        pinPanelLayout.setHorizontalGroup(
            pinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );
        pinPanelLayout.setVerticalGroup(
            pinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        nextPanel.setBackground(new java.awt.Color(246, 0, 118));
        nextPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextPanelMouseClicked(evt);
            }
        });

        nextLabel.setBackground(new java.awt.Color(246, 0, 118));
        nextLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        nextLabel.setForeground(new java.awt.Color(255, 255, 255));
        nextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextLabel.setText("NEXT >");

        javax.swing.GroupLayout nextPanelLayout = new javax.swing.GroupLayout(nextPanel);
        nextPanel.setLayout(nextPanelLayout);
        nextPanelLayout.setHorizontalGroup(
            nextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nextPanelLayout.setVerticalGroup(
            nextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Label_2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Label_3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panel_4Layout = new javax.swing.GroupLayout(panel_4);
        panel_4.setLayout(panel_4Layout);
        panel_4Layout.setHorizontalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panel_5Layout = new javax.swing.GroupLayout(panel_5);
        panel_5.setLayout(panel_5Layout);
        panel_5Layout.setHorizontalGroup(
            panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Label_5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panel_6Layout = new javax.swing.GroupLayout(panel_6);
        panel_6.setLayout(panel_6Layout);
        panel_6Layout.setHorizontalGroup(
            panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Label_6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_6Layout.setVerticalGroup(
            panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panel_7Layout = new javax.swing.GroupLayout(panel_7);
        panel_7.setLayout(panel_7Layout);
        panel_7Layout.setHorizontalGroup(
            panel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_7Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panel_8Layout = new javax.swing.GroupLayout(panel_8);
        panel_8.setLayout(panel_8Layout);
        panel_8Layout.setHorizontalGroup(
            panel_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Label_8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panel_9Layout = new javax.swing.GroupLayout(panel_9);
        panel_9.setLayout(panel_9Layout);
        panel_9Layout.setHorizontalGroup(
            panel_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Label_9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_9Layout.setVerticalGroup(
            panel_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panel_0Layout = new javax.swing.GroupLayout(panel_0);
        panel_0.setLayout(panel_0Layout);
        panel_0Layout.setHorizontalGroup(
            panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_0Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Label_0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_0Layout.setVerticalGroup(
            panel_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_0, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\Exercise1&2\\SimpleATM\\img\\delete.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(panel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panel_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panel_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(panel_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panel_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panel_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addComponent(panel_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(124, 124, 124)
                        .addComponent(nextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(pinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panel_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_1MouseClicked
        pinLabel.setText(pinLabel.getText()+Label_1.getText());
        
    }//GEN-LAST:event_panel_1MouseClicked

    private void panel_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_2MouseClicked
        pinLabel.setText(pinLabel.getText()+Label_2.getText());
    }//GEN-LAST:event_panel_2MouseClicked

    private void panel_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_3MouseClicked
        pinLabel.setText(pinLabel.getText()+Label_3.getText());
    }//GEN-LAST:event_panel_3MouseClicked

    private void panel_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_4MouseClicked
        pinLabel.setText(pinLabel.getText()+Label_4.getText());
    }//GEN-LAST:event_panel_4MouseClicked

    private void panel_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_5MouseClicked
        pinLabel.setText(pinLabel.getText()+Label_5.getText());
    }//GEN-LAST:event_panel_5MouseClicked

    private void panel_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_6MouseClicked
        pinLabel.setText(pinLabel.getText()+Label_6.getText());
    }//GEN-LAST:event_panel_6MouseClicked

    private void panel_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_7MouseClicked
        pinLabel.setText(pinLabel.getText()+Label_7.getText());
    }//GEN-LAST:event_panel_7MouseClicked

    private void panel_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_8MouseClicked
        pinLabel.setText(pinLabel.getText()+Label_8.getText());
    }//GEN-LAST:event_panel_8MouseClicked

    private void panel_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_9MouseClicked
        pinLabel.setText(pinLabel.getText()+Label_9.getText());
    }//GEN-LAST:event_panel_9MouseClicked

    private void panel_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_0MouseClicked
        pinLabel.setText(pinLabel.getText()+Label_0.getText());
    }//GEN-LAST:event_panel_0MouseClicked

    private void nextPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextPanelMouseClicked
        this.dispose();
        textInt = parseInt(pinLabel.getText());
        if(textInt == 2018 || textInt == 1995 || textInt == 5678){
           new atmGUI().setVisible(true);
        }else{
           new invalidPin().setVisible(true);
        }
    }//GEN-LAST:event_nextPanelMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        pinLabel.setText(pinLabel.getText().substring(0,
                pinLabel.getText().length()-1));
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enterPin().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nextLabel;
    private javax.swing.JPanel nextPanel;
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
    private javax.swing.JLabel pinLabel;
    private javax.swing.JPanel pinPanel;
    // End of variables declaration//GEN-END:variables
}
