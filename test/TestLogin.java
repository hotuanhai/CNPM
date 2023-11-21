
package test;

import javax.swing.UIManager;
import view.login.BeginLogin;

/**
 *
 * @author Admin
 */
public class TestLogin {
    public static void main(String[] args) {
		try {
                    
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new BeginLogin();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	

	}
}
//-J-Dfile.encoding=UTF-8
