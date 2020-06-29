package com.covid19.westbengal;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Test_MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LatLng latLng;
    private FusedLocationProviderClient fusedLocationClient;
    private SupportMapFragment mapFragment;
    LocationRequest mLocationRequest;
    Location mLastLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test__maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(30000);
        mLocationRequest.setFastestInterval(30000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        fusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, Looper.myLooper());
        mMap.setMyLocationEnabled(true);

        // Test Center 1
        final LatLng center1 = new LatLng(23.841524, 86.930748);
        mMap.addMarker(new MarkerOptions().position(center1).title("Bankura Sammilani Medical College And Hospital").snippet("website: http://bsmedicalcollege.org.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center1));

        // Test Center 2
        final LatLng center2 = new LatLng(23.515912, 87.311745);
        mMap.addMarker(new MarkerOptions().position(center2).title("Midnapore Medical College and Hospital").snippet("website: http://midnaporemmc.ac.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center2));

        // Test Center 3
        final LatLng center3 = new LatLng(24.430421, 87.521038);
        mMap.addMarker(new MarkerOptions().position(center3).title("Shri Ramkrishna Institute of Medical Sciences").snippet("website: https://www.setgoi.ac.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center3));

        // Test Center 4
        final LatLng center4 = new LatLng(24.190129, 87.789312);
        mMap.addMarker(new MarkerOptions().position(center4).title("Burdwan Medical College").snippet("website: https://www.burmed.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center4));

        // Test Center 5
        final LatLng center5 = new LatLng(23.261030, 88.189238);
        mMap.addMarker(new MarkerOptions().position(center5).title("Uluberia Sub Divisional Hospital").snippet("website: http://uluberia.gov.in/pages/display/76-contact-us"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center5));

        // Test Center 6
        final LatLng center6 = new LatLng(23.261030, 88.046441);
        mMap.addMarker(new MarkerOptions().position(center6).title("Diamond Harbour Government Medical College and south 24 pgs district hospital").snippet("website: http://www.dhgmc.edu.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center6));

        // Test Center 7
        final LatLng center7 = new LatLng(23.623891, 88.213395);
        mMap.addMarker(new MarkerOptions().position(center7).title("Woodlands Multispeciality Hospital Limited").snippet("website: http://www.woodlandshospital.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center7));

        // Test Center 8
        final LatLng center8 = new LatLng(23.301397, 88.310113);
        mMap.addMarker(new MarkerOptions().position(center8).title("The Calcutta Medical Research Institute").snippet("website: https://cmri.ckbirlahospitals.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center8));

        // Test Center 9
        final LatLng center9 = new LatLng(23.462743, 88.529839);
        mMap.addMarker(new MarkerOptions().position(center9).title("M R Bangur Hospital").snippet("website: https://www.mrbangurhospital.gov.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center9));

        // Test Center 10
        final LatLng center10 = new LatLng(23.220650, 88.266168);
        mMap.addMarker(new MarkerOptions().position(center10).title("Command Hospital").snippet("website: https://echs.gov.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center10));

        // Test Center 11
        final LatLng center11 = new LatLng(23.341752, 88.175696);
        mMap.addMarker(new MarkerOptions().position(center11).title("Chittaranjan National Cancer Institute"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center11));

        // Test Center 12
        final LatLng center12 = new LatLng(22.828359, 88.333717);
        mMap.addMarker(new MarkerOptions().position(center12).title("Institute of Post Graduate Medical Education and Research").snippet("website: http://www.ipgmer.gov.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center12));

        // Test Center 13
        final LatLng center13 = new LatLng(23.422425, 88.320258);
        mMap.addMarker(new MarkerOptions().position(center13).title("Calcutta National Medical College & Hospital").snippet("website: https://www.cnmckolkata.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center13));

        // Test Center 14
        final LatLng center14 = new LatLng(22.978118, 88.246991);
        mMap.addMarker(new MarkerOptions().position(center14).title("Laboratory Services Peerless Hospitex Hospital & Research Centre").snippet("website: http://www.peerlesshospital.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center14));

        // Test Center 15
        final LatLng center15 = new LatLng(23.261030, 88.446754);
        mMap.addMarker(new MarkerOptions().position(center15).title("Medical College, Kolkata").snippet("website: https://www.medicalcollegekolkata.in/main/contact_us"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center15));

        // Test Center 16
        final LatLng center16 = new LatLng(23.623891, 88.364204);
        mMap.addMarker(new MarkerOptions().position(center16).title("Remedy Lifecare").snippet("website: http://www.remedylifecare.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center16));

        // Test Center 17
        final LatLng center17 = new LatLng(23.462743, 88.187697);
        mMap.addMarker(new MarkerOptions().position(center17).title("Nil Ratan Sircar Medical College").snippet("website: http://nrsmc.edu.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center17));

        // Test Center 18
        final LatLng center18 = new LatLng(23.261030, 88.445600);
        mMap.addMarker(new MarkerOptions().position(center18).title("Calcutta School Of Tropical Medicine").snippet("website: http://www.stmkolkata.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center18));

        // Test Center 19
        final LatLng center19 = new LatLng(23.139855, 88.469600);
        mMap.addMarker(new MarkerOptions().position(center19).title("Desun Reference Lab").snippet("website: https://desunlab.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center19));

        // Test Center 20
        final LatLng center20 = new LatLng(23.543342, 88.367489);
        mMap.addMarker(new MarkerOptions().position(center20).title("R G KAR MEDICAL COLLEGE").snippet("website: http://rgkarmch.org/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center20));

        // Test Center 21
        final LatLng center21 = new LatLng(23.462743, 88.181748);
        mMap.addMarker(new MarkerOptions().position(center21).title("Serampore Walsh Super Speciality Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center21));

        // Test Center 22
        final LatLng center22 = new LatLng(23.220650, 88.290937);
        mMap.addMarker(new MarkerOptions().position(center22).title("Dept of Lab Services Medica Superspeciality Hospital").snippet("website: https://www.medicahospitals.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center22));

        // Test Center 23
        final LatLng center23 = new LatLng(23.623891, 88.309026);
        mMap.addMarker(new MarkerOptions().position(center23).title("ICMR-National Institute of Cholera and Enteric Diseases").snippet("website: http://www.niced.org.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center23));

        // Test Center 24
        final LatLng center24 = new LatLng(23.301397, 88.366439);
        mMap.addMarker(new MarkerOptions().position(center24).title("College of Medicine & Sagore Dutta Hospital").snippet("website: http://www.cmsdh.edu.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center24));

        // Test Center 25
        final LatLng center25 = new LatLng(23.341752, 88.396916);
        mMap.addMarker(new MarkerOptions().position(center25).title("Department of Laboratory Medicine, AMRI Hospitals").snippet("website: https://www.amrihospitals.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center25));

        // Test Center 26
        final LatLng center26 = new LatLng(23.341752, 88.572698);
        mMap.addMarker(new MarkerOptions().position(center26).title("Apollo Gleneagles Hospitals Limited").snippet("website: http://apollogleneaglesclinic.in/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center26));

        // Test Center 27
        final LatLng center27 = new LatLng(23.382094, 88.265080);
        mMap.addMarker(new MarkerOptions().position(center27).title("SRL Diagnostics").snippet("website: https://www.srlworld.com/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center27));

        // Test Center 28
        final LatLng center28 = new LatLng(23.261030, 88.520799);
        mMap.addMarker(new MarkerOptions().position(center28).title("Suraksha Diagnostics Pvt. Ltd.").snippet("website: http://13.71.61.208:9623/surakshaweb9/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center28));

        // Test Center 29
        final LatLng center29 = new LatLng(23.422425, 88.415352);
        mMap.addMarker(new MarkerOptions().position(center29).title("Dr. Lal Path Lab").snippet("website: https://www.lalpathlabs.com/west-bengal/kolkata/new-town"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center29));

        // Test Center 30
        final LatLng center30 = new LatLng(23.261030, 88.346324);
        mMap.addMarker(new MarkerOptions().position(center30).title("Tata Medical Center").snippet("website: https://tmckolkata.com/tmc/"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(center30));
        //  mMap.animateCamera(CameraUpdateFactory.zoomTo(6));



        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if(marker.getPosition().equals(center1)) {
                    Uri uriUrl = Uri.parse("http://bsmedicalcollege.org.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center2)) {
                    Uri uriUrl = Uri.parse("http://midnaporemmc.ac.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center3)) {
                    Uri uriUrl = Uri.parse("https://www.setgoi.ac.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center4)) {
                    Uri uriUrl = Uri.parse("https://www.burmed.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center5)) {
                    Uri uriUrl = Uri.parse("http://uluberia.gov.in/pages/display/76-contact-us");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center6)) {
                    Uri uriUrl = Uri.parse("http://www.dhgmc.edu.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center7)) {
                    Uri uriUrl = Uri.parse("http://www.woodlandshospital.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center8)) {
                    Uri uriUrl = Uri.parse("https://cmri.ckbirlahospitals.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center9)) {
                    Uri uriUrl = Uri.parse("https://www.mrbangurhospital.gov.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center10)) {
                    Uri uriUrl = Uri.parse("https://echs.gov.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center12)) {
                    Uri uriUrl = Uri.parse("http://www.ipgmer.gov.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center13)) {
                    Uri uriUrl = Uri.parse("https://www.cnmckolkata.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center14)) {
                    Uri uriUrl = Uri.parse("http://www.peerlesshospital.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center15)) {
                    Uri uriUrl = Uri.parse("https://www.medicalcollegekolkata.in/main/contact_us");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center16)) {
                    Uri uriUrl = Uri.parse("http://www.remedylifecare.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center17)) {
                    Uri uriUrl = Uri.parse("http://nrsmc.edu.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center18)) {
                    Uri uriUrl = Uri.parse("http://www.stmkolkata.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center19)) {
                    Uri uriUrl = Uri.parse("https://desunlab.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center20)) {
                    Uri uriUrl = Uri.parse("http://rgkarmch.org/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center22)) {
                    Uri uriUrl = Uri.parse("https://www.medicahospitals.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center23)) {
                    Uri uriUrl = Uri.parse("http://www.niced.org.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center24)) {
                    Uri uriUrl = Uri.parse("http://www.cmsdh.edu.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center25)) {
                    Uri uriUrl = Uri.parse("https://www.amrihospitals.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center26)) {
                    Uri uriUrl = Uri.parse("http://apollogleneaglesclinic.in/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center27)) {
                    Uri uriUrl = Uri.parse("https://www.srlworld.com/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center28)) {
                    Uri uriUrl = Uri.parse("http://13.71.61.208:9623/surakshaweb9/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center29)) {
                    Uri uriUrl = Uri.parse("https://www.lalpathlabs.com/west-bengal/kolkata/new-town");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
                else if(marker.getPosition().equals(center30)) {
                    Uri uriUrl = Uri.parse("https://tmckolkata.com/tmc/");
                    Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                    startActivity(launchBrowser);
                }
            }
        });
    }
    LocationCallback mLocationCallback=new LocationCallback(){
        @Override
        public void onLocationResult(LocationResult locationResult) {
            for(Location location1 : locationResult.getLocations()) {
                if (getApplicationContext() != null) {
                    mLastLocation = location1;
                    latLng = new LatLng(location1.getLatitude(), location1.getLongitude());
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(7));
                }
            }

        }
    };
    public void onBackPressed(){
        stopService(new Intent(getApplicationContext(), Location_Services.class));
        Intent intent = new Intent(Test_MapsActivity.this, home.class);
        startActivity(intent);
        finish();
        return;

    };
}
