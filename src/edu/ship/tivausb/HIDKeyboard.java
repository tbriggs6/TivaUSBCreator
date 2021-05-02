package edu.ship.tivausb;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HIDKeyboard extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_5;
	private JTextField textField_6;
	private JSpinner spinner;
	private JCheckBox chckbxBootSupport;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxSelfPower;
	private JCheckBox chckbxRemoteWake;
	public boolean return_code;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			HIDKeyboard dialog = new HIDKeyboard();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HIDKeyboard() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 84, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblHidMouseConfiguration = new JLabel("HID Keyboard Configuration");
			lblHidMouseConfiguration.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
			GridBagConstraints gbc_lblHidMouseConfiguration = new GridBagConstraints();
			gbc_lblHidMouseConfiguration.gridwidth = 3;
			gbc_lblHidMouseConfiguration.insets = new Insets(0, 0, 5, 0);
			gbc_lblHidMouseConfiguration.gridx = 0;
			gbc_lblHidMouseConfiguration.gridy = 0;
			contentPanel.add(lblHidMouseConfiguration, gbc_lblHidMouseConfiguration);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("VID:");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 1;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			textField_5 = new JTextField();
			GridBagConstraints gbc_textField_5 = new GridBagConstraints();
			gbc_textField_5.insets = new Insets(0, 0, 5, 0);
			gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_5.gridx = 2;
			gbc_textField_5.gridy = 1;
			contentPanel.add(textField_5, gbc_textField_5);
			textField_5.setColumns(10);
		}
		{
			JLabel lblPid = new JLabel("PID:");
			GridBagConstraints gbc_lblPid = new GridBagConstraints();
			gbc_lblPid.anchor = GridBagConstraints.EAST;
			gbc_lblPid.insets = new Insets(0, 0, 5, 5);
			gbc_lblPid.gridx = 1;
			gbc_lblPid.gridy = 2;
			contentPanel.add(lblPid, gbc_lblPid);
		}
		{
			textField_6 = new JTextField();
			GridBagConstraints gbc_textField_6 = new GridBagConstraints();
			gbc_textField_6.insets = new Insets(0, 0, 5, 0);
			gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_6.gridx = 2;
			gbc_textField_6.gridy = 2;
			contentPanel.add(textField_6, gbc_textField_6);
			textField_6.setColumns(10);
		}
		{
			JLabel lblPower = new JLabel("Power:");
			GridBagConstraints gbc_lblPower = new GridBagConstraints();
			gbc_lblPower.anchor = GridBagConstraints.EAST;
			gbc_lblPower.insets = new Insets(0, 0, 5, 5);
			gbc_lblPower.gridx = 1;
			gbc_lblPower.gridy = 3;
			contentPanel.add(lblPower, gbc_lblPower);
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.gridx = 2;
			gbc_panel.gridy = 3;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{65, 0, 0};
			gbl_panel.rowHeights = new int[]{26, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				spinner = new JSpinner(new SpinnerNumberModel(2, 2, 100, 2));
				GridBagConstraints gbc_spinner = new GridBagConstraints();
				gbc_spinner.insets = new Insets(0, 0, 0, 5);
				gbc_spinner.gridx = 0;
				gbc_spinner.gridy = 0;
				panel.add(spinner, gbc_spinner);
			}
			{
				JLabel lblMa = new JLabel("ma");
				GridBagConstraints gbc_lblMa = new GridBagConstraints();
				gbc_lblMa.gridx = 1;
				gbc_lblMa.gridy = 0;
				panel.add(lblMa, gbc_lblMa);
			}
		}
		{
			JLabel lblAttributes = new JLabel("Attributes:");
			GridBagConstraints gbc_lblAttributes = new GridBagConstraints();
			gbc_lblAttributes.anchor = GridBagConstraints.EAST;
			gbc_lblAttributes.insets = new Insets(0, 0, 5, 5);
			gbc_lblAttributes.gridx = 1;
			gbc_lblAttributes.gridy = 4;
			contentPanel.add(lblAttributes, gbc_lblAttributes);
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 2;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 2;
			gbc_panel.gridy = 4;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				chckbxNewCheckBox = new JCheckBox("Bus Power");
				buttonGroup.add(chckbxNewCheckBox);
				GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
				gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
				gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxNewCheckBox.gridx = 0;
				gbc_chckbxNewCheckBox.gridy = 0;
				panel.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
			}
			{
				chckbxSelfPower = new JCheckBox("Self Power");
				buttonGroup.add(chckbxSelfPower);
				GridBagConstraints gbc_chckbxSelfPower = new GridBagConstraints();
				gbc_chckbxSelfPower.anchor = GridBagConstraints.WEST;
				gbc_chckbxSelfPower.insets = new Insets(0, 0, 5, 0);
				gbc_chckbxSelfPower.gridx = 0;
				gbc_chckbxSelfPower.gridy = 1;
				panel.add(chckbxSelfPower, gbc_chckbxSelfPower);
			}
			{
				chckbxRemoteWake = new JCheckBox("Remote Wake");
				GridBagConstraints gbc_chckbxRemoteWake = new GridBagConstraints();
				gbc_chckbxRemoteWake.anchor = GridBagConstraints.WEST;
				gbc_chckbxRemoteWake.gridx = 0;
				gbc_chckbxRemoteWake.gridy = 2;
				panel.add(chckbxRemoteWake, gbc_chckbxRemoteWake);
			}
		}
		{
			chckbxBootSupport = new JCheckBox("Boot Support?");
			GridBagConstraints gbc_chckbxBootSupport = new GridBagConstraints();
			gbc_chckbxBootSupport.gridwidth = 2;
			gbc_chckbxBootSupport.gridx = 1;
			gbc_chckbxBootSupport.gridy = 6;
			contentPanel.add(chckbxBootSupport, gbc_chckbxBootSupport);
			chckbxBootSupport.setSelected(true);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						close(true);
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						close(false);
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	void close(boolean return_code)
	{
		this.return_code = return_code;
		this.setVisible(false);
	}
	
	
	public JTextField getVID() {
		return textField_5;
	}
	public JTextField getPID() {
		return textField_6;
	}
	public JSpinner getPower() {
		return spinner;
	}
	
	public JCheckBox getBoot() {
		return chckbxBootSupport;
	}
	
	
	public String toString() {
		
		StringBuffer buff = new StringBuffer( );
		
		
		
		buff.append("\n\n// Keyboard call back\n");
		buff.append("uint32_t KBCALLBACK(void *pvCBData, uint32_t ui32Event, \n");
		buff.append("          uint32_t ui32MsgParam, void *pvMsgData) \n");
		buff.append("{ \n");
		buff.append("     return 0; \n");
		buff.append("}\n");
				
		buff.append("const tUSBDHIDDevice usbHIDMouseDevice = {\n");
		buff.append("     .ui16VID = " + getVID().getText() + ",\n");
		buff.append("     .ui16PID = " + getPID().getText() + ",\n");
		buff.append("     .ui16MaxPowermA = " + getPower().getValue() + ",\n");
		
		String pwrAttr = "";
		if (getSelfPower().isSelected()) pwrAttr = "USB_CONF_ATTR_SELF_PWR";
		else pwrAttr = "USB_CONF_ATTR_BUS_PWR";
		if (getRemoteWake().isSelected()) pwrAttr += " | USB_CONF_ATTR_RWAKE";
		
		buff.append("     .ui8PwrAttributes = " + pwrAttr + ",\n");
		buff.append("     .pfnCallback = KBCALLBACK,\n");
		buff.append("      .pvCBData = NULL,\n");
		buff.append("     .ppui8StringDescriptors = usbStringDescriptors,\n");
		buff.append("     .ui32NumStringDescriptors = NUM_STRING_DESCRIPTORS,\n");
		buff.append("     .sPrivateData = NULL\n");
		buff.append("};\n\n");
		
		
		return buff.toString();
	}
	
	
	public JCheckBox getBusPower() {
		return chckbxNewCheckBox;
	}
	public JCheckBox getSelfPower() {
		return chckbxSelfPower;
	}
	public JCheckBox getRemoteWake() {
		return chckbxRemoteWake;
	}
}
