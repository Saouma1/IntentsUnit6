package css.cis3334unit6intents;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    Button buttonWeb1, buttonCalendar1, buttonMap1, buttonWebPi, buttonCalendarPi, buttonMapPi, buttonWebLife, buttonCalendarLife, buttonMapLife;
    TextView textViewStatus,textViewStatusPi,textViewStatusLife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = findViewById(R.id.textViewStatus);
        textViewStatusPi = findViewById(R.id.textViewStatusPi);
        textViewStatusLife = findViewById(R.id.textViewStatusLife);

        setupButtonWeb1();
        setupButtonCalendar1();
        setupButtonMap1();

        setupButtonWebPi();
        setupButtonCalendarPi();
        setupButtonMapPi();

        setupButtonWebLife();
        setupButtonCalendarLife();
        setupButtonMapLife();
    }

    private void setupButtonCalendar1() {
        buttonCalendar1 = findViewById(R.id.buttonCalendar1);
        buttonCalendar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Crafting a Children's Book Focused on the Common Good");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Virtual");
                GregorianCalendar begDate = new GregorianCalendar(2021, 2, 26, 15, 40);
                GregorianCalendar endDate = new GregorianCalendar(2021, 2, 26, 16, 55);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                startActivity(calIntent);
            }
        });
    }

    private void setupButtonWeb1() {
        buttonWeb1 = findViewById(R.id.buttonWeb1);
        buttonWeb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a website with the browser");
                textViewStatus.setText("This should display event 1 in the browser");

                // Add implicit intent code to open web browser to http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d150337461%26seotitle%3dCrafting-a-Childrens-Book-Focused-on-the-Common-Good-with-Sarah-Brokke-Erickson-and-Gary-Boelhower%26view%3devent%26-childview%3d
            }
        });
    }

    private void setupButtonMap1() {
        buttonMap1 = findViewById(R.id.buttonMap1);
        buttonMap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a map");
                textViewStatus.setText("This should display event 1 in the map");

                // Add implicit intent code to open a map to https://www.google.com/maps/place/Mitchell+Auditorium+at+The+College+of+St.+Scholastica/@46.816591,-92.1062274,17z/data=!4m5!3m4!1s0x52afad47c414a2b3:0xe0a4f95f0148e609!8m2!3d46.8165602!4d-92.1064688
            }
        });
    }

    private void setupButtonCalendarPi() {
        buttonCalendarPi = findViewById(R.id.buttonCalendarPi);
        buttonCalendarPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStatusPi.setText("Code should set a calendar event for performance 2");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Feel the Groove: Piazzolla and Tango Nuevo");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Scholastica");
                GregorianCalendar begDate = new GregorianCalendar(2023, 10, 21, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2023, 10, 21, 21, 00);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                startActivity(calIntent);
            }
        });
    }

    private void setupButtonWebPi() {
        buttonWebPi = findViewById(R.id.buttonWebPi);
        buttonWebPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a website with the browser");
                textViewStatusPi.setText("This should display event 2 in the browser");
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d150337461%26seotitle%3dCrafting-a-Childrens-Book-Focused-on-the-Common-Good-with-Sarah-Brokke-Erickson-and-Gary-Boelhower%26view%3devent%26-childview%3d"));
                startActivity(webIntent);

                // Add implicit intent code to open web browser to http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d150337461%26seotitle%3dCrafting-a-Childrens-Book-Focused-on-the-Common-Good-with-Sarah-Brokke-Erickson-and-Gary-Boelhower%26view%3devent%26-childview%3d
            }
        });
    }

    private void setupButtonMapPi() {
        buttonMapPi = findViewById(R.id.buttonMapPi);
        buttonMapPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a map");
                textViewStatusPi.setText("This should display event 2 in the map");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/maps/place/Mitchell+Auditorium+at+The+College+of+St.+Scholastica/@46.816591,-92.1062274,17z/data=!4m5!3m4!1s0x52afad47c414a2b3:0xe0a4f95f0148e609!8m2!3d46.8165602!4d-92.1064688"));
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }

    private void setupButtonCalendarLife() {
        buttonCalendarLife = findViewById(R.id.buttonCalendarLife);
        buttonCalendarLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStatusPi.setText("Code should set a calendar event for performance 2");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Water: Sustaining Life in the 21st Century");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Scholastica");
                GregorianCalendar begDate = new GregorianCalendar(2023, 10, 26, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2023, 10, 26, 21, 00);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                startActivity(calIntent);
            }
        });
    }

    private void setupButtonWebLife() {
        buttonWebLife = findViewById(R.id.buttonWebLife);
        buttonWebLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a website with the browser");
                textViewStatusLife.setText("This should display event 3 in the browser");
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d150337461%26seotitle%3dCrafting-a-Childrens-Book-Focused-on-the-Common-Good-with-Sarah-Brokke-Erickson-and-Gary-Boelhower%26view%3devent%26-childview%3d"));
                startActivity(webIntent);

                // Add implicit intent code to open web browser to http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d150337461%26seotitle%3dCrafting-a-Childrens-Book-Focused-on-the-Common-Good-with-Sarah-Brokke-Erickson-and-Gary-Boelhower%26view%3devent%26-childview%3d
            }
        });
    }

    private void setupButtonMapLife() {
        buttonMapLife = findViewById(R.id.buttonMapLife);
        buttonMapLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a map");
                textViewStatusLife.setText("This should display event 3 in the map");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/maps/place/Mitchell+Auditorium+at+The+College+of+St.+Scholastica/@46.816591,-92.1062274,17z/data=!4m5!3m4!1s0x52afad47c414a2b3:0xe0a4f95f0148e609!8m2!3d46.8165602!4d-92.1064688"));
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}  // End of class