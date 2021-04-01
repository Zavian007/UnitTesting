package za.ac.cput.testunits;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
        
/**
 * Applications Development Practice (ADP262) Assignment1 
 * Zavian Minnies
 * 217230458
 */


   
    @Disabled 
        class DisabledClassDemo{
            
            @Test
            void testWillBeSkipped()
            {
            
        }
    
                 @Test
        
        public void failingEquiltiyTest(){
    
        Project project1=new Project();
        Project project2=new Project();
        
        assertEquals(project1,project2);
        
    }
}
    


public class ProjectTest {
      
    private Project project1;
    private Project project2;
  
    @BeforeEach
    
    void setUp() {
        
        project1 = new Project();
        project2 = new Project();
        
    }
    
    @Test
    
    void testIdentity(){
    
        assertSame(project1,project2);
        
    }
    
    @Test
    
    void testEquality(){
        
        assertEquals(project1,project2);
    
    }
    
    @Test
    @Timeout(100)
    
    public void testInfiniteTameTakingLoop() throws InterruptedException{
        
        while(true){
    
        Thread.currentThread().sleep(200);
    
    }
        
    }
}
