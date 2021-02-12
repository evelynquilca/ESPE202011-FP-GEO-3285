/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12taxes;

import java.util.Scanner;

/**
 *
 * @author Evelyn Quilca
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        int option;

        do {
            System.out.println("----- Calculator Tax -----");
            System.out.println(" 1. IVA  ");
            System.out.println(" 2. Income Tax");
            System.out.println(" 3. ISD   ");
            System.out.println("  ENTER 0 (Zero) to exit ");

            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {
                case 1 -> {
                    float finalSum = 0.0F;
                    float sumBasicProducts;
                    float sumNonBasicProducts;
                    float iva;

                    System.out.println(" Enter the total value of 1st necessity"
                            + " produts (Tuna, Rice, Oil, Sugar)");
                    sumBasicProducts = input.nextFloat();
                    System.out.println("This products are basics --> so they are free tax ($0.00) ");

                    System.out.println(" Enter the total value of the rest of the products");
                    sumNonBasicProducts = input.nextFloat();
                    iva = (float) (sumNonBasicProducts * 0.12);
                    System.out.println("VAT is equal to $" + iva);

                    finalSum = sumBasicProducts + (sumNonBasicProducts + iva);
                    System.out.println("The final value of your shopping is " + finalSum);
        }

                case 2 -> {
                    float annualSalary;
                    float taxSalary;
                    float socialInsureValue;
                    float homeDeducible;
                    float dressDeducible;
                    float foodDeducible;
                    float educationDeducible;
                    float healthDeducible;
                    float sumDeducible = 0.0F;
                    float taxBase = 0.0F;
                    float basicFraction = 0.0F;
                    float overBaseTax = 0.0F;
                    float incomeTax = 0.0F;

                    System.out.println("Enter your Annual Salary");
                    annualSalary = input.nextFloat();

                    taxSalary = (float) (annualSalary - (annualSalary * 0.0945));

                    System.out.println("Enter your Home Deucible Final Value");
                    homeDeducible = input.nextFloat();
                    System.out.println("Enter your Dress Final Value");
                    dressDeducible = input.nextFloat();
                    System.out.println("Enter your Food deducible Final Value");
                    foodDeducible = input.nextFloat();
                    System.out.println("Enter your arts, culturas & education Final Value");
                    educationDeducible = input.nextFloat();
                    System.out.println("Enter your HealtDeducible Final Value");
                    healthDeducible = input.nextFloat();

                    sumDeducible = (float) (showHomeDeducibles(homeDeducible) + showDressDeducibles(dressDeducible)
                            + showFoodDeducibles(foodDeducible) + computeEducation(educationDeducible) + computeHealth(healthDeducible));

                    System.out.println("Your deducible sum is equal to --> " + computeSumDeducible(sumDeducible));

                    taxBase = (float) (annualSalary - computeSumDeducible(sumDeducible));

                    System.out.println("Your Tax Base is --> " + taxBase);
                    basicFraction = computeBasicFraction(taxBase, (int) basicFraction);
                    System.out.println("Your basic fraction is " + basicFraction);
                    overBaseTax = computeIncomeTax(taxBase, overBaseTax);
                    System.out.println("The value of the Income Tax over base is --> " + overBaseTax);

                    incomeTax = basicFraction + overBaseTax;
                    System.out.println("Your Income Tax to pay is $" + incomeTax);
        }

                case 3 -> {
                    float ISD = 0.0F;
                    float totalMoney;

                    System.out.println("Enter the total cash money that you have to travel abroad");
                    totalMoney = input.nextFloat();
                    if (totalMoney <= 1200) {
                        System.out.println("You are free tax ($0.00)");
                    } else {
                        ISD = (float) (totalMoney * 0.05);
                        System.out.println("The value of Currency Outflow Tax is $" + ISD);
                    }
        }

                case 0 -> {
                    System.out.println("Thnks for using my software \n Good Bye");
                    System.exit(0);
        }

                default -> System.out.println("Invalid option\n\n\n");

            }

        } while (option != 0);
    }

    public static double showHomeDeducibles(float homeDeducible) {
        if (homeDeducible > 3643.90) {
            return 3643.9;
        } else {
            return homeDeducible;
        }
    }

    public static double showDressDeducibles(float dressDeducible) {
        if (dressDeducible > 3643.90) {
            return 3643.9;
        } else {
            return dressDeducible;
        }
    }

    public static double showFoodDeducibles(float foodDeducible) {
        if (foodDeducible > 3643.90) {
            return 3643.9;
        } else {
            return foodDeducible;
        }
    }

    public static double computeEducation(float educationDeducible) {
        if (educationDeducible > 3643.90) {
            return 3643.9;
        } else {
            return educationDeducible;
        }
    }

    public static double computeHealth(float healthDeducible) {
        if (healthDeducible > 14575.60) {
            return 14575.60;
        } else {
            return healthDeducible;
        }
    }

    public static double computeSumDeducible(float sumDeducible) {
        if (sumDeducible > 14575.60) {
            return 14575.60;
        } else {
            return sumDeducible;
        }
    }

    public static float calculateCurrencyOutflowTax2(float totalMoney2, float taxBase2, float exitTax2) {
        float moneyTaxApplied;
        float exitTax;
        float taxValue2 = 0.05F;

        if (totalMoney2 > taxBase2) {
            moneyTaxApplied = (float) (totalMoney2 - taxBase2);
            exitTax = (float) (moneyTaxApplied * taxValue2);
            return exitTax;
        } else {
            return 0;
        }
    }
   
    public static int computeBasicFraction(float taxBase, int basicFraction) {
        if (taxBase < 11212) {
            return 0;
        } else {
            if (taxBase < 14285) {
                return 0;
            } else {
                if (taxBase < 17854) {
                    return 154;
                } else {
                    if (taxBase < 21442) {
                        return 511;
                    } else {
                        if (taxBase < 42874) {
                            return 64297;
                        } else {
                            if (taxBase < 64297) {
                                return 4156;
                            } else {
                                if (taxBase < 85729) {
                                    return 8440;
                                } else {
                                    if (taxBase < 144288) {
                                        return 13798;
                                    } else {
                                        if (taxBase > 144288) {
                                            return 22366;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return basicFraction;
    }

    public static float computeIncomeTax(float taxBase, float overBaseTax) {
        if (taxBase < 11212) {
            return 0;
        } else {
            if (taxBase < 14285) {
                return (float) ((taxBase - 11212) * 0.05);
            } else {
                if (taxBase < 17854) {
                    return (float) ((taxBase - 14285) * 0.10);
                } else {
                    if (taxBase < 21442) {
                        return (float) ((taxBase - 17854) * 0.12);
                    } else {
                        if (taxBase < 42874) {
                            return (float) ((taxBase - 21442) * 0.15);
                        } else {
                            if (taxBase < 64297) {
                                return (float) ((taxBase - 42874) * 0.20);
                            } else {
                                if (taxBase < 85729) {
                                    return (float) ((taxBase - 64297) * 0.25);
                                } else {
                                    if (taxBase < 144288) {
                                        return (float) ((taxBase - 85729) * 0.30);
                                    } else {
                                        if (taxBase > 144288) {
                                            return (float) ((taxBase - 144288) * 0.35);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return overBaseTax;
    }
}


