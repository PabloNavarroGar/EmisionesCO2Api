/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pablo
 */
public class HuellaCarbono {
    /*Mdelo que hay que seguir y que esta introducido ya 
    
    {
  "url": "url que se introduce ",
  "green": true,
  "bytes": 8929348,
  "cleanerThan": 0.12,
  "statistics": {
    "adjustedBytes": 6741657.74,
    "energy": 0.005085713015310467,
    "co2": {
      "grid": {
        "grams": 2.2478851527672266,
        "litres": 1.2502737219691311
      },
      "renewable": {
        "grams": 1.948845227466971,
        "litres": 1.083947715517129
      }
    }
  },
  "timestamp": 1681825240
}
    */
    private String url;
    private boolean green;
    private long bytes;
    private double cleanerThan; //Mas limpio que.
    private Statistics statistics; //Estadisticas
    private long timestamp;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isGreen() {
        return green;
    }

    public void setGreen(boolean green) {
        this.green = green;
    }

    public long getBytes() {
        return bytes;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    public double getCleanerThan() {
        return cleanerThan;
    }

    public void setCleanerThan(double cleanerThan) {
        this.cleanerThan = cleanerThan;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public static class Statistics {
        private double adjustedBytes;
        private double energy;
        private Co2 co2;

        public double getAdjustedBytes() {
            return adjustedBytes;
        }

        public void setAdjustedBytes(double adjustedBytes) {
            this.adjustedBytes = adjustedBytes;
        }

        public double getEnergy() {
            return energy;
        }

        public void setEnergy(double energy) {
            this.energy = energy;
        }

        public Co2 getCo2() {
            return co2;
        }

        public void setCo2(Co2 co2) {
            this.co2 = co2;
        }
    }

    public static class Co2 {
        private Grid grid;
        private Renewable renewable;

        public Grid getGrid() {
            return grid;
        }

        public void setGrid(Grid grid) {
            this.grid = grid;
        }

        public Renewable getRenewable() {
            return renewable;
        }

        public void setRenewable(Renewable renewable) {
            this.renewable = renewable;
        }
    }

    public static class Grid {
        private double grams;
        private double litres;

        public double getGrams() {
            return grams;
        }

        public void setGrams(double grams) {
            this.grams = grams;
        }

        public double getLitres() {
            return litres;
        }

        public void setLitres(double litres) {
            this.litres = litres;
        }
    }

    public static class Renewable {
        private double grams;
        private double litres;

        public double getGrams() {
            return grams;
        }

        public void setGrams(double grams) {
            this.grams = grams;
        }

        public double getLitres() {
            return litres;
        }

        public void setLitres(double litres) {
            this.litres = litres;
        }
    }

}
