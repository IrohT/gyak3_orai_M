public class Complex{
    private double real = 0;
    private  double imag = 0;


    public double getReal(){
        return real;
    }

    public double getImag(){
        return imag;
    }

    public String toString(){
        String elojel;
        if(imag < 0){
            elojel = "-";
        }
        else if(imag > 0) {
            elojel = "+";
        }
        else{
            elojel = "real";
        }

        return real + elojel + imag + "i";

    }


    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public Complex() {
        this(0,0);
    }


    public Complex add(Complex masik){
        double n_real = this.real + masik.real;
        double n_imag = this.imag + masik.imag;
        return new Complex(n_real, n_imag);
    }

    public Complex mul(Complex masik){
        double n_real = this.real * masik.real - this.imag * masik.imag ;
        double n_imag = this.real * masik.real + this.imag * masik.imag;
        return new Complex(n_real, n_imag);
    }

    public Complex conjugate(Complex masik){
        double n_real = this.real * masik.real - this.imag * masik.imag ;
        double n_imag = this.real * masik.real + this.imag * masik.imag;
        return new Complex(n_real, n_imag);
    }
}
