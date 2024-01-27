package com.rutar.custom_flat_laf;

import java.awt.*;
import javax.swing.*;
import com.formdev.flatlaf.util.*;
import com.rutar.custom_flat_laf.themes.*;

// ............................................................................

public class Custom_Flat_LaF_Demo extends JFrame {

///////////////////////////////////////////////////////////////////////////////

public Custom_Flat_LaF_Demo() {

setTitle("Custom Flat LaF Demo");
setSize(400, 300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

///////////////////////////////////////////////////////////////////////////////

public static void main (String[] args) {

Rutar_Dark.setup();
    
if (SystemInfo.isLinux) {
    JFrame .setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
}

EventQueue.invokeLater(() -> { new Custom_Flat_LaF_Demo().setVisible(true); });

}

///////////////////////////////////////////////////////////////////////////////

}