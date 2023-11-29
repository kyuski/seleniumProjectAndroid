package appiumtests;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

import javax.swing.Box;
import javax.swing.border.EtchedBorder;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Frame1 {

	private JFrame frmPmtSetupTool;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JTextField txtAdbOutput;
	private JTextField txtServerDeviceMdn;
	private JLabel lblNewLabel_1;
	private JTextField facebookresult;
	private JTextField youtuberesult;
	private JTextField mapsresult;
	private JTextField chromeresult;
	private JTextField sbrowserresult;
	private JTextField iheartresult;
	private JTextField amazonresult;
	private JTextField mhsresult;
	private JTextField clashresult;
	private JTextField gmailresult;
	private JTextField outlookresult;
	private JTextField actresult;
	private JTextField pmtresult;
	private JTextPane resulttxt;
	private JTextArea txtrConnectDevice;
	private JTextPane instructionstxt;
	private JTextPane txtpnFailCount;
	private JTextField failCountField;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton_6;
	private JTextField instaResult;
	private JCheckBox chromeCheckBox;
	private JCheckBox browserCheckBox;
	private JCheckBox iheartCheckBox;
	private JCheckBox mhsCheckBox;
	private JCheckBox amazonCheckBox;
	private JCheckBox clashCheckBox;
	private JCheckBox instaCheckBox;
	private JCheckBox gmailCheckBox;
	private JCheckBox outlookCheckBox;
	private JCheckBox actCheckBox;
	private JCheckBox pmtCheckBox;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmPmtSetupTool.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPmtSetupTool = new JFrame();
		frmPmtSetupTool.setTitle("PMT Setup Tool v1.4");
		frmPmtSetupTool.setBounds(100, 100, 800, 640);
		frmPmtSetupTool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPmtSetupTool.getContentPane().setLayout(null);
		
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 20, 762, 571);
		frmPmtSetupTool.getContentPane().add(tabbedPane);
		
		panel = new JPanel();
		tabbedPane.addTab("Sanity", null, panel, null);
		panel.setLayout(null);
		
		
		JButton btnNewButton = new JButton("RUN");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 10));
		btnNewButton.setBounds(586, 289, 108, 77);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("ADB Devices");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 10));
		btnNewButton_1.setBounds(586, 252, 108, 27);
		panel.add(btnNewButton_1);
		
		txtAdbOutput = new JTextField();
		txtAdbOutput.setFont(new Font("Arial", Font.PLAIN, 10));
		txtAdbOutput.setBounds(289, 255, 287, 22);
		panel.add(txtAdbOutput);
		txtAdbOutput.setColumns(10);
		
		textField = new JTextField("");
		textField.setFont(new Font("Arial", Font.PLAIN, 10));
		textField.setBounds(289, 289, 287, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("");
		textField_1.setFont(new Font("Arial", Font.PLAIN, 10));
		textField_1.setBounds(289, 318, 287, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		txtServerDeviceMdn = new JTextField();
		txtServerDeviceMdn.setFont(new Font("Arial", Font.PLAIN, 10));
		txtServerDeviceMdn.setBounds(289, 347, 287, 19);
		panel.add(txtServerDeviceMdn);
		txtServerDeviceMdn.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Reboot");
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 10));
		btnNewButton_5.setBounds(586, 376, 108, 19);
		panel.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("ADB Output:");
		lblNewLabel.setBounds(224, 259, 65, 13);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JTextPane txtpnLoginId = new JTextPane();
		txtpnLoginId.setBounds(236, 292, 53, 19);
		panel.add(txtpnLoginId);
		txtpnLoginId.setFont(new Font("Arial", Font.PLAIN, 11));
		txtpnLoginId.setBackground(SystemColor.menu);
		txtpnLoginId.setText("Login ID:");
		
		JTextPane txtpnPw = new JTextPane();
		txtpnPw.setBounds(261, 321, 28, 19);
		panel.add(txtpnPw);
		txtpnPw.setBackground(SystemColor.menu);
		txtpnPw.setFont(new Font("Arial", Font.PLAIN, 11));
		txtpnPw.setText("PW:");
		
		lblNewLabel_1 = new JLabel("Server MDN:");
		lblNewLabel_1.setBounds(224, 353, 65, 13);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton appiumButton = new JButton("Start Server");
		appiumButton.setBounds(337, 187, 132, 37);
		panel.add(appiumButton);
		appiumButton.setFont(new Font("Arial", Font.BOLD, 12));
		
		//Appium button ---- Starts Appium Server and checks output		
				AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
				final AppiumDriverLocalService server = AppiumDriverLocalService.buildService(serviceBuilder);
		
		
		JButton btnNewButton_2 = new JButton("Stop Server");
		btnNewButton_2.setBounds(492, 187, 142, 37);
		panel.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 12));
		
		resulttxt = new JTextPane();
		resulttxt.setBounds(10, 10, 53, 19);
		panel.add(resulttxt);
		resulttxt.setForeground(new Color(0, 0, 255));
		resulttxt.setText("Results:");
		resulttxt.setFont(new Font("Arial", Font.PLAIN, 13));
		resulttxt.setBackground(SystemColor.menu);
		
		facebookresult = new JTextField();
		facebookresult.setBounds(106, 39, 87, 22);
		panel.add(facebookresult);
		facebookresult.setFont(new Font("Arial", Font.PLAIN, 11));
		facebookresult.setColumns(10);
		
		youtuberesult = new JTextField();
		youtuberesult.setBounds(106, 68, 87, 22);
		panel.add(youtuberesult);
		youtuberesult.setFont(new Font("Arial", Font.PLAIN, 11));
		youtuberesult.setColumns(10);
		
		mapsresult = new JTextField();
		mapsresult.setBounds(106, 100, 87, 22);
		panel.add(mapsresult);
		mapsresult.setFont(new Font("Arial", Font.PLAIN, 11));
		mapsresult.setColumns(10);
		
		chromeresult = new JTextField();
		chromeresult.setBounds(106, 132, 87, 22);
		panel.add(chromeresult);
		chromeresult.setFont(new Font("Arial", Font.PLAIN, 11));
		chromeresult.setColumns(10);
		
		sbrowserresult = new JTextField();
		sbrowserresult.setBounds(106, 163, 87, 22);
		panel.add(sbrowserresult);
		sbrowserresult.setFont(new Font("Arial", Font.PLAIN, 11));
		sbrowserresult.setColumns(10);
		
		iheartresult = new JTextField();
		iheartresult.setBounds(106, 195, 87, 22);
		panel.add(iheartresult);
		iheartresult.setFont(new Font("Arial", Font.PLAIN, 11));
		iheartresult.setColumns(10);
		
		mhsresult = new JTextField();
		mhsresult.setBounds(106, 227, 87, 22);
		panel.add(mhsresult);
		mhsresult.setFont(new Font("Arial", Font.PLAIN, 11));
		mhsresult.setColumns(10);
		
		amazonresult = new JTextField();
		amazonresult.setBounds(106, 261, 87, 22);
		panel.add(amazonresult);
		amazonresult.setFont(new Font("Arial", Font.PLAIN, 11));
		amazonresult.setColumns(10);
		
		clashresult = new JTextField();
		clashresult.setBounds(106, 292, 87, 22);
		panel.add(clashresult);
		clashresult.setFont(new Font("Arial", Font.PLAIN, 11));
		clashresult.setColumns(10);
		
		gmailresult = new JTextField();
		gmailresult.setBounds(106, 356, 87, 22);
		panel.add(gmailresult);
		gmailresult.setFont(new Font("Arial", Font.PLAIN, 11));
		gmailresult.setColumns(10);
		
		outlookresult = new JTextField();
		outlookresult.setBounds(106, 388, 87, 22);
		panel.add(outlookresult);
		outlookresult.setFont(new Font("Arial", Font.PLAIN, 11));
		outlookresult.setColumns(10);
		
		actresult = new JTextField();
		actresult.setBounds(106, 420, 87, 22);
		panel.add(actresult);
		actresult.setFont(new Font("Arial", Font.PLAIN, 11));
		actresult.setColumns(10);
		
		pmtresult = new JTextField();
		pmtresult.setBounds(106, 452, 87, 22);
		panel.add(pmtresult);
		pmtresult.setFont(new Font("Arial", Font.PLAIN, 11));
		pmtresult.setColumns(10);
		
		txtpnFailCount = new JTextPane();
		txtpnFailCount.setBounds(31, 484, 65, 19);
		panel.add(txtpnFailCount);
		txtpnFailCount.setText("Fail Count:");
		txtpnFailCount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnFailCount.setBackground(SystemColor.menu);
		
		failCountField = new JTextField();
		failCountField.setBounds(106, 484, 37, 19);
		panel.add(failCountField);
		failCountField.setFont(new Font("Arial", Font.PLAIN, 11));
		failCountField.setForeground(Color.RED);
		failCountField.setColumns(10);
		
		
		

		
		JButton clearButton = new JButton("Clear");
		clearButton.setFont(new Font("Arial", Font.PLAIN, 10));
		clearButton.setBounds(108, 513, 85, 21);
		panel.add(clearButton);
		
		instructionstxt = new JTextPane();
		instructionstxt.setBounds(197, 10, 77, 19);
		panel.add(instructionstxt);
		instructionstxt.setText("Instructions:");
		instructionstxt.setForeground(Color.BLUE);
		instructionstxt.setFont(new Font("Arial", Font.PLAIN, 13));
		instructionstxt.setBackground(SystemColor.menu);
		
		txtrConnectDevice = new JTextArea();
		txtrConnectDevice.setBounds(266, 39, 441, 101);
		panel.add(txtrConnectDevice);
		txtrConnectDevice.setFont(new Font("Arial", Font.PLAIN, 10));
		txtrConnectDevice.setBackground(SystemColor.menu);
		txtrConnectDevice.setText("1. Click Start Server (Verify Proper Appium CMD output)\r\n2. Connect device with USB debugging enabled\r\n3. Click Allow for USB debugging pop up\r\n4. Click ADB Devices to verify connection\r\n5. Enter Login ID, Password, Server device MDN and click RUN\r\n6. Manually set up failed apps ,or rerun by checking only the failed apps\r\n7. Click \"Reboot\"");
		
		instaResult = new JTextField();
		instaResult.setFont(new Font("Arial", Font.PLAIN, 11));
		instaResult.setColumns(10);
		instaResult.setBounds(106, 324, 87, 22);
		panel.add(instaResult);
		
		final JCheckBox facebookCheckBox = new JCheckBox("Facebook");
		facebookCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		facebookCheckBox.setSelected(true);
		facebookCheckBox.setBounds(20, 37, 77, 21);
		panel.add(facebookCheckBox);
		
		final JCheckBox youtubeCheckBox = new JCheckBox("YouTube");
		youtubeCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		youtubeCheckBox.setSelected(true);
		youtubeCheckBox.setBounds(20, 68, 77, 21);
		panel.add(youtubeCheckBox);
		
		final JCheckBox mapsCheckBox = new JCheckBox("Maps");
		mapsCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		mapsCheckBox.setSelected(true);
		mapsCheckBox.setBounds(20, 101, 61, 21);
		panel.add(mapsCheckBox);
		
		final JCheckBox chromeCheckBox = new JCheckBox("Chrome");
		chromeCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		chromeCheckBox.setSelected(true);
		chromeCheckBox.setBounds(20, 130, 80, 21);
		panel.add(chromeCheckBox);
		
		final JCheckBox browserCheckBox = new JCheckBox("SBrowser");
		browserCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		browserCheckBox.setSelected(true);
		browserCheckBox.setBounds(20, 164, 77, 21);
		panel.add(browserCheckBox);
		
		final JCheckBox iheartCheckBox = new JCheckBox("iHeartR");
		iheartCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		iheartCheckBox.setSelected(true);
		iheartCheckBox.setBounds(20, 196, 77, 21);
		panel.add(iheartCheckBox);
		
		final JCheckBox mhsCheckBox = new JCheckBox("MHS");
		mhsCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		mhsCheckBox.setSelected(true);
		mhsCheckBox.setBounds(20, 228, 65, 21);
		panel.add(mhsCheckBox);
		
		final JCheckBox amazonCheckBox = new JCheckBox("Amazon");
		amazonCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		amazonCheckBox.setSelected(true);
		amazonCheckBox.setBounds(20, 262, 77, 21);
		panel.add(amazonCheckBox);
		
		final JCheckBox clashCheckBox = new JCheckBox("Clash R");
		clashCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		clashCheckBox.setSelected(true);
		clashCheckBox.setBounds(20, 289, 77, 25);
		panel.add(clashCheckBox);
		
		final JCheckBox instaCheckBox = new JCheckBox("Instagram");
		instaCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		instaCheckBox.setSelected(true);
		instaCheckBox.setBounds(20, 321, 85, 27);
		panel.add(instaCheckBox);
		
		final JCheckBox gmailCheckBox = new JCheckBox("GMail");
		gmailCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		gmailCheckBox.setSelected(true);
		gmailCheckBox.setBounds(20, 354, 77, 21);
		panel.add(gmailCheckBox);
		
		final JCheckBox outlookCheckBox = new JCheckBox("Outlook");
		outlookCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		outlookCheckBox.setSelected(true);
		outlookCheckBox.setBounds(20, 389, 77, 21);
		panel.add(outlookCheckBox);
		
		final JCheckBox actCheckBox = new JCheckBox("ACT");
		actCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		actCheckBox.setSelected(true);
		actCheckBox.setBounds(20, 421, 65, 21);
		panel.add(actCheckBox);
		
		final JCheckBox pmtCheckBox = new JCheckBox("PMTService");
		pmtCheckBox.setFont(new Font("Arial", Font.PLAIN, 10));
		pmtCheckBox.setSelected(true);
		pmtCheckBox.setBounds(20, 450, 85, 21);
		panel.add(pmtCheckBox);
		
		
		
//Select All button		
		
		JButton btnNewButton_3 = new JButton("Select All");
		btnNewButton_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        facebookCheckBox.setSelected(true);
                youtubeCheckBox.setSelected(true);
                mapsCheckBox.setSelected(true);
                chromeCheckBox.setSelected(true);
                browserCheckBox.setSelected(true);
                iheartCheckBox.setSelected(true);
                amazonCheckBox.setSelected(true);
                mhsCheckBox.setSelected(true);
                gmailCheckBox.setSelected(true);
                outlookCheckBox.setSelected(true);
                actCheckBox.setSelected(true);
                pmtCheckBox.setSelected(true);
                clashCheckBox.setSelected(true);
                instaCheckBox.setSelected(true);
		        
		        
		        
		    }
		});
		
		
		
		
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 10));
		btnNewButton_3.setBounds(11, 513, 85, 21);
		panel.add(btnNewButton_3);
		
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				facebookresult.setText(""); 		
				youtuberesult.setText(""); 
				mapsresult.setText(""); 
				chromeresult.setText(""); 
				sbrowserresult.setText(""); 
				iheartresult.setText(""); 
				amazonresult.setText(""); 
				mhsresult.setText(""); 
				gmailresult.setText(""); 
				outlookresult.setText(""); 
				actresult.setText(""); 
				pmtresult.setText(""); 
				failCountField.setText("");
				clashresult.setText("");
				instaResult.setText("");
				
				facebookCheckBox.setSelected(false);
				youtubeCheckBox.setSelected(false);
				mapsCheckBox.setSelected(false);
				chromeCheckBox.setSelected(false);
				browserCheckBox.setSelected(false);
				iheartCheckBox.setSelected(false);
				amazonCheckBox.setSelected(false);
				mhsCheckBox.setSelected(false);
				gmailCheckBox.setSelected(false);
				outlookCheckBox.setSelected(false);
				actCheckBox.setSelected(false);
				pmtCheckBox.setSelected(false);
				clashCheckBox.setSelected(false);
				instaCheckBox.setSelected(false);
				
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				server.stop();
				System.out.println("Appium Server Stopped");
			}
		});
		appiumButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				server.start();
				
			}
		});
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ProcessBuilder reboot = new ProcessBuilder(
			            "cmd.exe", "/c", "adb reboot");
				reboot.redirectErrorStream(true);
			        try {
						Process rebootset = reboot.start();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    System.out.println("Rebooting...");	
				
				
				
				
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcessBuilder adbdevices = new ProcessBuilder(
			            "cmd.exe", "/c", "adb devices");
				adbdevices.redirectErrorStream(true);
			        Process runadbdevices = null;
					try {
						runadbdevices = adbdevices.start();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
			        BufferedReader readadbdevices = new BufferedReader(new InputStreamReader(runadbdevices.getInputStream()));
			        String adbline = null;
			        String[] adblines = new String[1000];
			        int i = 0;
			        while (true) {

						try {
							adbline = readadbdevices.readLine();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}		
			        	adblines[i] = adbline;
			        	txtAdbOutput.setText(adblines[1]);
			            i++;
			           
			            if (adbline == null) { break; }
			            
			        }
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login_email = textField.getText();
				String login_password = textField_1.getText();
				String MDN = txtServerDeviceMdn.getText();
				@SuppressWarnings("rawtypes") AndroidDriver driver = null;
				


				

//Clear all App Data-----------------------------------------------------------------------
				System.out.println("Initializing apps...");
				System.out.println("Setting display timeout to 2 min...");
				System.out.println("Setting ringtone volume to 1...");
				System.out.println("Setting display brightness to 50%...");
					ProcessBuilder setup = new ProcessBuilder(
					        "cmd.exe", "/c", "adb shell settings put system screen_off_timeout 120000 && adb shell settings put system screen_brightness 130 && adb shell settings put global airplane_mode_radios \\\"cell,nfc,wimax\\\" && adb shell svc wifi disable && adb shell settings put secure location_mode 3 && adb shell pm clear com.google.android.googlequicksearchbox && adb shell pm clear com.samsung.android.app.contacts && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 2 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 5 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 -1 i32 1 && adb shell service call audio 10 i32 3 i32 1 i32 1 && adb shell service call audio 10 i32 3 i32 1 i32 1 && adb shell service call audio 10 i32 3 i32 1 i32 1 && adb shell service call audio 10 i32 3 i32 1 i32 1 && adb shell service call audio 10 i32 3 i32 1 i32 1 && adb shell service call audio 10 i32 3 i32 1 i32 1 && adb shell service call audio 10 i32 3 i32 1 i32 1");
					        setup.redirectErrorStream(true);
					        Process p = null;
							try {
								p = setup.start();
							} catch (IOException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
					        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
					        String line = null;
					     
					        
					        while (true) {
					            try {
									line = r.readLine();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					            if (line == null) { break; }
					            
					        }
					        p.destroy();
					        			        
			
//List all app packages in ADB and read from console-------------------------------------------
					
				System.out.println("Looking for installed apps...");
					ProcessBuilder findapps = new ProcessBuilder(
				            "cmd.exe", "/c", "adb shell pm list packages -e");
				        findapps.redirectErrorStream(true);
				        Process p2 = null;
						try {
							p2 = findapps.start();
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
				        BufferedReader r2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
				        String line2 = null;
				        String[] lines = new String[1000];
				        int i = 0;
				        while (true) {
				            try {
								line2 = r2.readLine();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				            lines[i] = line2;
				            i++;
				            if (line2 == null) { break; }
				            
				        }
				        p2.destroy();
				        
				        
					System.out.println("DONE!");

//Failure output------------------------------------------------------------------------
			int counter = 0;
				
					
					
//verify app existence---------------------------------------------------------------------------			

			boolean face = Arrays.asList(lines).contains("package:com.facebook.katana");
			boolean yout = Arrays.asList(lines).contains("package:com.google.android.youtube");
			boolean navi = Arrays.asList(lines).contains("package:com.google.android.apps.maps");
			boolean chro = Arrays.asList(lines).contains("package:com.android.chrome");
			boolean sams = Arrays.asList(lines).contains("package:com.sec.android.app.sbrowser");
			boolean ihea = Arrays.asList(lines).contains("package:com.clearchannel.iheartradio.controller");
			boolean amaz = Arrays.asList(lines).contains("package:com.amazon.mShop.android.shopping");
			boolean clash = Arrays.asList(lines).contains("package:com.supercell.clashroyale");
			boolean insta = Arrays.asList(lines).contains("package:com.instagram.android");
			boolean gmai = Arrays.asList(lines).contains("package:com.google.android.gm");
			boolean outl = Arrays.asList(lines).contains("package:com.microsoft.office.outlook");
			boolean sett = Arrays.asList(lines).contains("package:com.android.settings");
			boolean act = Arrays.asList(lines).contains("package:com.salab.act");
			boolean pmt = Arrays.asList(lines).contains("package:com.samsung.pmtservice");
			
			if(face == false) {
				System.out.println("Facebook not installed - Please install and set up manually");
				counter++;
				facebookresult.setText("Not Installed");
			}
			if(yout == false) {
				System.out.println("YouTube not installed - Please install and set up manually");
				counter++;
				youtuberesult.setText("Not Installed");
			}
			if(navi == false) {
				System.out.println("Google Maps not installed - Please install and set up manually");
				counter++;
				mapsresult.setText("Not Installed");
			}
			if(chro == false) {
				System.out.println("Chrome not installed - Please install and set up manually");
				counter++;
				chromeresult.setText("Not Installed");
				
			}
			if(sams == false) {
				System.out.println("Samsung Internet not installed - Please install and set up manually");
				counter++;
				sbrowserresult.setText("Not Installed");
				
			}
			if(ihea == false) {
				System.out.println("iHeartRadio not installed - Please install and set up manually");
				counter++;
				iheartresult.setText("Not Installed");
			}
			if(amaz == false) {
				System.out.println("Amazon Shopping not installed - Please install and set up manually");
				counter++;
				amazonresult.setText("Not Installed");
			}
			if(clash == false) {
				System.out.println("Clash Royale not installed - Please install and set up manually");
				counter++;
				clashresult.setText("Not Installed");

	        if(insta == false) {
	            System.out.println("Instagram not installed - Please install and set up manually");
	            counter++;
	            instaResult.setText("Not Installed");		
	        }
				
			}
			if(gmai == false) {
				System.out.println("Gmail not installed - Please install and set up manually");
				counter++;
				gmailresult.setText("Not Installed");
			}
			if(outl == false) {
				System.out.println("Outlook not installed - Please install and set up manually");
				counter++;
				outlookresult.setText("Not Installed");
			}
			if(sett == false) {
				System.out.println("Settings not installed - Please install");
				counter++;
				mhsresult.setText("Not Installed");
			}
			if(act == false) {
				System.out.println("ACT not installed - Please install and set up manually");
				counter++;
				actresult.setText("Not Installed");
			}
			if(pmt == false) {
				System.out.println("PMT service not installed - Please install and set up manually");
				counter++;
				pmtresult.setText("Not Installed");
			}



//Verifying successful launch of application--------------------------------------------------
			boolean facelaunch = true;
			boolean youlaunch = true;
			boolean navilaunch = true;
			boolean chromelaunch = true;
			boolean sbrowlaunch = true;
			boolean ihearlaunch = true;
			boolean settingslaunch = true;
			boolean amazlaunch = true;
			boolean gmaillaunch = true;
			boolean outlaunch = true;
			boolean actlaunch = true;
			boolean pmtlaunch = true;
			boolean clashlaunch = true;
			boolean instalaunch = true;

//Get Checkbox status
			boolean facebookChecked = facebookCheckBox.isSelected();
            boolean youtubeChecked = youtubeCheckBox.isSelected();
            boolean mapsChecked = mapsCheckBox.isSelected();
            boolean chromeChecked = chromeCheckBox.isSelected();
            boolean browserChecked = browserCheckBox.isSelected();
            boolean iheartChecked = iheartCheckBox.isSelected();
            boolean amazonChecked = amazonCheckBox.isSelected();
            boolean mhsChecked = mhsCheckBox.isSelected();
            boolean gmailChecked = gmailCheckBox.isSelected();
            boolean outlookChecked = outlookCheckBox.isSelected();
            boolean actChecked = actCheckBox.isSelected();
            boolean pmtChecked = pmtCheckBox.isSelected();
            boolean clashChecked = clashCheckBox.isSelected();
            boolean instaChecked = instaCheckBox.isSelected();


//FACEBOOK-------------------------------------------------------------------------------		
			 
			if(face && facebookChecked){
				
				System.out.println("Initiating Facebook...");
				DesiredCapabilities facebook = new DesiredCapabilities();
				facebook.setCapability("deviceName", "");
				facebook.setCapability("platformVersion", "");
				facebook.setCapability("platformName", "Android");
				facebook.setCapability("autoGrantPermissions","true");
				facebook.setCapability("appPackage", "com.facebook.katana");
				facebook.setCapability("appActivity", ".LoginActivity");
				
				try{
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), facebook);
				}

				catch(Exception e1){ System.out.println("Facebook: FAILED (Launch) - Please set up manually");
				facelaunch = false;
				counter++;
				facebookresult.setText("FAIL");

			}
				if(facelaunch){
				try{
				Thread.sleep(5000);
						    
				
                
                Boolean isPresentLoginToAnother = driver.findElements(By.xpath("//android.widget.Button[@text='Log Into Another Account']")).size() > 0;
                
                if(isPresentLoginToAnother) {
                    WebElement facebookelement2 = (new WebDriverWait(driver, 20))
                               .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Log Into Another Account']")));
                    driver.findElement(By.xpath("//android.widget.Button[@text='Log Into Another Account']")).click();
                }                
				

				
				WebElement faceelement = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='Mobile number or email']")));
				driver.findElement(By.xpath("//android.view.View[@content-desc='Mobile number or email']")).sendKeys(login_email);
				
				WebElement faceelement1 = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='Password']")));
				driver.findElement(By.xpath("//android.view.View[@content-desc='Password']")).sendKeys(login_password);
				
				WebElement faceelement2 = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='Log in']")));
				driver.findElement(By.xpath("//android.widget.Button[@content-desc='Log in']")).click();
				
				
				
				
				Thread.sleep(10000);
				
				
				
                Boolean isPresentSkip = driver.findElements(By.xpath("//android.widget.Button[@text='Skip']")).size() > 0;
                
                if(isPresentSkip) {
                    WebElement facebookelement3 = (new WebDriverWait(driver, 20))
                               .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Skip']")));
                    driver.findElement(By.xpath("//android.widget.Button[@text='Skip']")).click();
                }      
				
                driver.pressKey(new KeyEvent(AndroidKey.BACK));
                driver.pressKey(new KeyEvent(AndroidKey.BACK));
                driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.closeApp();
				driver.quit();
				
				System.out.println("Facebook: PASS");
				facebookresult.setText("PASS");
			
				
				
				}
				catch(Exception e1){System.out.println("Facebook: FAILED - Please set up manually");
				counter++;
				facebookresult.setText("FAIL");

				driver.closeApp();
				driver.quit();
				}

			

				}
			}

			


//YOUTUBE-------------------------------------------------------------------
			
			if(yout && youtubeChecked){
				
				System.out.println("Initiating YouTube...");
				DesiredCapabilities youtube = new DesiredCapabilities();
				youtube.setCapability("deviceName", "");
				youtube.setCapability("platformVersion", "");
				youtube.setCapability("platformName", "Android");
				youtube.setCapability("autoGrantPermissions","true");
				youtube.setCapability("appPackage", "com.google.android.youtube");
				youtube.setCapability("appActivity", ".app.honeycomb.Shell$HomeActivity");
				
				try{
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), youtube);
				}

				catch(Exception e1){ System.out.println("YouTube: FAILED (Launch) - Please set up manually");
				youlaunch = false;
				counter++;
				youtuberesult.setText("FAIL");

					}
				if(youlaunch){
				try{
				Thread.sleep(5000);
	
				
				
				
				Boolean isPresent = driver.findElements(By.xpath("//android.widget.Button[@text='DISMISS']")).size() > 0;
				
				if(isPresent) {
					WebElement youelement = (new WebDriverWait(driver, 20))
							   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='DISMISS']")));
					driver.findElement(By.xpath("//android.widget.Button[@text='DISMISS']")).click();
				}
				
				WebElement youelement2 = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@content-desc='Account']")));
				driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Account']")).click();
				
				WebElement youelement3 = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Settings']")));
				driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']")).click();

				WebElement youelement4 = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='General']")));
				driver.findElement(By.xpath("//android.widget.TextView[@text='General']")).click();
				
				WebElement youelement5 = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Picture-in-picture']")));
				driver.findElement(By.xpath("//android.widget.TextView[@text='Picture-in-picture']")).click();
				
				Thread.sleep(4000);
				driver.closeApp();
				driver.quit();
				System.out.println("YouTube: PASS");
				youtuberesult.setText("PASS");
				
				}
				catch(Exception e1){System.out.println("YouTube: FAILED (Some elements not clicked) - Please set up manually");
				counter++;
				youtuberesult.setText("FAIL");
				driver.closeApp();
				driver.quit();
				}

				

				}
			}	


//Google Navigation----------------------------------------
			
			if(navi && mapsChecked){
				
				System.out.println("Initiating Google Maps...");
				
			    
				DesiredCapabilities maps = new DesiredCapabilities();
				maps.setCapability("deviceName", "");
				maps.setCapability("platformVersion", "");
				maps.setCapability("platformName", "Android");
				maps.setCapability("autoGrantPermissions","true");
				maps.setCapability("appPackage", "com.google.android.apps.maps");
				maps.setCapability("appActivity", "com.google.android.maps.MapsActivity");
				
				try{
				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), maps);
				}

				catch(Exception e1){ System.out.println("Google Maps: FAILED (Launch) - Please set up manually");
				navilaunch = false;
				counter++;
				mapsresult.setText("FAIL");

					}

				

				
				if(navilaunch){
				try{ 
				Thread.sleep(5000);				
				
				WebElement mapselement = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.maps:id/on_map_directions_button")));
				driver.findElement(By.id("com.google.android.apps.maps:id/on_map_directions_button")).click();
				WebElement mapselement2 = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Choose destination']")));
				driver.findElement(By.xpath("//android.widget.TextView[@text='Choose destination']")).click();
				WebElement mapselement2_1 = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.maps:id/search_omnibox_edit_text")));
				driver.findElement(By.id("com.google.android.apps.maps:id/search_omnibox_edit_text")).sendKeys("3800 North Central expressway Plano TX");
				
				driver.pressKey(new KeyEvent(AndroidKey.ENTER));
				
				WebElement mapselement3 = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@text='Start']")));
				driver.findElement(By.xpath("//android.view.View[@text='Start']")).click();
				WebElement mapselement4 = (new WebDriverWait(driver, 20))
						   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Got it']")));
				driver.findElement(By.xpath("//android.widget.Button[@text='Got it']")).click();
				
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				
				driver.closeApp();
				driver.quit();	
				
				
				System.out.println("Google Maps: PASS");
				mapsresult.setText("PASS");
				
				}
				catch(Exception e1){System.out.println("Google Maps: FAILED (Some elements not clicked) - Please set up manually");
				counter++;
				mapsresult.setText("FAIL");
				driver.closeApp();
				driver.quit();
				}
				}
			}	


			
//Google Chrome----------------------------------------
			
				if(chro && chromeChecked){
					
					System.out.println("Initiating Google Chrome...");
					
				    
					DesiredCapabilities chrome = new DesiredCapabilities();
					chrome.setCapability("deviceName", "");
					chrome.setCapability("platformVersion", "");
					chrome.setCapability("platformName", "Android");
					chrome.setCapability("autoGrantPermissions","true");
					chrome.setCapability("appPackage", "com.android.chrome");
					chrome.setCapability("appActivity", "com.google.android.apps.chrome.Main");
					
					try{
					driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), chrome);
					}

					catch(Exception e1){ System.out.println("Google Chrome: FAILED (Launch) - Please set up manually");
					chromelaunch = false;
					counter++;
					chromeresult.setText("FAIL");

						}
					
					if(chromelaunch){
					try{
					Thread.sleep(5000);
					
					Boolean chromeSkip = driver.findElements(By.xpath("//android.widget.Button[@text='Use without an account']")).size() > 0;
                    
                    if(chromeSkip) {
                        WebElement chromeSkipClick = (new WebDriverWait(driver, 20))
                                   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Use without an account']")));
                        driver.findElement(By.xpath("//android.widget.Button[@text='Use without an account']")).click();
                        
                        Thread.sleep(4000);
                        driver.closeApp();
                        driver.quit();
                        System.out.println("Google Chrome: PASS");
                        chromeresult.setText("PASS");
                    }

					
					if(!chromeSkip) {
					
					WebElement chromeelement = (new WebDriverWait(driver, 20))
							   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Accept & continue']")));
					driver.findElement(By.xpath("//android.widget.Button[@text='Accept & continue']")).click();
					
					WebElement chromeelement2 = (new WebDriverWait(driver, 20))
							   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='No thanks']")));
					driver.findElement(By.xpath("//android.widget.Button[@text='No thanks']")).click();
				
					Thread.sleep(4000);
					driver.closeApp();
					driver.quit();
					System.out.println("Google Chrome: PASS");
					chromeresult.setText("PASS");
					}
					}
					catch(Exception e1){System.out.println("Google Chrome: FAILED (Some elements not clicked) - Please set up manually");
					counter++;
					chromeresult.setText("FAIL");
					driver.closeApp();
					driver.quit();
					}

					

					}
				}		
			

				
//SBrowser-----------------------------------------------------------
				
					if(sams && browserChecked){
						
						System.out.println("Initiating Samsung Internet...");
						
					    
						DesiredCapabilities sbrowser = new DesiredCapabilities();
						sbrowser.setCapability("deviceName", "");
						sbrowser.setCapability("platformVersion", "");
						sbrowser.setCapability("platformName", "Android");
						sbrowser.setCapability("autoGrantPermissions","true");
						sbrowser.setCapability("appPackage", "com.sec.android.app.sbrowser");
						sbrowser.setCapability("appActivity", ".SBrowserMainActivity");
						
						try{
						driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), sbrowser);
						}

						catch(Exception e1){ System.out.println("Samsung Internet: FAILED (Launch) - Please set up manually");
						sbrowlaunch = false;
						counter++;
						sbrowserresult.setText("FAIL");

							}
						
						if(sbrowlaunch){
						try{
						Thread.sleep(5000);
						
						
						WebElement Selement = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Continue']")));
						driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
						
						driver.pressKey(new KeyEvent(AndroidKey.BACK));
														
						
					
						Thread.sleep(4000);
						driver.closeApp();
						driver.quit();
						System.out.println("Samsung Internet: PASS");
						sbrowserresult.setText("PASS");
						
						}
						catch(Exception e1){System.out.println("Samsung Internet: FAILED (Some elements not clicked) - Please set up manually");
						counter++;
						sbrowserresult.setText("FAIL");
						driver.closeApp();
						driver.quit();
						}

						

						
					}				
					}
			
					
//iHeartRadio-----------------------------------------------------------
					
					if(ihea && iheartChecked){
						
						System.out.println("Initiating iHeartRadio...");
						
					    
						DesiredCapabilities iheartR = new DesiredCapabilities();
						iheartR.setCapability("deviceName", "");
						iheartR.setCapability("platformVersion", "");
						iheartR.setCapability("platformName", "Android");
						iheartR.setCapability("autoGrantPermissions","true");
						iheartR.setCapability("appPackage", "com.clearchannel.iheartradio.controller");
						iheartR.setCapability("appActivity", "com.iheart.activities.NavDrawerActivity");
						
						try{
						driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), iheartR);
						}

						catch(Exception e1){ System.out.println("iHeartRadio: FAILED (Launch) - Please set up manually");
						ihearlaunch = false;
						counter++;
						iheartresult.setText("FAIL");

							}
						
						if(ihearlaunch){
						try{
						Thread.sleep(5000);
						
						
						WebElement ihearelement = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Log In']")));
						driver.findElement(By.xpath("//android.widget.Button[@text='Log In']")).click();
						
						WebElement ihearelementid = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.id("com.clearchannel.iheartradio.controller:id/email_address")));
						driver.findElement(By.id("com.clearchannel.iheartradio.controller:id/email_address")).sendKeys(login_email);
						
						WebElement ihearelementPW = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.id("com.clearchannel.iheartradio.controller:id/password")));
						driver.findElement(By.id("com.clearchannel.iheartradio.controller:id/password")).sendKeys(login_password);
					
						WebElement ihearelementloginbutton = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.id("com.clearchannel.iheartradio.controller:id/email_login")));
						driver.findElement(By.id("com.clearchannel.iheartradio.controller:id/email_login")).click();
						
						
						Thread.sleep(6000);
						
						
						Boolean isPresentX = driver.findElements(By.xpath("//android.widget.Image[@text='x']")).size() > 0;
						
						if(isPresentX) {
							WebElement iheartX = (new WebDriverWait(driver, 20))
									   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Image[@text='x']")));
							driver.findElement(By.xpath("//android.widget.Image[@text='x']")).click();
						}						
						
						WebElement ihearelementsearchbutton = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='Search']")));
						driver.findElement(By.xpath("//android.widget.Button[@content-desc='Search']")).click();
						
						WebElement ihearelementsearchbar = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.id("com.clearchannel.iheartradio.controller:id/searchInputEditText")));
						driver.findElement(By.id("com.clearchannel.iheartradio.controller:id/searchInputEditText")).sendKeys("106.1 kIss fM");
						
						driver.pressKey(new KeyEvent(AndroidKey.ENTER));
						
						WebElement ihearelementkissfm = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='106.1 KISS FM']")));
						driver.findElement(By.xpath("//android.widget.TextView[@text='106.1 KISS FM']")).click();
						
						
						Thread.sleep(4000);
						driver.closeApp();
						driver.quit();
						System.out.println("iHeartRadio: PASS");
						iheartresult.setText("PASS");
						
						}
						catch(Exception e1){System.out.println("iHeartRadio: FAILED (Some elements not clicked) - Please set up manually");
						counter++;
						iheartresult.setText("FAIL");
						driver.closeApp();
						driver.quit();
						}

						

						
					}				
					}

					
					
//MHS-----------------------------------------------------------
		            
		            if(sett && mhsChecked){
		                
		                System.out.println("Initiating MHS...");
		                
		                
		                DesiredCapabilities MHS = new DesiredCapabilities();
		                MHS.setCapability("deviceName", "");
		                MHS.setCapability("platformVersion", "");
		                MHS.setCapability("platformName", "Android");
		                MHS.setCapability("autoGrantPermissions","true");
		                MHS.setCapability("appPackage", "com.android.settings");
		                MHS.setCapability("appActivity", "com.android.settings.TetherSettings");
		                
		                try{
		                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), MHS);
		                }

		                catch(Exception e1){ System.out.println("Settings: FAILED (Launch) - Please set up manually");
		                settingslaunch = false;
		                counter++;
		                mhsresult.setText("FAIL");

		                    }
		                
		                if(settingslaunch){
		                try{
		                Thread.sleep(5000);
		                
		                
		    
		                WebElement setelement4 = (new WebDriverWait(driver, 20))
		                           .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Mobile Hotspot']")));
		                driver.findElement(By.xpath("//android.widget.TextView[@text='Mobile Hotspot']")).click();
		                
		                WebElement setelement5 = (new WebDriverWait(driver, 20))
		                           .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Off']")));
		                driver.findElement(By.xpath("//android.widget.TextView[@text='Off']")).click();
		                
		                Thread.sleep(10000);
		                
		                
		                
		                //CLear MHS help POP up
		                Boolean mhsDoNotShow = driver.findElements(By.xpath("//android.widget.CheckBox[@text='Do not show again']")).size() > 0;
		                
		                if(mhsDoNotShow) {
		                    WebElement mhsDoNotShowClick = (new WebDriverWait(driver, 20))
		                               .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckBox[@text='Do not show again']")));
		                    driver.findElement(By.xpath("//android.widget.CheckBox[@text='Do not show again']")).click();
		                }
		                
		                                    
		                Boolean mhsOK = driver.findElements(By.xpath("//android.widget.Button[@text='Cancel']")).size() > 0;
		                
		                if(mhsOK) {
		                    WebElement mhsOKclick = (new WebDriverWait(driver, 20))
		                               .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Cancel']")));
		                    driver.findElement(By.xpath("//android.widget.Button[@text='Cancel']")).click();
		                }
		                
		                
		                
		                WebElement setelement6 = (new WebDriverWait(driver, 20))
		                           .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='On']")));
		                driver.findElement(By.xpath("//android.widget.TextView[@text='On']")).click();
		                
		                Thread.sleep(10000);
		                
		                
		                driver.pressKey(new KeyEvent(AndroidKey.BACK));
		                driver.pressKey(new KeyEvent(AndroidKey.BACK));
		                driver.pressKey(new KeyEvent(AndroidKey.BACK));
		                driver.pressKey(new KeyEvent(AndroidKey.BACK));
		                driver.closeApp();
		                driver.quit();
		                System.out.println("MHS: PASS");
		                mhsresult.setText("PASS");
		                
		                }
		                catch(Exception e1){System.out.println("MHS: FAILED (Some elements not clicked) - Please set up manually");
		                counter++;
		                mhsresult.setText("FAIL");
		                driver.closeApp();
		                driver.quit();
		                }

		                

		                
		            }               
		            }

		            
					

					
//Amazon-----------------------------------------------------------
					
					if(amaz && amazonChecked){
						
						System.out.println("Initiating Amazon Shopping...");
						
					    
						DesiredCapabilities amazon = new DesiredCapabilities();
						amazon.setCapability("deviceName", "");
						amazon.setCapability("platformVersion", "");
						amazon.setCapability("platformName", "Android");
						amazon.setCapability("autoGrantPermissions","true");
						amazon.setCapability("appPackage", "com.amazon.mShop.android.shopping");
						amazon.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
						
						try{
						driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), amazon);
						}

						catch(Exception e1){ System.out.println("Amazon Shopping: FAILED (Launch) - Please set up manually");
						amazlaunch = false;
						counter++;
						amazonresult.setText("FAIL");
							}
						
						if(amazlaunch){
						try{
						Thread.sleep(5000);

						
						WebElement amazelement = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Skip sign in']")));
						driver.findElement(By.xpath("//android.widget.Button[@text='Skip sign in']")).click();
						
						
						Thread.sleep(5000);
						
						driver.closeApp();
						driver.quit();
						System.out.println("Amazon Shopping: PASS");
						amazonresult.setText("PASS");
						
						}
						catch(Exception e1){System.out.println("Amazon Shopping: FAILED (Some elements not clicked) - Please set up manually");
						counter++;
						amazonresult.setText("FAIL");
						driver.closeApp();
						driver.quit();
						}

						

						
					}				
					}			

//Clash-----------------------------------------------------------
					
					if(clash && clashChecked){
						
						System.out.println("Initiating Clash Royale...");
						
					    
						DesiredCapabilities clashCap = new DesiredCapabilities();
						clashCap.setCapability("deviceName", "");
						clashCap.setCapability("platformVersion", "");
						clashCap.setCapability("platformName", "Android");
						clashCap.setCapability("autoGrantPermissions","true");
						clashCap.setCapability("appPackage", "com.supercell.clashroyale");
						clashCap.setCapability("appActivity", "com.supercell.titan.GameApp");
						
						try{
						driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), clashCap);
						}

						catch(Exception e1){ System.out.println("Clash Royale: FAILED (Launch) - Please set up manually");
						clashlaunch = false;
						counter++;
						clashresult.setText("FAIL");
							}
						
						if(clashlaunch){
						try{
						Thread.sleep(20000);
												
						
						driver.pressKey(new KeyEvent(AndroidKey.BACK));
						driver.pressKey(new KeyEvent(AndroidKey.BACK));
						driver.pressKey(new KeyEvent(AndroidKey.BACK));					
						
						Thread.sleep(5000);
						
						driver.closeApp();
						driver.quit();
						System.out.println("Clash Royale: PASS");
						clashresult.setText("PASS");
						
						}
						catch(Exception e1){System.out.println("Clash Royale: FAILED (Some elements not clicked) - Please set up manually");
						counter++;
						clashresult.setText("FAIL");
						driver.closeApp();
						driver.quit();
						}

						

						
					}				
					}			
					

					
					
//INSTAGRAM-------------------------------------------------------------------------------       
		            
		            if(insta && instaChecked){
		                
		                System.out.println("Initiating Instagram...");
		                DesiredCapabilities instagram = new DesiredCapabilities();
		                instagram.setCapability("deviceName", "");
		                instagram.setCapability("platformVersion", "");
		                instagram.setCapability("platformName", "Android");
		                instagram.setCapability("autoGrantPermissions","true");
		                instagram.setCapability("appPackage", "com.instagram.android");
		                instagram.setCapability("appActivity", "com.instagram.mainactivity.LauncherActivity");
		                
		                try{
		                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), instagram);
		                }

		                catch(Exception e1){ System.out.println("Instagram: FAILED (Launch) - Please set up manually");
		                instalaunch = false;
		                counter++;
		                instaResult.setText("FAIL");

		            }
		                if(instalaunch){
		                try{
		                Thread.sleep(10000);
		                
		                boolean isPresentinsta = driver.findElements(By.xpath("//android.widget.Button[@content-desc='Log into another account']")).size() > 0;
		                if(isPresentinsta) {
		                    WebElement instaelementlogin = (new WebDriverWait(driver, 20))
                                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='Log in']")));
                         driver.findElement(By.xpath("//android.widget.Button[@content-desc='Log in']")).click();
		                    
		                }
		                
		                if(!isPresentinsta) {
		  
		                WebElement instaelement = (new WebDriverWait(driver, 20))
		                        .until(ExpectedConditions.elementToBeClickable(By.id("com.instagram.android:id/log_in_button")));
		                driver.findElement(By.id("com.instagram.android:id/log_in_button")).click();
		                
		                WebElement instaelement1 = (new WebDriverWait(driver, 20))
		                        .until(ExpectedConditions.elementToBeClickable(By.id("com.instagram.android:id/login_username")));
		                driver.findElement(By.id("com.instagram.android:id/login_username")).sendKeys(login_email);
		                
		                WebElement instaelement2 = (new WebDriverWait(driver, 20))
		                        .until(ExpectedConditions.elementToBeClickable(By.id("com.instagram.android:id/password")));
		                driver.findElement(By.id("com.instagram.android:id/password")).sendKeys(login_password);
		                
		                WebElement instaelement3 = (new WebDriverWait(driver, 20))
		                        .until(ExpectedConditions.elementToBeClickable(By.id("com.instagram.android:id/button_text")));
		                driver.findElement(By.id("com.instagram.android:id/button_text")).click();
		                }
		                
		                Thread.sleep(10000);
		                
		                driver.closeApp();
		                driver.quit();
		                
		                System.out.println("Instagram: PASS");
		                instaResult.setText("PASS");
		            
		                
		                
		                }
		                catch(Exception e1){System.out.println("Instagram: FAILED - Please set up manually");
		                counter++;
		                instaResult.setText("FAIL");

		                driver.closeApp();
		                driver.quit();
		                }

		            

		                }
		            }           
		            
		            
					
					
					
					
//Gmail-----------------------------------------------------------
					
					if(gmai && gmailChecked){
						
						System.out.println("Initiating Gmail...");
						
					    
						DesiredCapabilities gmail = new DesiredCapabilities();
						gmail.setCapability("deviceName", "");
						gmail.setCapability("platformVersion", "");
						gmail.setCapability("platformName", "Android");
						gmail.setCapability("autoGrantPermissions","true");
						gmail.setCapability("appPackage", "com.google.android.gm");
						gmail.setCapability("appActivity", ".ConversationListActivityGmail");
						
						try{
						driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), gmail);
						}

						catch(Exception e1){ System.out.println("Gmail: FAILED (Launch) - Please set up manually");
						gmaillaunch = false;
						counter++;
						gmailresult.setText("FAIL");

							}
						
						if(gmaillaunch){
						try{
						Thread.sleep(5000);						
						
						WebElement gmailelement = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='GOT IT']")));
						driver.findElement(By.xpath("//android.widget.TextView[@text='GOT IT']")).click();
						
						WebElement gmailelement2 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='TAKE ME TO GMAIL']")));
						driver.findElement(By.xpath("//android.widget.TextView[@text='TAKE ME TO GMAIL']")).click();
						
						
						Thread.sleep(10000);	
						Boolean isPresentGotIT1 = driver.findElements(By.id("com.google.android.gm:id/next_button")).size() > 0;
						
						if(isPresentGotIT1) {
							WebElement youelementgotit1 = (new WebDriverWait(driver, 20))
									   .until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.gm:id/next_button")));
							driver.findElement(By.id("com.google.android.gm:id/next_button")).click();
						}
						
						
						
						WebElement gmailelement3 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Compose']")));
						driver.findElement(By.xpath("//android.widget.Button[@text='Compose']")).click();
						
						Boolean isPresentGotIT2 = driver.findElements(By.xpath("//android.widget.Button[@text='Got it']")).size() > 0;
						
						if(isPresentGotIT2) {
							WebElement youelement = (new WebDriverWait(driver, 20))
									   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Got it']")));
							driver.findElement(By.xpath("//android.widget.Button[@text='Got it']")).click();
						}
						
						driver.pressKey(new KeyEvent(AndroidKey.BACK));
						driver.pressKey(new KeyEvent(AndroidKey.BACK));
						driver.pressKey(new KeyEvent(AndroidKey.BACK));
						
						
						Thread.sleep(5000);
						
						driver.closeApp();
						driver.quit();
						System.out.println("Gmail: PASS");
						gmailresult.setText("PASS");
						
						}
						catch(Exception e1){System.out.println("Gmail: FAILED (Some elements not clicked) - Please set up manually");
						counter++;
						gmailresult.setText("FAIL");
						driver.closeApp();
						driver.quit();
						}

						

						
					}				
					}		
			
//Outlook-----------------------------------------------------------
					
					if(outl && outlookChecked){
						
						System.out.println("Initiating Outlook...");
						
					    
						DesiredCapabilities outlook = new DesiredCapabilities();
						outlook.setCapability("deviceName", "");
						outlook.setCapability("platformVersion", "");
						outlook.setCapability("platformName", "Android");
						outlook.setCapability("autoGrantPermissions","true");
						outlook.setCapability("appPackage", "com.microsoft.office.outlook");
						outlook.setCapability("appActivity", ".MainActivity");
						
						try{
						driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), outlook);
						}

						catch(Exception e1){ System.out.println("Outlook: FAILED (Launch) - Please set up manually");
						outlaunch = false;
						counter++;
						outlookresult.setText("FAIL");
							}
						
						if(outlaunch){
						try{
						Thread.sleep(5000);	
						
						
						WebElement outelement = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='ADD ACCOUNT']")));
						driver.findElement(By.xpath("//android.widget.Button[@text='ADD ACCOUNT']")).click();
						
						
						WebElement outelement2 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='ADD GOOGLE ACCOUNT']")));
						driver.findElement(By.xpath("//android.widget.Button[@text='ADD GOOGLE ACCOUNT']")).click();

						
						WebElement outelement4 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Microsoft apps & services']")));
						
						TouchAction action = new TouchAction(driver);
				        action.press(PointOption.point(550,1100))
				              .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				              .moveTo(PointOption.point(550, 800))  
				              .release().perform();
						TouchAction action2 = new TouchAction(driver);
				        action.press(PointOption.point(550,1100))
				              .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				              .moveTo(PointOption.point(550, 800))  
				              .release().perform();
						TouchAction action3 = new TouchAction(driver);
				        action.press(PointOption.point(550,1100))
				              .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				              .moveTo(PointOption.point(550, 800))  
				              .release().perform();				
						TouchAction action4 = new TouchAction(driver);
				        action.press(PointOption.point(550,1100))
				              .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				              .moveTo(PointOption.point(550, 800))  
				              .release().perform();
						TouchAction action5 = new TouchAction(driver);
				        action.press(PointOption.point(550,1100))
				              .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				              .moveTo(PointOption.point(550, 800))  
				              .release().perform();
						TouchAction action6 = new TouchAction(driver);
				        action.press(PointOption.point(550,1100))
				              .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				              .moveTo(PointOption.point(550, 800))  
				              .release().perform();
				        
				        
				        
						WebElement outelement5 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='Allow']")));
						driver.findElement(By.xpath("//android.widget.Button[@text='Allow']")).click();
						
						
						WebElement outelement3 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.gms:id/account_display_name")));
						driver.findElement(By.id("com.google.android.gms:id/account_display_name")).click();
						
						
						WebElement outelement6 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='MAYBE LATER']")));
						driver.findElement(By.xpath("//android.widget.Button[@text='MAYBE LATER']")).click();
						
						WebElement outelement7 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.id("com.microsoft.office.outlook:id/compose_fab")));
						
						Thread.sleep(5000);
						
						driver.closeApp();
						driver.quit();
						System.out.println("Outlook: PASS");
						outlookresult.setText("PASS");
						
						}
						catch(Exception e1){System.out.println("Outlook: FAILED (Some elements not clicked) - Please set up manually");
						counter++;
						outlookresult.setText("FAIL");
						driver.closeApp();
						driver.quit();
						}

						

						
					}				
					}	
					
//Add server number to ACT----------------------------------------
					
					if(act && actChecked){
						
						System.out.println("Saving Server MDN in ACT...");
						
					    
						DesiredCapabilities actcap = new DesiredCapabilities();
						actcap.setCapability("deviceName", "");
						actcap.setCapability("platformVersion", "");
						actcap.setCapability("platformName", "Android");
						actcap.setCapability("autoGrantPermissions","true");
						actcap.setCapability("appPackage", "com.salab.act");
						actcap.setCapability("appActivity", ".Main");
						
						try{
						driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), actcap);
						}

						catch(Exception e1){ System.out.println("ACT: FAILED (Launch) - Please add server MDN manually");
						actlaunch = false;
						counter++;
						actresult.setText("FAIL");

							}
						
						if(actlaunch){
						try{
						Thread.sleep(5000);

						
						WebElement actelement = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@content-desc='Setting']")));
						driver.findElement(By.xpath("//android.widget.Button[@content-desc='Setting']")).click();
						
						
						WebElement actelement2 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Mobile server information']")));
						driver.findElement(By.xpath("//android.widget.TextView[@text='Mobile server information']")).click();
						
						
						WebElement actelement3 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.id("android:id/edit")));
						driver.findElement(By.id("android:id/edit")).sendKeys(MDN);
						
						
						WebElement actelement4 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text='OK']")));
						driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
					
						
						
						
						
						Thread.sleep(4000);
						driver.closeApp();
						driver.quit();
						System.out.println("ACT setup: PASS");
						actresult.setText("PASS");
						
						}
						catch(Exception e1){System.out.println("ACT: FAILED (Server MDN not added) - Please set up manually");
						counter++;
						actresult.setText("FAIL");
						driver.closeApp();
						driver.quit();
						}

						

						}
					}
					
					
					
//PMT Launch----------------------------------------
					
					if(pmt && pmtChecked){
						
						System.out.println("Checking PMT Service...");
						
					    
						DesiredCapabilities pmtcap = new DesiredCapabilities();
						pmtcap.setCapability("deviceName", "");
						pmtcap.setCapability("platformVersion", "");
						pmtcap.setCapability("platformName", "Android");
						pmtcap.setCapability("autoGrantPermissions","true");
						pmtcap.setCapability("appPackage", "com.samsung.pmtservice");
						pmtcap.setCapability("appActivity", "com.samsung.pmtservice.MainActivity");
						
						try{
						driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), pmtcap);
						}

						catch(Exception e1){ System.out.println("PMT: FAILED (Launch) - Please Check PMT app");
						pmtlaunch = false;
						counter++;
						pmtresult.setText("FAIL");

							}
						
						if(pmtlaunch){
						try{
						Thread.sleep(5000);

						
		
						WebElement pmtelement = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc='More options']")));
						driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='More options']")).click();
						
						WebElement pmtelement2 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Stop Service']")));
						driver.findElement(By.xpath("//android.widget.TextView[@text='Stop Service']")).click();						
					
						WebElement pmtelement3 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc='More options']")));
						driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='More options']")).click();
						
						WebElement pmtelement4 = (new WebDriverWait(driver, 20))
								   .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Start Service']")));
						driver.findElement(By.xpath("//android.widget.TextView[@text='Start Service']")).click();	
						
						
						
						Thread.sleep(4000);
						driver.closeApp();
						driver.quit();
						System.out.println("PMT setup: PASS");
						pmtresult.setText("PASS");
						
						}
						catch(Exception e1){System.out.println("PMT: FAILED - Service not working properly, please check");
						counter++;
						pmtresult.setText("FAIL");
						driver.closeApp();
						driver.quit();
						}

						

						}
					}			
					
					
				    
				    
//Uninstall appium app and add server contact------------------------------------------------------
					System.out.println("Uninstalling appium apk...");
					ProcessBuilder setupapp = new ProcessBuilder(
				            "cmd.exe", "/c", "adb uninstall io.appium.settings");
					setupapp.redirectErrorStream(true);
				        try {
							Process appiset = setupapp.start();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				    System.out.println("Appium App Uninstalled");
				  			    
				    
				    
				    
					
//End output----------------------------------------------------------------			
					System.out.println("PMT Sanity set up is complete. Total number of failures is: "+counter);
					failCountField.setText(""+counter);
				
				
				
			}
		});
		
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Full Test", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("To Be Updated");
		lblNewLabel_3.setBounds(22, 28, 83, 13);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("DOU", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("To Be Updated");
		lblNewLabel_3_1.setBounds(22, 10, 83, 13);
		panel_2.add(lblNewLabel_3_1);
		Image img = new ImageIcon(this.getClass().getResource("/samsunglogonew.png")).getImage();
		

		
	}
}


//Release Notes:
//v1.3:
// -iHeartRadio procedure update 
// -Volume control update (android 12+)
