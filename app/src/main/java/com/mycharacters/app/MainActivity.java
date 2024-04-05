package com.mycharacters.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView simpleList;
    String characterList[] = {
        "Eleanor Shellstrop",
        "Michael Scott",
        "Walter White",
        "Daenerys Targaryen",
        "Captain Jack Sparrow",
        "John Snow",
        "Rick Sanchez",
        "Dexter Morgan",
        "Lara Croft",
        "Tony Stark",
        "Ellen Ripley",
        "Marty McFly",
        "Katniss Everdeen",
        "Atticus Finch",
        "Hermione Granger",
        "Frodo Baggins",
        "Indiana Jones",
        "Sherlock Holmes",
        "Bruce Wayne",
        "Hannibal Lecter",
        "Luke Skywalker",
        "Homer Simpson",
        "Holly Golightly",
        "Don Draper",
        "Lisbeth Salander",
        "James Bond",
        "Sarah Connor",
        "Elizabeth Bennet",
        "Jay Gatsby"
    };
    int icons[] = {
        R.drawable.img1, 
        R.drawable.img2, 
        R.drawable.img3, 
        R.drawable.img4, 
        R.drawable.img5, 
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.img9,
        R.drawable.img10,
        R.drawable.img11,
        R.drawable.img12,
        R.drawable.img13,
        R.drawable.img14,
        R.drawable.img15,
        R.drawable.img16,
        R.drawable.img17,
        R.drawable.img18,
        R.drawable.img19,
        R.drawable.img20,
        R.drawable.img21,
        R.drawable.img22,
        R.drawable.img23,
        R.drawable.img24,
        R.drawable.img25,
        R.drawable.img26,
        R.drawable.img27,
        R.drawable.img28,
        R.drawable.img29,
        R.drawable.img30
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        simpleList = findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), characterList, icons);
        simpleList.setAdapter(customAdapter);
    }
}
