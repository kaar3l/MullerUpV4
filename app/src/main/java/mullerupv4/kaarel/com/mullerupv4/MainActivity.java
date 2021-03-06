package mullerupv4.kaarel.com.mullerupv4;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;


public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT = 1;
    private final String UUID_STRING_WELL_KNOWN_SPP =
            "00001101-0000-1000-8000-00805F9B34FB";
    BluetoothAdapter bluetoothAdapter;
    ArrayList<BluetoothDevice> pairedDeviceArrayList;
    TextView textStatus;
    int textByteCnt;
    ListView listViewPairedDevice;
    LinearLayout inputPane;
    EditText inputField;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    Button button11, button12, button13, button14, button15, button16, button17, button18, button19, button20;
    Button button21, button22, button23, button24;
    String kl = "?";
    ArrayAdapter<BluetoothDevice> pairedDeviceAdapter;
    ThreadConnectBTdevice myThreadConnectBTdevice;
    ThreadConnected myThreadConnected;
    private UUID myUUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textStatus = (TextView) findViewById(R.id.status);
        listViewPairedDevice = (ListView) findViewById(R.id.pairedlist);

        inputPane = (LinearLayout) findViewById(R.id.inputpane);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv F
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x46};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv *
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x2A};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv +
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x2B};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv =
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x3D};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv %
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x25};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv /
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x2F};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv -
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x2D};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv I
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x51};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv 7
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x37};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv 8
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x38};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv 9
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x39};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv II
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x41};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv 4
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x34};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv 5
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x35};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv 6
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x36};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv III
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x0D};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv 1
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x31};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv 2
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x32};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv 3
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x33};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv ^
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x57};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv 0
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x30};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv Clr
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x43};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv Opc
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x4F};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Klahv v
                if (myThreadConnected != null) {
                    byte[] bytesToSend = {(byte) 0x53};
                    myThreadConnected.write(bytesToSend);
                }
            }
        });


        if (!getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH)) {
            Toast.makeText(this,
                    "FEATURE_BLUETOOTH NOT support",
                    Toast.LENGTH_LONG).show();
            finish();
            return;
        }

        //using the well-known SPP UUID
        myUUID = UUID.fromString(UUID_STRING_WELL_KNOWN_SPP);

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            Toast.makeText(this,
                    "Bluetooth ei toetata sellel seadmel",
                    Toast.LENGTH_LONG).show();
            finish();
            return;
        }

    }

    @Override
    protected void onStart() {
        super.onStart();

        //Turn ON BlueTooth if it is OFF
        if (!bluetoothAdapter.isEnabled()) {
            Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableIntent, REQUEST_ENABLE_BT);
        }

        setup();
    }

    private void setup() {
        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
        if (pairedDevices.size() > 0) {
            pairedDeviceArrayList = new ArrayList<BluetoothDevice>();

            for (BluetoothDevice device : pairedDevices) {
                pairedDeviceArrayList.add(device);
            }

            pairedDeviceAdapter = new ArrayAdapter<BluetoothDevice>(this,
                    android.R.layout.simple_list_item_1, pairedDeviceArrayList);
            listViewPairedDevice.setAdapter(pairedDeviceAdapter);

            listViewPairedDevice.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    BluetoothDevice device =
                            (BluetoothDevice) parent.getItemAtPosition(position);
                    Toast.makeText(MainActivity.this,
                            "Name: " + device.getName() + "\n"
                                    + "Address: " + device.getAddress() + "\n"
                                    + "BondState: " + device.getBondState() + "\n"
                                    + "BluetoothClass: " + device.getBluetoothClass() + "\n"
                                    + "Class: " + device.getClass(),
                            Toast.LENGTH_LONG).show();

                    textStatus.setText("start ThreadConnectBTdevice");
                    myThreadConnectBTdevice = new ThreadConnectBTdevice(device);
                    myThreadConnectBTdevice.start();
                }
            });
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (myThreadConnectBTdevice != null) {
            myThreadConnectBTdevice.cancel();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_ENABLE_BT) {
            if (resultCode == Activity.RESULT_OK) {
                setup();
            } else {
                Toast.makeText(this,
                        "BlueTooth pole sisse lülitatud",
                        Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }

    //Called in ThreadConnectBTdevice once connect successed
    //to start ThreadConnected
    private void startThreadConnected(BluetoothSocket socket) {

        myThreadConnected = new ThreadConnected(socket);
        myThreadConnected.start();
    }

    /*
    ThreadConnectBTdevice:
    Background Thread to handle BlueTooth connecting
    */
    private class ThreadConnectBTdevice extends Thread {

        private final BluetoothDevice bluetoothDevice;
        private BluetoothSocket bluetoothSocket = null;


        private ThreadConnectBTdevice(BluetoothDevice device) {
            bluetoothDevice = device;

            try {
                bluetoothSocket = device.createRfcommSocketToServiceRecord(myUUID);
                textStatus.setText("bluetoothSocket: \n" + bluetoothSocket);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            boolean success = false;
            try {
                bluetoothSocket.connect();
                success = true;
            } catch (IOException e) {
                e.printStackTrace();

                final String eMessage = e.getMessage();
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        textStatus.setText("Ei saa miksriga ühendust bluetoothSocket.connect(): \n" + eMessage);
                    }
                });

                try {
                    bluetoothSocket.close();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }

            if (success) {
                //connect successful
                final String msgconnected = "ühendatud:\n"
                        + "BluetoothSocket: " + bluetoothSocket + "\n"
                        + "BluetoothSeade: " + bluetoothDevice;

                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        textStatus.setText("");
                        Toast.makeText(MainActivity.this, msgconnected, Toast.LENGTH_LONG).show();

                        listViewPairedDevice.setVisibility(View.GONE);
                        inputPane.setVisibility(View.VISIBLE);
                    }
                });

                startThreadConnected(bluetoothSocket);

            } else {
                //fail
            }
        }

        public void cancel() {

            Toast.makeText(getApplicationContext(),
                    "Sulgen Bluetooth ühenduse",
                    Toast.LENGTH_LONG).show();

            try {
                bluetoothSocket.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

    /*
    ThreadConnected:
    Background Thread to handle Bluetooth data communication
    after connected
     */
    private class ThreadConnected extends Thread {
        private final BluetoothSocket connectedBluetoothSocket;
        private final InputStream connectedInputStream;
        private final OutputStream connectedOutputStream;

        public ThreadConnected(BluetoothSocket socket) {
            connectedBluetoothSocket = socket;
            InputStream in = null;
            OutputStream out = null;

            try {
                in = socket.getInputStream();
                out = socket.getOutputStream();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            connectedInputStream = in;
            connectedOutputStream = out;
        }

        @Override
        public void run() {
            byte[] buffer = new byte[1024];
            int bytes;

            String strRx = "";
            int c = 0;
            int k = 0;

            //BLuetoothi pakettide vastuvõtmine ja ekraanile panek
            while (true) {
                try {
                    //Mingi data tuleb, seega ekraanile
                    if (connectedInputStream.available() > 0) {
                        bytes = connectedInputStream.read(buffer);
                        final String strReceived = new String(buffer);

                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                // textStatus.append(strReceived);
                                textStatus.setText(strReceived);
                            }
                        });
                        //Mingit datat ei tule, seega ootame Sleep
                    } else SystemClock.sleep(100);


                    //Keepalive osa, mis saadab ? mingi aja tagant
                    //hetkel on ajaks 10*100=1000 millisekundit
                    //Originaal programmi keepalive:
                    //;E??????????;E??????????;E??????????;E??????????;E??????????;E??????????
                    c++;

                    if (c > 10) {
                        String kl = "?";
                        byte[] bytesToSend = kl.getBytes();
                        connectedOutputStream.write(bytesToSend);
                        c = 0;
                        k++;
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                    final String msgConnectionLost = "Ühendus nurjus: PANE PROGRAMM KINNI\n"
                            + e.getMessage();
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            textStatus.setText(msgConnectionLost);
                        }
                    });
                }
            }


        }

        //Byte saatmine
        public void write(byte[] buffer) {
            try {
                connectedOutputStream.write(buffer);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public void cancel() {
            try {
                connectedBluetoothSocket.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}