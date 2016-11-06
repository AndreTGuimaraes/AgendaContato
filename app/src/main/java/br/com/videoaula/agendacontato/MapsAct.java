package br.com.videoaula.agendacontato;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsAct extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_maps);
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

        // Add a marker in Sydney and move the camera
        LatLng Adriana = new LatLng(-20.75448611, -42.87943056);
        mMap.addMarker(new MarkerOptions().position(Adriana).title("Adriana Cestaro de Medeiros"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Adriana));

        LatLng Adriano = new LatLng(-20.74494167, -42.88001111);
        mMap.addMarker(new MarkerOptions().position(Adriano).title("Adriano Campos Valente"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Adriano));

        LatLng Agostinho = new LatLng(-20.753225, -42.88443611);
        mMap.addMarker(new MarkerOptions().position(Agostinho).title("Agostinho Morelo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Agostinho));

        LatLng Alan = new LatLng(-20.75291944, -42.88069167);
        mMap.addMarker(new MarkerOptions().position(Alan).title("Alan Werneck Ramos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Alan));

        LatLng Alessandro = new LatLng(-20.75761389, -42.88044167);
        mMap.addMarker(new MarkerOptions().position(Alessandro).title("Alessandro Lisboa da Silva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Alessandro));

        LatLng Alex = new LatLng(-20.75746944, -42.88048333);
        mMap.addMarker(new MarkerOptions().position(Alex).title("Alex Pinheiro Siqueira de Faria"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Alex));

        LatLng Alexandre = new LatLng(-20.75368889, -42.88254167);
        mMap.addMarker(new MarkerOptions().position(Alexandre).title("Alexandre Magno Gomes"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Alexandre));

        LatLng Aline = new LatLng(-20.75746944, -42.88048333);
        mMap.addMarker(new MarkerOptions().position(Aline).title("Aline Maria da Silva S. Novello"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Aline));

        LatLng Andre = new LatLng(-20.75746944, -42.88048333);
        mMap.addMarker(new MarkerOptions().position(Andre).title("André Kiyomitsu Z Sediyama"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Andre));

        LatLng Antonio = new LatLng(-20.75356667, -42.88346389);
        mMap.addMarker(new MarkerOptions().position(Antonio).title("Antônio Cândido da Silva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Antonio));

        LatLng Bruna = new LatLng(-20.74494167, -42.88001111);
        mMap.addMarker(new MarkerOptions().position(Bruna).title("Bruna de Oliveira Gomide"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bruna));

        LatLng CarlosH = new LatLng(-20.75674722, -42.87571944);
        mMap.addMarker(new MarkerOptions().position(CarlosH).title("Carlos Henrique Ferreira e Silva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CarlosH));

        LatLng CarlosR = new LatLng(-20.75648889, -42.87983056);
        mMap.addMarker(new MarkerOptions().position(CarlosR).title("Carlos Raimundo Torres Júnior"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CarlosR));


        LatLng CarlosRo = new LatLng(-20.75265556, -42.88015278);
        mMap.addMarker(new MarkerOptions().position(CarlosRo).title("Carlos Roberto de Carvalho"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CarlosRo));


        LatLng Cesar = new LatLng(-20.75253611 , -42.88053056);
        mMap.addMarker(new MarkerOptions().position(Cesar).title("César Augusto da Silva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cesar));

        LatLng Cristiane = new LatLng(-20.75761389 , -42.88044167);
        mMap.addMarker(new MarkerOptions().position(Cristiane).title("Cristiane Junqueira de Carvalho"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cristiane));

        LatLng Cristiano = new LatLng(-20.75761389 , -42.88044167);
        mMap.addMarker(new MarkerOptions().position(Cristiano).title("Cristiano Dominice Roberto"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cristiano));

        LatLng Cristina = new LatLng(-20.762125, -42.86164722);
        mMap.addMarker(new MarkerOptions().position(Cristina).title("Cristina Maria do Prado Lima"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Cristina));

        LatLng Denise = new LatLng(-20.75358611, -42.88445833);
        mMap.addMarker(new MarkerOptions().position(Denise).title("Denise Cristina Rodrigues"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Denise));

        LatLng Edilberto = new LatLng(-20.75448611,-42.87943056);
        mMap.addMarker(new MarkerOptions().position(Edilberto).title("Edilberto Carlos Drumond"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Edilberto));

        LatLng Edilene = new LatLng(-20.75674722 ,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Edilene).title("Edilene Lopes Drumond"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Edilene));

        LatLng Eduardo = new LatLng(-20.75333333,-42.87771667);
        mMap.addMarker(new MarkerOptions().position(Eduardo).title("Eduardo José Ferreira Lopes"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Eduardo));

        LatLng Egidio = new LatLng(-20.75746944 ,-42.88048333);
        mMap.addMarker(new MarkerOptions().position(Egidio).title("Egídio Oliveira Santana"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Egidio));


        LatLng Elaine = new LatLng(-20.75358611,-42.88445833);
        mMap.addMarker(new MarkerOptions().position(Elaine).title("Elaine Travaglia Santos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Elaine));

        LatLng Elcio  = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Elcio).title("Elcio Masiero"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Elcio));

        LatLng Eliane  = new LatLng(-20.75761389,-42.88044167 );
        mMap.addMarker(new MarkerOptions().position(Eliane).title("Eliane Interlandi da Costa Silva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Eliane));

        LatLng Emerson  = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Emerson).title("Emerson Mauro Brandi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Emerson));

        LatLng Emilio  = new LatLng(-20.75682222,-42.88095833);
        mMap.addMarker(new MarkerOptions().position(Emilio).title("Emilio Paulo Lopes Gomes"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Emilio));

        LatLng Ernani  = new LatLng(-20.75432778,-42.87926667);
        mMap.addMarker(new MarkerOptions().position(Ernani).title("Ernani Danilo Einloft Júnior"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ernani));

        LatLng Euldes  = new LatLng(-20.75682222,-42.88095833);
        mMap.addMarker(new MarkerOptions().position(Euldes).title("Euldes Nei Rosado"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Euldes));

        LatLng Fabricio  = new LatLng(-20.75682222,-42.88095833);
        mMap.addMarker(new MarkerOptions().position(Fabricio).title("Fabrício Costa Bandeira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Fabricio));

        LatLng FernandoF  = new LatLng(-20.75761389,-42.88044167);
        mMap.addMarker(new MarkerOptions().position(FernandoF).title("Fernando Fonseca dos Reis"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FernandoF));

        LatLng FernandoJ  = new LatLng(-20.75432778,-42.87926667);
        mMap.addMarker(new MarkerOptions().position(FernandoJ).title("Fernando Januário da Silva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FernandoJ));

        LatLng Flavia  = new LatLng(-20.75746944,-42.88048333);
        mMap.addMarker(new MarkerOptions().position(Flavia).title("Flavia Diniz Valadares"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Flavia));

        LatLng Flavio  = new LatLng(-20.75682222,-42.88095833);
        mMap.addMarker(new MarkerOptions().position(Flavio).title("Flavio Henrique  T Cassimiro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Flavio));

        LatLng Francisco  = new LatLng(-20.75265556,-42.88015278);
        mMap.addMarker(new MarkerOptions().position(Francisco).title("Francisco Miguel Q. Valente"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Francisco));

        LatLng Geraldo  = new LatLng(-20.75648889,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Geraldo).title("Geraldo Antunes Guimarães"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Geraldo));

        LatLng Gerson  = new LatLng(-20.75648889,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Gerson).title("Gerson José Matedi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Gerson));

        LatLng Gilson  = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Gilson).title("Gilson Teixeira Arêdes Junior"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Gilson));

        LatLng Gisele  = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Gisele).title("Gisele Milagres Silveira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Gisele));

        LatLng Guilherme  = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Guilherme).title("Guilherme Lobo da Silveira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Guilherme));

        LatLng GuilhermeO  = new LatLng(-20.75536944,-42.87744444);
        mMap.addMarker(new MarkerOptions().position(GuilhermeO).title("Guilherme Oliveira Thiebaut"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GuilhermeO));


        LatLng Gustavo  = new LatLng(-20.75682222,-42.88095833);
        mMap.addMarker(new MarkerOptions().position(Gustavo).title("Gustavo Carlos Osório Silva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Gustavo));


        LatLng Henrique  = new LatLng(-20.75682222,-42.88095833);
        mMap.addMarker(new MarkerOptions().position(Henrique).title("Humberto Barbosa de Freitas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Henrique));

        LatLng Jackson  = new LatLng(-20.75761389,-42.88044167);
        mMap.addMarker(new MarkerOptions().position(Jackson).title("Jackson Roberto de Moura"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jackson));


        LatLng Joao  = new LatLng(-20.75432778,-42.87926667);
        mMap.addMarker(new MarkerOptions().position(Joao).title("João Batista Teixeira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Joao));

        LatLng JoaoB  = new LatLng(-20.75722222 ,-42.87730556 );
        mMap.addMarker(new MarkerOptions().position(JoaoB).title("João Bosco Vidigal Santana"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JoaoB));

        LatLng Joaquim  = new LatLng(-20.75722222 ,-42.87730556 );
        mMap.addMarker(new MarkerOptions().position(Joaquim).title("Joaquim Honório Loures de Oliveira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Joaquim));

        LatLng Jose  = new LatLng(-20.75448611 ,-42.87943056);
        mMap.addMarker(new MarkerOptions().position(Jose).title("José Abrão El Hadj"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Jose));

        LatLng JoseO  = new LatLng(-20.75722222,-42.87730556);
        mMap.addMarker(new MarkerOptions().position(JoseO).title("José de Oliveira Silva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JoseO));

        LatLng JoseC  = new LatLng(-20.75368889 ,-42.88254167);
        mMap.addMarker(new MarkerOptions().position(JoseC).title("José do Carmo Lopes  Moreira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JoseC));

        LatLng Josel  = new LatLng(-20.75761389,-42.88044167);
        mMap.addMarker(new MarkerOptions().position(Josel).title("Jose Lúcio Barbosa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Josel));

        LatLng JoseM  = new LatLng(-20.75368889,-42.88254167);
        mMap.addMarker(new MarkerOptions().position(JoseM).title("José Manoel Lopes"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(JoseM));

        LatLng Juarez  = new LatLng(-20.75265556,-42.88015278);
        mMap.addMarker(new MarkerOptions().position(Juarez).title("Juarez Ribeiro Filho"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Juarez));

        LatLng Juliana  = new LatLng(-20.75432778,-42.87926667);
        mMap.addMarker(new MarkerOptions().position(Juliana).title("Juliana Batista Couto Bitarães"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Juliana));

        LatLng Julio  = new LatLng(-20.75648889 ,-42.87571944 );
        mMap.addMarker(new MarkerOptions().position(Julio).title("Júlio César Abreu Cotta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Julio));


        LatLng Karina  = new LatLng(-20.753225 ,-42.88443611);
        mMap.addMarker(new MarkerOptions().position(Karina).title("Karina Ferreira Soares"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Karina));

        LatLng Lairton  = new LatLng(-20.753225 ,-42.88443611);
        mMap.addMarker(new MarkerOptions().position(Lairton).title("Lairton Costa Andrade"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lairton));

        LatLng Leornardo = new LatLng(-20.75682222,-42.88095833);
        mMap.addMarker(new MarkerOptions().position(Leornardo).title("Leonardo Gomes Conde"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Leornardo));

        LatLng LeornardoO = new LatLng(-20.75761389,-42.88044167);
        mMap.addMarker(new MarkerOptions().position(LeornardoO).title("Leonardo Oliveira Rodrigues"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LeornardoO));

        LatLng Lucas = new LatLng(-20.75524167,-42.88046944);
        mMap.addMarker(new MarkerOptions().position(Lucas).title("Lucas Vilas Bôas Magalhães"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lucas));

        LatLng Lucia = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Lucia).title("Lúcia Halfeld Clark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lucia));

        LatLng Luciana = new LatLng(-20.75448611,-42.87943056);
        mMap.addMarker(new MarkerOptions().position(Luciana).title("Luciana Cestaro de Medeiros"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Luciana));

        LatLng LucianaC = new LatLng(-20.75448611,-42.87943056);
        mMap.addMarker(new MarkerOptions().position(LucianaC).title("Luciana de Cássia Martins Costa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LucianaC));

        LatLng LucianaG = new LatLng(-20.75682222,-42.88095833);
        mMap.addMarker(new MarkerOptions().position(LucianaG).title("Luciane Gomes El Hadj"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LucianaG));


        LatLng Luis = new LatLng(-20.75432778,-42.87926667);
        mMap.addMarker(new MarkerOptions().position(Luis).title("Luís Márcio Barbosa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Luis));

        LatLng LuisP = new LatLng(-20.75432778 ,-42.87926667);
        mMap.addMarker(new MarkerOptions().position(LuisP).title("Luís Pacheco Temponi Ribeiro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LuisP));

        LatLng Luisf = new LatLng(-20.75682222,-42.88095833);
        mMap.addMarker(new MarkerOptions().position(Luisf).title("Luíz Frederico Chaga e Freitas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Luisf));

        LatLng Marcelo = new LatLng(-20.75761389,-42.88044167);
        mMap.addMarker(new MarkerOptions().position(Marcelo).title("Marcelo Pimenta Fernandes Lima"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Marcelo));

        LatLng Marcia = new LatLng(-20.74494167,-42.88001111);
        mMap.addMarker(new MarkerOptions().position(Marcia).title("Márcia Garcia Gouveia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Marcia));


        LatLng Marco = new LatLng(-20.75265556,-42.88015278);
        mMap.addMarker(new MarkerOptions().position(Marco).title("Marco Antônio Maffia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Marco));

        LatLng MarcoL = new LatLng(-20.753225,-42.88443611);
        mMap.addMarker(new MarkerOptions().position(MarcoL).title("Marco Luis Honorato"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MarcoL));


        LatLng MariaH = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(MariaH).title("Maria Helena C. Araújo Torres"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MariaH));

        LatLng MariaM = new LatLng(-20.75265556,-42.88015278);
        mMap.addMarker(new MarkerOptions().position(MariaM).title("Maria Marta Reis Sari"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MariaM));

        LatLng MariaT = new LatLng(-20.75359722,-42.878975);
        mMap.addMarker(new MarkerOptions().position(MariaT).title("Maria Tereza Sad Campos Lopes"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MariaT));

        LatLng Maristela = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Maristela).title("Maristela Gomes O . Neves"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Maristela));

        LatLng Marta = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Marta).title("Marta Campos Vieira Feio"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Marta));

        LatLng MartaH = new LatLng(-20.74494167,-42.88001111);
        mMap.addMarker(new MarkerOptions().position(MartaH).title("Marta Heloisa Gonçalves"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MartaH));

        LatLng Mauricio = new LatLng(-20.75265556,-42.88015278);
        mMap.addMarker(new MarkerOptions().position(Mauricio).title("Maurício Rigueira Egídio"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mauricio));

        LatLng Michel = new LatLng(-20.75253611,-42.88053056);
        mMap.addMarker(new MarkerOptions().position(Michel).title("Michel José Salim Khouri"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Michel));

        LatLng Milede = new LatLng(-20.75648889,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Milede).title("Milede Abdo Lacerda Matedi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Milede));

        LatLng Mirene  = new LatLng(-20.75761389,-42.88044167);
        mMap.addMarker(new MarkerOptions().position(Mirene).title("Mirene Peloso"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mirene));

        LatLng Monica  = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Monica).title("Monica Fiuza de Castro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Monica));

        LatLng Odair  = new LatLng(-20.74494167,-42.88001111);
        mMap.addMarker(new MarkerOptions().position(Odair).title("Odair Vieira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Odair));

        LatLng Paulo  = new LatLng(-20.75266667,-42.88015278);
        mMap.addMarker(new MarkerOptions().position(Paulo).title("Paulo Eustáquio Jorge Daguer"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Paulo));

        LatLng PauloH  = new LatLng(-20.75648889,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(PauloH).title("Paulo Henrique de C. Araújo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PauloH));

        LatLng PauloM  = new LatLng(-20.75761389,-42.88044167);
        mMap.addMarker(new MarkerOptions().position(PauloM).title("Paulo Márcio Sant’Ana "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PauloM));

        LatLng PauloS  = new LatLng(-20.75874444,-42.88158611);
        mMap.addMarker(new MarkerOptions().position(PauloS).title("Paulo Sérgio Saraiva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PauloS));

        LatLng RenatoM  = new LatLng(-20.75761389,-42.88044167);
        mMap.addMarker(new MarkerOptions().position(RenatoM).title("Renato Mokdeci Khouri"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RenatoM));

        LatLng RenatoP  = new LatLng(-20.74775278,-42.87364444);
        mMap.addMarker(new MarkerOptions().position(RenatoP).title("Renato Paiva Del Giudice"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RenatoP));


        LatLng RicardoA  = new LatLng(-20.75761389,-42.88044167);
        mMap.addMarker(new MarkerOptions().position(RicardoA).title("Ricardo Antonio Della Lúcia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RicardoA));

        LatLng RodolphoP  = new LatLng(-20.75448611,-42.87943056);
        mMap.addMarker(new MarkerOptions().position(RodolphoP).title("Rodolpho Poeys Lima"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RodolphoP));

        LatLng Rodrigo  = new LatLng(-20.75761389,-42.88044167);
        mMap.addMarker(new MarkerOptions().position(Rodrigo).title("Rodrigo Gomes da Silva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Rodrigo));

        LatLng RodrigoL  = new LatLng(-20.75291944,-42.88068889);
        mMap.addMarker(new MarkerOptions().position(RodrigoL).title("Rodrigo Lopes Rodrigues"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RodrigoL));

        LatLng Rogeria  = new LatLng(-20.75448611,-42.87943056 );
        mMap.addMarker(new MarkerOptions().position(Rogeria).title("Rogéria Kalil Brumano"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Rogeria));

        LatLng Rosangela  = new LatLng(-20.75432778,-42.87926667);
        mMap.addMarker(new MarkerOptions().position(Rosangela).title("Rosângela P. Calil Oliveira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Rosangela));

        LatLng Samuel  = new LatLng(-20.75448611,-42.87943056);
        mMap.addMarker(new MarkerOptions().position(Samuel).title("Samuel Alves Costa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Samuel));

        LatLng Sebastiao  = new LatLng(-20.75448611,-42.87943056);
        mMap.addMarker(new MarkerOptions().position(Sebastiao).title("Sebastião Amir Abrão El Hadj"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sebastiao));

        LatLng Sergio  = new LatLng(-20.75333333,-42.87771667);
        mMap.addMarker(new MarkerOptions().position(Sergio).title("Sérgio Henrique Ferreira Lopes"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sergio));

        LatLng SergioL  = new LatLng(-20.75674722,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(SergioL).title("Sérgio Luís do Carmo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SergioL));

        LatLng SergioN  = new LatLng(-20.75746944,-42.88048333);
        mMap.addMarker(new MarkerOptions().position(SergioN).title("Sérgio Norfino Pinto"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SergioN));


        LatLng Silvania  = new LatLng(-20.75648889 ,-42.87571944);
        mMap.addMarker(new MarkerOptions().position(Silvania).title("Silvania Saraiva Viana"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Silvania));


        LatLng Tania  = new LatLng(-20.75368889,-42.88254167);
        mMap.addMarker(new MarkerOptions().position(Tania).title("Tânia Mara Batista Moreira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Tania));

        LatLng Vitor  = new LatLng(-20.75682222 ,-42.88095833);
        mMap.addMarker(new MarkerOptions().position(Vitor).title("Vitor Augusto Alcântara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Vitor));

        LatLng Vivian  = new LatLng(-20.75448611,-42.87943056);
        mMap.addMarker(new MarkerOptions().position(Vivian).title("Vivian Santana Soares Ribeiro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Vivian));

    }
}
