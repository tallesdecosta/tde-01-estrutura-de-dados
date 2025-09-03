


public class LinkedList
{

	private Node list;

	public LinkedList()
	{

		this.list = null;

	}

	public boolean vazio()
	{

		if (this.list == null)
		{

			return true;

		} else
		{


			return false;
		}

	}

	public Node inserePrimeiro(int infor)
	{


		Node newNode = new Node();
		newNode.info = infor;


		if (this.vazio() == true)
		{

			list = newNode;

		}
		else
		{

			newNode.next = list;
			list = newNode;


		}

        return newNode;


	}

	public Node insereDepois(Node node, int infor)
	{


        if (this.vazio() == true)
		{

			return inserePrimeiro(infor);

		}
		else
		{
		    
		    Node newNode = new Node();
		    newNode.info = infor;
		    
			Node last = null;
			Node current = list;
			
			if(current == node)
			{
			    newNode.next = current.next;
			    current.next = newNode;
			    return newNode;
			    
			    
			} else 
			{
			    
			    while (current != node)
    			{
    			    
    				if(current.next == node)
    				{
    
    					last = current;
    
    				}
    
    			    current = current.next;

			    }
			    
			    newNode.next = current.next;
			    current.next = newNode;
			    return newNode;
			    
			}

		}



	}

	public Node insereUltimo(int infor)
	{

		if (this.vazio() == true)
		{

            return inserePrimeiro(infor);

		}
		else
		{

			Node newNode = new Node();
			newNode.info = infor;

			Node current = list;

			while (current != null)
			{

				if(current.next == null)
				{

					break;

				}

				current = current.next;

			}

			current.next = newNode;
			newNode.next = null;
			return newNode;

		}

	}

	public Node insereOrdenado(int info)
	{
    
        Node newNode = new Node();
        newNode.info = info;
        
        if(this.vazio() == true)
        {
            
            return inserePrimeiro(info);
            
            
        } else 
        {
            
            int maiorNum = 0;
            Node maior = null;
            Node current = list;
            
            while (current != null) 
            {
                
                if(current.info > maiorNum)
                {
                    
                    maiorNum = current.info;
                    maior = current;
                    
                    
                }
                
                if (current.next == null)
                {
                    
                    break;
                }
                
                current = current.next;
                
            }
            
            newNode.next = maior.next;
            maior.next = newNode;
            return newNode;
            
            
            
            
        }
        

	}

	public void imprime()
	{
		Node current = list;
		int count = 0;

		while (current != null)
		{

			System.out.print("[" + count + "] - " + current.info + "\n");
			current = current.next;
			count++;

		}


	}

	public void removePrimeiro()
	{


		if (this.vazio() == true)
		{

			System.out.println("NC#o C) possC-vel remover itens de uma lista vazia.");

		}
		else
		{
			Node atual = list;
			list = atual.next;
			atual.next = null;

		}


	}

	public void removeUltimo()
	{

		if (this.vazio() == true)
		{

			System.out.println("NC#o C) possC-vel remover itens de uma lista vazia.");

		}
		else
		{
			Node last = list;
			Node current = list;

			while (current != null)
			{
				if(current.next.next == null)
				{

					break;

				}

				current = current.next;

			}

			current.next = null;

		}


	}

	public void removeNode(Node node)
	{

		if (this.vazio() == true)
		{

			System.out.println("NC#o C) possC-vel remover itens de uma lista vazia.");

		}
		else
		{
			Node last = null;
			Node current = list;
			
			if(current == node)
			{
			    
			    list = node.next;
			    
			    
			} else 
			{
			    
			    while (current != node)
    			{
    			    
    				if(current.next == node)
    				{
    
    					last = current;
    
    				}
    
    			    current = current.next;

			    }
			    
			    last.next = current.next;
			    
			}

		}

	}


}