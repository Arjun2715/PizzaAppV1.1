/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Test;

/**
 *
 * @author arjun
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        final JFrame frame = new JFrame();
//        frame.setPreferredSize(new Dimension(600, 400));
//        final JToolBar toolBar = new JToolBar();
//
//        //Create the popup menu.
//        final JPopupMenu popup = new JPopupMenu();
//        popup.add(new JMenuItem(new AbstractAction("Option 1") {
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(frame, "Option 1 selected");
//            }
//        }));
//        popup.add(new JMenuItem(new AbstractAction("Option 2") {
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(frame, "Option 2 selected");
//            }
//        }));
//
//        final JButton button = new JButton("Options");
//        button.addMouseListener(new MouseAdapter() {
//            public void mousePressed(MouseEvent e) {
//                popup.show(e.getComponent(), e.getX(), e.getY());
//            }
//        });
//        toolBar.add(button);
//
//        frame.getContentPane().add(toolBar, BorderLayout.NORTH);
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
 // Create a ScheduledExecutorService with a single thread
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        // Schedule a task to be executed after 10 seconds have elapsed
        executor.schedule(new Runnable() {
            public void run() {
                System.out.println("Hello, world!");
            }
        }, 5, TimeUnit.SECONDS);

        // Shut down the executor service once the task has finished running
        executor.shutdown();
    }
    }
    

