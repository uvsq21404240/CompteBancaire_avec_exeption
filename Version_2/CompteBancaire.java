package comptebancaire;

public class CompteBancaire {
	
	private int soldeinit;
	
	
	public CompteBancaire()
	{
		this.soldeinit=1000;
	}
	
	
	public CompteBancaire (int soldeinit)throws Exception
	{
		
		if(soldeinit<0)
		{
			throw new Exception("solde negatif");
		}
		
		else  this.soldeinit=soldeinit;
		
	}
	
	
	public void consulter_solde(int solde) throws Exception
	{
		
		if(solde<0)
		{
			throw new Exception("solde negatif");
		
		}
		else
		{
			this.soldeinit=solde;
		}
		
	}
	
	
	
	
	public int credit(int crdt)throws Exception
	{
		if(crdt<0)
		{
			throw new Exception("credit negatif");
			
		}
		
		else 
		{
			this.soldeinit=this.soldeinit+crdt;
		}
		return this.soldeinit;
		
	}
	
	
	
	public int debit(int dbt)throws Exception
	{
		if(dbt<0)
		{
			throw new Exception("debit negatif");
			
		}
		
		if(dbt>this.soldeinit)
		{
			throw new Exception("debit superieur au solde ");
		}
		else 
		{
			this.soldeinit=this.soldeinit-dbt;
		}
		return this.soldeinit;
		
	}
	
	
	
	
	

}
