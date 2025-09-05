


public class Merge 
{
    
    
    public Merge()
    {
        
        
        
    }
    
    
    public LinkedList fazerMerge(LinkedList A, LinkedList B)
    {
        
        LinkedList C = new LinkedList();

        
        while(!A.vazio() && !B.vazio())
        {
            
            if(A.list.info <= B.list.info)
            {
                
                C.insere(A.remove());
                
            }   
            else
            {
                
                C.insere(B.remove());
                
            }
            
            
        }
        
        while(!A.vazio())
        {
                
            C.insere(A.remove());
                
        }
            
        while(!B.vazio())
        {
                
            C.insere(B.remove());
                
        }
        
        return C;
        
        
    }
    
    
    
    
}