/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intse;
import java.util.Date;
/**
 *
 * @author Craig
 */
public class WorkBreakTree {
    protected String taskName;
    protected String groupAssigned;
    protected String branchNumber;
    protected boolean mileStone;
    
    public WorkBreakTree( String taskName, String groupAssigned, String branchNumber, Boolean mileStone){
        this.taskName = taskName;
        this.groupAssigned = groupAssigned;
        this.branchNumber = branchNumber;
        this.mileStone = mileStone;
    }
    
    
}
