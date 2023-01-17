/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author arjun
 */
public class MultiLineTableCellRenderer extends DefaultTableCellRenderer {

    private JTextArea textArea;

    public MultiLineTableCellRenderer() {
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // set the text and wrap it if necessary
        textArea.setText(value.toString());
        // adjust the row height to fit the text
        int currentRowHeight = table.getRowHeight(row);
        int preferredRowHeight = textArea.getPreferredSize().height;
        if (currentRowHeight < preferredRowHeight) {
            table.setRowHeight(row, preferredRowHeight);
        }
        return textArea;
    }
}
