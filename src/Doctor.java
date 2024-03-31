public class Doctor extends Person{

    private String department;
    private String degree;
    private double docFee;

    public Doctor(String name,String department,String degree) {
        super(name);
        this.degree=degree;
        this.department=department;
    }

    public Doctor(double docFee) {
        this.docFee=docFee;
    }

    public Doctor() {

    }

    public double getDocFee() {
        return docFee;
    }

    public void ShowInfo(){
        System.out.println("Referral Doctor: ");
        super.ShowInfo();
        System.out.println("Degree: "+degree);
        System.out.println("Department: "+department);

    }


}