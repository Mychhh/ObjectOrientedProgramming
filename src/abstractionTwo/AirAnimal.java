package abstractionTwo;
                         /*in this scenario I extend the LandAnimal Interface
                           because most bird are also walking right? if im not mistaken
                           so the AirAnimal interface will inherit all the value in the LandAnimal Interface*/

//note this method is efficient in this kind of scenario 
public interface AirAnimal extends LandAnimal {

	public void fly();

}
