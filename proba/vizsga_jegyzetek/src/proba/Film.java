package proba;

public class Film implements Comparable<Film>{

    public String Cim;
    public String Rendezo;
    public double Hossz;


  public Film(String Cim,String Rendezo,double Hossz){
      this.Cim = Cim;
      this.Rendezo = Rendezo;
      this.Hossz = Hossz;
  }

  public String getRendezo(){
      return Rendezo;
  }

    public void setRendezo(String rendezo) {
        Rendezo = rendezo;
    }


    @Override
    public String toString(){
      return "Cim:" + this.Cim +  " Rendezo:" + this.Rendezo + " Hossz:" +this.Hossz +" perc ";
    }

    @Override
    public int compareTo(Film o) {
      if(this.Cim.compareTo(o.Cim) > 0){
          return 1;
      }
      else {
          return -1;
      }
    }
}
