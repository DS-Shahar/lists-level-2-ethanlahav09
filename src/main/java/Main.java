
  public static int distanveFromEdge(Node<Integer> head, int num)
    {
        int dis1=0, dis2=0;
        boolean hasShown=false;
        while(head!=null)
        {
            if (head.getValue()==num)
            {
                hasShown=true;
                dis2=0;
            }
            if(hasShown==false && head.getValue()!=num)
                dis1++;
            if(hasShown==true && head.getValue()!=num)
            {
                dis2++;
            }
            head=head.getNext();
            
        }
        if(hasShown==false)
            return -1;
        return dis1+dis2;
        
    }
	
	public static boolean isItUnique(Node<Integer> head)
    {
        while(head.hasNext())
        {
            if(head.getValue()==head.getNext().getValue())
                return false;
            head=head.getNext();
        }
        return true;
    }







	
}






