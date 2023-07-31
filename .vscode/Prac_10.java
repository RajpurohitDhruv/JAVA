import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Prac_10 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(20,20,20,20));
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(30);
        gp.setVgap(20);
        
        Label F_name = new Label("First Name : ");
        TextField fn = new TextField();
        gp.add(F_name,0,0);
        gp.add(fn,1,0);
        
        Label M_name = new Label("Middle Name : ");
        TextField mn = new TextField();
        gp.add(M_name,0,1);
        gp.add(mn,1,1);

        Label L_name = new Label("Last Name : ");
        TextField ln = new TextField();
        gp.add(L_name,0,2);
        gp.add(ln,1,2);

        Label l1 = new Label("Want to Participate in : ");
        gp.add(l1,0,3);
        CheckBox c1 = new CheckBox("Technical Event");
        CheckBox c2 = new CheckBox("Cultural Event");
        HBox h = new HBox(c1,c2);
        gp.add(h,1,3);

        Label l2 = new Label("Your Current Semester");
        gp.add(l2,0,4);

        RadioButton r1 = new RadioButton("2nd");
        RadioButton r2 = new RadioButton("4th");
        RadioButton r3 = new RadioButton("6th");
        RadioButton r4 = new RadioButton("8th");
        HBox h2 = new HBox(r1,r2,r3,r4);
        gp.add(h2,1,4);

        ToggleGroup g1 = new ToggleGroup();
        r1.setToggleGroup(g1);
        r2.setToggleGroup(g1);
        r3.setToggleGroup(g1);
        r4.setToggleGroup(g1);

        Label l3 = new Label("Select your college : ");
        gp.add(l3,0,5);
        ArrayList<String> clglist = new ArrayList<String>();
        clglist.add("GEC,Bhavnagar");
        clglist.add("GEC,Gandhinagar");
        clglist.add("GEC,Bharuch");
        clglist.add("GEC,Surat");

        ComboBox<String> cbbox = new ComboBox<String>();
        cbbox.getItems().addAll(clglist);
        gp.add(cbbox,1,5);
        cbbox.setValue("GEC, Bhavnagar");
        
        Button btn = new Button("Submit Details");
        HBox h3 = new HBox(btn);
        h3.setAlignment(Pos.CENTER_RIGHT);
        gp.add(h3,1,6);
        
        Scene s = new Scene(gp,500,500);
        stage.setScene(s);
        stage.setTitle("Event Registration form by GEC, Bhavnagar");
        stage.show();
    }
     public static void main(String[] args) {
        Application.launch(args);
    }
}