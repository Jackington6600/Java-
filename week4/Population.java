/**
Represents a population of people and an infection that passes between between them.
*/
import java.util.Random;
import java.util.ArrayList;

public class Population
{
	private ArrayList<Person> pop;
	private double infect; // infection rate of the disease
	private double recover; //recovery rate for the disease
	private Random generator; // random number generator
        private double death; //death rate of the disease
	
	/**
	Create a population, some of whom may be infected
	@param popsize the population size
	@param initial the proportion of the population initially infected
	@param infect the infection rate
	@param recover the recovery rate
	*/
	public Population(int popsize, double initial, double infect, double recover)
	{
		this.infect = infect;
		this.recover = recover;
		this.pop = new ArrayList<Person>(popsize);
		this.generator = new Random();
                this.death = 0;
		
		for(int i = 0; i < popsize; i++)
		{
			Person p = new Person();
                        
			if(generator.nextDouble() < initial)
			{
				p.setInfected(true);
			}
			pop.add(p);
		}
	
	}
        
        /**
	Create a population, some of whom may be infected and some of whom can die
	@param popsize the population size
	@param initial the proportion of the population initially infected
	@param infect the infection rate
	@param recover the recovery rate
        @param death the death rate
	*/
	public Population(int popsize, double initial, double infect, double recover, double death)
	{
		this.infect = infect;
		this.recover = recover;
		this.pop = new ArrayList<Person>(popsize);
		this.generator = new Random();
                this.death = death;
		
		for(int i = 0; i < popsize; i++)
		{
			Person p = new Person();
                        
			if(generator.nextDouble() < initial)
			{
				p.setInfected(true);
			}
			pop.add(p);
		}
	
	}
	
	/** 
	Get the population size
	@return population size
	*/
	public int getPopsize()
	{
		return pop.size();
	}
	
	
	public String toString()
	{
		return "population of " + this.getPopsize() + " people";
	}
	
	/**
	Get infection rate
	@return infection rate
	*/
	public double getInfect()
	{
		return this.infect;
	}
	
	/**
	Get recovery rate
	@return recovery rate
	*/
	public double getRecover()
	{
		return this.recover;
	}
	
	/**
	Change infection rate
	@param infect new infection rate
	*/
	public void setInfect(double infect)
	{
		this.infect = infect;
	}
	
	/**
	Change recovery rate
	@param recover new recovery rate
	*/
	public void setRecover(double recover)
	{
		this.recover = recover;
	}
        
        /**
        Get death rate
        @return death rate
        */
        public double getDeath()
        {
                return this.death;
        }
        
        /**
        Change death rate
        @param death new death rate
        */
        public void setDeath(double death)
        {
                this.death = death;
        }
        
        
        
	
	/**
	Is the person at a specific index infected?
	@param index index of the person concerned
	@return whether or not this person is infected
	*/
	public boolean isInfected(int index)
	{
		return pop.get(index).isInfected();
	}
	
	
	/**
	How many people are infected?
	@return how many infected people in the population?
	*/
	public int howManyInfected()
	{
		int count = 0;
		for(int i = 0; i < getPopsize(); i++)
		{
			if(isInfected(i))
			{
				count++;
			}
		}
		return count;
	}
	
	/**
	What proportion of population are infected?
	@return proportion infected
	*/
	public double proportionInfected()
	{
		return ((double)howManyInfected())/getPopsize();
	}
	
	/**
	Update status of population following a period of time
	*/
	public void update()
	{
            ArrayList<Boolean> deaths = new ArrayList<Boolean>(0);
            
		for(int i = 0; i < getPopsize(); i++)
		{
			if(isInfected(i))
			{
				if(generator.nextDouble() < recover)
				{
					pop.get(i).setInfected(false);
				}
			}
			else
			{
				// choose someone to meet
				int j = generator.nextInt(getPopsize());
				if(isInfected(j))
				{
					if(generator.nextDouble() < infect)
					{
						pop.get(i).setInfected(true);
					}
				}
			}
                        
                        
                        if(isInfected(i))
                        {
                            if(generator.nextDouble() < death)
				{
                                    deaths.add(true);
				}
                        }
                        else
                        {
                            deaths.add(false);
                        }
                        
		}
                
                int x = 0;
                if(deaths.indexOf(true)>=0)
                {
                    while(x>=0)
                    {

                        pop.remove(deaths.indexOf(true));
                        deaths.remove(deaths.indexOf(true));
                        x=deaths.indexOf(true);

                    }
                }
                
	}
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
