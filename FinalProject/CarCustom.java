
public class CarCustom {
    // private varibles that will define a custom car
    private String body = "";
    private String paint = "";
    private String engine = "";
    // constructors
    public CarCustom(){
        body = "sedan";
        paint = "white";
        engine = "stock";
    }
    public CarCustom(String body1, String paint1, String engine1){
        if(body1.equalsIgnoreCase("suv") || body1.equalsIgnoreCase("sedan") || body1.equalsIgnoreCase("convertible")){
            body = body1;
        }else{
            body = "INVALID";
        }
        if(paint1.equalsIgnoreCase("blue") || paint1.equalsIgnoreCase("red") || paint1.equalsIgnoreCase("yellow") || paint1.equalsIgnoreCase("white")){
            paint = paint1;
        }else{
            paint = "INVALID";
        }
        if(engine1.equalsIgnoreCase("stock") || engine1.equalsIgnoreCase("premium") || engine1.equalsIgnoreCase("sport")){
            engine = engine1;
        }else{
            engine = "INVALID";
        }
    }
    // assesor methods
    public String getBody(){
        return body;
    }
    public String getPaint(){
        return paint;
    }
    public String getEngine(){
        return engine;
    }
    public void setBody(String newBody){
        body = newBody;
    }
    public void setPaint(String newPaint){
        paint = newPaint;
    }
    public void setEngine(String newEngine){
        engine = newEngine;
    }
    // toString to print out car
    public String toString(){
        return("You ordered a custom " + paint + " " + body + " with a " + engine + " engine kit.");
    }
    public void getSound(String engine5){
        if(engine5.equalsIgnoreCase("stock")){
            System.out.println("bruuum rrrrruuumm");
        }else if(engine5.equalsIgnoreCase("premium")){
            System.out.println("purrrrrr neeooom");
        }else if(engine5.equalsIgnoreCase("sport")){
            System.out.println("RRROOOOM BRRRROOOOOM st sts st st NNNEEEOOOMMMM");
        }else{
            System.out.println("Without an engine your car will not sound like much");
        }
    }
}
