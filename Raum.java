import java.util.*;
/**
 * Diese Klasse modelliert Räume in der Welt von Zuul.
 * 
 * Ein "Raum" repräsentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen Räumen über Ausgänge verbunden.
 * Mögliche Ausgänge liegen im Norden, Osten, Süden und Westen.
 * Für jede Richtung hält ein Raum eine Referenz auf den 
 * benachbarten Raum.
 * 
 * @author  Michael Kölling und David J. Barnes
 * @version 31.07.2011
 */
public class Raum 
{
    private HashMap<String, Raum> ausgaenge;
    public String beschreibung;
    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausgänge.
     * @param beschreibung enthält eine Beschreibung in der Form
     *        "in einer Küche" oder "auf einem Sportplatz".
     */
    public Raum(String beschreibung) 
    {
        ausgaenge = new HashMap<>();
        this.beschreibung = beschreibung;
    }

    /**
     * Definiere die Ausgänge dieses Raums. Jede Richtung
     * führt entweder in einen anderen Raum oder ist 'null'
     * (kein Ausgang).
     * @param norden Der Nordausgang.
     * @param osten Der Ostausgang.
     * @param sueden Der Südausgang.
     * @param westen Der Westausgang.
     */
    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen) 
    {
        if(norden != null) {
            setzeAusgang("norden", norden);
        }
        if(osten != null) {
           setzeAusgang("osten", osten);
        }
        if(sueden != null) {
            setzeAusgang("sueden", sueden);
        }
        if(westen != null) {
             setzeAusgang("westen", westen);
        }
    }

    public void setzeAusgang(String richtung, Raum raum)
    {
        ausgaenge.put(richtung , raum);
        
    }
    
    public Raum gibAusgang(String richtung)
    {
        if (ausgaenge.containsKey(richtung))
            return ausgaenge.get(richtung);
        else
            return null;
    }
    
    public String gibLangeBeschreibung()
    {
        String langeBeschreibung = "";
        langeBeschreibung += beschreibung;
        langeBeschreibung += "\n";
        for(String key : ausgaenge.keySet())
            {
                langeBeschreibung += key + " ";
            }
        return langeBeschreibung;
    }
    
    /**
     * @return die Beschreibung dieses Raums.
     */
    public String gibBeschreibung()
    {
        return beschreibung;
    }
}
