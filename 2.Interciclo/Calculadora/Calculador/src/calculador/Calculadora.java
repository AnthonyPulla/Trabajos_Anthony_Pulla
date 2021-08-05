package calculador;
public class Calculadora extends javax.swing.JFrame {
    public Calculadora() {
        initComponents();
    }
    double op1=0,op2=0;
    String operacion="";
    boolean nueva=true;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtResul = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnBTo = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResul.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        txtResul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtResul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResulActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(txtResul, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(txtResul, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnC.setText("0");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnP.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnP.setText(".");
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnDel.setText("DEL");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnMulti.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnMulti.setText("x");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnSuma.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnBTo.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnBTo.setText("AC");
        btnBTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBToActionPerformed(evt);
            }
        });

        btnD.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnD.setText("/");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnResult.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        btnResult.setText("=");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btn7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btn4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btn1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btn8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btn5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btn2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btn9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btn6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btn3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnDel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnMulti, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnSuma, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 7, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnBTo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnD, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnResult, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnResta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jPanel2Layout.createSequentialGroup()
                                    .add(btn9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(btn6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(btn3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(45, 45, 45))
                                .add(jPanel2Layout.createSequentialGroup()
                                    .add(btn7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(btn4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(btn1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(btnC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(btn8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btn5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btn2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(btnBTo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnD, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnResta, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnResult, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(btnDel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnMulti, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnSuma, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .add(0, 0, Short.MAX_VALUE))))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResulActionPerformed

    }//GEN-LAST:event_txtResulActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        addNumber("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addNumber("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        addNumber("0");
    }//GEN-LAST:event_btnCActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        addNumber("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        addNumber(".");
    }//GEN-LAST:event_btnPActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        addNumber("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        addNumber("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addNumber("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addNumber("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        addNumber("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        addNumber("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        txtResul.setText("");
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        addOperation("x");
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        addOperation("+");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnBToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBToActionPerformed
        txtResul.setText("");
        System.out.println("Borrar");
    }//GEN-LAST:event_btnBToActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        addOperation("/");
    }//GEN-LAST:event_btnDActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        addOperation("-");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        addResult("=");
    }//GEN-LAST:event_btnResultActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    public void addNumber(String digito){
    txtResul.setText(txtResul.getText()+digito);
    nueva=false;
    }
    public void addOperation(String operaciones){
    try{
        if(op1!=0)
            op1=op1+Double.parseDouble(txtResul.getText());
        else
            op1=Double.parseDouble(txtResul.getText());
        operacion=operaciones;
        txtResul.setText("");
        }catch(Exception err){}
    }
    
    public void addResult(String resultado){
    try{
        op2=Double.parseDouble(txtResul.getText());
        }catch(Exception err){}
    if(operacion.equals("+")){
        double res = op1+op2;
        txtResul.setText(String.valueOf(res));
        op1=op2=0;
        operacion="";
    }else if(operacion.equals("-")){
        double res = op1-op2;
        txtResul.setText(String.valueOf(res));
        op1=op2=0;
        operacion="";
    }else if(operacion.equals("x")){
        double res = op1*op2;
        txtResul.setText(String.valueOf(res));
        op1=op2=0;
        operacion="";
    }else if(operacion.equals("/")){
        double res = op1/op2;
        txtResul.setText(String.valueOf(res));
        op1=op2=0;
        operacion="";
    }
    nueva=true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBTo;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnSuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtResul;
    // End of variables declaration//GEN-END:variables

}
