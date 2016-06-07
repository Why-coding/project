
package ludomaster;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class Ludomaster extends Application {
    
    Stage stage;
    Scene s1,s2,s3,s4,s5;
    player master[]=new player[5];
    gamer boss[]=new gamer[4];
    Circle red=new Circle(852,65,25.0f,Color.RED); 
    Circle green=new Circle(852,125,25.0f,Color.GREEN); 
    Circle blue=new Circle(852,185,25.0f,Color.BLUE); 
    Circle yellow=new Circle(852,245,25.0f,Color.YELLOW); 
    Circle red1=new Circle(630,60,10.0f,Color.RED); 
    Circle green1=new Circle(630,110,10.0f,Color.GREEN); 
    Circle blue1=new Circle(630,160,10.0f,Color.BLUE); 
    Circle yellow1=new Circle(630,210,10.0f,Color.YELLOW); 
    Circle red2=new Circle(655,60,10.0f,Color.RED); 
    Circle green2=new Circle(655,110,10.0f,Color.GREEN); 
    Circle blue2=new Circle(655,160,10.0f,Color.BLUE); 
    Circle yellow2=new Circle(655,210,10.0f,Color.YELLOW); 
    Circle red3=new Circle(680,60,10.0f,Color.RED); 
    Circle green3=new Circle(680,110,10.0f,Color.GREEN); 
    Circle blue3=new Circle(680,160,10.0f,Color.BLUE); 
    Circle yellow3=new Circle(680,210,10.0f,Color.YELLOW); 
    Circle red4=new Circle(705,60,10.0f,Color.RED); 
    Circle green4=new Circle(705,110,10.0f,Color.GREEN); 
    Circle blue4=new Circle(705,160,10.0f,Color.BLUE); 
    Circle yellow4=new Circle(705,210,10.0f,Color.YELLOW); 
    Pane root3=new Pane();
    Label label=new Label(" ");
    Label label1=new Label(" ");
    Button b5=new Button("Dice");
    Button b6=new Button("Move");
    Button b7=new Button("Dice");
    Button b8=new Button("Move");
    int x,count1=0,count2=0,count3=0,count4=0;
    VBox v=new VBox();
    VBox v2=new VBox();
    VBox v3=new VBox();
    VBox v4=new VBox();
    Button b1=new Button("OK");
    Button b2=new Button("OK");
    Button b3=new Button("OK");
    Button b4=new Button("OK");
    Label lbl=new Label("You");
    Label lbl2=new Label(" ");
    Label lbl3=new Label(" ");
    Label lbl4=new Label(" ");
    int t=1;
    position[] a=new position[101];
    position []ld=new position[73];
    int j,k;
    Random rand=new Random(); 
    Stage wndw=new Stage();
    Stage wndw2=new Stage();
    Stage wndw3=new Stage();
    Stage wndw4=new Stage();
    public void start(Stage primaryStage) {
        stage=primaryStage;
        Button btn1 = new Button("PLAY");
        Button btn2=new Button("CONTINUE");
        Button btn3=new Button("EXIT");
        btn1.setPrefSize(200, 50);
        btn2.setPrefSize(200, 50);
        btn3.setPrefSize(200, 50);
        btn1.setOnAction((ActionEvent event) -> {
            stage.setScene(s2);
            stage.show();
        });        
        VBox root;
        root = new VBox();
        root.getChildren().addAll(btn1,btn2,btn3);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(70);      
        s1 = new Scene(root, 1090, 1090);
        s1.getStylesheets().add(getClass().getResource("scene1.css").toExternalForm());
        Button btn4=new Button("SNAKE MODE");
        Button btn5=new Button("LUDO MODE");
        btn4.setPrefSize(200, 50);
        btn5.setPrefSize(200, 50);
        btn4.setOnAction(e-> {
            stage.setScene(s3);
            stage.show();
            snake();
        });
        btn5.setOnAction(e->{
            stage.setScene(s4);
            stage.show();
        });
        VBox root2=new VBox();
        root2.getChildren().addAll(btn4,btn5);
        root2.setAlignment(Pos.CENTER);
        root2.setSpacing(70);
        s2=new Scene(root2,1000,1000);
        s2.getStylesheets().add(getClass().getResource("scene2.css").toExternalForm());
        b5.setMinHeight(60);
        b5.setPrefWidth(100);
        b5.setLayoutX(816);
        b5.setLayoutY(529);
        b6.setMinHeight(60);
        b6.setPrefWidth(100);
        b6.setLayoutX(816);
        b6.setLayoutY(609);
        label.setPrefSize(80,60);
        label.setLayoutX(810);
        label.setLayoutY(429);
        root3.getChildren().addAll(red,green,blue,yellow,b5,b6,label);
        s3=new Scene(root3,970,1000);
        s3.getStylesheets().add(getClass().getResource("scene3.css").toExternalForm());
        Pane root4=new Pane();
        b7.setMinHeight(50);
        b7.setPrefWidth(60);
        b7.setLayoutX(620);
        b7.setLayoutY(365);
        b8.setMinHeight(50);
        b8.setPrefWidth(60);
        b8.setLayoutX(620);
        b8.setLayoutY(430);
        label1.setPrefSize(60,50);
        label1.setLayoutX(620);
        label1.setLayoutY(290);
        red1.setStroke(Color.BLACK);
        red1.setStrokeWidth(4);
        red2.setStroke(Color.BLACK);
        red2.setStrokeWidth(4);
        red3.setStroke(Color.BLACK);
        red3.setStrokeWidth(4);
        red4.setStroke(Color.BLACK);
        red4.setStrokeWidth(4);
        green1.setStroke(Color.BLACK);
        green1.setStrokeWidth(4);
        green2.setStroke(Color.BLACK);
        green2.setStrokeWidth(4);
        green3.setStroke(Color.BLACK);
        green3.setStrokeWidth(4);
        green4.setStroke(Color.BLACK);
        green4.setStrokeWidth(4);
        blue1.setStroke(Color.BLACK);
        blue1.setStrokeWidth(4);
        blue2.setStroke(Color.BLACK);
        blue2.setStrokeWidth(4);
        blue3.setStroke(Color.BLACK);
        blue3.setStrokeWidth(4);
        blue4.setStroke(Color.BLACK);
        blue4.setStrokeWidth(4);
        yellow1.setStroke(Color.BLACK);
        yellow1.setStrokeWidth(4);
        yellow2.setStroke(Color.BLACK);
        yellow2.setStrokeWidth(4);
        yellow3.setStroke(Color.BLACK);
        yellow3.setStrokeWidth(4);
        yellow4.setStroke(Color.BLACK);
        yellow4.setStrokeWidth(4);
        root4.getChildren().addAll(red1,green1,blue1,yellow1,red2,green2,blue2,yellow2,red3,green3,blue3,yellow3,red4,green4,blue4,yellow4,b7,b8,label1);
        s4=new Scene(root4,752,558);
        s4.getStylesheets().add(getClass().getResource("scene4.css").toExternalForm());
        stage.setScene(s1);
        stage.show();
    }
    void snake(){
        //snake game ode
        for(j=1;j<=4;j++){
            master[j]=new player();
        }
        a[1]=new position();
        a[1].px=36;
        a[1].py=697;
        double width=73;
        double height=73;
        for(j=2;j<=10;j++){
            a[j]=new position();
            a[j].px=a[j-1].px+width;
            a[j].py=a[1].py;
        }
        for(j=11;j<=20;j++){
            a[j]=new position();
            if(j==11){
                a[j].px=a[j-1].px;
                a[j].py=a[j-1].py-height;
            }
            else{
            a[j].px=a[j-1].px-width;
            a[j].py=a[j-1].py;
            }
        }
        for(j=21;j<=30;j++){
            a[j]=new position();
            if(j==21){
                a[j].px=a[j-1].px;
                a[j].py=a[j-1].py-height;
            }
            else{
            a[j].px=a[j-1].px+width;
            a[j].py=a[j-1].py;
            }
        }
        for(j=31;j<=40;j++){
            a[j]=new position();
            if(j==31){
                a[j].px=a[j-1].px;
                a[j].py=a[j-1].py-height;
            }
            else{
            a[j].px=a[j-1].px-width;
            a[j].py=a[j-1].py;
            }
        }
        for(j=41;j<=50;j++){
            a[j]=new position();
            if(j==41){
                a[j].px=a[j-1].px;
                a[j].py=a[j-1].py-height;
            }
            else{
            a[j].px=a[j-1].px+width;
            a[j].py=a[j-1].py;
            }
        }
        for(j=51;j<=60;j++){
            a[j]=new position();
            if(j==51){
                a[j].px=a[j-1].px;
                a[j].py=a[j-1].py-height;
            }
            else{
            a[j].px=a[j-1].px-width;
            a[j].py=a[j-1].py;
            }
        }
        for(j=61;j<=70;j++){
            a[j]=new position();
            if(j==61){
                a[j].px=a[j-1].px;
                a[j].py=a[j-1].py-height;
            }
            else{
            a[j].px=a[j-1].px+width;
            a[j].py=a[j-1].py;
            }
        }
        for(j=71;j<=80;j++){
            a[j]=new position();
            if(j==71){
                a[j].px=a[j-1].px;
                a[j].py=a[j-1].py-height;
            }
            else{
            a[j].px=a[j-1].px-width;
            a[j].py=a[j-1].py;
            }
        }
        for(j=81;j<=90;j++){
            a[j]=new position();
            if(j==81){
                a[j].px=a[j-1].px;
                a[j].py=a[j-1].py-height;
            }
            else{
            a[j].px=a[j-1].px+width;
            a[j].py=a[j-1].py;
            }
        }
        
        for(j=91;j<=100;j++){
            a[j]=new position();
            if(j==91){
                a[j].px=a[j-1].px;
                a[j].py=a[j-1].py-height;
            }
            else{
            a[j].px=a[j-1].px-width;
            a[j].py=a[j-1].py;
            }
        }
        v.getChildren().addAll(b1,lbl);
        v.setAlignment(Pos.CENTER);
        v.setSpacing(50);
        Scene s=new Scene(v,300,300);
        
        wndw.setScene(s);
        wndw.initModality(Modality.APPLICATION_MODAL);
        wndw.show();
        v2.getChildren().addAll(b2,lbl2);
        v2.setAlignment(Pos.CENTER);
        v2.setSpacing(50);
        Scene sc=new Scene(v2,300,300);
        wndw2.setScene(sc);
        wndw2.initModality(Modality.APPLICATION_MODAL);
        v3.getChildren().addAll(b3,lbl3);
        v3.setAlignment(Pos.CENTER);
        v3.setSpacing(50);
        Scene sc3=new Scene(v3,300,300);
        wndw3.setScene(sc3);
        wndw3.initModality(Modality.APPLICATION_MODAL);
        v4.getChildren().addAll(b4,lbl4);
        v4.setAlignment(Pos.CENTER);
        v4.setSpacing(50);
        Scene sc4=new Scene(v4,300,300);
        wndw4.setScene(sc4);
        wndw4.initModality(Modality.APPLICATION_MODAL);
        b1.setOnAction(e->{
            wndw.close();
        });   
        b5.setOnAction(e->{           
           System.out.println("done");
           x=rand.nextInt(6)+1;   
           label.setText(Integer.toString(x)); 
           System.out.println(x);
           if(x==1){
               if(master[t].flag==0){
                   master[t].flag=1;
               }
               if(master[t].flag==1){
                   count1+=x;
                   lbl.setText("Another turn");
                   wndw.show();
               }
           }
           if(x!=1){
               if(master[t].flag==1){
                   count1+=x;
                   //do_move(t);
                   t++;
                   //lbl2.setText("Second Player");
                   //wndw2.show();
               }
               else{
                   t++;
                   lbl2.setText("Second Player Turn");
                   wndw2.show();
               }
           }
           
                     
           
           });
        b6.setOnAction(e->{
            do_move(t-1);
            lbl2.setText("Second Player");
            wndw2.show();
        });
        b2.setOnAction(e->{
           wndw2.close();
           System.out.println("done");
           if(t==2){
           x=rand.nextInt(6)+1;   
           label.setText(Integer.toString(x)); 
           System.out.println(x);
           if(x==1){
               if(master[t].flag==0){
                   master[t].flag=1;
               }
               if(master[t].flag==1){
                   count2+=x;
                   lbl2.setText("Another turn");
                   wndw2.show();
               }
           }
           if(x!=1){
               if(master[t].flag==1){
                   count2+=x;
                   movepcblue(t);
                   t++;
                   lbl3.setText("Third Player");
                   wndw3.show();
               }
               else{
                   t++;
                   lbl3.setText("Third Player");
                   wndw3.show();
               }
           }
           
           }
        });
        b3.setOnAction(e->{
        wndw3.close();
        System.out.println("done");
        if(t==3){
            x=rand.nextInt(6)+1;   
           label.setText(Integer.toString(x)); 
           System.out.println(x);
           if(x==1){
               if(master[t].flag==0){
                   master[t].flag=1;
               }
               if(master[t].flag==1){
                   count3+=x;
                   lbl3.setText("Another turn");
                   wndw3.show();
               }
           }
           if(x!=1){
               if(master[t].flag==1){
                   count3+=x;
                   movepcgreen(t);
                   t++;
                   lbl4.setText("Fourth Player");
                   wndw4.show();
               }
               else{
                   t++;
                   lbl4.setText("Fourth Player");
                   wndw4.show();
               }
           }
           
        }
        
        });
        b4.setOnAction(e->{
        wndw4.close();
        System.out.println("done");
           if(t==4){
               x=rand.nextInt(6)+1;   
           label.setText(Integer.toString(x)); 
           System.out.println(x);
           if(x==1){
               if(master[t].flag==0){
                   master[t].flag=1;
               }
               if(master[t].flag==1){
                   count4+=x;
                   lbl.setText("Another turn");
                   wndw.show();
               }
           }
           if(x!=1){
               if(master[t].flag==1){
                   count4+=x;
                   movepcyl(t);
                   t=1;
                   lbl.setText("You");
                   wndw.show();
               }
               else{
                   t=1;
                   lbl.setText("You");
                   wndw.show();
               }
           }
           
           }
        
        });
    
    
    }
    
    void do_move(int p){
        
        /*Random pnt=new Random();           
           x=pnt.nextInt(6)+1;           
           label.setText(Integer.toString(x));          
           //count=count+x;
           if(x==1) master[p].flag=1;
           if(master[p].flag==1){
               count1=count1+x;
               x=pnt.nextInt(6)+1;           
               label.setText(Integer.toString(x)); */
              
               
               
                master[p].curr+=count1;
                if(master[p].curr==2) master[p].curr=38;
                if(master[p].curr==7) master[p].curr=14;
                if(master[p].curr==8) master[p].curr=31;
                if(master[p].curr==15) master[p].curr=26;
                if(master[p].curr==21) master[p].curr=42;
                if(master[p].curr==28) master[p].curr=84;
                if(master[p].curr==51) master[p].curr=67;
                if(master[p].curr==71) master[p].curr=91;
                if(master[p].curr==78) master[p].curr=98;
                if(master[p].curr==87) master[p].curr=94;
                if(master[p].curr==16) master[p].curr=6;
                if(master[p].curr==46) master[p].curr=25;
                if(master[p].curr==49) master[p].curr=11;
                if(master[p].curr==62) master[p].curr=19;
                if(master[p].curr==64) master[p].curr=60;
                if(master[p].curr==74) master[p].curr=53;
                if(master[p].curr==89) master[p].curr=68;
                if(master[p].curr==92) master[p].curr=88;
                if(master[p].curr==95) master[p].curr=75;
                if(master[p].curr==99) master[p].curr=80;
                if(master[p].curr<=100){
                    red.setCenterX(a[master[p].curr].px);
                    red.setCenterY(a[master[p].curr].py);
                    count1=0;  
                }
                if(master[p].curr>100){
                    master[p].curr-=count1;
                    red.setCenterX(a[master[p].curr].px);
                    red.setCenterY(a[master[p].curr].py);
                    count1=0;  
                } 
               
           //}
           /*snkp[m].currpos+=b;
      red.setCenterX(a[snkp[m].currpos].c_x);
      red.setCenterY(a[snkp[m].currpos].c_y);
      count1=0; */ 
    }
   
    void movepcblue(int p){
        /*Random pnt=new Random();           
           x=pnt.nextInt(6)+1;           
           label.setText(Integer.toString(x));          
           //count=count+x;
           if(x==1) master[p].flag=1;
           if(master[p].flag==1){
               count2=count2+x;
               x=pnt.nextInt(6)+1;           
               label.setText(Integer.toString(x)); 
               if(x==1){
                   count2=count2+x;
                   x=pnt.nextInt(6)+1;           
                   label.setText(Integer.toString(x)); 
               }
               if(x!=1){*/
                master[p].curr+=count2;
                if(master[p].curr==2) master[p].curr=38;
                if(master[p].curr==7) master[p].curr=14;
                if(master[p].curr==8) master[p].curr=31;
                if(master[p].curr==15) master[p].curr=26;
                if(master[p].curr==21) master[p].curr=42;
                if(master[p].curr==28) master[p].curr=84;
                if(master[p].curr==51) master[p].curr=67;
                if(master[p].curr==71) master[p].curr=91;
                if(master[p].curr==78) master[p].curr=98;
                if(master[p].curr==87) master[p].curr=94;
                if(master[p].curr==16) master[p].curr=6;
                if(master[p].curr==46) master[p].curr=25;
                if(master[p].curr==49) master[p].curr=11;
                if(master[p].curr==62) master[p].curr=19;
                if(master[p].curr==64) master[p].curr=60;
                if(master[p].curr==74) master[p].curr=53;
                if(master[p].curr==89) master[p].curr=68;
                if(master[p].curr==92) master[p].curr=88;
                if(master[p].curr==95) master[p].curr=75;
                if(master[p].curr==99) master[p].curr=80;
                if(master[p].curr<=100){
                    blue.setCenterX(a[master[p].curr].px);
                    blue.setCenterY(a[master[p].curr].py);
                    count2=0;  
                }
                if(master[p].curr>100){
                    master[p].curr-=count2;
                    blue.setCenterX(a[master[p].curr].px);
                    blue.setCenterY(a[master[p].curr].py);
                    count2=0;  
                } 
              
               //}
           //}
       
           
                
    }
    void movepcgreen(int p){
        /*Random pnt=new Random();           
           x=pnt.nextInt(6)+1;           
           label.setText(Integer.toString(x));          
           //count=count+x;
           if(x==1) master[p].flag=1;
           if(master[p].flag==1){
               count3=count3+x;
               x=pnt.nextInt(6)+1;           
               label.setText(Integer.toString(x)); 
               if(x==1){
                   count3=count3+x;
                   x=pnt.nextInt(6)+1;           
                   label.setText(Integer.toString(x)); 
               }
               if(x!=1){*/
               master[p].curr+=count3;
               if(master[p].curr==2) master[p].curr=38;
                if(master[p].curr==7) master[p].curr=14;
                if(master[p].curr==8) master[p].curr=31;
                if(master[p].curr==15) master[p].curr=26;
                if(master[p].curr==21) master[p].curr=42;
                if(master[p].curr==28) master[p].curr=84;
                if(master[p].curr==51) master[p].curr=67;
                if(master[p].curr==71) master[p].curr=91;
                if(master[p].curr==78) master[p].curr=98;
                if(master[p].curr==87) master[p].curr=94;
                if(master[p].curr==16) master[p].curr=6;
                if(master[p].curr==46) master[p].curr=25;
                if(master[p].curr==49) master[p].curr=11;
                if(master[p].curr==62) master[p].curr=19;
                if(master[p].curr==64) master[p].curr=60;
                if(master[p].curr==74) master[p].curr=53;
                if(master[p].curr==89) master[p].curr=68;
                if(master[p].curr==92) master[p].curr=88;
                if(master[p].curr==95) master[p].curr=75;
                if(master[p].curr==99) master[p].curr=80;
                if(master[p].curr<=100){
                    green.setCenterX(a[master[p].curr].px);
                    green.setCenterY(a[master[p].curr].py);
                    count3=0;  
                }
                if(master[p].curr>100){
                    master[p].curr-=count3;
                    green.setCenterX(a[master[p].curr].px);
                    green.setCenterY(a[master[p].curr].py);
                    count3=0;  
                } 
              
               //}
           //}
       
           
                
    }
    void movepcyl(int p){
        /*Random pnt=new Random();           
           x=pnt.nextInt(6)+1;           
           label.setText(Integer.toString(x));          
           //count=count+x;
           if(x==1) master[p].flag=1;
           if(master[p].flag==1){
               count4=count4+x;
               x=pnt.nextInt(6)+1;           
               label.setText(Integer.toString(x)); 
               if(x==1){
                   count4=count4+x;
                   x=pnt.nextInt(6)+1;           
                   label.setText(Integer.toString(x)); 
               }
               if(x!=1){*/
               master[p].curr+=count4;
               if(master[p].curr==2) master[p].curr=38;
                if(master[p].curr==7) master[p].curr=14;
                if(master[p].curr==8) master[p].curr=31;
                if(master[p].curr==15) master[p].curr=26;
                if(master[p].curr==21) master[p].curr=42;
                if(master[p].curr==28) master[p].curr=84;
                if(master[p].curr==51) master[p].curr=67;
                if(master[p].curr==71) master[p].curr=91;
                if(master[p].curr==78) master[p].curr=98;
                if(master[p].curr==87) master[p].curr=94;
                if(master[p].curr==16) master[p].curr=6;
                if(master[p].curr==46) master[p].curr=25;
                if(master[p].curr==49) master[p].curr=11;
                if(master[p].curr==62) master[p].curr=19;
                if(master[p].curr==64) master[p].curr=60;
                if(master[p].curr==74) master[p].curr=53;
                if(master[p].curr==89) master[p].curr=68;
                if(master[p].curr==92) master[p].curr=88;
                if(master[p].curr==95) master[p].curr=75;
                if(master[p].curr==99) master[p].curr=80;
                if(master[p].curr<=100){
                    yellow.setCenterX(a[master[p].curr].px);
                    yellow.setCenterY(a[master[p].curr].py);
                    count4=0;  
                }
                if(master[p].curr>100){
                    master[p].curr-=count4;
                    yellow.setCenterX(a[master[p].curr].px);
                    yellow.setCenterY(a[master[p].curr].py);
                    count4=0;  
                } 
              
               //}
           //}
       
           
                
    }
    void ludo(){
        
       for(k=1;k<5;k++){
           boss[k]=new gamer();
       }
        for(k=1;k<74;k++){
            ld[k]=new position();
        }
        double var=33;
        for(k=1;k<6;k++){
            ld[k].px=221;
            ld[k].py=459-(k-1)*var;
        }
        for(k=6;k<12;k++){
            ld[k].px=187-(k-6)*var;
            ld[k].py=289;
        }
        for(k=12;k<14;k++){
            ld[k].px=22;
            ld[k].py=289-(k-11)*var;
        }
        for(k=14;k<19;k++){
            ld[k].px=22+(k-13)*var;
            ld[k].py=223;
        }
        for(k=19;k<25;k++){
            ld[k].px=221;
            ld[k].py=186-(k-19)*var;
        }
        for(k=25;k<27;k++){
            ld[k].px=221+(k-24)*var;
            ld[k].py=21;
        }
        for(k=27;k<32;k++){
            ld[k].px=287;
            ld[k].py=21+(k-26)*var;
        }
        for(k=32;k<38;k++){
            ld[k].px=324+(k-32)*var;
            ld[k].py=221;
        }
        for(k=38;k<40;k++){
            ld[k].px=493;
            ld[k].py=221+(k-37)*var;
        }
        for(k=40;k<45;k++){
            ld[k].px=493-(k-39)*var;
            ld[k].py=288;
        }
        for(k=45;k<51;k++){
            ld[k].px=290;
            ld[k].py=325+(k-45)*var;
        }
        for(k=51;k<53;k++){
            ld[k].px=290-(k-50)*var;
            ld[k].py=490;
        }
        for(k=53;k<58;k++){
            ld[k].px=256;
            ld[k].py=460-(k-53)*var;
        }
        for(k=58;k<63;k++){
            ld[k].px=50+(k-58)*var;
            ld[k].py=255;
        }
        for(k=63;k<68;k++){
            ld[k].px=256;
            ld[k].py=50+(k-63)*var;
        }
        for(k=68;k<73;k++){
            ld[k].px=460-(k-68)*var;
            ld[k].py=255;
        }
        boss[1].a[1].init.px=409;//up
        boss[1].a[1].init.py=68;
        boss[1].a[2].init.px=375;
        boss[1].a[2].init.py=102;//left
        boss[1].a[3].init.px=410;
        boss[1].a[3].init.py=136;//down
        boss[1].a[4].init.px=443;
        boss[1].a[4].init.py=103;//r8
        boss[2].a[1].init.px=409;//up
        boss[2].a[1].init.py=374;
        boss[2].a[2].init.px=375;
        boss[2].a[2].init.py=409;//left
        boss[2].a[3].init.px=410;
        boss[2].a[3].init.py=443;//down
        boss[2].a[4].init.px=443;
        boss[2].a[4].init.py=408;//r8+blue
        boss[3].a[1].init.px=102;//up
        boss[3].a[1].init.py=68;
        boss[3].a[2].init.px=68;
        boss[3].a[2].init.py=102;//left
        boss[3].a[3].init.px=102;
        boss[3].a[3].init.py=136;//down
        boss[3].a[4].init.px=136;
        boss[3].a[4].init.py=103;//r8+green
        boss[4].a[1].init.px=102;//up
        boss[4].a[1].init.py=374;
        boss[4].a[2].init.px=68;
        boss[4].a[2].init.py=409;//left
        boss[4].a[3].init.px=102;
        boss[4].a[3].init.py=443;//down
        boss[4].a[4].init.px=136;
        boss[4].a[4].init.py=408;//r8+yellow
        
        v.getChildren().addAll(b1,lbl);
        v.setAlignment(Pos.CENTER);
        v.setSpacing(50);
        Scene s=new Scene(v,300,300);
        
        wndw.setScene(s);
        wndw.initModality(Modality.APPLICATION_MODAL);
        wndw.show();
        v2.getChildren().addAll(b2,lbl2);
        v2.setAlignment(Pos.CENTER);
        v2.setSpacing(50);
        Scene sc=new Scene(v2,300,300);
        wndw2.setScene(sc);
        wndw2.initModality(Modality.APPLICATION_MODAL);
        v3.getChildren().addAll(b3,lbl3);
        v3.setAlignment(Pos.CENTER);
        v3.setSpacing(50);
        Scene sc3=new Scene(v3,300,300);
        wndw3.setScene(sc3);
        wndw3.initModality(Modality.APPLICATION_MODAL);
        v4.getChildren().addAll(b4,lbl4);
        v4.setAlignment(Pos.CENTER);
        v4.setSpacing(50);
        Scene sc4=new Scene(v4,300,300);
        wndw4.setScene(sc4);
        wndw4.initModality(Modality.APPLICATION_MODAL);
        
        
        
        
        
        
        
        
        
        
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
