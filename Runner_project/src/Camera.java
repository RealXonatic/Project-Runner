public class Camera {
    private double x;
    private double y;

    protected int vitesseX, vitesseY, accelerationX, accelerationY, deltaT;

    //Création du constructeur prenant en arguments x et y
    public Camera(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters pour récupérer les coordonnées x et y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Méthode toString() pour afficher les coordonnées x et y séparées par une virgule
    @Override
    public String toString() {
        return x + "," + y;
    }

    public void update(long time){
        accelerationX = HeroX - x + 1.2*vitesseX;
        
    }


}

