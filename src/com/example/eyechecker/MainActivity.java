package com.example.eyechecker;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	int i=0;
	int x=0;
	EditText t1;
	int stub=0;
    Integer[] imageIDs = {
            R.drawable.fig1,
            R.drawable.fig2,
            R.drawable.fig3,
            R.drawable.fig4,
            R.drawable.fig5,
            R.drawable.fig6,
            R.drawable.fig7,
            R.drawable.fig8,
            R.drawable.fig9,
    };
    
    Integer[] imageIDs1 = {
    		R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
            R.drawable.pic10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.image1);
        imageView.setImageResource(imageIDs[i]);
        ImageView imageView1 = (ImageView) findViewById(R.id.image2);
        imageView1.setImageResource(imageIDs1[i]);
        
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Welcome to EyeChecker");

        alertDialogBuilder.setMessage("Welcome to color Blindness Test. To Know tap Help option in the Menu");
        alertDialogBuilder.setPositiveButton("OK", 
           new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface arg0, int arg1)
           {
        	   
           }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    } 
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
        case R.id.Help:
        	//Addcontact();
        	AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
	        alertDialogBuilder.setTitle("Help!");

	        alertDialogBuilder.setMessage("This a test of color blindness, which is essential to pass in order " +
	        		"to become fighter pilot. Each picture has a number which you have to enter, if you cannot see " +
	        		"anything then simply enter 0 and go to the next image");
	        alertDialogBuilder.setPositiveButton("OK", 
	           new DialogInterface.OnClickListener() {
	           @Override
	           public void onClick(DialogInterface arg0, int arg1)
	           {
	             
	           }
	        });
	        AlertDialog alertDialog = alertDialogBuilder.create();
	        alertDialog.show();
            return true;
                
        }
		return true;
    }
     
    public void submit (View v)
    {
    	t1=(EditText)findViewById(R.id.editText1);
    	if(t1.getText().toString().equals(""))
    	{
    		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
	        alertDialogBuilder.setTitle("Blank Entry!");

	        alertDialogBuilder.setMessage("Please enter a valid number");
	        alertDialogBuilder.setPositiveButton("OK", 
	           new DialogInterface.OnClickListener() {
	           @Override
	           public void onClick(DialogInterface arg0, int arg1)
	           {
	             
	           }
	        });
	        AlertDialog alertDialog = alertDialogBuilder.create();
	        alertDialog.show();
    	}
    	else
    	{
    	Integer[] number = {
                5,12,74,26,15,57,29,8,35
        };
    	t1=(EditText)findViewById(R.id.editText1);
    	String number_input=t1.getText().toString();
    	x=Integer.parseInt(number_input);
    	t1.setText("");
    	if(number[i]!=x)
    	{
    		stub=5;
    	}
    	i++;
    	{
    		if(i==9)
    		{
    			if(stub==5)
    			{
    				//color blind code
    				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
    		        alertDialogBuilder.setTitle("Final Report");

    		        alertDialogBuilder.setMessage("You are color blind");
    		        alertDialogBuilder.setPositiveButton("OK", 
    		           new DialogInterface.OnClickListener() {
    		           @Override
    		           public void onClick(DialogInterface arg0, int arg1)
    		           {
    		             
    		           }
    		        });
    		        AlertDialog alertDialog = alertDialogBuilder.create();
    		        alertDialog.show();
    		       i=0; 
    	    		stub=0;
    		       ImageView imageView = (ImageView) findViewById(R.id.image1);
    		        imageView.setImageResource(imageIDs[i]);
    		        ImageView imageView1 = (ImageView) findViewById(R.id.image2);
    		        imageView1.setImageResource(imageIDs1[i]);
    			}
    			else
    			{
    				//not color blind code
    				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
    		        alertDialogBuilder.setTitle("Final Report");

    		        alertDialogBuilder.setMessage("You are not color blind");
    		        alertDialogBuilder.setPositiveButton("OK", 
    		           new DialogInterface.OnClickListener() {
    		           @Override
    		           public void onClick(DialogInterface arg0, int arg1)
    		           {
    		             
    		           }
    		        });
    		        AlertDialog alertDialog = alertDialogBuilder.create();
    		        alertDialog.show();
    		        i=0; 
    	    		stub=0;//to change the value from 5 to 0
     		        ImageView imageView = (ImageView) findViewById(R.id.image1);
     		        imageView.setImageResource(imageIDs[i]);
     		        ImageView imageView1 = (ImageView) findViewById(R.id.image2);
     		        imageView1.setImageResource(imageIDs1[i]);
    			}
    		}
    		else
    		{
    			ImageView imageView = (ImageView) findViewById(R.id.image1);
    	        imageView.setImageResource(imageIDs[i]);
    	        ImageView imageView1 = (ImageView) findViewById(R.id.image2);
    	        imageView1.setImageResource(imageIDs1[i]);
    	       
    		}
    	}
      }
    } 
 }