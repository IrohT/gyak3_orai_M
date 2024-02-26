public class Kutya{

    private String nev;
    private String[] kedvencEtelek;
    private short ehseg;
    private long jokedv;
    private static int Kuytak_SZAMA;



    //public String getNev(){
    //  return nev;
    //}


    //public String setNev(){
    //    System.err.println("NONO");
    //    return null;
    //}
    public Kutya(String nev){
        this.nev = nev;
        this.kedvencEtelek = new String[]{"csirke", "sajt", "lazac"};
        //Kuytak_SZAMA++;


    }
    public Kutya(String nev, String[] kedvencEtelek){
        this.nev = nev;
        this.kedvencEtelek = kedvencEtelek;
        //Kuytak_SZAMA++;

    }

    //public String toString(){
    //    return "Nev:" + nev;
    //}

    public boolean szereti(String etel){
        for (String k_etel : this.kedvencEtelek) {
            if (k_etel.equals(etel.toLowerCase())) {
                return true;
            }
        }
        return false;
    }


    public void ehesenNez(){
        this.ehseg++;
        System.out.println("Vau!");
    }


    public Kutya farokCsovalas(){
        this.jokedv++;
        return this;
    }

    public void eszik(String etel){
        if(!this.szereti(etel)){
            this.ehesenNez();
            return;
        }
        else{
            if(this.ehseg > 0){
                this.ehseg--;
            }
            else{
                this.farokCsovalas();
            }
        }
    }



}
