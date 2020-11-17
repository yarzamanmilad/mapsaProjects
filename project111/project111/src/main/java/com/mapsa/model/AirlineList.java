package com.mapsa.model;

import javax.persistence.*;


@Entity
@Table(name = "airlineList")
public class AirlineList {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   private String Origin;
   private String Destination;
   private String Seatnumber;
   private String Dateofdeparture;
   private String Returndate;



   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getOrigin() {
      return Origin;
   }

   public void setOrigin(String origin) {
      Origin = origin;
   }

   public String getDestination() {
      return Destination;
   }

   public void setDestination(String destination) {
      Destination = destination;
   }

   public String getSeatnumber() {
      return Seatnumber;
   }

   public void setSeatnumber(String seatnumber) {
      Seatnumber = seatnumber;
   }

   public String getDateofdeparture() {
      return Dateofdeparture;
   }

   public void setDateofdeparture(String dateofdeparture) {
      Dateofdeparture = dateofdeparture;
   }

   public String getReturndate() {
      return Returndate;
   }

   public void setReturndate(String returndate) {
      Returndate = returndate;
   }
   @Override
   public String toString() {
      return "Login{" +
              "id=" + id +
              ", Origin='" + Origin + '\'' +
              ", Destination='" + Destination + '\'' +
              ", Seatnumber='" + Seatnumber + '\'' +
              ", Dateofdeparture='" + Dateofdeparture + '\'' +
              ", Returndate='" + Returndate + '\'' +
              '}';
   }
}
