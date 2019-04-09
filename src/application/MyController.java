package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController {
	@FXML
	private Button button_igual;
	@FXML
	private Button button_sumar;
	@FXML
	private Button button_restar;
	@FXML
	private Button button_multiplicar;
	@FXML
	private Button button_dividir;
	@FXML
	private Button button_porciento;
	@FXML
	private Button button_uno;
	@FXML
	private Button button_dos;
	@FXML
	private Button button_tres;
	@FXML
	private Button button_cuatro;
	@FXML
	private Button button_cinco;
	@FXML
	private Button button_seis;
	@FXML
	private Button button_siete;
	@FXML
	private Button button_ocho;
	@FXML
	private Button button_nueve;
	@FXML
	private TextField myTextfield1;
	@FXML
	private TextField myTextfield2;
	@FXML
	private TextField myTextfield3;
	@FXML
	private TextField myTextfield4;
	@FXML
	private String numero1 = "";
	@FXML
	private String numero2 = "";
	@FXML
	private double num1 = 0;
	@FXML
	private double num2 = 0;

	@FXML
	public void initialize() {
	}

	public void cero(ActionEvent event) {
		System.out.println("Button CERO Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += "0";
			myTextfield1.setText(numero1);
		} else {
			numero2 += "0";
			myTextfield3.setText(numero2);
		}

	}

	public void uno(ActionEvent event) {
		System.out.println("Button UNO Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += "1";
			myTextfield1.setText(numero1);
		} else {
			numero2 += "1";
			myTextfield3.setText(numero2);
		}
	}

	public void dos(ActionEvent event) {
		System.out.println("Button DOS Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += "2";
			myTextfield1.setText(numero1);
		} else {
			numero2 += "2";
			myTextfield3.setText(numero2);
		}
	}

	public void tres(ActionEvent event) {
		System.out.println("Button TRES Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += "3";
			myTextfield1.setText(numero1);
		} else {
			numero2 += "3";
			myTextfield3.setText(numero2);
		}
	}

	public void cuatro(ActionEvent event) {
		System.out.println("Button CUATRO Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += "4";
			myTextfield1.setText(numero1);
		} else {
			numero2 += "4";
			myTextfield3.setText(numero2);
		}
	}

	public void cinco(ActionEvent event) {
		System.out.println("Button CINCO Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += "5";
			myTextfield1.setText(numero1);
		} else {
			numero2 += "5";
			myTextfield3.setText(numero2);
		}
	}

	public void seis(ActionEvent event) {
		System.out.println("Button SEIS Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += "6";
			myTextfield1.setText(numero1);
		} else {
			numero2 += "6";
			myTextfield3.setText(numero2);
		}
	}

	public void siete(ActionEvent event) {
		System.out.println("Button SIETE Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += "7";
			myTextfield1.setText(numero1);
		} else {
			numero2 += "7";
			myTextfield3.setText(numero2);
		}
	}

	public void ocho(ActionEvent event) {
		System.out.println("Button OCHO Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += "8";
			myTextfield1.setText(numero1);
		} else {
			numero2 += "8";
			myTextfield3.setText(numero2);
		}
	}

	public void nueve(ActionEvent event) {
		System.out.println("Button NUEVE Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += "9";
			myTextfield1.setText(numero1);
		} else {
			numero2 += "9";
			myTextfield3.setText(numero2);
		}
	}

	public void sumar(ActionEvent event) {
		System.out.println("Button SUMAR Clicked!");
		myTextfield2.setText("+");

	}

	public void restar(ActionEvent event) {
		System.out.println("Button RESTAR Clicked!");
		myTextfield2.setText("-");
	}

	public void multiplicar(ActionEvent event) {
		System.out.println("Button MULTIPLICAR Clicked!");
		myTextfield2.setText("*");
	}

	public void dividir(ActionEvent event) {
		System.out.println("Button DIVIDIR Clicked!");
		myTextfield2.setText("/");
	}

	public void porciento(ActionEvent event) {
		System.out.println("Button PORCIENTO Clicked!");
		myTextfield2.setText("%");
	}

	public void coma(ActionEvent event) {
		System.out.println("Button COMA Clicked!");
		if (myTextfield2.getText().equals("")) {
			numero1 += ",";
			myTextfield1.setText(numero1);
		} else {
			numero2 += ",";
			myTextfield3.setText(numero2);
		}
	}

	public void borrar(ActionEvent event) {
		System.out.println("Button  BORRAR Clicked!");
		numero1 = "";
		numero2 = "";
		myTextfield1.setText("");
		myTextfield2.setText("");
		myTextfield3.setText("");
		myTextfield4.setText("");
	}

	public void ac(ActionEvent event) {
		System.out.println("Button  AC Clicked!");
		numero1 = "";
		numero2 = "";
		myTextfield1.setText("");
		myTextfield2.setText("");
		myTextfield3.setText("");
		myTextfield4.setText("");
	}

	public void resultado(ActionEvent event) {
		numero1 = String.valueOf(num1);
		numero2 = String.valueOf(num2);
		System.out.println("Button resultado Clicked!");
		if (myTextfield2.getText().equals("+")) {
			myTextfield4.setText(String.valueOf(num1 + num2));

		} else if (myTextfield2.getText().equals("-")) {
			myTextfield4.setText(String.valueOf(num1 - num2));

		} else if (myTextfield2.getText().equals("*")) {
			myTextfield4.setText(String.valueOf(num1 * num2));

		} else if (myTextfield2.getText().equals("/")) {
			myTextfield4.setText(String.valueOf(num1 / num2));

		} else {
			myTextfield4.setText(String.valueOf(num1 + num2));

		}
//TODO resetea los valores despues de mostrar el resultado
		numero1 = "";
		myTextfield2.setText("");
		numero2 = "";
	}
}