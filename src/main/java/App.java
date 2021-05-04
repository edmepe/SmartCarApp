
import static spark.Spark.*;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.smartcar.sdk.*;
import com.smartcar.sdk.data.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enta
 */
public class App extends javax.swing.JFrame {

    private final AuthClient client;
    private String access;
    private static Gson gson = new Gson();
    private static int x;
    private static int y = 0;

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        port(8000);
        String clientId = "ce96b37c-e1af-487c-bde3-176379696714";
        String clientSecret = "37c77a72-1b68-4aaf-a31e-f616d4e77782";
        String redirectUri = "http://localhost:8000/callback";
        String[] scope = {"read_engine_oil read_battery read_charge read_fuel read_location control_security read_odometer read_tires read_vehicle_info read_vin"};

        boolean testMode = true;

        client = new AuthClient(
                clientId,
                clientSecret,
                redirectUri,
                scope,
                testMode
        );
        CarController cc = new CarController();
        cc.getAccess(client);
        access = System.getProperty("access");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();
        vehicle = new javax.swing.JButton();
        vehicles = new javax.swing.JButton();
        odometer = new javax.swing.JButton();
        fuel = new javax.swing.JButton();
        location = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        oil = new javax.swing.JButton();
        vehiclenumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        battery = new javax.swing.JButton();
        tire = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        res.setColumns(20);
        res.setRows(5);
        jScrollPane1.setViewportView(res);

        vehicle.setText("Selected vehicle info");
        vehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleActionPerformed(evt);
            }
        });

        vehicles.setText("List vehicles");
        vehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiclesActionPerformed(evt);
            }
        });

        odometer.setText("Odometer");
        odometer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odometerActionPerformed(evt);
            }
        });

        fuel.setText("Fuel");
        fuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelActionPerformed(evt);
            }
        });

        location.setText("Location");
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        oil.setText("Oil");
        oil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilActionPerformed(evt);
            }
        });

        vehiclenumber.setText("0");
        vehiclenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiclenumberActionPerformed(evt);
            }
        });

        jLabel1.setText("Vehicle number:");

        battery.setText("Battery");
        battery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batteryActionPerformed(evt);
            }
        });

        tire.setText("Tire pressure");
        tire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tireActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vehicles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vehicle))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vehiclenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(odometer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fuel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(battery)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(location)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tire))
                            .addComponent(clear))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addComponent(login))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicles)
                            .addComponent(vehicle))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odometer)
                    .addComponent(fuel)
                    .addComponent(location)
                    .addComponent(oil)
                    .addComponent(vehiclenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(battery)
                    .addComponent(tire))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        OpenBrowser openBrowser = new OpenBrowser("http://localhost:8000/login");
        res.append("Browser should be open!\n");
    }//GEN-LAST:event_loginActionPerformed

    private void vehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleActionPerformed
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\edgar\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();
                System.out.println(vehicleIds.length);
                x = Integer.parseInt(vehiclenumber.getText());
                if (x >= vehicleIds.length || x < 0) {
                    res.append("Error, the vehicle with number " + x + " does not exist. Please insert a car number between 0 and " + (vehicleIds.length - 1) + ".");
                    res.append("\n");
                    res.append("------------------------------------------------------------------------------------------------------------------------------------" + "\n");
                } else {
                    Vehicle vehicle = new Vehicle(vehicleIds[x], access);
                    VehicleInfo info = vehicle.info();
                    System.out.println(gson.toJson(info));
                    JsonParser parser = new JsonParser();
                    JsonObject obj = parser.parse(gson.toJson(info)).getAsJsonObject();
                    String id = obj.get("id").getAsString();
                    String make = obj.get("make").getAsString();
                    String model = obj.get("model").getAsString();
                    String year = obj.get("year").getAsString();
                    res.append("car number: " + x + "\n");
                    res.append("id = " + id + "\n");
                    res.append("make = " + make + "\n");
                    res.append("model = " + model + "\n");
                    res.append("year = " + year + "\n");
                    res.append("------------------------------------------------------------------" + "\n");
                }
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_vehicleActionPerformed

    private void vehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiclesActionPerformed
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\edgar\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();
                for (String v : vehicleIds) {
                    Vehicle vehicle = new Vehicle(v, access);
                    VehicleInfo info = vehicle.info();
                    System.out.println(gson.toJson(info));
                    JsonParser parser = new JsonParser();
                    JsonObject obj = parser.parse(gson.toJson(info)).getAsJsonObject();
                    String id = obj.get("id").getAsString();
                    String make = obj.get("make").getAsString();
                    String model = obj.get("model").getAsString();
                    String year = obj.get("year").getAsString();
                    res.append("car number: " + y + "\n");
                    res.append("id = " + id + "\n");
                    res.append("make = " + make + "\n");
                    res.append("model = " + model + "\n");
                    res.append("year = " + year + "\n");
                    res.append("\n");
                    y++;
                }
                res.append("------------------------------------------------------------------" + "\n");
                y = 0;
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_vehiclesActionPerformed

    private void odometerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odometerActionPerformed
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\edgar\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();
                x = Integer.parseInt(vehiclenumber.getText());
                if (x >= vehicleIds.length || x < 0) {
                    res.append("Error, the vehicle with number " + x + " does not exist. Please insert a car number between 0 and " + (vehicleIds.length - 1) + ".");
                    res.append("\n");
                    res.append("------------------------------------------------------------------------------------------------------------------------------------" + "\n");
                } else {
                    Vehicle vehicle = new Vehicle(vehicleIds[x], access);
                    VehicleInfo info = vehicle.info();
                    SmartcarResponse<VehicleOdometer> odometerResponse = vehicle.odometer();
                    VehicleOdometer odometerData = odometerResponse.getData();
                    double odometer = odometerData.getDistance();
                    System.out.println(gson.toJson(info));
                    JsonParser parser = new JsonParser();
                    JsonObject obj = parser.parse(gson.toJson(info)).getAsJsonObject();
                    String id = obj.get("id").getAsString();
                    String make = obj.get("make").getAsString();
                    String model = obj.get("model").getAsString();
                    String year = obj.get("year").getAsString();
                    res.append("car number: " + x + "\n");
                    res.append("id = " + id + "\n");
                    res.append("make = " + make + "\n");
                    res.append("model = " + model + "\n");
                    res.append("year = " + year + "\n");
                    res.append("distance = " + odometer + " km" + "\n");
                    res.append("------------------------------------------------------------------" + "\n");
                }
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_odometerActionPerformed

    private void fuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelActionPerformed
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\edgar\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();
                x = Integer.parseInt(vehiclenumber.getText());
                if (x >= vehicleIds.length || x < 0) {
                    res.append("Error, the vehicle with number " + x + " does not exist. Please insert a car number between 0 and " + (vehicleIds.length - 1) + ".");
                    res.append("\n");
                    res.append("------------------------------------------------------------------------------------------------------------------------------------" + "\n");
                } else {
                    Vehicle vehicle = new Vehicle(vehicleIds[x], access);
                    VehicleInfo info = vehicle.info();
                    SmartcarResponse<VehicleFuel> fuelResponse = vehicle.fuel();
                    VehicleFuel fuelData = fuelResponse.getData();
                    double fuelpercent = fuelData.getPercentRemaining();
                    double fuelrange = fuelData.getRange();
                    double fuelremaining = fuelData.getAmountRemaining();
                    System.out.println(gson.toJson(info));
                    JsonParser parser = new JsonParser();
                    JsonObject obj = parser.parse(gson.toJson(info)).getAsJsonObject();
                    String id = obj.get("id").getAsString();
                    String make = obj.get("make").getAsString();
                    String model = obj.get("model").getAsString();
                    String year = obj.get("year").getAsString();
                    res.append("car number: " + x + "\n");
                    res.append("id = " + id + "\n");
                    res.append("make = " + make + "\n");
                    res.append("model = " + model + "\n");
                    res.append("year = " + year + "\n");
                    res.append("Fuel percent = " + fuelpercent + "%" + "\n");
                    res.append("Fuel range = " + fuelrange + "km" + "\n");
                    res.append("Fuel remaining = " + fuelremaining + "l" + "\n");
                    res.append("------------------------------------------------------------------" + "\n");
                }
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fuelActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\edgar\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();
                x = Integer.parseInt(vehiclenumber.getText());
                if (x >= vehicleIds.length || x < 0) {
                    res.append("Error, the vehicle with number " + x + " does not exist. Please insert a car number between 0 and " + (vehicleIds.length - 1) + ".");
                    res.append("\n");
                    res.append("------------------------------------------------------------------------------------------------------------------------------------" + "\n");
                } else {
                    Vehicle vehicle = new Vehicle(vehicleIds[x], access);
                    VehicleInfo info = vehicle.info();
                    SmartcarResponse<VehicleLocation> locationResponse = vehicle.location();
                    VehicleLocation locationData = locationResponse.getData();
                    double latitude = locationData.getLatitude();
                    double longitude = locationData.getLongitude();
                    System.out.println(gson.toJson(info));
                    JsonParser parser = new JsonParser();
                    JsonObject obj = parser.parse(gson.toJson(info)).getAsJsonObject();
                    String id = obj.get("id").getAsString();
                    String make = obj.get("make").getAsString();
                    String model = obj.get("model").getAsString();
                    String year = obj.get("year").getAsString();
                    res.append("car number: " + x + "\n");
                    res.append("id = " + id + "\n");
                    res.append("make = " + make + "\n");
                    res.append("model = " + model + "\n");
                    res.append("year = " + year + "\n");
                    res.append("Latitude = " + latitude + "\n");
                    res.append("Longitude = " + longitude + "\n");
                    res.append("------------------------------------------------------------------" + "\n");
                    OpenBrowser openBrowser = new OpenBrowser("https://www.google.pt/maps/place/" + locationData.getLatitude() + "," + locationData.getLongitude());
                }
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_locationActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        res.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void oilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilActionPerformed
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\edgar\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();
                x = Integer.parseInt(vehiclenumber.getText());
                if (x >= vehicleIds.length || x < 0) {
                    res.append("Error, the vehicle with number " + x + " does not exist. Please insert a car number between 0 and " + (vehicleIds.length - 1) + ".");
                    res.append("\n");
                    res.append("------------------------------------------------------------------------------------------------------------------------------------" + "\n");
                } else {
                    Vehicle vehicle = new Vehicle(vehicleIds[x], access);
                    VehicleInfo info = vehicle.info();
                    SmartcarResponse<VehicleOil> oilResponse = vehicle.oil();
                    VehicleOil oilData = oilResponse.getData();
                    double oil = oilData.getLifeRemaining();
                    System.out.println(gson.toJson(info));
                    JsonParser parser = new JsonParser();
                    JsonObject obj = parser.parse(gson.toJson(info)).getAsJsonObject();
                    String id = obj.get("id").getAsString();
                    String make = obj.get("make").getAsString();
                    String model = obj.get("model").getAsString();
                    String year = obj.get("year").getAsString();
                    res.append("car number: " + x + "\n");
                    res.append("id = " + id + "\n");
                    res.append("make = " + make + "\n");
                    res.append("model = " + model + "\n");
                    res.append("year = " + year + "\n");
                    res.append("Oil life remaining = " + oil + "%" + "\n");
                    res.append("------------------------------------------------------------------" + "\n");
                }
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_oilActionPerformed

    private void vehiclenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiclenumberActionPerformed

    }//GEN-LAST:event_vehiclenumberActionPerformed

    private void batteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batteryActionPerformed
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\edgar\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();
                x = Integer.parseInt(vehiclenumber.getText());
                if (x >= vehicleIds.length || x < 0) {
                    res.append("Error, the vehicle with number " + x + " does not exist. Please insert a car number between 0 and " + (vehicleIds.length - 1) + ".");
                    res.append("\n");
                    res.append("------------------------------------------------------------------------------------------------------------------------------------" + "\n");
                } else {
                    Vehicle vehicle = new Vehicle(vehicleIds[x], access);
                    VehicleInfo info = vehicle.info();
                    SmartcarResponse<VehicleBattery> batteryResponse = vehicle.battery();
                    VehicleBattery batteryData = batteryResponse.getData();
                    double percentremaining = batteryData.getPercentRemaining();
                    double range = batteryData.getRange();
                    System.out.println(gson.toJson(info));
                    JsonParser parser = new JsonParser();
                    JsonObject obj = parser.parse(gson.toJson(info)).getAsJsonObject();
                    String id = obj.get("id").getAsString();
                    String make = obj.get("make").getAsString();
                    String model = obj.get("model").getAsString();
                    String year = obj.get("year").getAsString();
                    res.append("car number: " + x + "\n");
                    res.append("id = " + id + "\n");
                    res.append("make = " + make + "\n");
                    res.append("model = " + model + "\n");
                    res.append("year = " + year + "\n");
                    res.append("Percent battery remaining = " + percentremaining + "%" + "\n");
                    res.append("Battery range = " + range + "km" + "\n");
                    res.append("------------------------------------------------------------------" + "\n");
                }
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_batteryActionPerformed

    private void tireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tireActionPerformed
        try {
            BufferedReader brTest = new BufferedReader(new FileReader("C:\\Users\\edgar\\AppData\\Local\\Temp\\access"));
            access = brTest.readLine();
            try {
                SmartcarResponse<VehicleIds> vehicleIdResponse = AuthClient.getVehicleIds(access);
                String[] vehicleIds = vehicleIdResponse.getData().getVehicleIds();
                x = Integer.parseInt(vehiclenumber.getText());
                if (x >= vehicleIds.length || x < 0) {
                    res.append("Error, the vehicle with number " + x + " does not exist. Please insert a car number between 0 and " + (vehicleIds.length - 1) + ".");
                    res.append("\n");
                    res.append("------------------------------------------------------------------------------------------------------------------------------------" + "\n");
                } else {
                    Vehicle vehicle = new Vehicle(vehicleIds[x], access);
                    VehicleInfo info = vehicle.info();
                    SmartcarResponse<VehicleTirePressure> VehicleTirePressureResponse = vehicle.tirePressure();
                    VehicleTirePressure vehicletirepressureData = VehicleTirePressureResponse.getData();
                    double fleft = vehicletirepressureData.getFrontLeft();
                    double fright = vehicletirepressureData.getFrontRight();
                    double bleft = vehicletirepressureData.getBackLeft();
                    double bright = vehicletirepressureData.getBackRight();
                    System.out.println(gson.toJson(info));
                    JsonParser parser = new JsonParser();
                    JsonObject obj = parser.parse(gson.toJson(info)).getAsJsonObject();
                    String id = obj.get("id").getAsString();
                    String make = obj.get("make").getAsString();
                    String model = obj.get("model").getAsString();
                    String year = obj.get("year").getAsString();
                    res.append("car number: " + x + "\n");
                    res.append("id = " + id + "\n");
                    res.append("make = " + make + "\n");
                    res.append("model = " + model + "\n");
                    res.append("year = " + year + "\n");
                    res.append("Front left = " + fleft + " psi" + "\n");
                    res.append("Front right = " + fright + " psi" + "\n");
                    res.append("Back left = " + bleft + " psi" + "\n");
                    res.append("Back right = " + bright + " psi" + "\n");
                    res.append("------------------------------------------------------------------" + "\n");
                }
            } catch (SmartcarException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tireActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton battery;
    private javax.swing.JButton clear;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton fuel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton location;
    private javax.swing.JButton login;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton odometer;
    private javax.swing.JButton oil;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JTextArea res;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JButton tire;
    private javax.swing.JButton vehicle;
    private javax.swing.JTextField vehiclenumber;
    private javax.swing.JButton vehicles;
    // End of variables declaration//GEN-END:variables

}