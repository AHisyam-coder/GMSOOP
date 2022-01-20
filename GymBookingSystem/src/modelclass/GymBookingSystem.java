/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelclass;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Hisyam
 */
public class GymBookingSystem {

    /**
     * @param args the command line arguments
     * 
     * Inheritance Customer with normal customer and VIP customer
     * Aggregation in admin, booking, coach, customer class
     */
    public static void main(String[] args) {
        /*int min = 1, max = 1000, random_id;
        ArrayList<Coach> arrayCoach = new ArrayList<>(); // Array 
        ArrayList<Booking> arrayBooking = new ArrayList<>(); // Array
        GymSession gymSession = new GymSession();

        Scanner scanner = new Scanner(System.in);
        boolean exitSystem = false;

        System.out.println("======== GYM BOOKING SYSTEM ========\n");
        System.out.println("You must become our customer first to use this system.\n");
        System.out.println("Do you want to become our VIP customer or Normal customer? 1-Normal, 2-VIP");
        int customerChoose = scanner.nextInt();

        //control statement
        switch (customerChoose) {
            case 1:
                System.out.println("Enter your name:");
                String custName = scanner.next();
                System.out.println("Enter your Identity Card No:");
                String custIc = scanner.next();
                System.out.println("Enter your phone no:");
                String custPhoneNo = scanner.next();
                System.out.println("Enter your gender:");
                String custGender = scanner.next();
                System.out.println("Enter your age:");
                int custAge = scanner.nextInt();
                Customer normalCust = new NormalCustomer(custIc, custName, custPhoneNo, custGender, custAge, gymSession);
                System.out.println("Successfully become our normal customer!\n");

                //repetition statement
                while (exitSystem == false) {
                    System.out.println("======== GYM BOOKING SYSTEM ========\n");
                    System.out.println("Please select the menu option\n");
                    System.out.println("1-Book Gym Session");
                    System.out.println("2-Coach List");
                    System.out.println("3-Become a VIP customer");
                    System.out.println("4-Become a coach");
                    System.out.println("5-Customer Details");
                    System.out.println("6-Exit system");

                    String option = scanner.next();

                    //control statement
                    if (null == option) {
                        System.out.println("Please input option 1 - 5 only.");
                    } else {
                        switch (option) {
                            case "1":
                                System.out.println("======= Gym Session ========\n");
                                System.out.println("Enter the duration (hours):");
                                int duration = scanner.nextInt();

                                gymSession.setHours(duration);
                                normalCust.setGymSession(gymSession);

                                System.out.println("Note: We only accept cash.");
                                System.out.println("Total payment: RM" + normalCust.gymSessionTotalPayment());
                                System.out.println("Paid? 1- Yes, 2- No");
                                int paid = scanner.nextInt();

                                if (paid == 1) {
                                    exitSystem = true;
                                }

                                break;
                            case "2":
                                //control statement
                                if (arrayCoach.isEmpty()) {
                                    System.out.println("There is no coach right now.\n");
                                } else {
                                    System.out.println("There are " + arrayCoach.size() + " coach available.\n");
                                    System.out.println("List of coaches\n");

                                    //repetition statement for array
                                    for (int i = 0; i < arrayCoach.size(); i++) {
                                        System.out.println("--------------------------------");
                                        System.out.println("ID: " + arrayCoach.get(i).getCoachId());
                                        System.out.println("Name: " + arrayCoach.get(i).getCoachName());
                                        System.out.println("Email: " + arrayCoach.get(i).getCoachEmail());
                                        System.out.println("Phone No: " + arrayCoach.get(i).getCoachPhoneNum());
                                        System.out.println("--------------------------------");
                                    }
                                }
                                break;
                            case "3":
                                System.out.println("======= Become VIP Customer ========\n");
                                System.out.println("You will get promotions if you become our VIP Customer!");
                                System.out.println("Are you sure to proceed? 1- Yes, 2- No");
                                int vipCustDecision = scanner.nextInt();

                                if (vipCustDecision == 1) {
                                    VIPCustomer vipCust = new VIPCustomer(custIc, custName, custPhoneNo, custGender, custAge, gymSession);

                                    System.out.println("Note: We only accept cash.");
                                    System.out.println("Total payment: RM" + vipCust.newVIPFee());
                                    System.out.println("Paid? 1- Yes, 2- No");
                                    int payVipFee = scanner.nextInt();

                                    if (payVipFee == 1) {
                                        exitSystem = true;
                                    }
                                }
                                break;
                            case "4":
                                System.out.println("======= Become a coach ========\n");
                                System.out.println("Enter your name:");
                                String coachName = scanner.next();
                                System.out.println("Enter your email:");
                                String coachEmail = scanner.next();
                                System.out.println("Enter your phone no:");
                                String coachPhoneNo = scanner.next();

                                random_id = (int) Math.floor(Math.random() * (max - min + 1) + min);
                                arrayCoach.add(new Coach(random_id, coachName, coachPhoneNo, coachEmail));

                                System.out.println("Successfully registered as a coach!\n");
                                break;
                            case "5":
                                System.out.println("======= Customer Details ========\n");
                                //POLYMORPHISM
                                normalCust.customerType();
                                System.out.println("Name: " + normalCust.getCustName());
                                System.out.println("Age: " + normalCust.getCustAge());
                                System.out.println("Gender: " + normalCust.getCustGender());
                                System.out.println("IC No: " + normalCust.getCustIc());
                                System.out.println("Phone No: " + normalCust.getCustPhoneNum());
                                System.out.println("================================");
                                break;
                            case "6":
                                exitSystem = true;
                                break;
                            default:
                                break;
                        }
                    }
                }
                break;
            case 2:
                System.out.println("Enter your name:");
                String custVipName = scanner.next();
                System.out.println("Enter your Identity Card No:");
                String custVipIc = scanner.next();
                System.out.println("Enter your phone no:");
                String custVipPhoneNo = scanner.next();
                System.out.println("Enter your gender:");
                String custVipGender = scanner.next();
                System.out.println("Enter your age:");
                int custVipAge = scanner.nextInt();
                VIPCustomer vipCust = new VIPCustomer(custVipIc, custVipName, custVipPhoneNo, custVipGender, custVipAge, gymSession);

                System.out.println("Note: We only accept cash.");
                System.out.println("New VIP customer's fee: RM" + vipCust.newVIPFee());
                System.out.println("Paid? 1- Yes, 2- No");
                int payVipFee = scanner.nextInt();

                if (payVipFee == 1) {
                    System.out.println("Successfully become our VIP customer!\n");

                    //repetition statement
                    while (exitSystem == false) {
                        System.out.println("======== GYM BOOKING SYSTEM ========\n");
                        System.out.println("Please select the menu option\n");
                        System.out.println("1-Book Gym Session");
                        System.out.println("2-Book a Coach");
                        System.out.println("3-Coach List");
                        System.out.println("4-Become a coach");
                        System.out.println("5-Customer Details");
                        System.out.println("6-Exit system");

                        String option = scanner.next();

                        //control statement
                        if (null == option) {
                            System.out.println("Please input option 1 - 5 only.");
                        } else {
                            switch (option) {
                                case "1":
                                    System.out.println("======= Gym Session ========\n");
                                    System.out.println("Enter the duration (hours):");
                                    int duration = scanner.nextInt();

                                    gymSession.setHours(duration);
                                    vipCust.setGymSession(gymSession);

                                    System.out.println("Note: We only accept cash.");
                                    //polymorphism normal customer
                                    System.out.println("Total payment: RM" + vipCust.gymSessionTotalPayment());
                                    System.out.println("Paid? 1- Yes, 2- No");
                                    int paid = scanner.nextInt();

                                    if (paid == 1) {
                                        exitSystem = true;
                                    }

                                    break;
                                case "2":
                                    System.out.println("======= Book a coach ========\n");

                                    //Composition between booking and bookinglist class
                                    Booking booking;
                                    
                                    if (!arrayBooking.isEmpty()) {
                                        System.out.println("----------------Booking list--------------");
                                        BookingList bookList = new BookingList(arrayBooking);
                                        ArrayList<Booking> books = bookList.getBookingListInfo();

                                        // Iterating over for each loop
                                        for (Booking bk : books) {
                                            System.out.println("\nBook ID : " + bk.getBookingId());
                                            System.out.println("Book date : " + bk.getBookingDate());
                                            System.out.println("Status : " + bk.getBookingStatus());
                                        }
                                        System.out.println("-----------------------------------------");
                                    }
                                    
                                    int bookingSize = arrayBooking.size() + 1;
                                    System.out.println("\nBooking " + bookingSize);
                                    System.out.println("Booking Time (e.g 1330):");
                                    int bookTime = scanner.nextInt();
                                    
                                    System.out.println("Booking Date (e.g 7/1/2022):");
                                    String bookDate = scanner.next();

                                    random_id = (int) Math.floor(Math.random() * (max - min + 1) + min);
                                    String bookId = "B" + random_id;

                                    Payment payment = new Payment();

                                    booking = new Booking(bookId, bookDate, 10.50, bookTime, "Pending", payment);

                                    arrayBooking.add(booking);

                                    System.out.println("Please wait for admin to confirm(via phone call) whether the coach is available or not.");
                                    break;

                                case "3":
                                    if (arrayCoach.isEmpty()) {
                                        System.out.println("There is no coach right now.\n");
                                    } else {
                                        System.out.println("There are " + arrayCoach.size() + " coach available.\n");
                                        System.out.println("List of coaches\n");

                                        //repetition statement for array 
                                        for (int i = 0; i < arrayCoach.size(); i++) {
                                            System.out.println("--------------------------------");
                                            System.out.println("ID: " + arrayCoach.get(i).getCoachId());
                                            System.out.println("Name: " + arrayCoach.get(i).getCoachName());
                                            System.out.println("Email: " + arrayCoach.get(i).getCoachEmail());
                                            System.out.println("Phone No: " + arrayCoach.get(i).getCoachPhoneNum());
                                            System.out.println("--------------------------------");
                                        }
                                    }
                                    break;
                                case "4":
                                    System.out.println("======= Become a coach ========\n");
                                    System.out.println("Enter your name:");
                                    String coachName = scanner.nextLine();
                                    System.out.println("Enter your email:");
                                    String coachEmail = scanner.nextLine();
                                    System.out.println("Enter your phone no:");
                                    String coachPhoneNo = scanner.nextLine();

                                    random_id = (int) Math.floor(Math.random() * (max - min + 1) + min);
                                    arrayCoach.add(new Coach(random_id, coachName, coachPhoneNo, coachEmail));

                                    System.out.println("Successfully registered as a coach!\n");
                                    break;
                                case "5":
                                    System.out.println("======= Customer Details ========\n");
                                    //POLYMORPHISM
                                    vipCust.customerType();
                                    System.out.println("Name: " + vipCust.getCustName());
                                    System.out.println("Age: " + vipCust.getCustAge());
                                    System.out.println("Gender: " + vipCust.getCustGender());
                                    System.out.println("IC No: " + vipCust.getCustIc());
                                    System.out.println("Phone No: " + vipCust.getCustPhoneNum());
                                    System.out.println("================================");
                                    break;
                                case "6":
                                    exitSystem = true;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                } else {
                    System.out.println("Please try again");
                }
                break;
            default:
                System.out.println("Please choose VIP or normal customer only!");
                break;
        }*/
    }
}
