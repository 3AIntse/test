/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intse;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Craig
 */
public class ChartBuilder {
    private String taskName;
    private String groupAssigned;
    private String branchNumber;
    private boolean mileStone;
    private Date startDate;
    private Date endDate;
    private Double leanWay;
   //private ArrayList<ChartBuilder> tempList;
    
    public ChartBuilder(String taskName, String groupAssigned, String branchNumber, Boolean mileStone, Date startDate, Date endDate, Double leanWay){
        this.taskName = taskName;
        this.groupAssigned = groupAssigned;
        this.branchNumber = branchNumber;
        this.mileStone = mileStone;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leanWay = leanWay;
      //  tempList = new ArrayList<ChartBuilder>();
    }
    
    public void setVarables(String taskName, String groupAssigned, String branchNumber, Boolean mileStone, Date startDate, Date endDate, Double leanWay){
        this.taskName = taskName;
        this.groupAssigned = groupAssigned;
        this.branchNumber = branchNumber;
        this.mileStone = mileStone;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leanWay = leanWay;
    }
    
    
    //use for later
    public void addElementToArray(){
           System.out.println(taskName);
       
           
           /** tempList.add(this);
        System.out.println("--------------");
        for( int i = 0; i < tempList.size(); i++){
            System.out.println(tempList.get(i).getTaskName());
        }
        **/
    }
    
    public String getTaskName(){
        return taskName;
    }
}
