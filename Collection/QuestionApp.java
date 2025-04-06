import java.util.*;
class Question {
	private int qid;
	private String qname;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String answer;
	
	public Question()
	{
		
	}
	public Question(int qid, String qname, String opt1, String opt2, String opt3, String opt4, String answer) {
		this.qid = qid;
		this.qname = qname;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.answer = answer;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getOpt1() {
		return opt1;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}
	public String getOpt4() {
		return opt4;
	}
	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}	
}

public class QuestionApp {
	private static Question qs;

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		do {
			Scanner xyz = new Scanner(System.in);
			System.out.println("Case 1: Add New Question in Collection");
			System.out.println("Case 2: View All Question ");
			System.out.println("Case 3: Search question by using question id");
			System.out.println("Case 4: remove question using question id");

			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter qid,Question,opt1,opt2,opt3,opt4,answer");
				for (int i = 0; i < 2; i++) {
					int qid = xyz.nextInt();
					xyz.nextLine();
					String name = xyz.nextLine();
					String opt1 = xyz.nextLine();
					String opt2 = xyz.nextLine();
					String opt3 = xyz.nextLine();
					String opt4 = xyz.nextLine();
					String answer = xyz.nextLine();

					Question q = new Question(qid, name, opt1, opt2, opt3, opt4, answer);
					al.add(q);
				}
				break;
			case 2:
				Iterator i = al.iterator();
				while (i.hasNext()) {
					Object obj = i.next();
					Question qs = (Question) obj;
					System.out.println("Qno."+qs.getQid() + "\t" +"Question: "+ qs.getQname() + "\t"+"option1: " + qs.getOpt1() + "\t" +"option2: "+ qs.getOpt2()
							+ "\t" +"option3: "+ qs.getOpt3() + "\t"+"option4: " + qs.getOpt4() + "\t" +"Answer: "+ qs.getAnswer());
				}
				break;
			case 3:
					System.out.println("Enter Search id ");
					int sid=xyz.nextInt();
					i = al.iterator();
					boolean flag=false;
					while (i.hasNext()) {
						Object obj = i.next();
						qs = (Question) obj;
						
						if(qs.getQid()==sid)
						{
							flag=true;
							break;
						}
					}
					if(flag)
					{
						System.out.println("Question found");
						System.out.println("Qno."+qs.getQid() + "\t" +"Question: "+ qs.getQname() + "\t"+"option1: " + qs.getOpt1() + "\t" +"option2: "+ qs.getOpt2()
						+ "\t" +"option3: "+ qs.getOpt3() + "\t"+"option4: " + qs.getOpt4() + "\t" +"Answer: "+ qs.getAnswer());
						
					}else
					{
						System.out.println("Question not fount");
					}
					
				break;
			case 4:
				System.out.println("Enter id for remove data");
				int did=xyz.nextInt();
				i = al.iterator();
				 flag=false;
				while (i.hasNext()) {
					Object obj = i.next();
					Question qs = (Question) obj;
					
					if(qs.getQid()==did)
					{
						int index=al.indexOf(qs);
						if(index !=-1)
						{
						al.remove(did);
						flag=true;
						break;
						}
					}
				}
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (true);
	}

}
