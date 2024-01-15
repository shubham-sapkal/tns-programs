class Tax
{
    public void calculateTax(Person person)
    {

        if( person.getAge() > 65 || person.getGender().equalsIgnoreCase("female") )
        {
            person.setTax(0);
            if(person.getGender().equalsIgnoreCase("female")) {
                System.out.println("Tax Is Not Applicable For Women.");
                System.out.println("NOTE: No Gender Discrimation Is Hurted Here ... ");
            }
            else {
                System.out.println("Tax Is Not Applicable For Senior Citizen.");
            }
        }
        else {

            // All mens here
            if(person.getIncome() <= 160000 ) {
                person.setTax(0);
                System.out.println("Tax Is Not Applicable! Switch A Job and Pay Tax :) ");
            }
            else if(person.getIncome() > 160000 && person.getIncome() <= 500000 )
            {
                // Apply 10% tax on income
                int tax = ((person.getIncome()-160000)*10)/100;
                person.setTax( tax );
                System.out.println("You Will be Paying "+ tax +" Tax! Congratulation ... ");
            }
            else if(person.getIncome() > 500000 && person.getIncome() <= 800000 )
            {   
                // Apply 20% tax on income
                int tax = ((person.getIncome()-160000)*20)/100;
                person.setTax( tax );
                System.out.println("You Will be Paying "+ tax +" Tax! Congratulation ... ");
            }
            else if(person.getIncome() > 800000 && person.getIncome() <= 2000000 )
            {
                // Apply 30% tax on income
                int tax = ((person.getIncome()-160000)*30)/100;
                person.setTax( tax );
                System.out.println("You Will be Paying "+ tax +" Tax! Congratulation ... ");
            }


        }

    }
}


