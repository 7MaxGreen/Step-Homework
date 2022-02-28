package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.HashMap;

public class MainController {
    @FXML
    private TextField Display;

    @FXML
    private Button C;

    @FXML
    private Button Percent;

    @FXML
    private Button division;

    @FXML
    private Button Rad;

    @FXML
    private Button Seven;

    @FXML
    private Button Eight;

    @FXML
    private Button Nine;

    @FXML
    private Button Multiplication;

    @FXML
    private Button Log;

    @FXML
    private Button Four;

    @FXML
    private Button Five;

    @FXML
    private Button Six;

    @FXML
    private Button Subtraction;

    @FXML
    private Button Sin;

    @FXML
    private Button One;

    @FXML
    private Button Two;

    @FXML
    private Button Three;

    @FXML
    private Button Addition;

    @FXML
    private Button Cos;

    @FXML
    private Button Zero;

    @FXML
    private Button Point;

    @FXML
    private Button Del;

    @FXML
    private Button PlusMinus;

    @FXML
    private Button Equal;

    private Double result;
    private int mathOp;
    private Double answer;

    void parseDouble(){
        result = Double.parseDouble(Display.getText());
        Display.setText("");
    }


    @FXML
    void ButtonPush(ActionEvent event) {

        if(event.getSource() == One) Display.setText(Display.getText() + "1");
        else if(event.getSource() == Two) Display.setText(Display.getText() + "2");
        else if(event.getSource() == Three) Display.setText(Display.getText() + "3");
        else if(event.getSource() == Four) Display.setText(Display.getText() + "4");
        else if(event.getSource() == Five) Display.setText(Display.getText() + "5");
        else if(event.getSource() == Six) Display.setText(Display.getText() + "6");
        else if(event.getSource() == Seven) Display.setText(Display.getText() + "7");
        else if(event.getSource() == Eight) Display.setText(Display.getText() + "8");
        else if(event.getSource() == Nine) Display.setText(Display.getText() + "9");
        else if(event.getSource() == Zero) Display.setText(Display.getText() + "0");
        else if(event.getSource() == Del) Display.setText(Display.getText().substring(0,Display.getText().length()-1));

        else if(event.getSource() == Addition) {
            parseDouble();
            mathOp = 1;

            }
        else if(event.getSource() == Subtraction) {
            parseDouble();
            mathOp = 2;
        }
        else if(event.getSource() == Multiplication) {
            parseDouble();
            mathOp = 3;
        }
        else if(event.getSource() == division) {
            parseDouble();
            mathOp = 4;
        }
        else if(event.getSource() == Rad) {
            parseDouble();
            mathOp = 5;
        }
        else if(event.getSource() == Log) {
            parseDouble();
            mathOp = 6;
        }
        else if(event.getSource() == Sin) {
            parseDouble();
            mathOp = 7;
        }
        else if(event.getSource() == Cos) {
            parseDouble();
            mathOp = 8;
        }
        else if(event.getSource() == Percent) {
            parseDouble();
            mathOp = 9;
        }

        else if(event.getSource() == Equal) {

             Double result2;
             result2 = Double.parseDouble(Display.getText());
            switch(mathOp){
                case 1:  answer = result+result2; Display.setText(String.valueOf(answer)); break;
                case 2:  answer = result-result2; Display.setText(String.valueOf(answer)); break;
                case 3:  answer = result*result2; Display.setText(String.valueOf(answer)); break;

                case 4:  try{answer = result/result2;
                            }catch(Exception e) {Display.setText("Division by 0 is forbidden"); }
                         Display.setText(String.format("%.5f", answer));
                         break;

                case 5:  try{answer = Math.sqrt(result2);}
                         catch(Exception e){Display.setText("Error");}
                         Display.setText(String.format("%.5f", answer));
                         break;

                case 6:  answer = Math.log(result2); Display.setText(String.format("%.5f", answer)); break;
                case 7:  answer = Math.cos(result2); Display.setText(String.format("%.5f", answer)); break;
                case 8:  answer = Math.sin(result2); Display.setText(String.format("%.5f", answer)); break;

                case 9:  try{answer = (result*result2) /100 ;}
                         catch(Exception e){Display.setText("Error");}
                         Display.setText(String.format("%.5f", answer));
                         break;
            }
        }
        else if(event.getSource() == C) Display.setText("");

        else if(event.getSource() == Point) {
            if(Display.getText().contains(".")) {
                Display.setText(Display.getText());
            }else{Display.setText(Display.getText() + ".");}
        }

        else if(event.getSource() == PlusMinus) {
            if(Display.getText().contains("-")) {
               Display.setText(Display.getText().substring(1));
            }else if(!Display.getText().contains("-")){
                Display.setText("-" + Display.getText());}
        }
      }
    }



