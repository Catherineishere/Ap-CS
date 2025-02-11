/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The clue to determine the celebrity
     * 
	 */
    private String clue;
	
	/**
	 * The answer or name of the celebrity.
	 */
	private String name;
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String initclue)
	{
         name = answer;
         clue = initclue;


	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return clue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return name;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
        this.clue = clue;

	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
        name = answer;
		
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return "The name is " + name+ " ,The clue is. ";
	}
    public static void main ( String[] args)
    {
        Celebrity p1 = new Celebrity( "ArianaGrande", "singer");
        System.out.println(p1.getClue());
        System.out.println(p1.getAnswer());



    }

	
}