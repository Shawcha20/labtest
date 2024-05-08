package com.example.soft_lab_testa2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

class vehicle{
    int wheel;
    double fuel=0.0;
    double milage=0.0;
    public vehicle(int wheel, double fuel, double milage){
        this.wheel= wheel;
        this.fuel= fuel;
        this.milage= milage;
    }
    public int wheels()
    {
        return wheel;
    }
    public double fuels()
    {
        return fuel;
    }
    public double milages()
    {
        return milage;
    }
    public void patrol(double need)
    {
        fuel= fuel+need;
    }
    public String drive()
    {
        return null;
    }
}
 class sedan extends vehicle{
    public sedan(){
        super(3,2,5);
    }
    public String drive(){
        return "this is sedan";
    }
}
class motorcycle extends vehicle{
    public motorcycle(){
        super(2,.5,1.5);
    }
    public String drive(){
        return "this is motorcycle";
    }
}
class SUV extends vehicle{
    public SUV()
    {
        super(4,2.5,4);
    }
    public String drive(){
        return "this is suv";
    }
}
class color{
    String name;
    public color(String name){
        this.name= name;
    }
    public String showColor()
    {
        return "the color is "+name;
    }
}
class red extends color{
    public red()
    {
        super("Red");
    }
}
class blue extends color{
    public blue()
    {
        super("Blue");
    }
}
class green extends color{
    public green()
    {
        super("Green");
    }
}

public class MainActivity extends AppCompatActivity {

    public EditText vehicleEditText, ColorEditText ,p_edit;
    public Button button, p_button ;
    public TextView drive_show,p_show, vehicleTextview , ColorTextView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vehicleEditText = findViewById(R.id.vehicleEdtText);
        ColorEditText = findViewById(R.id.ColorEditText);
        button = findViewById(R.id.button);
        vehicleTextview = findViewById(R.id.vehicleTextView);
        ColorTextView = findViewById(R.id.ColorTextView);
        p_edit=findViewById(R.id.petrolEdiTxt);
        p_button= findViewById(R.id.petrolButton);
        p_show= findViewById(R.id.petrolShow);
        drive_show= findViewById(R.id.diveText);

        button.setOnClickListener(v -> {
            String color = ColorEditText.getText().toString() ;
            String vehi=vehicleEditText.getText().toString();
            if(color.equals("Red")){
                red r = new red();
                ColorTextView.setText(r.showColor());
            }
            else if(color.equals("Green")){
                green g = new green();
                ColorTextView.setText(g.showColor());
            }
            else if(color.equals("Blue")){
                blue b = new blue();
                ColorTextView.setText(b.showColor());
            }
            else{
                ColorTextView.setText("Invalid Color");
            }
            if(vehi.equals("Sedan")){
                vehicle s = new sedan();
                vehicleTextview.setText(s.drive());
            }
            else if(vehi.equals("motorcycle")){
                vehicle m = new motorcycle();
                vehicleTextview.setText(m.drive());
            }
            else if(vehi.equals("SUv")){
                vehicle Su = new SUV();
                vehicleTextview.setText(Su.drive());
            }
            else {
                vehicleTextview.setText("Invalid Color");
            }

        });
        p_button.setOnClickListener(v->{
            double getP= p_edit.getText();
            if
                }

        );
    }
}