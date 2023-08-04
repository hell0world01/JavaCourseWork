import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGUI {
    ArrayList<Student> studentData = new ArrayList<>();
     public void student(){
         //FRAME SECTION START
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         BorderLayout borderLayout = new BorderLayout();
         frame.setLayout(borderLayout);
         //Frame section end

         //BUTTON SECTION START
         JButton addRegularStudent = new JButton("Add1");
         addRegularStudent.setFocusable(false);
         JButton addDropOutStudent = new JButton("Add2");

         //PANEL SECTION START
         JPanel panel1 = new JPanel();
         JPanel panel2 = new JPanel();
         JPanel panel2_1 = new JPanel();
         JPanel panel2_2 = new JPanel();
         JPanel panel3 = new JPanel();
         JPanel panel4 = new JPanel();
         JPanel panel5 = new JPanel();
         panel1.setBackground(new Color(123,50,250));
         panel2.setBackground(Color.lightGray);
         panel2_1.setBackground(new Color(100,50,50));
         panel2_1.setOpaque(true);
         panel3.setBackground(Color.magenta);
         panel4.setBackground(Color.yellow);
         panel5.setBackground(Color.pink);
         //PANEL SECTION END


         //GIVING MARGIN
         Border margin = new EmptyBorder(10,60,10,30);
         Border marginForPanel = new EmptyBorder(100,0,45,0);


         //INSIDE PANEL (panel1) START
//         JLabel simpleTXT = new JLabel("Must Enter Student Details");
         JLabel heading1 = new JLabel("Student Form");
         heading1.setBorder(margin);
         heading1.setFont(new Font("Consolas",Font.BOLD,24));
         JLabel studentName = new JLabel("Student Name");
         studentName.setBorder(margin);
         studentName.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel enrollmentID = new JLabel("Enrollment ID");
         enrollmentID.setBorder(margin);
         enrollmentID.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel courseName = new JLabel("Course Name");
         courseName.setBorder(margin);
         courseName.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel courseDuration = new JLabel("Course Duration");
         courseDuration.setBorder(margin);
         courseDuration.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel tuitionFee = new JLabel("Tuition Fee");
         tuitionFee.setBorder(margin);
         tuitionFee.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel dateOfBirth = new JLabel("Date of birth");
         dateOfBirth.setBorder(margin);
         dateOfBirth.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel dateOfEnrollment = new JLabel("Date of enrollment");
         dateOfEnrollment.setBorder(margin);
         dateOfEnrollment.setFont(new Font("Consolas",Font.PLAIN,16));

         JTextField studentNameTf = new JTextField(15);
         JTextField enrollmentIDTf = new JTextField(15);
         JTextField courseNameTf = new JTextField(15);
         JTextField courseDurationTf = new JTextField(15);
         JTextField tuitionFeeTf = new JTextField(15);

//         String years[] = {"Select DOB", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
//                 "2016", "2017"};
         String DOB_array[] = {"Select DOB", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                 "2016", "2017"};
         String DOE_array[] = {"Select DOE", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013",
                 "2014", "2015", "2016", "2017"};
         String DOD_array[] = {"Select DOD", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                 "2016", "2017"};
         String months[] = {"Select Months", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
         String days[]= {"Days", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
                 "25", "26", "27", "29", "30", "31", "32"};


         //COMBOBOX section START
         //For Date Of Birth (DOB)
         JComboBox dateOfBirthCB = new JComboBox<>(DOB_array);
         JComboBox comboBoxMonths_DOB = new JComboBox<>(months);
         JComboBox comboBoxDays_DOB = new JComboBox<>(days);

         //For Date Of Enrollment (DOE)
         JComboBox dateOfEnrollmentCB = new JComboBox<>(DOE_array);
         JComboBox comboBoxMonths_DOE = new JComboBox<>(months);
         JComboBox comboBoxDays_DOE = new JComboBox<>(days);

         //For Date Of DropOut (DOD)
         JComboBox dateOfDropOutCB = new JComboBox<>(DOD_array);
         JComboBox comboBoxMonths_DOD = new JComboBox<>(months);
         JComboBox comboBoxDays_DOD = new JComboBox<>(days);
         //COMBOBOX section END


         //making the combo box editable
//         dateOfBirthCB.setEditable(true);
//         dateOfEnrollmentCB.setEditable(true);

         //GRIDBAGLAYOUT
         GridBagLayout layout = new GridBagLayout();
         GridBagConstraints gbc = new GridBagConstraints();
         panel1.setLayout(layout);
         panel2.setLayout(layout);
         gbc.anchor = GridBagConstraints.LINE_START;

//         panel1.add(simpleTXT);

         gbc.gridx = 0;
         gbc.gridy = 0;
         gbc.gridwidth = 1;
         gbc.fill = GridBagConstraints.HORIZONTAL;
         panel1.add(heading1,gbc);

         gbc.gridx = 0;
         gbc.gridy = 1;
         gbc.gridwidth = 1;
         panel1.add(studentName,gbc);

         gbc.gridx = 1;
         gbc.gridy = 1;
         gbc.gridwidth = 2;
         panel1.add(studentNameTf,gbc);

         gbc.gridx = 0;
         gbc.gridy = 2;
         gbc.gridwidth = 1;
         panel1.add(enrollmentID,gbc);

         gbc.gridx = 1;
         gbc.gridy = 2;
         gbc.gridwidth = 2;
         panel1.add(enrollmentIDTf,gbc);

         gbc.gridx = 0;
         gbc.gridy = 3;
         gbc.gridwidth = 1;
         panel1.add(courseName,gbc);

         gbc.gridx = 1;
         gbc.gridy = 3;
         gbc.gridwidth = 2;
         panel1.add(courseNameTf,gbc);

         gbc.gridx = 0;
         gbc.gridy = 4;
         gbc.gridwidth = 1;
         panel1.add(courseDuration,gbc);

         gbc.gridx = 1;
         gbc.gridy = 4;
         gbc.gridwidth = 2;
         panel1.add(courseDurationTf,gbc);

         gbc.gridx = 0;
         gbc.gridy = 5;
         gbc.gridwidth = 1;
         panel1.add(tuitionFee,gbc);

         gbc.gridx = 1;
         gbc.gridy = 5;
         gbc.gridwidth = 2;
         panel1.add(tuitionFeeTf,gbc);

         gbc.gridx = 0;
         gbc.gridy = 6;
         gbc.gridwidth = 1;
         panel1.add(dateOfBirth,gbc);

         gbc.gridx = 1;
         gbc.gridy = 6;
         gbc.gridwidth = 1;
         panel1.add(dateOfBirthCB,gbc);

         gbc.gridx = 2;
         gbc.gridy = 6;
         gbc.gridwidth = 1;
         panel1.add(comboBoxMonths_DOB,gbc);

         gbc.gridx = 3;
         gbc.gridy = 6;
         gbc.gridwidth = 1;
         panel1.add(comboBoxDays_DOB,gbc);

         gbc.gridx = 0;
         gbc.gridy = 7;
         gbc.gridwidth = 1;
         panel1.add(dateOfEnrollment,gbc);

         gbc.gridx = 1;
         gbc.gridy = 7;
         gbc.gridwidth = 1;
         panel1.add(dateOfEnrollmentCB,gbc);

         gbc.gridx = 2;
         gbc.gridy = 7;
         gbc.gridwidth = 1;
         panel1.add(comboBoxMonths_DOE,gbc);

         gbc.gridx = 3;
         gbc.gridy = 7;
         gbc.gridwidth = 1;
         panel1.add(comboBoxDays_DOE,gbc);
         //INSIDE PANEL (panel) END

         //INSIDE PANEL (panel2) START
         JLabel heading2 = new JLabel("Student Form");
         heading2.setBorder(margin);
         heading2.setFont(new Font("Consolas",Font.BOLD,24));
         JLabel heading3 = new JLabel("Student Form");
         heading3.setBorder(margin);
         heading3.setFont(new Font("Consolas",Font.BOLD,24));
         JLabel numberOfModules =new JLabel("Number of Modules");
         numberOfModules.setBorder(margin);
         numberOfModules.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel numberOfCreditHours = new JLabel("Number of credit hours");
         numberOfCreditHours.setBorder(margin);
         numberOfCreditHours.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel numberOfDaysPresent = new JLabel("Number of days present");
         numberOfDaysPresent.setBorder(margin);
         numberOfDaysPresent.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel numberOfRemainingModules =new JLabel("Number of remaining modules");
         numberOfRemainingModules.setBorder(margin);
         numberOfRemainingModules.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel numberOfMonthsAttended = new JLabel("Number of months attended");
         numberOfMonthsAttended.setBorder(margin);
         numberOfMonthsAttended.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel dateOfDropOut = new JLabel("Date of DropOut");
         dateOfDropOut.setBorder(margin);
         dateOfDropOut.setFont(new Font("Consolas",Font.PLAIN,16));
         JLabel remainingAmount = new JLabel("Remaining amount");
         remainingAmount.setBorder(margin);
         remainingAmount.setFont(new Font("Consolas",Font.PLAIN,16));


         JTextField numberOfModulesTf = new JTextField(15);
         JTextField numberOfCreditHoursTf = new JTextField(15);
         JTextField numberOfDaysPresentTf = new JTextField(15);
         JTextField numberOfRemainingModulesTf = new JTextField(15);
         JTextField numberOfMonthsAttendedTf = new JTextField(15);
         JTextField remainingAmountTf = new JTextField(15);

         gbc.gridx = 0;
         gbc.gridy = 0;
         gbc.gridwidth = 1;
         panel2.add(panel2_1.add(heading2),gbc);

         gbc.gridx = 0;
         gbc.gridy = 1;
         gbc.gridwidth = 1;
         panel2.add(panel2_1.add(numberOfModules),gbc);

         gbc.gridx = 1;
         gbc.gridy = 1;
         gbc.gridwidth = 2;
         gbc.weightx = 2;
         panel2.add(panel2_1.add(numberOfModulesTf),gbc);

         gbc.gridx = 0;
         gbc.gridy = 2;
         gbc.gridwidth = 1;
         panel2.add(panel2_1.add(numberOfCreditHours),gbc);

         gbc.gridx = 1;
         gbc.gridy = 2;
         gbc.gridwidth = 2;
         gbc.weightx = 2;
         panel2.add(panel2_1.add(numberOfCreditHoursTf),gbc);

         gbc.gridx = 0;
         gbc.gridy = 3;
         gbc.gridwidth = 1;
         panel2.add(panel2_1.add(numberOfDaysPresent),gbc);

         gbc.gridx = 1;
         gbc.gridy = 3;
         gbc.gridwidth = 2;
         panel2.add(panel2_1.add(numberOfDaysPresentTf),gbc);

         gbc.gridx = 1;
         gbc.gridy = 4;
         gbc.gridwidth = 2;
         panel2.add(panel2_1.add(addRegularStudent),gbc);
         //making the combo box editable
//         dateOfDropOutCB.setEditable(true);

         //FOR DropOut SECTION  START
         gbc.gridx = 3;
         gbc.gridy = 0;
         gbc.gridwidth = 1;
         panel2.add((panel2_2.add(heading3)),gbc);

         gbc.gridx = 3;
         gbc.gridy = 1;
         gbc.gridwidth = 1;
         panel2.add((panel2_2.add(numberOfRemainingModules)),gbc);

         gbc.gridx = 4;
         gbc.gridy = 1;
         gbc.gridwidth = 2;
         panel2.add((panel2_2.add(numberOfRemainingModulesTf)),gbc);

         gbc.gridx = 3;
         gbc.gridy = 2;
         gbc.gridwidth = 1;
         panel2.add((panel2_2.add(numberOfMonthsAttended)),gbc);

         gbc.gridx = 4;
         gbc.gridy = 2;
         gbc.gridwidth = 2;
         panel2.add(panel2_2.add(numberOfMonthsAttendedTf),gbc);

         gbc.gridx = 3;
         gbc.gridy = 3;
         gbc.gridwidth = 1;
         panel2.add(panel2_2.add(dateOfDropOut),gbc);

         gbc.gridx = 4;
         gbc.gridy = 3;
         gbc.gridwidth = 1;
         panel2.add(panel2_2.add(dateOfDropOutCB),gbc);

         gbc.gridx = 5;
         gbc.gridy = 3;
         gbc.gridwidth = 1;
         panel2.add(panel2_2.add(comboBoxMonths_DOD),gbc);

         gbc.gridx = 6;
         gbc.gridy = 3;
         gbc.gridwidth = 1;
         panel2.add(panel2_2.add(comboBoxDays_DOD),gbc);

         gbc.gridx = 3;
         gbc.gridy = 4;
         gbc.gridwidth = 1;
         panel2.add(panel2_2.add(remainingAmount),gbc);

         gbc.gridx = 4;
         gbc.gridy = 4;
         gbc.gridwidth = 2;
         panel2.add(panel2_2.add(remainingAmountTf),gbc);

         gbc.gridx = 4;
         gbc.gridy = 5;
         gbc.gridwidth = 2;
         panel2.add(panel2_2.add(addDropOutStudent),gbc);
         //PANEL (panel2) END

         //ADD REGULAR STUDENT BUTTON ACTIONLISTENER
         //by replacing getAction with getEditor don't know why but the below code is working.
//         addRegularStudent.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 if (enrollmentIDTf.getText().toString().equals(0) || courseDurationTf.getText().toString().equals(0) || studentNameTf.getText().equals("") ||
//                 dateOfBirthCB.getEditor().equals("") || dateOfBirthCB.getEditor().equals("") || courseDurationTf.getText().toString().equals(0) || tuitionFeeTf.getText().toString().equals(0)){
//                     JOptionPane.showMessageDialog(null,"Please fill up the form properly","Something is left",JOptionPane.INFORMATION_MESSAGE);
//                 }
//                 else {
//                     studentData.add(new Regular(Integer.parseInt(enrollmentIDTf.getText()),dateOfBirthCB.getSelectedItem(),courseNameTf.getText(),studentName.getText(),dateOfEnrollmentCB.getSelectedItem(),courseDurationTf.getText(),tuitionFeeTf.getText(),numberOfModulesTf.getText(),numberOfCreditHours.getText(),numberOfDaysPresentTf.getText()));
//                     JOptionPane.showMessageDialog(null,"Information added","Added",JOptionPane.INFORMATION_MESSAGE);
//                 }
//             }
//         });


         panel2.setBorder(marginForPanel);

//         panel1.add(comboBoxDays);
//         panel1.add(comboBoxMonths);
//         panel1.add(comboBoxYears);

         //ADDING COMPONENT IN FRAME START
         frame.add(panel1,BorderLayout.CENTER);
         frame.add(panel2,BorderLayout.PAGE_END);
         frame.add(panel3,BorderLayout.PAGE_START);
         frame.add(panel4,BorderLayout.LINE_START);
         frame.add(panel5,BorderLayout.LINE_END);
         frame.pack();
         frame.setVisible(true);
         //ADDING COMPONENT IN FRAME END
     }

    public static void main(String[] args) {
         StudentGUI student1 = new StudentGUI();
         student1.student();
    }
}
