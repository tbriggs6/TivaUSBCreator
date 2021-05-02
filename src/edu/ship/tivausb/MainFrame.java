package edu.ship.tivausb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.AbstractListModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextArea textArea;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnConfig;
	private JButton btnConfig_1;
	private JCheckBox chckbxMouse;
	
	private String mouseConfig = null;
	private String keyboardConfig = null;
	private JCheckBox chckbxKeyboard;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("HID", null, panel_2, null);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btnBuild_2 = new JButton("Build");
		btnBuild_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuffer buff = new StringBuffer( );
				
				buff.append("#include <stdint.h>\n");
				buff.append("#include <stdbool.h>\n");
				buff.append("#include <stdlib.h>\n");
				buff.append("#include \"usblib/usblib.h\"\n");
				buff.append("#include \"usblib/usbhid.h\"\n");
				buff.append("#include \"usblib/device/usbdevice.h\"\n");
				
				buff.append("#include \"usblib/device/usbdhid.h\"\n");
				
				if (getChckbxMouse().isSelected()) {
					buff.append("#include \"usblib/device/usbdhidmouse.h\n\n");
				}
				
				if (getChckbxKeyboard().isSelected()) {
					buff.append("#include \"usblib/device/usbdhidkeyb.h\n\n");
				}

				buff.append("\n\n");
				
				buff.append("// Language : EN_US\n");
				buff.append("const uint8_t usbLanguageDescriptor[] = {\n");
				buff.append("        4, // # of languages\n");
				buff.append("        USB_DTYPE_STRING,\n");
				buff.append("        USBShort(USB_LANG_EN_US)\n");
				buff.append("};\n\n");				
				
				buff.append("// Manufacturer String : " + getManufacturer().getText() + "\n");
				buff.append("const uint8_t usbManufacturerDescr[] = { \n");
				buff.append(createString(getManufacturer().getText()));
				buff.append(";\n");
				
				buff.append("// Product String : " + getProduct().getText() + "\n");
				buff.append("const uint8_t usbProductDescr[] = { \n");
				buff.append(createString(getProduct().getText()));
				buff.append(";\n");
				
				buff.append("// Serial # String : " + getSerial().getText() + "\n");
				buff.append("const uint8_t usbSerialDescr[] = { \n");
				buff.append(createString(getSerial().getText()));
				buff.append(";\n");
				
				buff.append("// Configuration String : " + txtHIDConfig().getText() + "\n");
				buff.append("const uint8_t usbHIDConfigDescr[] = { \n");
				buff.append( createString(txtHIDConfig().getText()));
				buff.append("\n;\n");
				
				buff.append("// Interface String : " + txtInterface().getText() + "\n");
				buff.append("const uint8_t usbInterfaceDescr[] = { \n");
				buff.append(createString(txtInterface().getText()));
				buff.append("\n;\n");
				
				
				buff.append("\n\n");
				buff.append("const uint8_t * const usbStringDescriptors[] = { \n");
				buff.append("      usbLanguageDescriptor,  // language description\n");
				buff.append("      usbManufacturerDescr,   // manufacturer description\n");
				buff.append("      usbProductDescr,        // product description\n");
				buff.append("      usbSerialDescr,         // serial number\n");
				buff.append("      usbHIDConfigDescr,      // usb HID config description\n");
				buff.append("      usbInterfaceDescr       // usb Interface description\n");
				buff.append("};\n");

				buff.append("\n\n");
				buff.append("#define NUM_STRING_DESCRIPTORS 6\n");
				
				if (getChckbxMouse().isSelected()) {
					buff.append(mouseConfig);
				}
				
				if (getChckbxKeyboard().isSelected()) {
					buff.append(keyboardConfig);
				}
				
				txtrHid().setText( buff.toString() );
			}
		});
		
		JLabel label = new JLabel("Manufacturer:");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel_2.add(label, gbc_label);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		panel_2.add(textField, gbc_textField);
		
		chckbxMouse = new JCheckBox("Mouse");
		chckbxMouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxMouse.isSelected()) getMouseBtnConfig().setEnabled(true);
				else getMouseBtnConfig().setEnabled(false);
				
			}
		});
		GridBagConstraints gbc_chckbxMouse = new GridBagConstraints();
		gbc_chckbxMouse.anchor = GridBagConstraints.WEST;
		gbc_chckbxMouse.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxMouse.gridx = 5;
		gbc_chckbxMouse.gridy = 1;
		panel_2.add(chckbxMouse, gbc_chckbxMouse);
		
		btnConfig = new JButton("Config");
		btnConfig.setEnabled(false);
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HIDMouse config = new HIDMouse();
				config.setModal(true);
				config.setVisible(true);
				config.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				if (config.return_code) {
					mouseConfig = config.toString();
				}
				
				
			}
		});
		GridBagConstraints gbc_btnConfig = new GridBagConstraints();
		gbc_btnConfig.insets = new Insets(0, 0, 5, 0);
		gbc_btnConfig.gridx = 6;
		gbc_btnConfig.gridy = 1;
		panel_2.add(btnConfig, gbc_btnConfig);
		
		JLabel label_1 = new JLabel("Product:");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 2;
		panel_2.add(label_1, gbc_label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		panel_2.add(textField_1, gbc_textField_1);
		
		chckbxKeyboard = new JCheckBox("Keyboard");
		chckbxKeyboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxKeyboard.isSelected()) getKeyBtnConfig().setEnabled(true);
				else getKeyBtnConfig().setEnabled(false);
				
			}
		});
		
		GridBagConstraints gbc_chckbxKeyboard = new GridBagConstraints();
		gbc_chckbxKeyboard.anchor = GridBagConstraints.WEST;
		gbc_chckbxKeyboard.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxKeyboard.gridx = 5;
		gbc_chckbxKeyboard.gridy = 2;
		panel_2.add(chckbxKeyboard, gbc_chckbxKeyboard);
		
		btnConfig_1 = new JButton("Config");
		btnConfig_1.setEnabled(false);
		btnConfig_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HIDKeyboard config = new HIDKeyboard();
				config.setModal(true);
				config.setVisible(true);
				config.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
				if (config.return_code) {
					keyboardConfig = config.toString();
				}
				
			}
		});
		GridBagConstraints gbc_btnConfig_1 = new GridBagConstraints();
		gbc_btnConfig_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnConfig_1.gridx = 6;
		gbc_btnConfig_1.gridy = 2;
		panel_2.add(btnConfig_1, gbc_btnConfig_1);
		
		JLabel label_2 = new JLabel("Serial#:");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 3;
		panel_2.add(label_2, gbc_label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		panel_2.add(textField_2, gbc_textField_2);
		
		JLabel lblHidConfigString = new JLabel("HID Config String:");
		GridBagConstraints gbc_lblHidConfigString = new GridBagConstraints();
		gbc_lblHidConfigString.insets = new Insets(0, 0, 5, 5);
		gbc_lblHidConfigString.anchor = GridBagConstraints.EAST;
		gbc_lblHidConfigString.gridx = 0;
		gbc_lblHidConfigString.gridy = 4;
		panel_2.add(lblHidConfigString, gbc_lblHidConfigString);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		panel_2.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Interface String:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 5;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 5;
		panel_2.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		GridBagConstraints gbc_btnBuild_2 = new GridBagConstraints();
		gbc_btnBuild_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuild_2.gridx = 1;
		gbc_btnBuild_2.gridy = 6;
		panel_2.add(btnBuild_2, gbc_btnBuild_2);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 7;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 7;
		panel_2.add(scrollPane, gbc_scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Consolas", Font.PLAIN, 12));
	}

	private String createString(String str) {
	
		int len = 2 + (str.length() * 2);
		
		StringBuffer buff = new StringBuffer( );
		buff.append("       " + len + ",\n");
		buff.append("       USB_DTYPE_STRING,\n");
		buff.append("       ");
		for (int i = 0; i < str.length(); i++) {
			if (i > 0) buff.append(",");
			Character ch = str.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				buff.append("'" + ch + "',0");
			}
			else {
				byte lo = (byte) (ch >> 8);
				byte hi = (byte) (ch & 0xff);
				buff.append( String.format("0x%x, 0x%x", lo,hi));
			}
		}
		buff.append("\n}");
		
		return buff.toString();
	}
	
	
	public JTextField getManufacturer() {
		return textField;
	}
	public JTextField getProduct() {
		return textField_1;
	}
	public JTextField getSerial() {
		return textField_2;
	}
	
	public JTextArea txtrHid() {
		return textArea;
	}
	public JTextField txtHIDConfig() {
		return textField_3;
	}
	public JTextField txtInterface() {
		return textField_4;
	}
	public JButton getMouseBtnConfig() {
		return btnConfig;
	}
	public JButton getKeyBtnConfig() {
		return btnConfig_1;
	}
	public JCheckBox getChckbxMouse() {
		return chckbxMouse;
	}
	public JCheckBox getChckbxKeyboard() {
		return chckbxKeyboard;
	}
}
