package com.example.android.quakereport;

/**
 * Created by Jayanth on 26-08-2017.
 */

public class EarthQuake {



        private String cityName;


        private String magnitude;

        // Drawable resource ID
        private int date;



        public EarthQuake(String cname, String mag, int d)
        {
            cityName=cname;
            magnitude=mag;
            date=d;
        }

        /**
         * Get the name of the Android version
         */
        public String getCityName() {
            return cityName;
        }

        /**
         * Get the Android version number
         */
        public String getMagnitude() {
            return magnitude;
        }

        /**
         * Get the image resource ID
         */
        public int getdate() {
            return date;
        }


    }


