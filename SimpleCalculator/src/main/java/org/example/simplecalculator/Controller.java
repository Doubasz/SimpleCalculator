package org.example.simplecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    public Label result;
    public double ans = 0;
    public String operation = "";

    @FXML
    public void click0() {
        result.setText(result.getText() + "0");
    }
    public void click1() {
        result.setText(result.getText() + "1");
    }
    public void click2() {
        result.setText(result.getText() + "2");
    }
    public void click3() {
        result.setText(result.getText() + "3");
    }
    public void click4() {
        result.setText(result.getText() + "4");
    }
    public void click5() {
        result.setText(result.getText() + "5");
    }
    public void click6() {
        result.setText(result.getText() + "6");
    }
    public void click7() {
        result.setText(result.getText() + "7");
    }
    public void click8() {
        result.setText(result.getText() + "8");
    }
    public void click9() {
        result.setText(result.getText() + "9");
    }
    public void clickEsc(){
        result.setText("");
        ans = 0;
        operation = "";
    }
    public void clickSum(){
        checkOperation(operation);
        result.setText("");
        operation = "Sum";

    }
    public void clickSub(){
        checkOperation(operation);
        result.setText("");
        operation = "Sub";
    }
    public void clickMultp(){
        checkOperation(operation);
        result.setText("");
        operation = "Multp";
    }
    public void clickDiv(){
        checkOperation(operation);
        result.setText("");
        operation = "Div";
    }
    public void clickEgal(){
        checkOperation(operation);
        if(isDouble(ans)) result.setText(String.valueOf(ans));
        else result.setText(String.valueOf((int) ans));

        ans = Double.parseDouble(result.getText());
        operation = "";
    }
    public void clickPnt(){
        result.setText(result.getText() + ".");
    }
    public void clickAns(){
        result.setText(String.valueOf(ans));
    }

    public void checkOperation(String op){
        switch (op) {
            case "Sum" -> ans += Double.parseDouble(result.getText());
            case "Sub" -> ans -= Double.parseDouble(result.getText());
            case "Multp" -> ans *= Double.parseDouble(result.getText());
            case "Div" -> ans /= Double.parseDouble(result.getText());
            default -> ans = Double.parseDouble(result.getText());
        }
    }

    public boolean isDouble(double n) {
        return (n - (int) n) > 0;
    }
}
