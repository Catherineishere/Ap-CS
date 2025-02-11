public class Community {
    private int days;
    private String StudentName;
    private boolean completeness;
    private String job;

    public Community(initdays, initStudentName, initCompleteness, initJob )
    {
        days = initdays;
        studentName = initStudentName;
        Completeness = initCompleteness;
        job = initJob;
    }
    public void print ()
    {
        System.out.println(" Weekeend or week day gratis: " + days+ ","+ " Student responsibility"+ StudentName +","+ " Is it weel done or not"+ completeness+ ","+ )
    }

    
    
}
