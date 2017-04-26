package DS;
import java.util.HashSet; 
import java.util.Iterator; 
import java.util.Set; 

public class LoadBalancer { 

public static void main(String[] args) { 
LB lb = new LB(); 

lb.addHost("a"); 
lb.addHost("b"); 
lb.addHost("c"); 
lb.addHost("d"); 
lb.addHost("e"); 
lb.addHost("f"); 

System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 

lb.removeHost("d"); 

System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
System.out.println(lb.getHost()); 
} 
} 

class LB { 
private Set<String> ips; 
private Iterator<String> iterator; 

public LB() { 
ips = new HashSet<String>(); 
iterator = ips.iterator(); 
} 

public void addHost(String ip) { 
ips.add(ip); 
} 

public void removeHost(String ip) { 
ips.remove(ip); 
iterator = ips.iterator(); 
} 

public String getHost() { 
if(!iterator.hasNext()) { 
iterator = ips.iterator(); 
} 
return iterator.next(); 
} 
}