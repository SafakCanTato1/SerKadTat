public class SerKadTat
{
    private String schule;
    private int alter;
    private int schulklasse;
    private boolean student;
    private String name;
    
    public SerKadTat(String schule, int alter, int schulklasse, 
    boolean student, boolean berufstatig, String name)
    {
    }
        

    public SerKadTat(String schule, int alter, int schulklasse, boolean student, String name)
    {
    setSchule(schule);
    setAlter(alter);
    setSchulklasse(schulklasse);
    setStudent(student);
    setName(name);
    
    }
    
    public void setSchule(String neuSchule)
    {
        schule = neuSchule;
    }
    
    public void setAlter(int neuAlter)
    {
        alter = neuAlter;
    }
    
    public void setStudent(boolean neuStudent)
    {
        student = neuStudent;
    }
    
    public void setName(String neuName)
    {
        name = neuName;
    }
    
    public void setSchulklasse(int neuSchulklasse)
    {
        schulklasse = neuSchulklasse;
    }
}






