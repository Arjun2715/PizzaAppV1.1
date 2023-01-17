
package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

/**
 *
 * @author arjun
 */
public class test {

    /**
     * 
     * 
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String username = "admin";
//        System.out.println(username.substring(0, 1).toUpperCase() + "" + username.substring(1));
//        //jLabel1.setIcon(new ImageIcon("bg.png"));
//        Runnable r = new Runnable() {
//            public void run() {
//                final JButton b = new JButton("Pop Up");
//
//                final JPopupMenu menu = new JPopupMenu("Menu");
//                menu.add("A");
//                menu.add("B");
//                menu.add("C");
//                b.addActionListener(new ActionListener() {
//                    public void actionPerformed(ActionEvent ae) {
//                        menu.show(b, b.getWidth() / 2, b.getHeight() / 2);
//                        System.out.println(ae.getActionCommand());
//
//                    }
//                });
//                JOptionPane.showMessageDialog(null, b);
//            }
//        };
//        SwingUtilities.invokeLater(r);
//
//        ActionListener menuListener = new ActionListener() {
//            public void actionPerformed(ActionEvent event) {
//                System.out.println("Popup menu item ["
//                        + event.getActionCommand() + "] was pressed.");
//            }
//        };
//
//    }

//    private static void userExixt() {
//        String data = "";
//        String password = "9876";
//        String username = "arjun";
//
//        try {
//            File file = new File("users\\loginUsers.txt");
//            System.out.println(file.exists() + " file found!!!");
//            Scanner in = new Scanner(file);
//            while (in.hasNext()) {
//                data += in.nextLine();
////                System.out.println(data);
//            }
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//        System.out.println(data);
//
//        String[] userData = data.split(";");
//        System.out.println(Arrays.toString(userData));
//        
//        
//        for (String user : userData) {
//            
//            
//            int index = user.indexOf(",");
//            System.out.println(index);
//            System.out.println(user.substring(0, index));
//            if (user.substring(0, index).equals(username)) {
//                System.out.println("user exist");
//                System.out.println(user.substring(index, user.length()));
//                if (user.substring(index+1, user.length()).equals(password)) {
//                    System.out.println("logged in");
//                } else {
//                    //System.out.println(user.substring(index, user.length()));
//                    System.out.println("Password incorrect");
//                }
//            } else {
//                //System.out.println(user.substring(0, index));
//                System.out.println("user incorrect");
//                
//            }
//        }
//    }
}
}
