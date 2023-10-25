package cl.ipvg.turistmap1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.ipvg.turistmap1.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        LatLng estadio = new LatLng(-36.61831, -72.10787);
        LatLng centroC = new LatLng(-36.60961, -72.10090);
        LatLng catedral = new LatLng(-36.60649, -72.10216);
        LatLng ipvg = new LatLng(-36.58965, -72.08212);

        mMap.addMarker(new MarkerOptions().position(estadio).title("Marcador en estadio"));
        mMap.addMarker(new MarkerOptions().position(centroC).title("Marcador en Mall"));
        mMap.addMarker(new MarkerOptions().position(catedral).title("Marcador en catedral"));
        mMap.addMarker(new MarkerOptions().position(ipvg).title("Marcador en IPVG"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(centroC));
        mMap.setMinZoomPreference(40.f);
        mMap.setMaxZoomPreference(80.f);
    }
}