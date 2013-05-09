/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salex;

import com.nanosl.lib.db.Manager;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import lock.Coder;
import util.Format;

/**
 *
 * @author Thilina
 */
public class SuperController implements Format {

    protected Manager manager = Manager.getInstance();

    public void showError(String er) {
        JOptionPane.showMessageDialog(null, er, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public boolean isPhone(String phone) {
        if (phone.length() == 10) {
            try {
                int n = Integer.parseInt(phone);
                if (n < 1000000000) {
                    return true;
                }
            } catch (NumberFormatException numberFormatException) {
            }
        }
        return false;
    }

    public boolean isNIC(String nic) {
        if (nic.length() == 10) {
            try {
                Integer.parseInt(nic.substring(0, 9));
                String lastLetter = nic.substring(9, 10);
                if (lastLetter.equalsIgnoreCase("v") || lastLetter.equalsIgnoreCase("x")) {
                    return true;
                }
            } catch (NumberFormatException numberFormatException) {
            }
        }
        return false;
    }

    public boolean isText(String text) {
        if (text.length() > 0) {
            try {
                Integer.parseInt(text);
            } catch (NumberFormatException numberFormatException) {
                return true;
            }
        }
        return false;
    }

    public boolean isNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException numberFormatException) {
        }
        return false;
    }

    public void errorField(JTextField jTextField) {
        jTextField.setBackground(Color.PINK);
    }

    public boolean confirm(String message) {
        int ans = JOptionPane.showConfirmDialog(null, message, "Confirm", JOptionPane.YES_NO_OPTION);
        return ans == JOptionPane.YES_OPTION;
    }

    protected boolean authView() {

        long lock = Coder.gen();
        String keyText = JOptionPane.showInputDialog(lock);
        try {
            long key = Long.parseLong(keyText.trim());
            return Coder.key1(lock) == key;
        } catch (Exception e) {
            return false;
        }
    }
}
