
import java.util.*;
public class InstituteManagement
{
	public static void main(String x[])
	{
			Admission admission=new Admission();
			Course c[]=new Course[3];
			Enquiry e[]=new Enquiry[5];
			Batch newBatch=new Batch();
			Scanner xyz=new Scanner(System.in);
			do{
				System.out.println("1: create courses");
				System.out.println("2: View All Courses");
				System.out.println("3: Add new Enquiry");
				System.out.println("4: View All Enquiry");
				System.out.println("5: Ask for Admission");
				System.out.println("6: View Admission");
				System.out.println("7:Create Batch And allocate course and students for batch");
				System.out.println("8: View batch Admission");
				System.out.println("Enter your choice");
				int choice=xyz.nextInt();
				
		switch(choice)
		{
			case 1:
					xyz.nextLine();
					for(int i=0;i<c.length;i++)
					{
						c[i]=new Course();
						System.out.println("Enter name id and fees and duration");
						String name=xyz.nextLine();
						int id=xyz.nextInt();
						int fees=xyz.nextInt();
						int duration=xyz.nextInt();
						
						c[i].setName(name);
						c[i].setCid(id);
						c[i].setFees(fees);
						c[i].setDuration(duration);
						xyz.nextLine();
				}
				admission.setCourses(c);
			break;
			case 2:
						if(c[0]!=null)
						{
						System.out.println("_____________________________________________________________________________________________");
						System.out.println("Course ID\tCourse Name\tCourse Fees\tCourse");
					for(int i=0;i<c.length;i++)
					{
						System.out.println(c[i].getCid()+"\t\t"+c[i].getName()+"\t\t"+c[i].getFees()+"\t\t"+c[i].getDuration());
						
					}
					System.out.println("_________________________________________________________________________________________________");
						}else{
							System.out.println("There is no any course Present");
						}
			break;
			case 3: 
					System.out.println("______________________________________________________________________________________________");
						xyz.nextLine();
					for(int i=0;i<e.length;i++)
					{
						System.out.println("Enter name id contact and address");
						e[i]=new Enquiry();
						
						e[i].setName(xyz.nextLine());
						e[i].setId(xyz.nextInt());
						xyz.nextLine();
						e[i].setContact(xyz.nextLine());
						e[i].setAddress(xyz.nextLine());
						e[i].setStatus(false);
						System.out.println("Enter course name");
						String courseName=xyz.nextLine();
						Course course=admission.getCourseByName(courseName);
						e[i].setCourse(course);
		
					}
					admission.setEnquiries(e);
			break;
			case 4:
					if(e[0]!=null)
					{
					System.out.println("_____________________________________________________________________________________________");
						System.out.println("Enquiry ID\tEnquiry Name\tcontact\tAddress\tStatus");
					for(int i=0;i<e.length;i++)
					{
						Course course=e[i].getCourse();
						System.out.println(e[i].getId()+"\t\t"+e[i].getName()+"\t\t"+e[i].getContact()+"\t\t"+e[i].getAddress()+"\t\t"+e[i].isStatus()+"\t\t"+course.getName());
						
					}
					System.out.println("______________________________________________________________________________________________");
					
			break;
			}
			else{
				 System.out.println("There is no enquiry");
				}
			break;
			case 5:
					System.out.println("call for confirmation");
						String ename=xyz.nextLine();
						int eid=xyz.nextInt();
						xyz.nextLine();
						String feedback=xyz.nextLine();
						boolean b=admission.askForAdmission(eid,ename,feedback);
					if(b)
					{
						System.out.println("Yes Admission done Success");
					}	
					else{
						System.out.println("No cancel Admission ");
					}
			break;
			case 6:
					if(e[0]!=null)
					{
					System.out.println("_____________________________________________________________________________________________");
						System.out.println("Admission ID\tAdmission Name\tcontact\tAddress\tStatus");
					for(int i=0;i<e.length;i++)
					{
						Course course=e[i].getCourse();
						if(e[i].isStatus())
						{
						System.out.println(e[i].getId()+"\t\t"+e[i].getName()+"\t\t"+e[i].getContact()+"\t\t"+e[i].getAddress()+"\t\t"+e[i].isStatus()+"\t\t"+course.getName());
						}
					}
					System.out.println("______________________________________________________________________________________________");
					
			break;
			}
			else{
				 System.out.println("There is no enquiry");
				}
			break;
			case 7:
					System.out.println("Enter batch code");
					int batchid=xyz.nextInt();
					xyz.nextLine();
					System.out.println("Enter batch label");
					String batchName=xyz.nextLine();
					System.out.println("Enter batch start date");
					String batchStartDate=xyz.nextLine();
					System.out.println("Enter batch start Time");
					String batchStartTime=xyz.nextLine();
					Course bc=new Course();
					Course bc = new Course();
					System.out.println("Enter course detail for batch");
					int cid = xyz.nextInt();
					xyz.nextLine(); 
					String courseName = xyz.nextLine();
					bc.setCid(cid);
					bc.setName(courseName);
					b.setCourse(bc);

					Enquiry e1[]=new Enquiry[5];
					int index=0;
					for(int i=0;i<e.length;i++)
					{
						if(e[i].getStatus()==true)
						{
							Course ec = e[i].getCourse();
							boolean result = b.isCourseMatch(ec);
							if(result)
							{
								e1[index]=e[i];
								index++;
							}
						}
					}
					b.setAdmission(e1);
			break;
			case 8:
					System.out.println("_________________________________________________________");
					int bid = b.getId();
					String bname = b.getBatchName();
					String sdate = b.getStartDate();
					String stime = b.getStartTime();
					Course bcourse = b.getCourse();
					Enquiry badms[] = b.getAdmission();

					System.out.println(bid + "\t" + bname + "\t" + sdate + "\t" + stime + "\t" + bcourse.getCid() + "\t" + bcourse.getName());
					System.out.println("_________________________________________________________");

					if (badms != null) {
					for (int i = 0; i < badms.length; i++) {
					if (badms[i] != null)
					{
						System.out.println(badms[i].getId() + "\t" + badms[i].getName() + "\t" + badms[i].getContact() + "\t" + badms[i].getAddress() + "\t" + badms[i].isStatus());
					}
				}
			} 
			else
			{
				System.out.println("No students assigned to this batch.");
			}
			break;
			case 11:
					System.exit(0);
			break;
			default:
					System.out.println("Invalid choice");
		
		}
			}while(true);
	}
}