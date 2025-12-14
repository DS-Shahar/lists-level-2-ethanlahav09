public class Main
{
	public static void main(String[] args) {
		
        
        int [] arr={8,1,5,6,7,8,2,2};
        Node<Integer> head1=buildList(arr);
        System.out.println(distanveFromEdge(head1, 8));

	}

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

}






