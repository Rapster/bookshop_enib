/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JUpdateBookPanel.java
 *
 * Created on 14 oct. 2009, 11:46:50
 */

package fr.enib.ihm.bookshop.view;

import fr.enib.ihm.bookshop.domain.catalog.Book;
import java.text.SimpleDateFormat;

/**
 *
 * @author yo8chapa
 */
public class JReadBookPanel extends javax.swing.JPanel {

    /** Creates new form JEditBookPanel */
    public JReadBookPanel(Book b) {
        initComponents();
        this.setBookToUpdated(b);
        jTextTitle.setText(bookToUpdated.getTitle());
        if(bookToUpdated.getSubject()!=null)
        jTextSubject.setText(bookToUpdated.getSubject().getName());
        jTextIsbn.setText(bookToUpdated.getIsbn());
        jTextLang.setText(bookToUpdated.getLang());
        jTextAuthor.setText(bookToUpdated.getAuthor());
        jTextEditor.setText(bookToUpdated.getEditor());
        jTextPrice.setText(bookToUpdated.getPrice().toString());
        if(bookToUpdated.getDateOfParution()!=null){
            SimpleDateFormat d = new SimpleDateFormat ("dd/MM/yyyy" );
            String dateString = d.format(bookToUpdated.getDateOfParution());
            jTextDateParution.setText(dateString);
        }
        jTextImagePath.setText(bookToUpdated.getImagePath());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbLTitleNorth = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jPanelClose = new javax.swing.JPanel();
        jButtonClose = new javax.swing.JButton();
        jPanelForm = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelIsbn = new javax.swing.JLabel();
        jLabelLang = new javax.swing.JLabel();
        jLabelAuthor = new javax.swing.JLabel();
        jLabelEditor = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelDateParution = new javax.swing.JLabel();
        jLabelImagePath = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextTitle = new javax.swing.JTextField();
        jTextIsbn = new javax.swing.JTextField();
        jTextLang = new javax.swing.JTextField();
        jTextAuthor = new javax.swing.JTextField();
        jTextEditor = new javax.swing.JTextField();
        jTextPrice = new javax.swing.JTextField();
        jTextImagePath = new javax.swing.JTextField();
        jTextSubject = new javax.swing.JTextField();
        jTextDateParution = new javax.swing.JTextField();

        setName("JMainPanel"); // NOI18N
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jLbLTitleNorth.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        jLbLTitleNorth.setText("Read a book");
        jLbLTitleNorth.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(jLbLTitleNorth, java.awt.BorderLayout.NORTH);

        jPanelFooter.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanelFooter.setOpaque(false);
        jPanelFooter.setLayout(new javax.swing.BoxLayout(jPanelFooter, javax.swing.BoxLayout.X_AXIS));

        jPanelClose.setOpaque(false);
        jPanelClose.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButtonClose.setText("Close");
        jButtonClose.setToolTipText("Close this panel");
        jButtonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCloseMouseClicked(evt);
            }
        });
        jPanelClose.add(jButtonClose);

        jPanelFooter.add(jPanelClose);

        add(jPanelFooter, java.awt.BorderLayout.SOUTH);

        jPanelForm.setOpaque(false);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabelTitle.setText("Title");

        jLabelIsbn.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabelIsbn.setText("ISNB");

        jLabelLang.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabelLang.setText("Lang");

        jLabelAuthor.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabelAuthor.setText("Author");

        jLabelEditor.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabelEditor.setText("Editor");

        jLabelPrice.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabelPrice.setText("Price");

        jLabelDateParution.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabelDateParution.setText("Date of Parution");

        jLabelImagePath.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabelImagePath.setText("Image path");

        jLabel1.setText("Subject");

        jTextTitle.setEditable(false);

        jTextIsbn.setEditable(false);

        jTextLang.setEditable(false);

        jTextAuthor.setEditable(false);

        jTextEditor.setEditable(false);

        jTextPrice.setEditable(false);

        jTextImagePath.setEditable(false);

        jTextSubject.setEditable(false);

        jTextDateParution.setEditable(false);

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addComponent(jLabelImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextImagePath, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrice)
                            .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelEditor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelAuthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                            .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelLang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelIsbn)
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDateParution, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(jTextEditor, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(jTextPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(jTextAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(jTextLang, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(jTextIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(jTextSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(jTextDateParution, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIsbn)
                    .addComponent(jTextIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLang)
                    .addComponent(jTextLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAuthor)
                    .addComponent(jTextAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditor)
                    .addComponent(jTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrice)
                    .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateParution)
                    .addComponent(jTextDateParution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelImagePath)
                    .addComponent(jTextImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanelForm, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCloseMouseClicked
        this.getParent().remove(this); // Close panel
    }//GEN-LAST:event_jButtonCloseMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelDateParution;
    private javax.swing.JLabel jLabelEditor;
    private javax.swing.JLabel jLabelImagePath;
    private javax.swing.JLabel jLabelIsbn;
    private javax.swing.JLabel jLabelLang;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLbLTitleNorth;
    private javax.swing.JPanel jPanelClose;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JTextField jTextAuthor;
    private javax.swing.JTextField jTextDateParution;
    private javax.swing.JTextField jTextEditor;
    private javax.swing.JTextField jTextImagePath;
    private javax.swing.JTextField jTextIsbn;
    private javax.swing.JTextField jTextLang;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextSubject;
    private javax.swing.JTextField jTextTitle;
    // End of variables declaration//GEN-END:variables
    private Book bookToUpdated;

    public void setBookToUpdated(Book bookToUpdated) {
        this.bookToUpdated = bookToUpdated;
    }
}