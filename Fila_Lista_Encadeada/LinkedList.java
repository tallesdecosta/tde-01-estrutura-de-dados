


public class LinkedList
{

	public Node list;


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


	public void insere(int info)
	{


		Node node = new Node();
		node.info = info;


		if(this.vazio() == true)
		{

			this.list = node;


		} 
		else
		{

			
			Node ultimo = this.list;
			
			while(ultimo.next != null)
			{
			    ultimo = ultimo.next;
			}
			
			ultimo.next = node;
            

		}



	}



	public void imprime()
	{
		Node current = list;
		int count = 0;
        System.out.println("\n");
		while (current != null)
		{

			System.out.print("[" + count + "] - " + current.info + "\n");
			current = current.next;
			count++;

		}
		System.out.println("\n");


	}

	public int remove()
	{


		if(this.vazio() == true)
		{

			System.out.println("Não há itens para remover. :(");
			return 0;


		} else
		{
		    int info = this.list.info;
		    
		    this.list = this.list.next;
		    
		    System.out.println("Item removido da pilha: [" + info + "]");
		    
		    return info;

		}


	}


}