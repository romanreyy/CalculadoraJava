package CALCULADORA;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class CALCULADORA_SIMPLE {

    private JFrame frame;
    private JTextField txtTxtnum;
    private JTextField txtTxtnum_1;
    private JTextField[][] txtCoef2x2;
    private JTextField[][] txtCoef3x3;
    private JLabel lblResu;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CALCULADORA_SIMPLE window = new CALCULADORA_SIMPLE();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public CALCULADORA_SIMPLE() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        txtTxtnum = new JTextField();
        txtTxtnum.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTxtnum.setText("0");
        txtTxtnum.setBounds(165, 131, 96, 19);
        frame.getContentPane().add(txtTxtnum);
        txtTxtnum.setColumns(10);

        txtTxtnum_1 = new JTextField();
        txtTxtnum_1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTxtnum_1.setText("0");
        txtTxtnum_1.setColumns(10);
        txtTxtnum_1.setBounds(291, 131, 96, 19);
        frame.getContentPane().add(txtTxtnum_1);

        JLabel lblNum1 = new JLabel("Numero 1");
        lblNum1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNum1.setBounds(165, 203, 96, 21);
        frame.getContentPane().add(lblNum1);

        JLabel lblNum2 = new JLabel("Numero 2");
        lblNum2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNum2.setBounds(291, 203, 96, 17);
        frame.getContentPane().add(lblNum2);

        lblResu = new JLabel("Resultado");
        lblResu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblResu.setHorizontalAlignment(SwingConstants.CENTER);
        lblResu.setBounds(0, 198, 157, 30);
        frame.getContentPane().add(lblResu);

        JButton btnSuma = new JButton("SUMA");
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(txtTxtnum.getText());
                    int num2 = Integer.parseInt(txtTxtnum_1.getText());
                    int suma = num1 + num2;
                    lblResu.setText(String.valueOf(suma));
                } catch (NumberFormatException ex) {
                    lblResu.setText("Error: Entrada no válida");
                }
            }
        });
        btnSuma.setBounds(291, 59, 96, 21);
        frame.getContentPane().add(btnSuma);

        JButton btnResta = new JButton("RESTA");
        btnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(txtTxtnum.getText());
                    int num2 = Integer.parseInt(txtTxtnum_1.getText());
                    int resta = num1 - num2;
                    lblResu.setText(String.valueOf(resta));
                } catch (NumberFormatException ex) {
                    lblResu.setText("Error: Entrada no válida");
                }
            }
        });
        btnResta.setBounds(165, 59, 96, 21);
        frame.getContentPane().add(btnResta);

        JButton btnMult = new JButton("MULT");
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(txtTxtnum.getText());
                    int num2 = Integer.parseInt(txtTxtnum_1.getText());
                    int mult = num1 * num2;
                    lblResu.setText(String.valueOf(mult));
                } catch (NumberFormatException ex) {
                    lblResu.setText("Error: Entrada no válida");
                }
            }
        });
        btnMult.setBounds(33, 59, 96, 21);
        frame.getContentPane().add(btnMult);

        JButton btnDivi = new JButton("DIV");
        btnDivi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(txtTxtnum.getText());
                    float num2 = Float.parseFloat(txtTxtnum_1.getText());

                    if (num2 == 0) {
                        lblResu.setText("Error: División por cero");
                    } else {
                        float Divi = num1 / num2;
                        lblResu.setText(String.valueOf(Divi));
                    }
                } catch (NumberFormatException ex) {
                    lblResu.setText("Error: Entrada no válida");
                }
            }
        });
        btnDivi.setBounds(33, 100, 96, 21);
        frame.getContentPane().add(btnDivi);

        // Coeficientes para 2x2
        txtCoef2x2 = new JTextField[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                txtCoef2x2[i][j] = new JTextField();
                txtCoef2x2[i][j].setBounds(50 + j * 60, 300 + i * 30, 50, 20);
                frame.getContentPane().add(txtCoef2x2[i][j]);
            }
        }

        JButton btnSolve2x2 = new JButton("Solve 2x2");
        btnSolve2x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a1 = Double.parseDouble(txtCoef2x2[0][0].getText());
                    double b1 = Double.parseDouble(txtCoef2x2[0][1].getText());
                    double c1 = Double.parseDouble(txtCoef2x2[0][2].getText());
                    double a2 = Double.parseDouble(txtCoef2x2[1][0].getText());
                    double b2 = Double.parseDouble(txtCoef2x2[1][1].getText());
                    double c2 = Double.parseDouble(txtCoef2x2[1][2].getText());

                    double det = a1 * b2 - a2 * b1;
                    if (det == 0) {
                        lblResu.setText("No tiene solución única");
                    } else {
                        double x = (c1 * b2 - c2 * b1) / det;
                        double y = (a1 * c2 - a2 * c1) / det;
                        lblResu.setText("x = " + x + ", y = " + y);
                    }
                } catch (NumberFormatException ex) {
                    lblResu.setText("Error: Entrada no válida");
                }
            }
        });
        btnSolve2x2.setBounds(57, 419, 100, 21);
        frame.getContentPane().add(btnSolve2x2);

        // Coeficientes para 3x3
        txtCoef3x3 = new JTextField[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                txtCoef3x3[i][j] = new JTextField();
                txtCoef3x3[i][j].setBounds(300 + j * 60, 300 + i * 30, 50, 20);
                frame.getContentPane().add(txtCoef3x3[i][j]);
            }
        }

        JButton btnSolve3x3 = new JButton("Solve 3x3");
        btnSolve3x3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a1 = Double.parseDouble(txtCoef3x3[0][0].getText());
                    double b1 = Double.parseDouble(txtCoef3x3[0][1].getText());
                    double c1 = Double.parseDouble(txtCoef3x3[0][2].getText());
                    double d1 = Double.parseDouble(txtCoef3x3[0][3].getText());
                    double a2 = Double.parseDouble(txtCoef3x3[1][0].getText());
                    double b2 = Double.parseDouble(txtCoef3x3[1][1].getText());
                    double c2 = Double.parseDouble(txtCoef3x3[1][2].getText());
                    double d2 = Double.parseDouble(txtCoef3x3[1][3].getText());
                    double a3 = Double.parseDouble(txtCoef3x3[2][0].getText());
                    double b3 = Double.parseDouble(txtCoef3x3[2][1].getText());
                    double c3 = Double.parseDouble(txtCoef3x3[2][2].getText());
                    double d3 = Double.parseDouble(txtCoef3x3[2][3].getText());

                    double det = a1 * (b2 * c3 - b3 * c2) - b1 * (a2 * c3 - a3 * c2) + c1 * (a2 * b3 - a3 * b2);
                    if (det == 0) {
                        lblResu.setText("No tiene solución única");
                    } else {
                        double x = (d1 * (b2 * c3 - b3 * c2) - b1 * (d2 * c3 - d3 * c2) + c1 * (d2 * b3 - d3 * b2)) / det;
                        double y = (a1 * (d2 * c3 - d3 * c2) - d1 * (a2 * c3 - a3 * c2) + c1 * (a2 * d3 - a3 * d2)) / det;
                        double z = (a1 * (b2 * d3 - b3 * d2) - b1 * (a2 * d3 - a3 * d2) + d1 * (a2 * b3 - a3 * b2)) / det;
                        lblResu.setText("x = " + x + ", y = " + y + ", z = " + z);
                    }
                } catch (NumberFormatException ex) {
                    lblResu.setText("Error: Entrada no válida");
                }
            }
        });
        btnSolve3x3.setBounds(291, 419, 100, 21);
        frame.getContentPane().add(btnSolve3x3);
    }
}
