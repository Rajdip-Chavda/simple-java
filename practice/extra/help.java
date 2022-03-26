class help{
    public static void main(String args[]) throws java.io.IOException{
    char choice ,ignore;
    do{
        System.out.println("Help on:");
        System.out.println("1.if ");
        System.out.println("2. switch");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println("5. do-while \n");
        System.out.print("choise one: ");
        
        choice=(char) System.in.read();
        do{
            ignore=(char) System.in.read();
        }while(ignore != '\n');
    }while(choice < '1' | choice >'5');

    switch(choice)
    {
        case '1' :
            System.out.println("The if: \n");
            System.out.println("if(Condition) Statement");
            System.out.println("else Statement");
            break;
        case '2':
            System.out.println("The Switch: \n");
            System.out.println("switch(Expression) {");
            System.out.println("case contant");
            System.out.println("     Statement sequence");
            System.out.println("     break");
            System.out.println("     //....");
            System.out.println("}");
            break;
        case '3':
            System.out.println("The for: \n");
            System.out.println("for(init;Condition;iteration)");
            System.out.println("Statement");
            break;
        case '4':
            System.out.println("The while: \n");
            System.out.println("while(Condition) Statement;");
            System.out.println("else Statement");
            break;       
        case '5':
            System.out.println("The do-while: \n");
            System.out.println("do{");
            System.out.println(" Statement;");
            System.out.println("}while(Condition)");
            break;     
    }
    }
    }