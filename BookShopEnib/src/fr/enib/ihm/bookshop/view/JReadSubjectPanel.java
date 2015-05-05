/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JUpdateCategoryPanel.java
 *
 * Created on 31 oct. 2009, 13:02:55
 */

package fr.enib.ihm.bookshop.view;

import fr.enib.ihm.bookshop.domain.catalog.Subject;

/**
 *
 * @author Yoann
 */
public class JReadSubjectPanel extends javax.swing.JPanel {

    /** Creates new form JReadSubjectPanel */

    public JReadSubjectPanel(Subject s){
        initComponents();
        this.setSubjectRead(s);
        jTextName.setText(subjectRead.getName());
        jTextAreaDescription.setText(subjectRead.getDescription());
        if(subjectRead.getCategory() != null)
            jTextCategory.setText(subjectRead.getCategory().getName());
        else
            jTextCategory.setText("No category for this subject");
        jLabelUpdatedCategoryId.setText("Id : " + subjectRead.getId());
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabellTitle = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jButtonClose = new javax.swing.JButton();
        jLabelUpdatedCategoryId = new javax.swing.JLabel();
        jLabelCategoryAssociate = new javax.swing.JLabel();
        jTextCategory = new javax.swing.JTextField();

        jLabellTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLabellTitle.setText("Read a subject");
        jLabellTitle.setFocusable(false);

        jLabelDescription.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabelDescription.setText("Description :");
        jLabelDescription.setFocusable(false);

        jLabelName.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabelName.setText("Name : ");
        jLabelName.setFocusable(false);

        jTextName.setEditable(false);

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setOpaque(false);
        jScrollPane1.setViewportView(jTextAreaDescription);

        jButtonClose.setText("Close");
        jButtonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCloseMouseClicked(evt);
            }
        });

        jLabelUpdatedCategoryId.setFont(new java.awt.Font("DejaVu Sans", 1, 12));
        jLabelUpdatedCategoryId.setForeground(new java.awt.Color(0, 102, 204));
        jLabelUpdatedCategoryId.setText("id :");
        jLabelUpdatedCategoryId.setToolTipText("updated category's id");
        jLabelUpdatedCategoryId.setFocusable(false);
        jLabelUpdatedCategoryId.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelUpdatedCategoryId.setName("jLabelCategoryId"); // NOI18N

        jLabelCategoryAssociate.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabelCategoryAssociate.setText("Category :");

        jTextCategory.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabellTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                        .addComponent(jLabelUpdatedCategoryId))
                    .addComponent(jButtonClose, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescription)
                            .addComponent(jLabelCategoryAssociate)
                            .addComponent(jLabelName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextName, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(jTextCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabellTitle)
                    .addComponent(jLabelUpdatedCategoryId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoryAssociate)
                    .addComponent(jTextCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescription)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelUpdatedCategoryId.getAccessibleContext().setAccessibleName("jLabelCategoryId");
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCloseMouseClicked
        this.getParent().remove(this); // Close panel
}//GEN-LAST:event_jButtonCloseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JLabel jLabelCategoryAssociate;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelUpdatedCategoryId;
    private javax.swing.JLabel jLabellTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextCategory;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables

    private Subject subjectRead;
    public void setSubjectRead(Subject subjectRead) {
        this.subjectRead = subjectRead;
    }
}
