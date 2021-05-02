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

public class HIDMouse extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
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
			HIDMouse dialog = new HIDMouse();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HIDMouse() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 84, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblHidMouseConfiguration = new JLabel("HID Mouse Configuration");
			lblHidMouseConfiguration.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
			GridBagConstraints gbc_lblHidMouseConfiguration = new GridBagConstraints();
			gbc_lblHidMouseConfiguration.gridwidth = 4;
			gbc_lblHidMouseConfiguration.insets = new Insets(0, 0, 5, 0);
			gbc_lblHidMouseConfiguration.gridx = 0;
			gbc_lblHidMouseConfiguration.gridy = 0;
			contentPanel.add(lblHidMouseConfiguration, gbc_lblHidMouseConfiguration);
		}
		{
			JLabel lblNewLabel = new JLabel("Num Buttons");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 1;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 1;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("VID:");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 2;
			gbc_lblNewLabel_1.gridy = 1;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			textField_5 = new JTextField();
			GridBagConstraints gbc_textField_5 = new GridBagConstraints();
			gbc_textField_5.insets = new Insets(0, 0, 5, 0);
			gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_5.gridx = 3;
			gbc_textField_5.gridy = 1;
			contentPanel.add(textField_5, gbc_textField_5);
			textField_5.setColumns(10);
		}
		{
			JLabel lblPhysicalRangeMin = new JLabel("Physical Range Min:");
			GridBagConstraints gbc_lblPhysicalRangeMin = new GridBagConstraints();
			gbc_lblPhysicalRangeMin.anchor = GridBagConstraints.EAST;
			gbc_lblPhysicalRangeMin.insets = new Insets(0, 0, 5, 5);
			gbc_lblPhysicalRangeMin.gridx = 0;
			gbc_lblPhysicalRangeMin.gridy = 2;
			contentPanel.add(lblPhysicalRangeMin, gbc_lblPhysicalRangeMin);
		}
		{
			textField_1 = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 1;
			gbc_textField_1.gridy = 2;
			contentPanel.add(textField_1, gbc_textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblPid = new JLabel("PID:");
			GridBagConstraints gbc_lblPid = new GridBagConstraints();
			gbc_lblPid.anchor = GridBagConstraints.EAST;
			gbc_lblPid.insets = new Insets(0, 0, 5, 5);
			gbc_lblPid.gridx = 2;
			gbc_lblPid.gridy = 2;
			contentPanel.add(lblPid, gbc_lblPid);
		}
		{
			textField_6 = new JTextField();
			GridBagConstraints gbc_textField_6 = new GridBagConstraints();
			gbc_textField_6.insets = new Insets(0, 0, 5, 0);
			gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_6.gridx = 3;
			gbc_textField_6.gridy = 2;
			contentPanel.add(textField_6, gbc_textField_6);
			textField_6.setColumns(10);
		}
		{
			JLabel lblPhysicalRangeMax = new JLabel("Physical Range Max:");
			GridBagConstraints gbc_lblPhysicalRangeMax = new GridBagConstraints();
			gbc_lblPhysicalRangeMax.anchor = GridBagConstraints.EAST;
			gbc_lblPhysicalRangeMax.insets = new Insets(0, 0, 5, 5);
			gbc_lblPhysicalRangeMax.gridx = 0;
			gbc_lblPhysicalRangeMax.gridy = 3;
			contentPanel.add(lblPhysicalRangeMax, gbc_lblPhysicalRangeMax);
		}
		{
			textField_2 = new JTextField();
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.insets = new Insets(0, 0, 5, 5);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 1;
			gbc_textField_2.gridy = 3;
			contentPanel.add(textField_2, gbc_textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel lblPower = new JLabel("Power:");
			GridBagConstraints gbc_lblPower = new GridBagConstraints();
			gbc_lblPower.anchor = GridBagConstraints.EAST;
			gbc_lblPower.insets = new Insets(0, 0, 5, 5);
			gbc_lblPower.gridx = 2;
			gbc_lblPower.gridy = 3;
			contentPanel.add(lblPower, gbc_lblPower);
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.gridx = 3;
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
			JLabel lblLogicalMin = new JLabel("Logical Min:");
			GridBagConstraints gbc_lblLogicalMin = new GridBagConstraints();
			gbc_lblLogicalMin.anchor = GridBagConstraints.EAST;
			gbc_lblLogicalMin.insets = new Insets(0, 0, 5, 5);
			gbc_lblLogicalMin.gridx = 0;
			gbc_lblLogicalMin.gridy = 4;
			contentPanel.add(lblLogicalMin, gbc_lblLogicalMin);
		}
		{
			textField_3 = new JTextField();
			GridBagConstraints gbc_textField_3 = new GridBagConstraints();
			gbc_textField_3.insets = new Insets(0, 0, 5, 5);
			gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_3.gridx = 1;
			gbc_textField_3.gridy = 4;
			contentPanel.add(textField_3, gbc_textField_3);
			textField_3.setColumns(10);
		}
		{
			JLabel lblAttributes = new JLabel("Attributes:");
			GridBagConstraints gbc_lblAttributes = new GridBagConstraints();
			gbc_lblAttributes.anchor = GridBagConstraints.EAST;
			gbc_lblAttributes.insets = new Insets(0, 0, 5, 5);
			gbc_lblAttributes.gridx = 2;
			gbc_lblAttributes.gridy = 4;
			contentPanel.add(lblAttributes, gbc_lblAttributes);
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 2;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 3;
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
			JLabel lblLogicalMax = new JLabel("Logical Max:");
			GridBagConstraints gbc_lblLogicalMax = new GridBagConstraints();
			gbc_lblLogicalMax.anchor = GridBagConstraints.EAST;
			gbc_lblLogicalMax.insets = new Insets(0, 0, 5, 5);
			gbc_lblLogicalMax.gridx = 0;
			gbc_lblLogicalMax.gridy = 5;
			contentPanel.add(lblLogicalMax, gbc_lblLogicalMax);
		}
		{
			textField_4 = new JTextField();
			GridBagConstraints gbc_textField_4 = new GridBagConstraints();
			gbc_textField_4.insets = new Insets(0, 0, 5, 5);
			gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_4.gridx = 1;
			gbc_textField_4.gridy = 5;
			contentPanel.add(textField_4, gbc_textField_4);
			textField_4.setColumns(10);
		}
		{
			chckbxBootSupport = new JCheckBox("Boot Support?");
			GridBagConstraints gbc_chckbxBootSupport = new GridBagConstraints();
			gbc_chckbxBootSupport.gridwidth = 2;
			gbc_chckbxBootSupport.gridx = 2;
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
	
	
	public JTextField getNumButtons() {
		return textField;
	}
	public JTextField getPhysMin() {
		return textField_1;
	}
	public JTextField getPhysMax() {
		return textField_2;
	}
	public JTextField getLogicalMin() {
		return textField_3;
	}
	public JTextField getLogicalMax() {
		return textField_4;
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
		int num_buttons = Integer.parseInt(getNumButtons().getText());
		
		buff.append("static const uint8_t usbMouseReportDescriptor[] = \n");
		buff.append("{\n");
		buff.append("  UsagePage(USB_HID_GENERIC_DESKTOP),\n");
		buff.append("  Usage(USB_HID_MOUSE),\n");
		buff.append("  Collection(USB_HID_APPLICATION),\n");
		buff.append("  Usage(USB_HID_POINTER),\n");
		buff.append("  Collection(USB_HID_PHYSICAL),\n");
		buff.append("   // \n");
		buff.append("   // The buttons.\n");
		buff.append("   //\n");
		buff.append("      UsagePage(USB_HID_BUTTONS),\n");
		buff.append("      UsageMinimum(1),\n");
		buff.append("      UsageMaximum(" + num_buttons + "),\n");
		buff.append("      LogicalMinimum(0),\n");
		buff.append("      LogicalMaximum(1),\n");
		buff.append("      	//\n");
		buff.append("       // 3 - 1 bit values for the buttons.\n");
		buff.append("       //\n");
		buff.append("       ReportSize(1),\n");
		buff.append("       ReportCount(" + num_buttons + "),\n");
		buff.append("       Input(USB_HID_INPUT_DATA | USB_HID_INPUT_VARIABLE | \n");
		buff.append("           	USB_HID_INPUT_ABS),\n");
		buff.append("       //\n");
		if (num_buttons < 8) 
		{
			buff.append("      	// 1 - 5 bit unused constant value to fill the 8 bits.\n");
			buff.append("       //\n");
			buff.append("       ReportSize(" + (8-num_buttons) + "),\n");
			buff.append("       ReportCount(1),\n");
			buff.append(" 		Input(USB_HID_INPUT_CONSTANT | USB_HID_INPUT_ARRAY | \n");
			buff.append("              USB_HID_INPUT_ABS),\n");
			buff.append("       //\n");
		}
		buff.append("       // The X and Y axis.\n");
		buff.append("       //\n");
		buff.append("       UsagePage(USB_HID_GENERIC_DESKTOP),\n");
		buff.append("       Usage(USB_HID_X),\n");
		buff.append("       Usage(USB_HID_Y),\n");
		buff.append("       LogicalMinimum(" + getLogicalMin().getText() + "),\n");
		buff.append("       LogicalMaximum(" + getLogicalMax().getText() + "),\n");
		buff.append("       // \n");
		buff.append("       // 2 - 8 bit Values for x and y.\n");
		buff.append("       //\n");
		buff.append("       ReportSize(8),\n");
		buff.append("       ReportCount(2),\n");
		buff.append("       Input(USB_HID_INPUT_DATA | USB_HID_INPUT_VARIABLE | \n");
		buff.append("            USB_HID_INPUT_RELATIVE),\n");
		buff.append("       EndCollection,\n");
		buff.append("   EndCollection,\n");
		buff.append("};\n\n");
		
		buff.append("static const tHIDDescriptor usbMouseHIDDescriptor = \n");
		buff.append("{\n");
		buff.append("    9, // bLength\n");
		buff.append("    USB_HID_DTYPE_HID, // bDescriptorType\n");
		buff.append("     0x111, // bcdHID (version 1.11 compliant)\n");
		buff.append("     0, // bCountryCode (not localized)\n");
		buff.append("     1, // bNumDescriptors\n");
		buff.append("     USB_HID_DTYPE_REPORT, // Report descriptor\n");
		buff.append("     sizeof(usbMouseReportDescriptor) // Size of report descriptor\n");
		buff.append("};\n\n");
		
		buff.append("static const uint8_t * const usbMouseClassDescriptors[] = \n");
		buff.append("{ \n");
		buff.append("    usbMouseReportDescriptor\n");
		buff.append("};\n");
		
		buff.append("tHIDReportIdle usbMouseReportIdle[2] = {\n");
		buff.append("   { 125, 1, 0, 0 }, // Report 1 polled every 500mS (4 * 125). \n");
		buff.append("	{ 0, 2, 0, 0} // Report 2 is not polled (0mS timeout)\n");
		buff.append("};\n\n");
		
		buff.append("\n\n// Receive call back\n");
		buff.append("uint32_t RXCALLBACK(void *pvCBData, uint32_t ui32Event, \n");
		buff.append("          uint32_t ui32MsgParam, void *pvMsgData) \n");
		buff.append("{ \n");
		buff.append("     return 0; \n");
		buff.append("}\n");
		
		buff.append("\n\n// Transmit call back\n");
		buff.append("uint32_t TXCALLBACK(void *pvCBData, uint32_t ui32Event, \n");
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
		
		String subclass = "USB_HID_SCLASS_NONE";
		if (getBoot().isSelected()) 
			subclass = "USB_HID_SCLASS_BOOT";
		
		buff.append("     .ui8Subclass = " + subclass + ",\n");
		
		buff.append("     .ui8Protocol = USB_HID_PROTOCOL_MOUSE,\n");
		buff.append("     .ui8NumInputReports = 1,\n");
		buff.append("     .psReportIdle = usbMouseReportIdle,\n");
		buff.append("     .pfnRxCallback = RXCALLBACK,\n");
		buff.append("     .pvRxCBData = NULL,\n");
		buff.append("     .pfnTxCallback = TXCALLBACK,\n");
		buff.append("     .pvTxCBData = NULL,\n");
		buff.append("     .bUseOutEndpoint = false,\n");
		buff.append("     .psHIDDescriptor = &usbMouseHIDDescriptor,\n");
		buff.append("     .ppui8ClassDescriptors = usbMouseClassDescriptors,\n");
		buff.append("     .ppui8StringDescriptors = usbStringDescriptors,\n");
		buff.append("     .ui32NumStringDescriptors = NUM_STRING_DESCRIPTORS,\n");
		buff.append("     .ppsConfigDescriptor = NULL,\n");
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
