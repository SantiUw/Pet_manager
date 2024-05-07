/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Class.*;
import controller.*;
import java.awt.Color;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Usuario
 */
public class show extends javax.swing.JFrame {
    ctlpet ctlPet;
    
    LinkedList<clscat> Catlist= new LinkedList<clscat>();
    LinkedList<clsdog> Doglist= new LinkedList<clsdog>();
    JList list = new JList();

    /**
     * Creates new form show
     */
    public show() {
        initComponents();
        setLocationRelativeTo(null);
        this.ctlPet = new ctlpet();
        fillJlist();
    }
    
    public static String firstNChars(String str, int n) {
        if (str == null) {
            return null;
        }
 
        return str.length() < n ? str : str.substring(0, n);
    }
    
     public static String getLastN(String s, int n) {
        if (s == null || n > s.length()) {
            return s;
        }
        return s.substring(s.length() - n);
    }
     
     public void vacio(){
        txtname.setText("");
        txtcode.setText("");
        txtcolor.setText("");
        txtbreed.setText("");
        txthealth.setText("");
        txtyear.setText("");
        txtpedigree.setText("");
         
     }

       
    
    private void fillJlist(){
        LinkedList<clspet> listap= ctlPet.listar();
        
        DefaultListModel model = new DefaultListModel();
        petList.setModel(model);
        
        
        
        int index=0;
        
        
        Iterator iter= listap.iterator();

        
        while(iter.hasNext()){
            clspet dog= (clspet)iter.next();
        }
        
        for(clspet pet:  listap){
            if(pet.getAnimalType()=="Perro"){
                String data= pet.getCode()+"-Perro";
                model.add(index, data);
                index++;
            }else if(pet.getAnimalType()=="Gato"){
                String data= pet.getCode()+"-Gato";
                model.add(index, data);
                index++;
            }else{
                
            } 
        }

        
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);

        
       petList.setModel(model);
    }
    
    
    public void nuevocat() {
        CatTxtname.setText("");
        CatTxthealth.setSelectedIndex(0);
        CatTxtcolor.setText("");
        CatTxtcode.setText("");
        CatTxtborn.setText("");
        CatTxtbreed.setSelectedIndex(0);
        CatTxtcode.requestFocus();
    }
    
    public void nuevodog() {
        DogTxtname.setText("");
        DogTxthealth.setSelectedIndex(0);
        DogTxtcolor.setText("");
        DogTxtcode.setText("");
        DogTxtyear.setText("");
        DogTxtbreed.setSelectedIndex(0);
        DogTxtpedigree.setSelected(false);
        DogTxtcode.requestFocus();
    }
    

    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        petList = new javax.swing.JList<>();
        frame = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        txtcode = new javax.swing.JLabel();
        txtyear = new javax.swing.JLabel();
        txtcolor = new javax.swing.JLabel();
        txtbreed = new javax.swing.JLabel();
        txthealth = new javax.swing.JLabel();
        txtpedigree = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CatTxtcode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CatTxtborn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CatTxthealth = new javax.swing.JComboBox<>(){
            @Override
            public javax.swing.ListCellRenderer getRenderer() {
                return new javax.swing.DefaultListCellRenderer() {
                    @Override
                    public java.awt.Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        java.awt.Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (isSelected) {
                            c.setBackground(new java.awt.Color(204, 255, 51));
                            c.setForeground(new java.awt.Color(51, 51, 51));
                        } else {
                            c.setBackground(new java.awt.Color(51, 51, 51));
                            c.setForeground(new java.awt.Color(204, 255, 51));
                        }
                        return c;
                    }
                };
            }

        };
        jLabel8 = new javax.swing.JLabel();
        CatTxtname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CatTxtcolor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CatTxtbreed = new javax.swing.JComboBox<>(){
            @Override
            public javax.swing.ListCellRenderer getRenderer() {
                return new javax.swing.DefaultListCellRenderer() {
                    @Override
                    public java.awt.Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        java.awt.Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (isSelected) {
                            c.setBackground(new java.awt.Color(204, 255, 51));
                            c.setForeground(new java.awt.Color(51, 51, 51));
                        } else {
                            c.setBackground(new java.awt.Color(51, 51, 51));
                            c.setForeground(new java.awt.Color(204, 255, 51));
                        }
                        return c;
                    }
                };
            }

        };
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        DogTxtcode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        DogTxtname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        DogTxtyear = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        DogTxtcolor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        DogTxthealth = new javax.swing.JComboBox<>(){
            @Override
            public javax.swing.ListCellRenderer getRenderer() {
                return new javax.swing.DefaultListCellRenderer() {
                    @Override
                    public java.awt.Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        java.awt.Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (isSelected) {
                            c.setBackground(new java.awt.Color(204, 255, 51));
                            c.setForeground(new java.awt.Color(51, 51, 51));
                        } else {
                            c.setBackground(new java.awt.Color(51, 51, 51));
                            c.setForeground(new java.awt.Color(204, 255, 51));
                        }
                        return c;
                    }
                };
            }

        };
        jLabel16 = new javax.swing.JLabel();
        btnCreateDog = new javax.swing.JButton();
        btnSearchDog = new javax.swing.JButton();
        btnEditDog = new javax.swing.JButton();
        btnDeleteDog = new javax.swing.JButton();
        DogTxtpedigree = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        DogTxtbreed = new javax.swing.JComboBox<>(){
            @Override
            public javax.swing.ListCellRenderer getRenderer() {
                return new javax.swing.DefaultListCellRenderer() {
                    @Override
                    public java.awt.Component getListCellRendererComponent(javax.swing.JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        java.awt.Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (isSelected) {
                            c.setBackground(new java.awt.Color(204, 255, 51));
                            c.setForeground(new java.awt.Color(51, 51, 51));
                        } else {
                            c.setBackground(new java.awt.Color(51, 51, 51));
                            c.setForeground(new java.awt.Color(204, 255, 51));
                        }
                        return c;
                    }
                };
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(204, 255, 0));
        jTabbedPane1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseEntered(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        petList.setBackground(new java.awt.Color(51, 51, 51));
        petList.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        petList.setForeground(new java.awt.Color(204, 255, 0));
        petList.setSelectionBackground(new java.awt.Color(204, 255, 0));
        petList.setSelectionForeground(new java.awt.Color(51, 51, 51));
        petList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                petListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(petList);

        frame.setBackground(new java.awt.Color(51, 51, 51));
        frame.setForeground(new java.awt.Color(204, 204, 204));
        frame.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Informacion de la Mascota:");
        jLabel21.setToolTipText("");

        txtname.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        txtname.setForeground(new java.awt.Color(204, 255, 0));

        txtcode.setBackground(new java.awt.Color(51, 51, 51));
        txtcode.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        txtcode.setForeground(new java.awt.Color(204, 255, 0));
        txtcode.setToolTipText("");

        txtyear.setBackground(new java.awt.Color(51, 51, 51));
        txtyear.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        txtyear.setForeground(new java.awt.Color(204, 255, 0));

        txtcolor.setBackground(new java.awt.Color(51, 51, 51));
        txtcolor.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        txtcolor.setForeground(new java.awt.Color(204, 255, 0));

        txtbreed.setBackground(new java.awt.Color(51, 51, 51));
        txtbreed.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        txtbreed.setForeground(new java.awt.Color(204, 255, 0));

        txthealth.setBackground(new java.awt.Color(51, 51, 51));
        txthealth.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        txthealth.setForeground(new java.awt.Color(204, 255, 0));

        txtpedigree.setBackground(new java.awt.Color(51, 51, 51));
        txtpedigree.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        txtpedigree.setForeground(new java.awt.Color(204, 255, 0));

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame);
        frame.setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addContainerGap(162, Short.MAX_VALUE))
                    .addGroup(frameLayout.createSequentialGroup()
                        .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtyear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcolor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbreed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txthealth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(txtpedigree, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbreed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txthealth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpedigree)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("petList", jPanel3);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Code : ");

        CatTxtcode.setBackground(new java.awt.Color(51, 51, 51));
        CatTxtcode.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        CatTxtcode.setForeground(new java.awt.Color(204, 255, 0));
        CatTxtcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        CatTxtcode.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        CatTxtcode.setSelectionColor(new java.awt.Color(204, 255, 0));
        CatTxtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatTxtcodeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Born Year :");

        CatTxtborn.setBackground(new java.awt.Color(51, 51, 51));
        CatTxtborn.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        CatTxtborn.setForeground(new java.awt.Color(204, 255, 0));
        CatTxtborn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        CatTxtborn.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        CatTxtborn.setSelectionColor(new java.awt.Color(204, 255, 0));
        CatTxtborn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatTxtbornActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Health Status : ");

        CatTxthealth.setBackground(new java.awt.Color(51, 51, 51));
        CatTxthealth.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        CatTxthealth.setForeground(new java.awt.Color(204, 255, 0));
        CatTxthealth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Sano", "Enfermo", "Muerto", "Fracturado", "hospitalizado" }));
        CatTxthealth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        CatTxthealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatTxthealthActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Name :");

        CatTxtname.setBackground(new java.awt.Color(51, 51, 51));
        CatTxtname.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        CatTxtname.setForeground(new java.awt.Color(204, 255, 0));
        CatTxtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        CatTxtname.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        CatTxtname.setSelectionColor(new java.awt.Color(204, 255, 0));
        CatTxtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatTxtnameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Color : ");

        CatTxtcolor.setBackground(new java.awt.Color(51, 51, 51));
        CatTxtcolor.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        CatTxtcolor.setForeground(new java.awt.Color(204, 255, 0));
        CatTxtcolor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        CatTxtcolor.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        CatTxtcolor.setSelectionColor(new java.awt.Color(204, 255, 0));
        CatTxtcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatTxtcolorActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Breed : ");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 255, 0));
        jButton1.setText("Crear");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 255, 0));
        jButton2.setText("Search");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 255, 0));
        jButton3.setText("Editar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 255, 0));
        jButton4.setText("Delete");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/happy (1).png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/happy (1).png"))); // NOI18N

        CatTxtbreed.setBackground(new java.awt.Color(51, 51, 51));
        CatTxtbreed.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        CatTxtbreed.setForeground(new java.awt.Color(204, 255, 0));
        CatTxtbreed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Criollo", "Persa", "Siames", "Kohana", "Turco", "Angora", "Caracat" }));
        CatTxtbreed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatTxtbreedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6))
                            .addGap(44, 44, 44))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CatTxtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CatTxtborn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(CatTxthealth, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(41, 41, 41))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(36, 36, 36))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CatTxtcolor)
                            .addComponent(CatTxtname)
                            .addComponent(CatTxtbreed, 0, 90, Short.MAX_VALUE))
                        .addGap(131, 131, 131))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel18)
                        .addGap(40, 40, 40))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CatTxtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(CatTxtname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CatTxtborn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CatTxtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CatTxthealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(CatTxtbreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))))
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("CatManager", jPanel2);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Code : ");

        DogTxtcode.setBackground(new java.awt.Color(51, 51, 51));
        DogTxtcode.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        DogTxtcode.setForeground(new java.awt.Color(204, 255, 0));
        DogTxtcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        DogTxtcode.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        DogTxtcode.setSelectionColor(new java.awt.Color(204, 255, 0));
        DogTxtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogTxtcodeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Name :");

        DogTxtname.setBackground(new java.awt.Color(51, 51, 51));
        DogTxtname.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        DogTxtname.setForeground(new java.awt.Color(204, 255, 0));
        DogTxtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        DogTxtname.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        DogTxtname.setSelectionColor(new java.awt.Color(204, 255, 0));
        DogTxtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogTxtnameActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Born Year :");

        DogTxtyear.setBackground(new java.awt.Color(51, 51, 51));
        DogTxtyear.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        DogTxtyear.setForeground(new java.awt.Color(204, 255, 0));
        DogTxtyear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        DogTxtyear.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        DogTxtyear.setSelectionColor(new java.awt.Color(204, 255, 0));
        DogTxtyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogTxtyearActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Color : ");

        DogTxtcolor.setBackground(new java.awt.Color(51, 51, 51));
        DogTxtcolor.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        DogTxtcolor.setForeground(new java.awt.Color(204, 255, 0));
        DogTxtcolor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        DogTxtcolor.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        DogTxtcolor.setSelectionColor(new java.awt.Color(204, 255, 0));
        DogTxtcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogTxtcolorActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Health Status : ");

        DogTxthealth.setBackground(new java.awt.Color(51, 51, 51));
        DogTxthealth.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        DogTxthealth.setForeground(new java.awt.Color(204, 255, 0));
        DogTxthealth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Sano", "Enfermo", "Muerto", "Fracturado", "hospitalizado" }));
        DogTxthealth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        DogTxthealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogTxthealthActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Breed : ");

        btnCreateDog.setBackground(new java.awt.Color(51, 51, 51));
        btnCreateDog.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnCreateDog.setForeground(new java.awt.Color(204, 255, 0));
        btnCreateDog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnCreateDog.setLabel("Create");
        btnCreateDog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateDogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateDogMouseExited(evt);
            }
        });
        btnCreateDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDogActionPerformed(evt);
            }
        });

        btnSearchDog.setBackground(new java.awt.Color(51, 51, 51));
        btnSearchDog.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnSearchDog.setForeground(new java.awt.Color(204, 255, 0));
        btnSearchDog.setText("Search");
        btnSearchDog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnSearchDog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSearchDog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchDogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchDogMouseExited(evt);
            }
        });
        btnSearchDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDogActionPerformed(evt);
            }
        });

        btnEditDog.setBackground(new java.awt.Color(51, 51, 51));
        btnEditDog.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnEditDog.setForeground(new java.awt.Color(204, 255, 0));
        btnEditDog.setActionCommand("Edit");
        btnEditDog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnEditDog.setLabel("Edit");
        btnEditDog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditDogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditDogMouseExited(evt);
            }
        });
        btnEditDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDogActionPerformed(evt);
            }
        });

        btnDeleteDog.setBackground(new java.awt.Color(51, 51, 51));
        btnDeleteDog.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnDeleteDog.setForeground(new java.awt.Color(204, 255, 0));
        btnDeleteDog.setText("Delete");
        btnDeleteDog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnDeleteDog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteDogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteDogMouseExited(evt);
            }
        });
        btnDeleteDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDogActionPerformed(evt);
            }
        });

        DogTxtpedigree.setBackground(new java.awt.Color(51, 51, 51));
        DogTxtpedigree.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        DogTxtpedigree.setForeground(new java.awt.Color(204, 204, 204));
        DogTxtpedigree.setText("Pedigree");
        DogTxtpedigree.setBorder(null);
        DogTxtpedigree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DogTxtpedigreeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DogTxtpedigreeMouseExited(evt);
            }
        });
        DogTxtpedigree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogTxtpedigreeActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/dog.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/dog.png"))); // NOI18N

        DogTxtbreed.setBackground(new java.awt.Color(51, 51, 51));
        DogTxtbreed.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        DogTxtbreed.setForeground(new java.awt.Color(204, 255, 0));
        DogTxtbreed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Criollo", "Chihuahua", "Pomerania", "Beagle", "Caniche", "Bull Dog", "Cocker", "Pastor Aleman", "San Bernardo", "Gran Danés", "Labrador", "Golden retriever", "Schanauzer" }));
        DogTxtbreed.setBorder(null);
        DogTxtbreed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DogTxtbreed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DogTxtbreedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(118, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateDog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DogTxtcode, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DogTxtyear, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DogTxthealth, 0, 90, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel12))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(DogTxtpedigree, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DogTxtname, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(DogTxtcolor)
                            .addComponent(DogTxtbreed, 0, 1, Short.MAX_VALUE))
                        .addGap(130, 130, 130))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnSearchDog, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnEditDog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btnDeleteDog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel20)
                        .addGap(40, 40, 40))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(DogTxtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(DogTxtname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(DogTxtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DogTxtyear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(DogTxthealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(DogTxtbreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DogTxtpedigree))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCreateDog)
                                    .addComponent(btnSearchDog)
                                    .addComponent(btnEditDog)
                                    .addComponent(btnDeleteDog))))))
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("DogManager", jPanel4);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 0));
        jLabel1.setText(" Kapporet Pet");
        jLabel1.setMaximumSize(new java.awt.Dimension(759, 512));
        jLabel1.setMinimumSize(new java.awt.Dimension(759, 512));
        jLabel1.setPreferredSize(new java.awt.Dimension(759, 512));

        jLabel2.setMaximumSize(new java.awt.Dimension(512, 512));
        jLabel2.setMinimumSize(new java.awt.Dimension(512, 512));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/footprint (1).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/footprint.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CatTxtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatTxtcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatTxtcodeActionPerformed

    private void CatTxtbornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatTxtbornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatTxtbornActionPerformed

    private void CatTxthealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatTxthealthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatTxthealthActionPerformed

    private void CatTxtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatTxtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatTxtnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
        String code= CatTxtcode.getText();
        String name= CatTxtname.getText();
        String color= CatTxtcolor.getText();
        int year= Integer.parseInt(CatTxtborn.getText());
        String breed= CatTxtbreed.getSelectedItem().toString();
        String health = CatTxthealth.getSelectedItem().toString();
        if(code.equals(" ") || name.equals("") || color.equals(" ") || breed.equals("...") || health.equals("...")){
            JOptionPane.showMessageDialog(null, "cajas estan Vacias!!!");
            }else{
                clscat c= new clscat(breed, code, name, year, color, health);
                
                String text= ctlPet.CreatePet(c);
                JOptionPane.showMessageDialog(null, text);
                fillJlist();
                nuevocat();
                }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Año invalido, vuelva a ingresarlo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DogTxtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogTxtcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DogTxtcodeActionPerformed

    private void DogTxtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogTxtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DogTxtnameActionPerformed

    private void DogTxtyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogTxtyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DogTxtyearActionPerformed

    private void DogTxthealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogTxthealthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DogTxthealthActionPerformed

    private void btnCreateDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDogActionPerformed
        try{
        String code= DogTxtcode.getText();
        String name= DogTxtname.getText();
        String color= DogTxtcolor.getText();
        int year= Integer.parseInt(DogTxtyear.getText());
        String breed= DogTxtbreed.getSelectedItem().toString();
        String health = DogTxthealth.getSelectedItem().toString();
        boolean pedigre= DogTxtpedigree.isSelected();
        if(code.equals(" ") || name.equals("") || color.equals(" ") || breed.equals("...") || health.equals("...")){
            JOptionPane.showMessageDialog(null, "cajas estan Vacias!!!");
        }else{
            clsdog d= new clsdog(breed,pedigre, code, name, year, color, health);
            fillJlist();
            String text=ctlPet.CreatePet(d);
            JOptionPane.showMessageDialog(null, text);
            nuevodog();
            }   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Año invalido, vuelva a ingresarlo");
        }
    }//GEN-LAST:event_btnCreateDogActionPerformed

    private void DogTxtpedigreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogTxtpedigreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DogTxtpedigreeActionPerformed

    private void btnCreateDogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateDogMouseEntered
        btnCreateDog.setBackground(new Color(204,255,0));
        btnCreateDog.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_btnCreateDogMouseEntered

    private void btnCreateDogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateDogMouseExited
        btnCreateDog.setBackground(new Color(51,51,51));
        btnCreateDog.setForeground(new Color(204,255,0));
    }//GEN-LAST:event_btnCreateDogMouseExited

    private void jTabbedPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseEntered

    }//GEN-LAST:event_jTabbedPane1MouseEntered

    private void btnEditDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDogActionPerformed
        try {
            String code= DogTxtcode.getText();             
            String name= DogTxtname.getText();
            String color= DogTxtcolor.getText();
            int year= Integer.parseInt(DogTxtyear.getText());
            String breed= DogTxtbreed.getSelectedItem().toString();
            String health = DogTxthealth.getSelectedItem().toString();  
            boolean pedigri= DogTxtpedigree.isSelected();
            clsdog d= new clsdog(breed, pedigri,  code, name, year, color, health);
            
            String text= ctlPet.EditPet(d);
            JOptionPane.showMessageDialog(null, text);
            
            nuevodog();
                
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEditDogActionPerformed

    private void DogTxtcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogTxtcolorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DogTxtcolorActionPerformed

    private void btnSearchDogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchDogMouseEntered
        btnSearchDog.setBackground(new Color(204,255,0));
        btnSearchDog.setForeground(new Color(51,51,51));    }//GEN-LAST:event_btnSearchDogMouseEntered

    private void btnSearchDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDogActionPerformed
        String code= DogTxtcode.getText();
        clsdog dog = (clsdog) ctlPet.SearchPet(code, "Perro");
        try {              
            if(dog == null){
                JOptionPane.showMessageDialog(null, "Codigo no encontrado");                    
            }else{
                DogTxtcode.setText(dog.getCode());
                DogTxtname.setText(dog.getName());
                DogTxtcolor.setText(dog.getColor());
                DogTxtyear.setText(String.valueOf(dog.getBorn_year()));
                DogTxtbreed.setSelectedItem(dog.getBreed());
                DogTxthealth.setSelectedItem(dog.getHealthStatus()); 
                DogTxtpedigree.setSelected(dog.getPedigri());
            }
        
        } catch (Exception e) {
        }
           
    }//GEN-LAST:event_btnSearchDogActionPerformed

    private void btnSearchDogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchDogMouseExited
        btnSearchDog.setBackground(new Color(51,51,51));
        btnSearchDog.setForeground(new Color(204,255,0));
    }//GEN-LAST:event_btnSearchDogMouseExited

    private void btnEditDogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditDogMouseEntered
        btnEditDog.setBackground(new Color(204,255,0));
        btnEditDog.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_btnEditDogMouseEntered

    private void btnEditDogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditDogMouseExited
        btnEditDog.setBackground(new Color(51,51,51));
        btnEditDog.setForeground(new Color(204,255,0));
    }//GEN-LAST:event_btnEditDogMouseExited

    private void btnDeleteDogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteDogMouseEntered
        btnDeleteDog.setBackground(new Color(204,255,0));
        btnDeleteDog.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_btnDeleteDogMouseEntered

    private void btnDeleteDogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteDogMouseExited
        btnDeleteDog.setBackground(new Color(51,51,51));
        btnDeleteDog.setForeground(new Color(204,255,0));
    }//GEN-LAST:event_btnDeleteDogMouseExited

    private void DogTxtpedigreeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DogTxtpedigreeMouseEntered
        DogTxtpedigree.setForeground(new Color(204,255,0));
    }//GEN-LAST:event_DogTxtpedigreeMouseEntered

    private void DogTxtpedigreeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DogTxtpedigreeMouseExited
        DogTxtpedigree.setForeground(new Color(204,204,204));

    }//GEN-LAST:event_DogTxtpedigreeMouseExited

    private void CatTxtcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatTxtcolorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatTxtcolorActionPerformed

    private void CatTxtbreedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatTxtbreedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatTxtbreedActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String code= CatTxtcode.getText();
        clscat cat = (clscat) ctlPet.SearchPet(code, "Gato");
        try {            
            if(cat == null){
                JOptionPane.showMessageDialog(null, "Codigo no encontrado");                    
            }else{  
                CatTxtcode.setText(cat.getCode());
                CatTxtname.setText(cat.getName());
                CatTxtcolor.setText(cat.getColor());
                CatTxtborn.setText(String.valueOf(cat.getBorn_year()));
                CatTxtbreed.setSelectedItem(cat.getBreed());
                CatTxthealth.setSelectedItem(cat.getHealthStatus());
                
                
                
                
                }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe esta mascota");
        }
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void petListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petListMouseClicked

        String code= firstNChars(petList.getSelectedValue(), 3);
        
        String[] parts = petList.getSelectedValue().split("-");
        String Type = parts[1];
        try {
            if(Type.equals("Gato")){
                vacio();
                
                clscat cat = (clscat) ctlPet.MostrarPet(code, "Gato");

                if(cat == null){
                    JOptionPane.showMessageDialog(null, "Codigo no encontrado");                    
                }else{  
                    txtname.setText(cat.getName());
                    txtcode.setText(cat.getCode());
                    txtcolor.setText(cat.getColor());
                    txtbreed.setText(cat.getBreed());
                    txthealth.setText(cat.getHealthStatus());
                    txtyear.setText(String.valueOf(cat.getBorn_year()));
                }
            }else if(Type.equals("Perro")){
                vacio();
                clsdog dog = (clsdog) ctlPet.MostrarPet(code, "Perro");

                if(dog == null){
                    JOptionPane.showMessageDialog(null, "Codigo no encontrado");                    
                }else{  
                    txtname.setText(dog.getName());
                    txtcode.setText(dog.getCode());
                    txtcolor.setText(dog.getColor());
                    txtbreed.setText(dog.getBreed());
                    txthealth.setText(dog.getHealthStatus());
                    txtyear.setText(String.valueOf(dog.getBorn_year()));
                    txtpedigree.setText(dog.getPedigri().toString());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        

        
        
        
        /*
        int index=petList.getSelectedIndex();
            txtname.setText(Catlist.get(index).getName());
            txtcode.setText(Catlist.get(index).getCode());
            txtcolor.setText(Catlist.get(index).getColor());
            txtbreed.setText(Catlist.get(index).getBreed());
            txthealth.setText(Catlist.get(index).getHealthStatus());
            txtyear.setText(String.valueOf(Catlist.get(index).getBorn_year()));
          */  

                       
    }//GEN-LAST:event_petListMouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(204,255,0));
        jButton1.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(51,51,51));
        jButton1.setForeground(new Color(204,255,0));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(204,255,0));
        jButton2.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(51,51,51));
        jButton2.setForeground(new Color(204,255,0));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(204,255,0));
        jButton3.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(51,51,51));
        jButton3.setForeground(new Color(204,255,0));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new Color(204,255,0));
        jButton4.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new Color(51,51,51));
        jButton4.setForeground(new Color(204,255,0));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                
        try {
            String code= CatTxtcode.getText();             
            String name= CatTxtname.getText();
            String color= CatTxtcolor.getText();
            int year= Integer.parseInt(CatTxtborn.getText());
            String breed= CatTxtbreed.getSelectedItem().toString();
            String health = CatTxthealth.getSelectedItem().toString();  
            clscat c= new clscat(breed, code, name, year, color, health);
            
            String text= ctlPet.EditPet(c);
            JOptionPane.showMessageDialog(null, text);
            
            nuevocat();
                
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String code= CatTxtcode.getText();              
            clscat c= new clscat();
            c.setCode(code);
            
            String text= ctlPet.DelatePet(c);
            JOptionPane.showMessageDialog(null, text);    
            fillJlist();
            
                    nuevocat();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DogTxtbreedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DogTxtbreedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DogTxtbreedActionPerformed

    private void btnDeleteDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDogActionPerformed
        try {
            String code= DogTxtcode.getText();              
            clsdog c= new clsdog();
            c.setCode(code);
            
            String text= ctlPet.DelatePet(c);
            JOptionPane.showMessageDialog(null, text);    
            fillJlist();
            
                    nuevodog();

        } catch (Exception e) {
        }

        
    }//GEN-LAST:event_btnDeleteDogActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CatTxtborn;
    private javax.swing.JComboBox<String> CatTxtbreed;
    private javax.swing.JTextField CatTxtcode;
    private javax.swing.JTextField CatTxtcolor;
    private javax.swing.JComboBox<String> CatTxthealth;
    private javax.swing.JTextField CatTxtname;
    private javax.swing.JComboBox<String> DogTxtbreed;
    private javax.swing.JTextField DogTxtcode;
    private javax.swing.JTextField DogTxtcolor;
    private javax.swing.JComboBox<String> DogTxthealth;
    private javax.swing.JTextField DogTxtname;
    private javax.swing.JCheckBox DogTxtpedigree;
    private javax.swing.JTextField DogTxtyear;
    private javax.swing.JButton btnCreateDog;
    private javax.swing.JButton btnDeleteDog;
    private javax.swing.JButton btnEditDog;
    private javax.swing.JButton btnSearchDog;
    private javax.swing.JPanel frame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> petList;
    private javax.swing.JLabel txtbreed;
    private javax.swing.JLabel txtcode;
    private javax.swing.JLabel txtcolor;
    private javax.swing.JLabel txthealth;
    private javax.swing.JLabel txtname;
    private javax.swing.JLabel txtpedigree;
    private javax.swing.JLabel txtyear;
    // End of variables declaration//GEN-END:variables
}
