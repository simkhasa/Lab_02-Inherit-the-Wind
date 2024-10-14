import java.util.ArrayList;
public class InheritanceDemo {
    public static void main(String[] args) {
        Worker worker1 = new Worker("0000001", "Max", "S", "Mr.", 1990, 50);
        Worker worker2 = new Worker("0000002", "Wyat", "E", "Mr.", 1991, 45);
        Worker worker3 = new Worker("0000003", "Ken", "T", "Mr.", 1992, 35);

        SalaryWorker salaryWorker1 = new SalaryWorker("0000004", "Paul", "G", "Ms.", 1993, 19, 50000);
        SalaryWorker salaryWorker2 = new SalaryWorker("0000005", "Rone", "H", "Mr.", 1994, 19, 50000);
        SalaryWorker salaryWorker3 = new SalaryWorker("0000006", "Bull", "Bill", "Mr.", 1995, 19, 50000);
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);
        //Write a loop that simulates 3 weekly pay periods.
        // Week 1 is a 40 hour week. For week 2  assume it is crunch time and everyone worked 50 hours.
        // Week 3 is back to normal with 40 hours.
        // Generate a display showing the weekly pay for each of the workers for each week in a reasonable tabular format.
        int week;
        for (week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");
            System.out.println(String.format("%-10s %-18s %-10s", "ID", "Full Name", "Weekly Pay"));
            for (Worker worker : workers) {
                System.out.println(String.format("%-10s %-18s %-10.2f", worker.getID(),worker.getFirstName() + " " + worker.getLastName(), worker.calculateWeeklyPay(week == 2 ? 50 : 40)));
            }}}
}