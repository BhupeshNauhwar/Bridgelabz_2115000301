import java.util.*;

class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    public TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private TaskNode head = null, tail = null;
    private TaskNode currentTask = null;

    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
        if (currentTask == null) currentTask = head;
    }

    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
        if (currentTask == null) currentTask = head;
    }

    public void addTaskAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        if (position < 1) return;
        if (position == 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode newTask = new TaskNode(taskId, taskName, priority, dueDate);
        TaskNode temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) temp = temp.next;

        if (temp == null || temp.next == head) {
            addTaskAtEnd(taskId, taskName, priority, dueDate);
        } else {
            newTask.next = temp.next;
            temp.next = newTask;
        }
    }

    public void removeTask(int taskId) {
        if (head == null) return;
        TaskNode temp = head, prev = null;

        if (head.taskId == taskId) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        do {
            prev = temp;
            temp = temp.next;
        } while (temp != head && temp.taskId != taskId);

        if (temp.taskId == taskId) {
            prev.next = temp.next;
            if (temp == tail) tail = prev;
        }
    }

    public void viewAndMoveToNextTask() {
        if (currentTask == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Current Task: " + currentTask.taskName + " | Priority: " + currentTask.priority);
        currentTask = currentTask.next;
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + " | Task Name: " + temp.taskName +
                    " | Priority: " + temp.priority + " | Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.taskId + " | Task Name: " + temp.taskName +
                        " | Priority: " + temp.priority + " | Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("No tasks found with priority " + priority);
    }
}

public class TaskSchedulerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();
        int choice;

        do {
            System.out.println("\n1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View and Move to Next Task");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID, Name, Priority, Due Date: ");
                    scheduler.addTaskAtBeginning(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    System.out.print("Enter Task ID, Name, Priority, Due Date: ");
                    scheduler.addTaskAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 3:
                    System.out.print("Enter Task ID, Name, Priority, Due Date, Position: ");
                    scheduler.addTaskAtPosition(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Task ID to Remove: ");
                    scheduler.removeTask(sc.nextInt());
                    break;
                case 5:
                    scheduler.viewAndMoveToNextTask();
                    break;
                case 6:
                    scheduler.displayAllTasks();
                    break;
                case 7:
                    System.out.print("Enter Priority to Search: ");
                    scheduler.searchTaskByPriority(sc.nextInt());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);

        sc.close();
    }
}
