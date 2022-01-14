// programme de test de la classe Console
public class TestConsole{

    public static void main (String[] args)
    {        
        char c=' ';
		do {			
			System.out.println ("Que voulez-vous lire (C=char - B=byte - S=short - I=Int - L=long - F=float - D=double - R=String) - Entree pour terminer ? ") ;
            try {
                c=Console.lireChar();}
            catch (Exception e) {c=' ';}
            switch (c)
			{
				case 'C' :
				case 'c' :			
					char cc ;
					do
					{	System.out.println ("donnez un caractere") ;
						cc = Console.lireChar() ;
						if(!Console.enErreur) System.out.println ("merci pour " + cc) ;
					}
					while (Console.enErreur);
					break;	
				case 'B' :		
				case 'b' :			
					byte b ;
					do 
					{	System.out.println ("donnez un octet") ;
						b = Console.lireByte() ;				
						if(!Console.enErreur) System.out.println ("merci pour " + b) ;
					}
					while (Console.enErreur);
					break;
				case 'S' :
				case 's' :
					
					short s;
					do
					{	System.out.println ("donnez un entier court") ;
						s = Console.lireShort() ;
						if(!Console.enErreur) System.out.println ("merci pour " + s) ;
					}
					while (Console.enErreur);
					break;
				case 'I' :
				case 'i' :
					
					int i ;
					do
					{	System.out.println ("donnez un entier") ;
						i = Console.lireInt() ;
						if(!Console.enErreur) System.out.println ("merci pour " + i) ;
					}
					while (Console.enErreur);
					break;
				case 'L' :
				case 'l' :				
					long l ;
					do
					{	System.out.println ("donnez un entier long") ;
						l = Console.lireLong() ;
						if(!Console.enErreur) System.out.println ("merci pour " + l) ;
					}
					while (Console.enErreur);
					break;
				case 'F' :
				case 'f' :				
					float x ;
					do
					{	System.out.println ("donnez un flottant") ;
						x = Console.lireFloat() ;
						if(!Console.enErreur) System.out.println ("merci pour " + x) ;
					}
					while (Console.enErreur);
					break;
				case 'D' :
				case 'd' :			
					double xx ;
					do
					{	System.out.println ("donnez un double") ;
						xx = Console.lireDouble() ;
						if(!Console.enErreur) System.out.println ("merci pour " + xx) ;
					}
					while (Console.enErreur);
					break;
				case 'R' :
				case 'r' :
					
					String chaine ;
					do
					{	System.out.println ("donnez une chaine") ;
						chaine = Console.lireString() ;
						if(!Console.enErreur) System.out.println ("merci pour " + chaine) ;
					}
					while (Console.enErreur);
					break;
				default : if (c!=' ') System.out.println ("Valeur "+c+" incorrecte !") ;
			}
		} while (c!=' ');
        
    }
}

