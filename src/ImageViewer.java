import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds
 * and displays the application GUI and initialises all other components.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 0.1
 */
public class ImageViewer {
    private JFrame frame;
    
    /**
     * Create an ImageViewer show it on screen.
     */
    public ImageViewer() {
        makeFrame();
    }
    
    /**
     * Open function: open a file chooser to select a new image file.
     */
    private void openFile() {
        // this is some test output, until we do this properly
        System.out.println("open file"); 
    }
    
    /**
     * Quit function: quit the application.
     */
    private void quit() {
        System.exit(0);
    }
    
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame() {
        frame = new JFrame("ImageViewer"); 
        frame.setSize(200, 300);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        //creates the menu
        makeMenubar(frame);
        
        JLabel label = new JLabel("I am a label. I can display some text.");
        contentPane.add(label);
        
        
      // Causes the frame to arrange the components inside it properly and to size itself appropriately. 
      // We always have to call the pack method on the frame after we have added or resized components.
        //frame.pack();
        
        frame.setVisible(true);
    }
    
    /**
     *  Create the Swing menu and its content.
     */
    private void makeMenubar(JFrame frame) {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        //Now we are ready to create a menu and add it to the menu bar:
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        //These two lines create a menu labeled File and insert it into our menu bar. Finally, we can add menu
        //tems to the menu. The following lines add two items, labeled Open and Quit, to the File menu:
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { openFile(); }
        });
        fileMenu.add(openItem);
        
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) { quit(); }
        });
        fileMenu.add(quitItem);
        
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(new SaveActionListener());
        fileMenu.add(saveItem);
        
        //Help menu
        JMenu helpMenu = new JMenu("Help");
        menubar.add(helpMenu);
        
        JMenuItem aboutItem = new JMenuItem("About ImageViewer");
        aboutItem.addActionListener(new AboutActionListener());
        helpMenu.add(aboutItem);

    }
    
   
	class OpenActionListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Open");
		}
	}
	
	class QuitActionListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// perform quit action
		}
	}
	
	class SaveActionListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// perform quit action
		}
	}

	class AboutActionListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			// perform quit action
		}
	}
    
    public static void main(String[] args) {
    	@SuppressWarnings("unused")
		ImageViewer image = new ImageViewer();
    	
    }
}
